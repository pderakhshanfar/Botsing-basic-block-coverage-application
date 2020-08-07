/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 20:50:23 UTC 2020
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
      String string0 = "BLOCK";
      EntityType entityType0 = EntityType.BLOCK;
      EntityType entityType1 = EntityType.BLOCK;
      EntityReference entityReference0 = null;
      EntityReference entityReference1 = new EntityReference("BLOCK", entityType1, (EntityReference) null);
      EntityReference entityReference2 = new EntityReference("BLOCK", entityType1, entityReference1);
      entityReference2.getName();
      EntityType entityType2 = EntityType.BLOCK;
      entityReference1.equals(entityReference2, entityType1, entityType2);
      entityReference1.hasParent((EntityReference) null);
      String string1 = "";
      EntityReference entityReference3 = new EntityReference("", entityType2, entityReference1);
  }
}