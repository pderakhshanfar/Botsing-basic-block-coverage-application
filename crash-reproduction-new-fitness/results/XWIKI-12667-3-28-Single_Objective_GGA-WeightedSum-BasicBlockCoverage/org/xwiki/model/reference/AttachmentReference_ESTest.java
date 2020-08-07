/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 17:52:06 UTC 2020
 */

package org.xwiki.model.reference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.model.EntityType;
import org.xwiki.model.reference.AttachmentReference;
import org.xwiki.model.reference.DocumentReference;
import org.xwiki.model.reference.LocalDocumentReference;
import org.xwiki.model.reference.WikiReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AttachmentReference_ESTest extends AttachmentReference_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DocumentReference documentReference0 = mock(DocumentReference.class, new ViolatedAssumptionAnswer());
      Locale locale0 = Locale.CHINA;
      DocumentReference documentReference1 = new DocumentReference("*2I0:Kr]", "*2I0:Kr]", "*2I0:Kr]", locale0);
      WikiReference wikiReference0 = new WikiReference("%~S*@>nOF?{");
      WikiReference wikiReference1 = new WikiReference(wikiReference0);
      DocumentReference documentReference2 = documentReference1.setWikiReference(wikiReference1);
      AttachmentReference attachmentReference0 = new AttachmentReference("SgyE5M'/NWn[-", documentReference2);
      attachmentReference0.getParameter("%~S*@>nOF?{");
      attachmentReference0.getParameter("%~S*@>nOF?{");
      attachmentReference0.equals((Object) null);
      EntityType entityType0 = EntityType.SPACE;
      attachmentReference0.extractReference(entityType0);
      LocalDocumentReference localDocumentReference0 = new LocalDocumentReference("*2I0:Kr]", documentReference1);
      attachmentReference0.equalsNonRecursive(localDocumentReference0);
      String string0 = "] for an attachment reference";
      AttachmentReference attachmentReference1 = new AttachmentReference("] for an attachment reference", documentReference0);
      attachmentReference0.extractReference(entityType0);
      AttachmentReference attachmentReference2 = new AttachmentReference("", documentReference1);
  }
}