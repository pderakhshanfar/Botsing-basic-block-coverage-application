/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 21:37:52 UTC 2020
 */

package com.xpn.xwiki.doc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.XWikiContext;
import com.xpn.xwiki.doc.XWikiDocument;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.model.reference.DocumentReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XWikiDocument_ESTest extends XWikiDocument_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DocumentReference documentReference0 = mock(DocumentReference.class, new ViolatedAssumptionAnswer());
      doReturn((Locale) null).when(documentReference0).getLocale();
      XWikiDocument xWikiDocument0 = new XWikiDocument(documentReference0);
      String string0 = "{%GH#b/PTPcDa;Of<";
      DocumentReference documentReference1 = mock(DocumentReference.class, new ViolatedAssumptionAnswer());
      int int0 = (-811);
      xWikiDocument0.getXObject(documentReference1, (-811));
      xWikiDocument0.getFirstObject("{%GH#b/PTPcDa;Of<");
      xWikiDocument0.getRealLocale();
      xWikiDocument0.getDefaultTemplate();
      xWikiDocument0.hasElement((-811));
      XWikiContext xWikiContext0 = null;
      // Undeclared exception!
      xWikiDocument0.getTranslationList((XWikiContext) null);
  }
}