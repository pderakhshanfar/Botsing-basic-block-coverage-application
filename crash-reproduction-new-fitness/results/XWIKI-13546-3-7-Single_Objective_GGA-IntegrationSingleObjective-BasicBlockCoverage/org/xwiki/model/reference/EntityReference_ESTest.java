/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 13:39:14 UTC 2020
 */

package org.xwiki.model.reference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Serializable;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xwiki.model.EntityType;
import org.xwiki.model.reference.EntityReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class EntityReference_ESTest extends EntityReference_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EntityType entityType0 = EntityType.SPACE;
      EntityType entityType1 = EntityType.OBJECT;
      EntityReference entityReference0 = new EntityReference("dE9 '", entityType1);
      EntityReference entityReference1 = new EntityReference("]", entityType0, entityReference0);
      EntityReference entityReference2 = new EntityReference(entityReference1, entityReference0, entityReference1);
      Map<String, Serializable> map0 = entityReference2.getParameters();
      EntityReference entityReference3 = new EntityReference("", entityType0, entityReference2, map0);
  }
}