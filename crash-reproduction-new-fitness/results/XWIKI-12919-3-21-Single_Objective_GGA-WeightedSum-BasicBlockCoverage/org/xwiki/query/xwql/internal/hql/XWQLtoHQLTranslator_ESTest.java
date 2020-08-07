/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 14:36:45 UTC 2020
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
import org.xwiki.query.xwql.internal.QueryContext;
import org.xwiki.query.xwql.internal.hql.XWQLtoHQLTranslator;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XWQLtoHQLTranslator_ESTest extends XWQLtoHQLTranslator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XWQLtoHQLTranslator xWQLtoHQLTranslator0 = new XWQLtoHQLTranslator();
      DocumentAccessBridge documentAccessBridge0 = mock(DocumentAccessBridge.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(documentAccessBridge0).toString();
      Injector.inject(xWQLtoHQLTranslator0, (Class<?>) XWQLtoHQLTranslator.class, "documentAccessBridge", (Object) documentAccessBridge0);
      Injector.validateBean(xWQLtoHQLTranslator0, (Class<?>) XWQLtoHQLTranslator.class);
      QueryContext queryContext0 = mock(QueryContext.class, new ViolatedAssumptionAnswer());
      xWQLtoHQLTranslator0.getPrinter(queryContext0);
      xWQLtoHQLTranslator0.translate("");
      XWQLtoHQLTranslator xWQLtoHQLTranslator1 = new XWQLtoHQLTranslator();
      DocumentAccessBridge documentAccessBridge1 = mock(DocumentAccessBridge.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(documentAccessBridge1).toString();
      Injector.inject(xWQLtoHQLTranslator1, (Class<?>) XWQLtoHQLTranslator.class, "documentAccessBridge", (Object) documentAccessBridge1);
      Injector.validateBean(xWQLtoHQLTranslator1, (Class<?>) XWQLtoHQLTranslator.class);
      DocumentAccessBridge documentAccessBridge2 = xWQLtoHQLTranslator0.getDocumentAccessBridge();
      DocumentAccessBridge documentAccessBridge3 = xWQLtoHQLTranslator1.getDocumentAccessBridge();
      xWQLtoHQLTranslator0.getOutputLanguage();
      XWQLtoHQLTranslator xWQLtoHQLTranslator2 = new XWQLtoHQLTranslator();
      Injector.inject(xWQLtoHQLTranslator2, (Class<?>) XWQLtoHQLTranslator.class, "documentAccessBridge", (Object) documentAccessBridge3);
      Injector.validateBean(xWQLtoHQLTranslator2, (Class<?>) XWQLtoHQLTranslator.class);
      XWQLtoHQLTranslator xWQLtoHQLTranslator3 = new XWQLtoHQLTranslator();
      Injector.inject(xWQLtoHQLTranslator3, (Class<?>) XWQLtoHQLTranslator.class, "documentAccessBridge", (Object) documentAccessBridge2);
      Injector.validateBean(xWQLtoHQLTranslator3, (Class<?>) XWQLtoHQLTranslator.class);
      try { 
        xWQLtoHQLTranslator1.translate(":pr1~t!5w");
        fail("Expecting exception: ParserException");
      
      } catch(ParserException e) {
         //
         // [1,1] expecting: select
         //
         verifyException("org.xwiki.query.jpql.parser.Parser", e);
      }
  }
}