/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 13:46:07 UTC 2020
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
      EntityType entityType0 = EntityType.SPACE;
      EntityReference entityReference0 = new EntityReference(")Lp", entityType0);
      entityReference0.getReversedReferenceChain();
      EntityReference entityReference1 = new EntityReference("X$Q5LL`#", entityType0);
      entityReference0.setParameter(" \":-HZkWk", " \":-HZkWk");
      entityReference1.getName();
      EntityType entityType1 = EntityType.WIKI;
      EntityReference entityReference2 = new EntityReference("", entityType1);
  }
}