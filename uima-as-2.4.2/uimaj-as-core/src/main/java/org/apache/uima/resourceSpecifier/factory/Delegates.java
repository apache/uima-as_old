/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.uima.resourceSpecifier.factory;

import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Interface Delegates.
 */
public interface Delegates {
  
  /**
   * Gets the delegates.
   *
   * @return the delegates
   */
  public List<DelegateAnalysisEngine> getDelegates();
  
  /**
   * Adds the delegate.
   *
   * @param dae the dae
   */
  public void addDelegate(DelegateAnalysisEngine dae);
  
  /**
   * Gets the remote delegates.
   *
   * @return the remote delegates
   */
  public List<RemoteDelegateEngine> getRemoteDelegates();
  
  /**
   * Gets the colocated delegate engine.
   *
   * @return the colocated delegate engine
   */
  public List<ColocatedDelegateEngine> getColocatedDelegateEngine();
  
}
