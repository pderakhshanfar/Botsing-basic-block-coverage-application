/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 13:20:56 UTC 2020
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
      String string0 = "OBJECT";
      EntityType entityType0 = EntityType.BLOCK;
      EntityReference entityReference0 = new EntityReference("OBJECT", entityType0, (EntityReference) null);
      entityReference0.setParameter("", entityType0);
      entityReference0.getName();
      entityReference0.equalsNonRecursive((EntityReference) null);
      EntityReference entityReference1 = entityReference0.removeParent((EntityReference) null);
      EntityType entityType1 = EntityType.BLOCK;
      entityReference1.extractReference(entityType1);
      EntityType entityType2 = EntityType.OBJECT;
      EntityReference entityReference2 = new EntityReference((String) null, entityType2, entityReference0);
  }
}