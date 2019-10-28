package org.apache.hadoop.hive.ql.impalafile;

import java.nio.ByteBuffer;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.nio.charset.Charset;
import org.apache.hadoop.fs.BlockLocation;
import org.apache.hadoop.fs.FileStatus;
import org.apache.impala.thrift.TNetworkAddress;
import org.apache.impala.thrift.THdfsFileDesc;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.common.base.Objects;
import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.google.common.base.Joiner;
import com.google.common.collect.Sets;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;

public class FileDescriptor implements Comparable<FileDescriptor> {

    // An invalid network address, which will always be treated as remote.
    private final static TNetworkAddress REMOTE_NETWORK_ADDRESS =
        new TNetworkAddress("remote*addr", 0);

    // Minimum block size in bytes allowed for synthetic file blocks (other than the last
    // block, which may be shorter).
    public final static long MIN_SYNTHETIC_BLOCK_SIZE = 1024 * 1024;

    // Internal representation of a file descriptor using a FlatBuffer.
    private final FbFileDesc fbFileDescriptor_;

    private FileDescriptor(FbFileDesc fileDescData) { fbFileDescriptor_ = fileDescData; }

    /**
     * Clone the descriptor, but change the replica indexes to reference the new host
     * index 'dstIndex' instead of the original index 'origIndex'.
     */
    public FileDescriptor cloneWithNewHostIndex(List<TNetworkAddress> origIndex,
        ListMap<TNetworkAddress> dstIndex) {
      // First clone the flatbuffer with no changes.
      ByteBuffer oldBuf = fbFileDescriptor_.getByteBuffer();
      ByteBuffer newBuf = ByteBuffer.allocate(oldBuf.remaining());
      newBuf.put(oldBuf.array(), oldBuf.position(), oldBuf.remaining());
      newBuf.rewind();
      FbFileDesc cloned = FbFileDesc.getRootAsFbFileDesc(newBuf);

      // Now iterate over the blocks in the new flatbuffer and mutate the indexes.
      FbFileBlock it = new FbFileBlock();
      for (int i = 0; i < cloned.fileBlocksLength(); i++) {
        it = cloned.fileBlocks(it, i);
        for (int j = 0; j < it.replicaHostIdxsLength(); j++) {
          int origHostIdx = FileBlock.getReplicaHostIdx(it, j);
          boolean isCached = FileBlock.isReplicaCached(it, j);
          TNetworkAddress origHost = origIndex.get(origHostIdx);
          int newHostIdx = dstIndex.getIndex(origHost);
          it.mutateReplicaHostIdxs(j, FileBlock.makeReplicaIdx(isCached, newHostIdx));
        }
      }
      return new FileDescriptor(cloned);
    }

    /**
     * Creates the file descriptor of a file represented by 'fileStatus' with blocks
     * stored in 'blockLocations'. 'fileSystem' is the filesystem where the
     * file resides and 'hostIndex' stores the network addresses of the hosts that store
     * blocks of the parent HdfsTable. 'isEc' indicates whether the file is erasure-coded.
     * Populates 'numUnknownDiskIds' with the number of unknown disk ids.
     *
     *
     */
    /**
     * Creates a FileDescriptor with block locations.
     *
     * @param fileStatus the status returned from file listing
     * @param relPath the path of the file relative to the partition directory
     * @param blockLocations the block locations for the file
     * @param hostIndex the host index to use for encoding the hosts
     * @param isEc true if the file is known to be erasure-coded
     * @param numUnknownDiskIds reference which will be set to the number of blocks
     *                          for which no disk ID could be determined
     */
    public static FileDescriptor create(FileStatus fileStatus, String relPath,
        BlockLocation[] blockLocations, ListMap<TNetworkAddress> hostIndex, boolean isEc,
        Reference<Long> numUnknownDiskIds) throws IOException {
      FlatBufferBuilder fbb = new FlatBufferBuilder(1);
      int[] fbFileBlockOffsets = new int[blockLocations.length];
      int blockIdx = 0;
      for (BlockLocation loc: blockLocations) {
        if (isEc) {
          fbFileBlockOffsets[blockIdx++] = FileBlock.createFbFileBlock(fbb,
              loc.getOffset(), loc.getLength(),
              (short) hostIndex.getIndex(REMOTE_NETWORK_ADDRESS));
        } else {
          fbFileBlockOffsets[blockIdx++] =
              FileBlock.createFbFileBlock(fbb, loc, hostIndex, numUnknownDiskIds);
        }
      }
      return new FileDescriptor(createFbFileDesc(fbb, fileStatus, relPath,
          fbFileBlockOffsets, isEc));
    }

