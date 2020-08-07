/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 10:53:18 UTC 2020
 */

package org.xwiki.query.xwql.internal.hql;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.xwiki.bridge.DocumentAccessBridge;
import org.xwiki.query.jpql.parser.ParserException;
import org.xwiki.query.xwql.internal.hql.XWQLtoHQLTranslator;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XWQLtoHQLTranslator_ESTest extends XWQLtoHQLTranslator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XWQLtoHQLTranslator xWQLtoHQLTranslator0 = new XWQLtoHQLTranslator();
      DocumentAccessBridge documentAccessBridge0 = mock(DocumentAccessBridge.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(documentAccessBridge0).toString();
      Injector.inject(xWQLtoHQLTranslator0, (Class<?>) XWQLtoHQLTranslator.class, "documentAccessBridge", (Object) documentAccessBridge0);
      Injector.validateBean(xWQLtoHQLTranslator0, (Class<?>) XWQLtoHQLTranslator.class);
      XWQLtoHQLTranslator xWQLtoHQLTranslator1 = new XWQLtoHQLTranslator();
      DocumentAccessBridge documentAccessBridge1 = mock(DocumentAccessBridge.class, new ViolatedAssumptionAnswer());
      Injector.inject(xWQLtoHQLTranslator1, (Class<?>) XWQLtoHQLTranslator.class, "documentAccessBridge", (Object) documentAccessBridge1);
      Injector.validateBean(xWQLtoHQLTranslator1, (Class<?>) XWQLtoHQLTranslator.class);
      xWQLtoHQLTranslator0.translate("");
      xWQLtoHQLTranslator1.getOutputLanguage();
      xWQLtoHQLTranslator0.getOutputLanguage();
      try { 
        xWQLtoHQLTranslator0.translate("from");
        fail("Expecting exception: ParserException");
      
      } catch(ParserException e) {
         //
         // [1,43] expecting: in, id
         //
         verifyException("org.xwiki.query.jpql.parser.Parser", e);
      }
  }
}