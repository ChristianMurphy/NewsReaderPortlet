/**
 * Licensed to Apereo under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * Apereo licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License.  You may obtain a
 * copy of the License at the following location:
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
package org.jasig.portlet.newsreader;

/**
 * UserDefinedNewsDefinition represents a user-added news definition.
 *
 * @author Anthony Colebourne
 * @author Jen Bourey
 */
public class UserDefinedNewsDefinition extends NewsDefinition {

    private UserDefinedNewsConfiguration userConfiguration;

    /**
     * Default constructor
     */
    public UserDefinedNewsDefinition() {
        super();
    }

    /**
     * Construct a new user-defined news definition
     *
     * @param id
     * @param className
     * @param name
     */
    public UserDefinedNewsDefinition(Long id, String className, String name) {
        super(id, className, name);
    }

    /*
      * (non-Javadoc)
      * @see java.lang.Object#toString()
      */
    @Override
    public String toString() {
        return "id: " + getId() + ", name: " + getName() + ", parameters: "
                + getParameters().toString();
    }

    /**
     * Get the news configuration for this definition.
     *
     * @return
     */
    public UserDefinedNewsConfiguration getUserConfiguration() {
        return userConfiguration;
    }

    /**
     * Set the news configuration for this definition.
     *
     * @param userConfiguration
     */
    public void setUserConfiguration(
            UserDefinedNewsConfiguration userConfiguration) {
        this.userConfiguration = userConfiguration;
	}


}