    /**
     * Creates the file descriptor of a file represented by 'fileStatus' that
     * resides in a filesystem that doesn't support the BlockLocation API (e.g. S3).
     */
    public static FileDescriptor createWithNoBlocks(FileStatus fileStatus,
        String relPath) {
      FlatBufferBuilder fbb = new FlatBufferBuilder(1);
      return new FileDescriptor(createFbFileDesc(fbb, fileStatus, relPath, null, false));
    }

    /**
     * Serializes the metadata of a file descriptor represented by 'fileStatus' into a
     * FlatBuffer using 'fbb' and returns the associated FbFileDesc object.
     * 'fbFileBlockOffsets' are the offsets of the serialized block metadata of this file
     * in the underlying buffer. Can be null if there are no blocks.
     */
    private static FbFileDesc createFbFileDesc(FlatBufferBuilder fbb,
        FileStatus fileStatus, String relPath, int[] fbFileBlockOffets, boolean isEc) {
      // A negative block vector offset is used when no block offsets are specified.
      int blockVectorOffset = -1;
      if (fbFileBlockOffets != null) {
        blockVectorOffset = FbFileDesc.createFileBlocksVector(fbb, fbFileBlockOffets);
      }
      int relPathOffset = fbb.createString(ByteBuffer.wrap(relPath.getBytes(Charset.forName("UTF-8"))));
//      int relPathOffset = fbb.createString(relPath);
      FbFileDesc.startFbFileDesc(fbb);
      // TODO(todd) rename to RelativePathin the FBS
      FbFileDesc.addRelativePath(fbb, relPathOffset);
      FbFileDesc.addLength(fbb, fileStatus.getLen());
      FbFileDesc.addLastModificationTime(fbb, fileStatus.getModificationTime());
      FbFileDesc.addIsEc(fbb, isEc);
      HdfsCompression comp = HdfsCompression.fromFileName(fileStatus.getPath().getName());
      FbFileDesc.addCompression(fbb, comp.toFb());
      if (blockVectorOffset >= 0) FbFileDesc.addFileBlocks(fbb, blockVectorOffset);
      fbb.finish(FbFileDesc.endFbFileDesc(fbb));
      // To eliminate memory fragmentation, copy the contents of the FlatBuffer to the
      // smallest possible ByteBuffer.
      ByteBuffer bb = fbb.dataBuffer().slice();
      ByteBuffer compressedBb = ByteBuffer.allocate(bb.capacity());
      compressedBb.put(bb);
      return FbFileDesc.getRootAsFbFileDesc((ByteBuffer)compressedBb.flip());
    }

    public String getRelativePath() { return fbFileDescriptor_.relativePath(); }
    public long getFileLength() { return fbFileDescriptor_.length(); }

    /** Compute the total length of files in fileDescs */
    public static long computeTotalFileLength(Collection<FileDescriptor> fileDescs) {
      long totalLength = 0;
      for (FileDescriptor fileDesc: fileDescs) {
        totalLength += fileDesc.getFileLength();
      }
      return totalLength;
    }

    public HdfsCompression getFileCompression() {
      return HdfsCompression.valueOf(FbCompression.name(fbFileDescriptor_.compression()));
    }

