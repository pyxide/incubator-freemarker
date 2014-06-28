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

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Collections;

import org.junit.Ignore;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

@Ignore
public abstract class TemplateOutputTest {

    protected void assertOutput(String ftl, String expectedOut, Configuration cfg) throws IOException, TemplateException {
        Template t = new Template(null, ftl, cfg);
        StringWriter out = new StringWriter();
        t.process(Collections.emptyMap(), out);
        assertEquals(expectedOut, out.toString());
    }
    
}
