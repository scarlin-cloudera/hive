/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to you under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.hadoop.hive.ql.plan.impala;

import org.apache.calcite.plan.RelOptCluster;
import org.apache.calcite.plan.RelTraitSet;
import org.apache.calcite.rel.AbstractRelNode;
import org.apache.calcite.rel.RelNode;
import org.apache.calcite.rel.RelVisitor;
import org.apache.calcite.rel.metadata.RelMetadataQuery;
import org.apache.calcite.rel.type.RelDataType;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

import java.util.List;

/** XXX: comment needed
 * Abstract base class for relational expressions with a single input.
 *
 * <p>It is not required that single-input relational expressions use this
 * class as a base class. However, default implementations of methods make life
 * easier.
 */
public abstract class ImpalaMultiRel extends AbstractRelNode {
  //~ Instance fields --------------------------------------------------------

  protected List<RelNode> inputs;

  //~ Constructors -----------------------------------------------------------

  /**
   * Creates a <code>SingleRel</code>.
   *
   * @param cluster Cluster this relational expression belongs to
   * @param input   Input relational expression
   */
  protected ImpalaMultiRel(
      RelOptCluster cluster,
      RelTraitSet traits,
      List<RelNode> inputs) {
    super(cluster, traits);
    this.inputs = Lists.newArrayList(inputs);
  }

  //~ Methods ----------------------------------------------------------------

  @Override
  public RelNode getInput(int i) {
    return inputs.get(i);
  }

  @Override public List<RelNode> getInputs() {
    return inputs;
  }

  @Override
  public void childrenAccept(RelVisitor visitor) {
    int i = 0;
    for (RelNode input : inputs) {
      visitor.visit(inputs.get(i), i++, this);
    }
  }

  @Override public void replaceInput(
      int ordinalInParent,
      RelNode rel) {
    assert ordinalInParent < inputs.size();
    this.inputs.set(ordinalInParent, rel);
  }
}

// End ImpalaMultiRel.java
