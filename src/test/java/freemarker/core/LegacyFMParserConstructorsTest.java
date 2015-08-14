/*
 * Copyright 2014 Attila Szegedi, Daniel Dekany, Jonathan Revusky
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
package freemarker.core;

import org.junit.Test;

public class LegacyFMParserConstructorsTest {

    @Test
    public void test1() throws ParseException {
        FMParser parser = new FMParser("x");
        parser.Root();
    }
    
    @Test
    public void testCreateExpressionParser() throws ParseException {
         FMParser parser = FMParser.createExpressionParser("x + y");
         parser.Expression();
    }
    
}
