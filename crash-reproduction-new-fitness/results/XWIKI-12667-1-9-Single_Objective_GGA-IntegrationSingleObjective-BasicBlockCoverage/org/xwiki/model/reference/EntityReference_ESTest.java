/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 13:25:05 UTC 2020
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
      String string0 = "";
      EntityType entityType0 = EntityType.OBJECT_PROPERTY;
      EntityReference entityReference0 = null;
      String string1 = "SPACE";
      EntityReference entityReference1 = new EntityReference("SPACE", entityType0);
      // Undeclared exception!
      entityReference1.setName("");
  }
}