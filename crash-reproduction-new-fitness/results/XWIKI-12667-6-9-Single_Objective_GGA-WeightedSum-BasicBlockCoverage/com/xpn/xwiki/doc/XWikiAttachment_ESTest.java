/*
 * This file was automatically generated by EvoSuite
 * Thu May 14 13:24:39 UTC 2020
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
      XWikiDocument xWikiDocument0 = mock(XWikiDocument.class, new ViolatedAssumptionAnswer());
      XWikiAttachment xWikiAttachment0 = new XWikiAttachment(xWikiDocument0, "uaZ]v");
      xWikiAttachment0.incrementVersion();
      xWikiAttachment0.setId(100000L);
      XWikiAttachment xWikiAttachment1 = new XWikiAttachment();
      XWikiContext xWikiContext0 = new XWikiContext();
      xWikiContext0.getUserReference();
      xWikiAttachment1.setAuthorReference((DocumentReference) null);
      XWikiDocument xWikiDocument1 = mock(XWikiDocument.class, new ViolatedAssumptionAnswer());
      doReturn((DocumentReference) null, (DocumentReference) null).when(xWikiDocument1).getDocumentReference();
      xWikiAttachment1.setDoc(xWikiDocument1);
      xWikiAttachment1.setAuthor("");
      xWikiAttachment0.apply(xWikiAttachment1);
      // Undeclared exception!
      xWikiAttachment1.getMimeType(xWikiContext0);
  }
}