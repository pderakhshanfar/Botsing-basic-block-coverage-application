/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 17:51:12 UTC 2020
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
      String string0 = " ~vj12+]K#?JTMq";
      EntityType entityType0 = EntityType.DOCUMENT;
      EntityReference entityReference0 = new EntityReference(" ~vj12+]K#?JTMq", entityType0);
      entityReference0.getName();
      entityReference0.hashCode();
      String string1 = null;
      // Undeclared exception!
      entityReference0.setName((String) null);
  }
}