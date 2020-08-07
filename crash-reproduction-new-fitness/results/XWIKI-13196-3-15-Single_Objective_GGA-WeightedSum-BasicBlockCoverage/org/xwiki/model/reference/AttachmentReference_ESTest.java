/*
 * This file was automatically generated by EvoSuite
 * Thu May 14 20:22:26 UTC 2020
 */

package org.xwiki.model.reference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.model.EntityType;
import org.xwiki.model.reference.AttachmentReference;
import org.xwiki.model.reference.DocumentReference;
import org.xwiki.model.reference.EntityReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AttachmentReference_ESTest extends AttachmentReference_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DocumentReference documentReference0 = mock(DocumentReference.class, new ViolatedAssumptionAnswer());
      doReturn((EntityReference) null, (EntityReference) null).when(documentReference0).getParent();
      doReturn((EntityType) null).when(documentReference0).getType();
      AttachmentReference attachmentReference0 = new AttachmentReference("] for an attachment reference", documentReference0);
      EntityType entityType0 = EntityType.OBJECT_PROPERTY;
      attachmentReference0.equals((EntityReference) attachmentReference0, entityType0, entityType0);
      attachmentReference0.getType();
      attachmentReference0.getParent();
      attachmentReference0.getDocumentReference();
      attachmentReference0.hasParent((EntityReference) null);
      AttachmentReference attachmentReference1 = new AttachmentReference("", (DocumentReference) null);
  }
}