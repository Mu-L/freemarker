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
 * Exposes <a href="http://www.jython.org" target="_blank">Jython</a> objects to templates.
 * The {@link freemarker.template.DefaultObjectWrapper default object wrapper} of FreeMarker automatically wraps Jython
 * nodes with this.
 *
 * <p>Most of the issues dealing with Jython objects are handled by the
 * {@link freemarker.ext.jython.JythonWrapper#wrap(Object)} method. In normal cases, this is the only method you should
 * use to turn an arbitrary Jython object into a FreeMarker {@link freemarker.template.TemplateModel}. Additionally, you
 * can manually create instances of any wrapper class using its constructors.
 */
package freemarker.ext.jython;