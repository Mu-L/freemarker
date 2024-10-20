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

/**
 * The {@linkplain freemarker.template.DefaultObjectWrapper default object wrapper} of FreeMarker uses
 * this to expose Java Beans and POJO-s to templates.
 *
 * <p>Most of the issues dealing with beans are handled by the {@link freemarker.ext.beans.BeansWrapper#wrap(Object)}
 * and {@link freemarker.ext.beans.BeansWrapper#getStaticModels()} methods. In normal cases, these are the only methods
 * you should use to turn an arbitrary Java object into a FreeMarker {@link freemarker.template.TemplateModel}.
 * Additionally, you can manually create instance of any wrapper class using its constructors. Note, however that in
 * such cases you bypass the eventual model caching of the wrapper.</p>
 */
package freemarker.ext.beans;