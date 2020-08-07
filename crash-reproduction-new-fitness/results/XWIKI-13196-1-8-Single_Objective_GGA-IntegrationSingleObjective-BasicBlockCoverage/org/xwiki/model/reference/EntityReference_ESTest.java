/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 20:54:37 UTC 2020
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
      EntityType entityType0 = EntityType.WIKI;
      String string0 = "BLOCK";
      EntityReference entityReference0 = new EntityReference("BLOCK", entityType0);
      EntityReference entityReference1 = new EntityReference(entityReference0, entityReference0);
      entityReference0.getName();
      entityReference1.compareTo(entityReference0);
      entityReference1.size();
      entityReference1.setParent(entityReference0);
      Map<String, Serializable> map0 = entityReference1.getParameters();
      entityReference0.setParameters(map0);
      entityReference0.getReversedReferenceChain();
      // Undeclared exception!
      entityReference1.setName("");
  }
}