/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 18:05:27 UTC 2020
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
      EntityType entityType0 = EntityType.DOCUMENT;
      EntityReference entityReference0 = new EntityReference("C^CAx6)8", entityType0);
      entityReference0.getParameters();
      EntityType entityType1 = EntityType.DOCUMENT;
      entityReference0.setType(entityType1);
      entityReference0.getParameter("");
      entityReference0.getParameter("");
      entityReference0.getType();
      EntityReference entityReference1 = new EntityReference("", entityType0);
  }
}