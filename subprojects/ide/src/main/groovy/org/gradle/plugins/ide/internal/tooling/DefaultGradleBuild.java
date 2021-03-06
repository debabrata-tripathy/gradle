/*
 * Copyright 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gradle.plugins.ide.internal.tooling;

import org.gradle.tooling.internal.gradle.BasicGradleProject;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

public class DefaultGradleBuild implements Serializable {
    private BasicGradleProject rootProject;
    private Set<BasicGradleProject> projects = new LinkedHashSet<BasicGradleProject>();

    public BasicGradleProject getRootProject() {
        return rootProject;
    }

    public DefaultGradleBuild setRootProject(BasicGradleProject rootProject) {
        this.rootProject = rootProject;
        return this;
    }

    public Set<? extends BasicGradleProject> getProjects() {
        return projects;
    }

    public void addProject(BasicGradleProject project) {
        projects.add(project);
    }
}
