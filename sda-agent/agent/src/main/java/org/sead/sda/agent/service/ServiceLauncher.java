/*
 * Copyright 2015 The Trustees of Indiana University
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * @author luoyu@indiana.edu
 * @author isuriara@indiana.edu
 */

package org.sead.sda.agent.service;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.sead.nds.repository.Repository;
import org.sead.sda.agent.calls.CallConfig;
import org.sead.sda.agent.calls.CallDaemons;
import org.sead.sda.agent.engine.PropertiesReader;

public class ServiceLauncher {

    private static boolean onOf = false;
    private static final Logger log = Logger.getLogger(ServiceLauncher.class);


    public static void start() {
        if (!onOf) {
            if (log.isDebugEnabled()) {
                log.debug("SDA Agent started");
            }
            onOf = true;
        }
    }

    public static void shutDown() {
        if (onOf) {
            if (log.isDebugEnabled()) {
                log.debug("SDA Agent stopped");
            }
            onOf = false;
        }
    }

    public static boolean startShimCalls() {
        CallConfig callConfig = new CallConfig();
        CallDaemons callDaemons = new CallDaemons(callConfig);
        callDaemons.start();
        return true;
    }

    public static void main(String[] args) {
        try {
            // assumes there's a log4j.properties file in the running directory
            PropertyConfigurator.configure("./log4j.properties");
            PropertiesReader.init(args[0]);
            Repository.init(PropertiesReader.properties);
            ServiceLauncher.start();
            if (!ServiceLauncher.startShimCalls()) {
                System.out.println("Agent Server shutting down...");
                shutDown();
            } else {
                System.out.println("\nAgent Server started...");
                System.out.println("Polling C3P-R services...\n");
            }
        } catch (Exception e) {
            log.fatal("Unable to launch service", e);
            shutDown();
        }
    }
}