    public long getModificationTime() { return fbFileDescriptor_.lastModificationTime(); }
    public int getNumFileBlocks() { return fbFileDescriptor_.fileBlocksLength(); }
    public boolean getIsEc() {return fbFileDescriptor_.isEc(); }

    public FbFileBlock getFbFileBlock(int idx) {
      return fbFileDescriptor_.fileBlocks(idx);
    }

    public THdfsFileDesc toThrift() {
      THdfsFileDesc fd = new THdfsFileDesc();
      ByteBuffer bb = fbFileDescriptor_.getByteBuffer();
      fd.setFile_desc_data(bb);
      return fd;
    }

    @Override
    public String toString() {
      int numFileBlocks = getNumFileBlocks();
      List<String> blocks = Lists.newArrayListWithCapacity(numFileBlocks);
      for (int i = 0; i < numFileBlocks; ++i) {
        blocks.add(FileBlock.debugString(getFbFileBlock(i)));
      }
      return Objects.toStringHelper(this)
          .add("RelativePath", getRelativePath())
          .add("Length", getFileLength())
          .add("Compression", getFileCompression())
          .add("ModificationTime", getModificationTime())
          .add("Blocks", Joiner.on(", ").join(blocks)).toString();
    }

    @Override
    public int compareTo(FileDescriptor otherFd) {
      return getRelativePath().compareTo(otherFd.getRelativePath());
    }

    /**
     * Function to convert from a byte[] flatbuffer to the wrapper class. Note that
     * this returns a shallow copy which continues to reflect any changes to the
     * passed byte[].
     */
    public static final Function<byte[], FileDescriptor> FROM_BYTES =
        new Function<byte[], FileDescriptor>() {
          @Override
          public FileDescriptor apply(byte[] input) {
            ByteBuffer bb = ByteBuffer.wrap(input);
            return new FileDescriptor(FbFileDesc.getRootAsFbFileDesc(bb));
          }
        };

    /**
     * Function to convert from the wrapper class to a raw byte[]. Note that
     * this returns a shallow copy and callers should not modify the returned array.
     */
    public static final Function<FileDescriptor, byte[]> TO_BYTES =
        new Function<FileDescriptor, byte[]>() {
          @Override
          public byte[] apply(FileDescriptor fd) {
            ByteBuffer bb = fd.fbFileDescriptor_.getByteBuffer();
            byte[] arr = bb.array();
            assert bb.arrayOffset() == 0 && bb.remaining() == arr.length;
            return arr;
          }
    };

  /**
   * Static utility methods to serialize and access file block metadata from FlatBuffers.
   */
  public static class FileBlock {
    // Bit mask used to extract the replica host id and cache info of a file block.
    // Use ~REPLICA_HOST_IDX_MASK to extract the cache info (stored in MSB).
    private static short REPLICA_HOST_IDX_MASK = (1 << 15) - 1;

