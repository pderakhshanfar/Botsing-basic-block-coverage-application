/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 20:50:20 UTC 2020
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
      String string0 = "";
      EntityType entityType0 = EntityType.BLOCK;
      String string1 = "An Entity Reference type cannot be null";
      EntityReference entityReference0 = new EntityReference("An Entity Reference type cannot be null", entityType0);
      EntityReference entityReference1 = new EntityReference(entityReference0);
      EntityReference entityReference2 = new EntityReference(entityReference1, entityReference1);
      EntityReference entityReference3 = new EntityReference("", entityType0, entityReference2, (Map<String, Serializable>) null);
  }
}