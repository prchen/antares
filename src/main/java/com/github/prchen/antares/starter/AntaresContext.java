/*
 * Copyright 2018 the original author or authors
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
 */
package com.github.prchen.antares.starter;

import java.lang.annotation.Annotation;
import java.util.Set;

/**
 * The bean used to hold Antares class definitions
 * @see AntaresScan
 */
public interface AntaresContext {
    /**
     * Get classes scanned by {@link AntaresScan} which have the given annotation
     * @param advice The annotation class annotated by {@link AntaresManifestAdvice}
     * @return Set of the classes
     * @see AntaresScan
     * @see AntaresManifestAdvice
     */
    Set<Class<?>> getManifest(Class<? extends Annotation> advice);
}