    /**
     * Constructs an FbFileBlock object from the block location metadata
     * 'loc'. Serializes the file block metadata into a FlatBuffer using 'fbb' and
     * returns the offset in the underlying buffer where the encoded file block starts.
     * 'hostIndex' stores the network addresses of the datanodes that store the files of
     * the parent HdfsTable. Populates 'numUnknownDiskIds' with the number of unknown disk
     * ids.
     */
    public static int createFbFileBlock(FlatBufferBuilder fbb, BlockLocation loc,
        ListMap<TNetworkAddress> hostIndex, Reference<Long> numUnknownDiskIds)
        throws IOException {
      Preconditions.checkNotNull(fbb);
      Preconditions.checkNotNull(loc);
      Preconditions.checkNotNull(hostIndex);
      // replica host ids
      FbFileBlock.startReplicaHostIdxsVector(fbb, loc.getNames().length);
      Set<String> cachedHosts = Sets.newHashSet(loc.getCachedHosts());
      // Enumerate all replicas of the block, adding any unknown hosts
      // to hostIndex. We pick the network address from getNames() and
      // map it to the corresponding hostname from getHosts().
      for (int i = 0; i < loc.getNames().length; ++i) {
        TNetworkAddress networkAddress = BlockReplica.parseLocation(loc.getNames()[i]);
        short replicaIdx = (short) hostIndex.getIndex(networkAddress);
        boolean isReplicaCached = cachedHosts.contains(loc.getHosts()[i]);
        replicaIdx = makeReplicaIdx(isReplicaCached, replicaIdx);
        fbb.addShort(replicaIdx);
      }
      int fbReplicaHostIdxOffset = fbb.endVector();
      short[] diskIds = createDiskIds(loc, numUnknownDiskIds);
      Preconditions.checkState(diskIds.length == loc.getNames().length,
          "Mismatch detected between number of diskIDs and block locations for block: " +
          loc.toString());
      int fbDiskIdsOffset = FbFileBlock.createDiskIdsVector(fbb, diskIds);
      FbFileBlock.startFbFileBlock(fbb);
      FbFileBlock.addOffset(fbb, loc.getOffset());
      FbFileBlock.addLength(fbb, loc.getLength());
      FbFileBlock.addReplicaHostIdxs(fbb, fbReplicaHostIdxOffset);
      FbFileBlock.addDiskIds(fbb, fbDiskIdsOffset);
      return FbFileBlock.endFbFileBlock(fbb);
    }

    private static short makeReplicaIdx(boolean isReplicaCached, int hostIdx) {
      Preconditions.checkArgument((hostIdx & REPLICA_HOST_IDX_MASK) == hostIdx,
          "invalid hostIdx: %s", hostIdx);
      return isReplicaCached ? (short) (hostIdx | ~REPLICA_HOST_IDX_MASK)
          : (short)hostIdx;
    }

    /**
     * Constructs an FbFileBlock object from the file block metadata that comprise block's
     * 'offset', 'length' and replica index 'replicaIdx'. Serializes the file block
     * metadata into a FlatBuffer using 'fbb' and returns the offset in the underlying
     * buffer where the encoded file block starts.
     */
    public static int createFbFileBlock(FlatBufferBuilder fbb, long offset, long length,
        short replicaIdx) {
      Preconditions.checkNotNull(fbb);
      FbFileBlock.startReplicaHostIdxsVector(fbb, 1);
      fbb.addShort(replicaIdx);
      int fbReplicaHostIdxOffset = fbb.endVector();
      FbFileBlock.startFbFileBlock(fbb);
      FbFileBlock.addOffset(fbb, offset);
      FbFileBlock.addLength(fbb, length);
      FbFileBlock.addReplicaHostIdxs(fbb, fbReplicaHostIdxOffset);
      return FbFileBlock.endFbFileBlock(fbb);
    }

    /**
     * Creates the disk ids of a block from its BlockLocation 'location'. Returns the
     * disk ids and populates 'numUnknownDiskIds' with the number of unknown disk ids.
     */
    private static short[] createDiskIds(BlockLocation location,
        Reference<Long> numUnknownDiskIds) throws IOException {
      long unknownDiskIdCount = 0;
      String[] storageIds = location.getStorageIds();
      String[] hosts = location.getHosts();
      if (storageIds.length != hosts.length) {
        storageIds = new String[hosts.length];
      }
      short[] diskIDs = new short[storageIds.length];
      for (int i = 0; i < storageIds.length; ++i) {
        if (Strings.isNullOrEmpty(storageIds[i])) {
          diskIDs[i] = (short) -1;
          ++unknownDiskIdCount;
        } else {
          diskIDs[i] = DiskIdMapper.INSTANCE.getDiskId(hosts[i], storageIds[i]);
        }
      }
      long count = numUnknownDiskIds.getRef() + unknownDiskIdCount;
      numUnknownDiskIds.setRef(Long.valueOf(count));
      return diskIDs;
    }

