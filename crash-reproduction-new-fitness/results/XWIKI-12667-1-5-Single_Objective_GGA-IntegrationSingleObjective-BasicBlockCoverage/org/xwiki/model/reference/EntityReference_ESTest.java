/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 13:20:56 UTC 2020
 */

package org.xwiki.model.reference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Serializable;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xwiki.model.EntityType;
import org.xwiki.model.reference.EntityReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class EntityReference_ESTest extends EntityReference_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EntityType entityType0 = EntityType.OBJECT;
      EntityReference entityReference0 = new EntityReference("E?#`j%&'FI|*Pe}[q+", entityType0);
      EntityType entityType1 = EntityType.OBJECT;
      entityReference0.setType(entityType1);
      entityReference0.size();
      EntityReference entityReference1 = new EntityReference(entityReference0, entityReference0);
      HashMap<String, Serializable> hashMap0 = new HashMap<String, Serializable>();
      entityReference1.setParameters(hashMap0);
      entityReference0.compareTo(entityReference1);
      // Undeclared exception!
      entityReference0.setName("");
  }
}