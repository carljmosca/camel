/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.management;

import org.apache.camel.support.TimerListenerManager;

/**
 * The {@link org.apache.camel.support.TimerListenerManager} used for tracking load statistics.
 * <p/>
 * From Camel 2.13 onwards the {@link ManagedLoadTimer} is only enabled if
 * {@link org.apache.camel.spi.ManagementStrategy#isLoadStatisticsEnabled()} is enabled.
 */
public class ManagedLoadTimer extends TimerListenerManager {

    // empty on purpose

}
