/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 20:36:26 UTC 2020
 */

package org.xwiki.rendering.internal.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import javax.inject.Provider;
import org.apache.commons.dbcp2.PoolingConnection;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.xwiki.component.internal.ContextRootComponentManager;
import org.xwiki.component.internal.UserComponentManager;
import org.xwiki.model.reference.EntityReference;
import org.xwiki.model.reference.EntityReferenceSerializer;
import org.xwiki.rendering.internal.parser.DefaultContentParser;
import org.xwiki.rendering.internal.parser.creole.CreoleParser;
import org.xwiki.rendering.internal.parser.twiki.TWikiParser;
import org.xwiki.rendering.syntax.Syntax;
import org.xwiki.rendering.xdomxmlcurrent.internal.parser.XDOMXMLParser;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DefaultContentParser_ESTest extends DefaultContentParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultContentParser defaultContentParser0 = new DefaultContentParser();
      Provider<ContextRootComponentManager> provider0 = (Provider<ContextRootComponentManager>) mock(Provider.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultContentParser0, (Class<?>) DefaultContentParser.class, "componentManagerProvider", (Object) provider0);
      EntityReferenceSerializer<XDOMXMLParser> entityReferenceSerializer0 = (EntityReferenceSerializer<XDOMXMLParser>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultContentParser0, (Class<?>) DefaultContentParser.class, "serializer", (Object) entityReferenceSerializer0);
      Injector.validateBean(defaultContentParser0, (Class<?>) DefaultContentParser.class);
      DefaultContentParser defaultContentParser1 = new DefaultContentParser();
      Provider<UserComponentManager> provider1 = (Provider<UserComponentManager>) mock(Provider.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultContentParser1, (Class<?>) DefaultContentParser.class, "componentManagerProvider", (Object) provider1);
      EntityReferenceSerializer<PoolingConnection> entityReferenceSerializer1 = (EntityReferenceSerializer<PoolingConnection>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultContentParser1, (Class<?>) DefaultContentParser.class, "serializer", (Object) entityReferenceSerializer1);
      Injector.validateBean(defaultContentParser1, (Class<?>) DefaultContentParser.class);
      DefaultContentParser defaultContentParser2 = new DefaultContentParser();
      Provider<CreoleParser> provider2 = (Provider<CreoleParser>) mock(Provider.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(provider2).get();
      Injector.inject(defaultContentParser2, (Class<?>) DefaultContentParser.class, "componentManagerProvider", (Object) provider2);
      EntityReferenceSerializer<TWikiParser> entityReferenceSerializer2 = (EntityReferenceSerializer<TWikiParser>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultContentParser2, (Class<?>) DefaultContentParser.class, "serializer", (Object) entityReferenceSerializer2);
      Injector.validateBean(defaultContentParser2, (Class<?>) DefaultContentParser.class);
      String string0 = null;
      Syntax syntax0 = mock(Syntax.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(syntax0).toIdString();
      EntityReference entityReference0 = mock(EntityReference.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      defaultContentParser2.parse((String) null, syntax0, entityReference0);
  }
}