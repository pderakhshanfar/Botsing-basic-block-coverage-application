/*
 * This file was automatically generated by EvoSuite
 * Thu May 14 13:32:28 UTC 2020
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
      String string0 = "Ej6p5V3;h2NL]C[";
      EntityType entityType0 = EntityType.ATTACHMENT;
      EntityReference entityReference0 = new EntityReference("Ej6p5V3;h2NL]C[", entityType0);
      String string1 = "";
      EntityReference entityReference1 = new EntityReference("", entityType0);
  }
}