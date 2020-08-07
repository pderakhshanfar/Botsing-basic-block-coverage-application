/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 13:26:58 UTC 2020
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
import org.xwiki.model.reference.EntityReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AttachmentReference_ESTest extends AttachmentReference_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = "LFf;2i}1";
      DocumentReference documentReference0 = mock(DocumentReference.class, new ViolatedAssumptionAnswer());
      doReturn((Locale) null, (Locale) null).when(documentReference0).getLocale();
      doReturn((String) null, (String) null, (String) null, (String) null).when(documentReference0).toString();
      doReturn((String) null, (String) null).when(documentReference0).getName();
      doReturn((EntityReference) null, (EntityReference) null, (EntityReference) null, (EntityReference) null).when(documentReference0).getParent();
      doReturn((EntityType) null, (EntityType) null, (EntityType) null, (EntityType) null, (EntityType) null).when(documentReference0).getType();
      AttachmentReference attachmentReference0 = new AttachmentReference("LFf;2i}1", documentReference0);
      EntityType entityType0 = EntityType.OBJECT;
      attachmentReference0.equals((EntityReference) attachmentReference0, entityType0);
      attachmentReference0.extractReference(entityType0);
      EntityType entityType1 = EntityType.CLASS_PROPERTY;
      attachmentReference0.equals((EntityReference) null, entityType1, entityType1);
      attachmentReference0.getParameter("LFf;2i}1");
      attachmentReference0.toString();
      attachmentReference0.getParameter("");
      String string1 = "";
      DocumentReference documentReference1 = mock(DocumentReference.class, new ViolatedAssumptionAnswer());
      AttachmentReference attachmentReference1 = new AttachmentReference("", documentReference1);
  }
}