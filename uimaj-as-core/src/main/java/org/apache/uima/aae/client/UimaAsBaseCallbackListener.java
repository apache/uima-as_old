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
package org.apache.uima.aae.client;

import java.util.List;

import org.apache.uima.aae.monitor.statistics.AnalysisEnginePerformanceMetrics;
import org.apache.uima.cas.CAS;
import org.apache.uima.collection.EntityProcessStatus;

/**
 * This is an abstract listener class that provides empty implementation. The user listener code
 * extends this class to provide concrete implementations for the notification APIs.
 * 
 */
public abstract class UimaAsBaseCallbackListener implements UimaASStatusCallbackListener {

  /**
   * Called by Uima AS client API just before the CAS is send to the service.
   * 
   * @param status
   *          - status object containing id of the CAS being send.
   */
  public void onBeforeMessageSend(UimaASProcessStatus status) {
    // to be overridden
  }
  /**
   * Called by Uima AS client API before CAS processing begins at the remote
   * UIMA AS service
   * 
   * @param status
   * @param nodeIP
   * @param pid
   */
  public void onBeforeProcessCAS(UimaASProcessStatus status, String nodeIP, String pid) {
    // to be overridden
  }
  /**
   * The callback used to inform the application that the initialization request has completed. On
   * success aStatus will be null; on failure use the EntityProcessStatus class to get the details.
   * 
   * @param aStatus
   *          the status of the processing. This object contains a record of any Exception that
   *          occurred, as well as timing information.
   */
  public void initializationComplete(EntityProcessStatus aStatus) {

  }

  /**
   * Called when the processing of each entity has completed.
   * 
   * @param aCas
   *          the CAS containing the processed entity and the analysis results
   * @param aStatus
   *          the status of the processing. This object contains a record of any Exception that
   *          occurred, as well as timing information.
   */
  public void entityProcessComplete(CAS aCas, EntityProcessStatus aStatus) {

  }

  /**
   * Called when the processing of each entity has completed.
   * 
   * @param aCas
   *          the CAS containing the processed entity and the analysis results
   * @param aStatus
   *          the status of the processing. This object contains a record of any Exception that
   *          occurred, as well as timing information.
   * @param componentMetricsList
   *          List containing CAS per component performance breakdown as reported by UIMA
   *          aggregate. Useful for identifying how much time each component took to analyze
   *          the CAS.  
   */
  public void entityProcessComplete(CAS aCas, EntityProcessStatus aStatus, List<AnalysisEnginePerformanceMetrics> componentMetricsList) {
	  // If not overridden call the older version as it may have deen.
    entityProcessComplete(aCas, aStatus);
  }
  
  /**
   * The callback used to inform the application that the CPC request has completed. On success
   * aStatus will be null; on failure use the EntityProcessStatus class to get the details.
   * 
   * @param aStatus
   *          the status of the processing. This object contains a record of any Exception that
   *          occurred, as well as timing information.
   */
  public void collectionProcessComplete(EntityProcessStatus aStatus) {

  }

}
