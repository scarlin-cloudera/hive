// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.
package org.apache.hadoop.hive.ql.impalafile;

import org.apache.impala.thrift.TNetworkAddress;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.BlockLocation;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.LocatedFileStatus;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.fs.RemoteIterator;
import org.apache.hadoop.hive.common.ValidWriteIdList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nullable;

/**
 * Utility for loading file metadata within a partition directory.
 */
public class FileMetadataLoader {
  private final static Logger LOG = LoggerFactory.getLogger(FileMetadataLoader.class);
  private static final Configuration CONF = new Configuration();

  private final Path partDir_;
  private final boolean recursive_;
  private final ImmutableMap<String, FileDescriptor> oldFdsByRelPath_;
  private final ListMap<TNetworkAddress> hostIndex_;
  @Nullable
  private final ValidWriteIdList writeIds_;

  private boolean forceRefreshLocations = false;

  private List<FileDescriptor> loadedFds_;

  /**
   * @param partDir the dir for which to fetch file metadata
   * @param recursive whether to recursively list files
   * @param oldFds any pre-existing file descriptors loaded for this table, used
   *   to optimize refresh if available.
   * @param hostIndex the host index with which to associate the file descriptors
   * @param writeIds if non-null, a write-id list which will filter the returned
   *   file descriptors to only include those indicated to be valid.
   *   TODO(todd) we also likely need to pass an open transaction list here to deal
   *   with ignoring in-progress (not-yet-visible) compactions.
   */
  public FileMetadataLoader(Path partDir, boolean recursive, List<FileDescriptor> oldFds,
      ListMap<TNetworkAddress> hostIndex, @Nullable ValidWriteIdList writeIds) {
    partDir_ = Preconditions.checkNotNull(partDir);
    recursive_ = recursive;
    hostIndex_ = Preconditions.checkNotNull(hostIndex);
    oldFdsByRelPath_ = Maps.uniqueIndex(oldFds, FileDescriptor::getRelativePath);
    writeIds_ = writeIds;

    if (writeIds_ != null) {
      Preconditions.checkArgument(recursive_, "ACID tables must be listed recursively");
    }
  }

  /**
   * @return the file descriptors that were loaded after an invocation of load()
   */
  public List<FileDescriptor> getLoadedFds() {
    Preconditions.checkState(loadedFds_ != null,
        "Must have successfully loaded first");
    return loadedFds_;
  }

  Path getPartDir() { return partDir_; }

  /**
   * Load the file descriptors, which may later be fetched using {@link #getLoadedFds()}.
   * After a successful load, stats may be fetched using {@link #getStats()}.
   *
   * If the directory does not exist, this succeeds and yields an empty list of
   * descriptors.
   *
   * @throws IOException if listing fails.
   */
  public void load() throws IOException {
    FileSystem fs = partDir_.getFileSystem(CONF);

    // If we don't have any prior FDs from which we could re-use old block location info,
    // we'll need to fetch info for every returned file. In this case we can inline
    // that request with the 'list' call and save a round-trip per file.
    //
    // In the case that we _do_ have existing FDs which we can reuse, we'll optimistically
    // assume that most _can_ be reused, in which case it's faster to _not_ prefetch
    // the locations.
    boolean listWithLocations = 
        (oldFdsByRelPath_.isEmpty() || forceRefreshLocations);

    String msg = String.format("%s file metadata%s from path %s",
          oldFdsByRelPath_.isEmpty() ? "Loading" : "Refreshing",
          listWithLocations ? " with eager location-fetching" : "",
          partDir_);
    LOG.trace(msg);
    try (ThreadNameAnnotator tna = new ThreadNameAnnotator(msg)) {
      RemoteIterator<? extends FileStatus> fileStatuses;
      if (listWithLocations) {
        fileStatuses = FileSystemUtil.listFiles(fs, partDir_, recursive_);
      } else {
        fileStatuses = FileSystemUtil.listStatus(fs, partDir_, recursive_);

        // TODO(todd): we could look at the result of listing without locations, and if
        // we see that a substantial number of the files have changed, it may be better
        // to go back and re-list with locations vs doing an RPC per file.
      }
      loadedFds_ = new ArrayList<>();
      if (fileStatuses == null) return;

      Reference<Long> numUnknownDiskIds = new Reference<Long>(Long.valueOf(0));

      List<FileStatus> stats = new ArrayList<>();
      while (fileStatuses.hasNext()) {
        stats.add(fileStatuses.next());
      }

      for (FileStatus fileStatus : stats) {
        if (fileStatus.isDirectory()) {
          continue;
        }

        if (!FileSystemUtil.isValidDataFile(fileStatus)) {
          continue;
        }

        String relPath = FileSystemUtil.relativizePath(fileStatus.getPath(), partDir_).toString();
        FileDescriptor fd = oldFdsByRelPath_.get(relPath);
        if (listWithLocations || forceRefreshLocations ||
            hasFileChanged(fd, fileStatus)) {
          fd = createFd(fs, fileStatus, relPath, numUnknownDiskIds);
        } else {
        }
        loadedFds_.add(Preconditions.checkNotNull(fd));;
      }
    }
  }

  /**
   * Create a FileDescriptor for the given FileStatus. If the FS supports block locations,
   * and FileStatus is a LocatedFileStatus (i.e. the location was prefetched) this uses
   * the already-loaded information; otherwise, this may have to remotely look up the
   * locations.
   */
  private FileDescriptor createFd(FileSystem fs, FileStatus fileStatus,
      String relPath, Reference<Long> numUnknownDiskIds) throws IOException {
    BlockLocation[] locations;
    if (fileStatus instanceof LocatedFileStatus) {
      locations = ((LocatedFileStatus)fileStatus).getBlockLocations();
    } else {
      locations = fs.getFileBlockLocations(fileStatus, 0, fileStatus.getLen());
    }
    return FileDescriptor.create(fileStatus, relPath, locations, hostIndex_,
        fileStatus.isErasureCoded(),
        numUnknownDiskIds);
  }

  /**
   * Compares the modification time and file size between the FileDescriptor and the
   * FileStatus to determine if the file has changed. Returns true if the file has changed
   * and false otherwise.
   */
  private static boolean hasFileChanged(FileDescriptor fd, FileStatus status) {
    return (fd == null) || (fd.getFileLength() != status.getLen()) ||
      (fd.getModificationTime() != status.getModificationTime());
  }
}
