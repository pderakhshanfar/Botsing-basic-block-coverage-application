/*
 * This file was automatically generated by EvoSuite
 * Thu May 14 13:16:59 UTC 2020
 */

package com.xpn.xwiki.doc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.XWikiContext;
import com.xpn.xwiki.doc.XWikiAttachment;
import com.xpn.xwiki.doc.XWikiDocument;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.model.reference.DocumentReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XWikiAttachment_ESTest extends XWikiAttachment_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XWikiAttachment xWikiAttachment0 = new XWikiAttachment();
      XWikiDocument xWikiDocument0 = mock(XWikiDocument.class, new ViolatedAssumptionAnswer());
      doReturn((DocumentReference) null, (DocumentReference) null).when(xWikiDocument0).getDocumentReference();
      xWikiAttachment0.setDoc(xWikiDocument0);
      XWikiContext xWikiContext0 = null;
      xWikiAttachment0.loadContent((XWikiContext) null);
      xWikiAttachment0.isContentDirty();
      XWikiDocument xWikiDocument1 = null;
      XWikiAttachment xWikiAttachment1 = new XWikiAttachment((XWikiDocument) null, "bICTKXv");
      xWikiAttachment1.apply(xWikiAttachment0);
      // Undeclared exception!
      xWikiAttachment0.getReference();
  }
}