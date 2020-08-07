/*
 * This file was automatically generated by EvoSuite
 * Thu May 14 13:25:51 UTC 2020
 */

package org.xwiki.model.reference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xwiki.model.EntityType;
import org.xwiki.model.reference.EntityReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class EntityReference_ESTest extends EntityReference_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = "%^L{M";
      EntityType entityType0 = EntityType.OBJECT_PROPERTY;
      EntityReference entityReference0 = new EntityReference("%^L{M", entityType0);
      EntityReference entityReference1 = entityReference0.getRoot();
      EntityReference entityReference2 = entityReference0.extractReference(entityType0);
      EntityType entityType1 = EntityType.CLASS_PROPERTY;
      entityReference2.equals(entityReference1, entityType1, entityType0);
      // Undeclared exception!
      entityReference2.setName("");
  }
}