    public static long getOffset(FbFileBlock fbFileBlock) { return fbFileBlock.offset(); }
    public static long getLength(FbFileBlock fbFileBlock) { return fbFileBlock.length(); }
    // Returns true if there is at least one cached replica.
    public static boolean hasCachedReplica(FbFileBlock fbFileBlock) {
      boolean hasCachedReplica = false;
      for (int i = 0; i < fbFileBlock.replicaHostIdxsLength(); ++i) {
        hasCachedReplica |= isReplicaCached(fbFileBlock, i);
      }
      return hasCachedReplica;
    }

    public static int getNumReplicaHosts(FbFileBlock fbFileBlock) {
      return fbFileBlock.replicaHostIdxsLength();
    }

    public static int getReplicaHostIdx(FbFileBlock fbFileBlock, int pos) {
      int idx = fbFileBlock.replicaHostIdxs(pos);
      return idx & REPLICA_HOST_IDX_MASK;
    }

    // Returns true if the block replica 'replicaIdx' is cached.
    public static boolean isReplicaCached(FbFileBlock fbFileBlock, int replicaIdx) {
      int idx = fbFileBlock.replicaHostIdxs(replicaIdx);
      return (idx & ~REPLICA_HOST_IDX_MASK) != 0;
    }

    /**
     * Return the disk id of the block in BlockLocation.getNames()[hostIndex]; -1 if
     * disk id is not supported.
     */
    public static int getDiskId(FbFileBlock fbFileBlock, int hostIndex) {
      if (fbFileBlock.diskIdsLength() == 0) return -1;
      return fbFileBlock.diskIds(hostIndex);
    }

    /**
     * Returns a string representation of a FbFileBlock.
     */
    public static String debugString(FbFileBlock fbFileBlock) {
      int numReplicaHosts = getNumReplicaHosts(fbFileBlock);
      List<Integer> diskIds = Lists.newArrayListWithCapacity(numReplicaHosts);
      List<Integer> replicaHosts = Lists.newArrayListWithCapacity(numReplicaHosts);
      List<Boolean> isBlockCached = Lists.newArrayListWithCapacity(numReplicaHosts);
      for (int i = 0; i < numReplicaHosts; ++i) {
        diskIds.add(getDiskId(fbFileBlock, i));
        replicaHosts.add(getReplicaHostIdx(fbFileBlock, i));
        isBlockCached.add(isReplicaCached(fbFileBlock, i));
      }
      StringBuilder builder = new StringBuilder();
      return builder.append("Offset: " + getOffset(fbFileBlock))
          .append("Length: " + getLength(fbFileBlock))
          .append("IsCached: " + hasCachedReplica(fbFileBlock))
          .append("ReplicaHosts: " + Joiner.on(", ").join(replicaHosts))
          .append("DiskIds: " + Joiner.on(", ").join(diskIds))
          .append("Caching: " + Joiner.on(", ").join(isBlockCached))
          .toString();
    }
  }
  public static class BlockReplica {
    private final boolean isCached_;
    private final short hostIdx_;

    public BlockReplica(short hostIdx, boolean isCached) {
      hostIdx_ = hostIdx;
      isCached_ = isCached;
    }

    /**
     * Parses the location (an ip address:port string) of the replica and returns a
     * TNetworkAddress with this information, or null if parsing fails.
     */
    public static TNetworkAddress parseLocation(String location) {
      Preconditions.checkNotNull(location);
      String[] ip_port = location.split(":");
      if (ip_port.length != 2) return null;
      try {
        return new TNetworkAddress(ip_port[0], Integer.parseInt(ip_port[1]));
      } catch (NumberFormatException e) {
        return null;
      }
    }

    public boolean isCached() { return isCached_; }
    public short getHostIdx() { return hostIdx_; }
  }

}
