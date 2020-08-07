/*
 * This file was automatically generated by EvoSuite
 * Thu May 14 13:39:11 UTC 2020
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
      EntityReference entityReference0 = new EntityReference("ATTACHMENT", entityType0);
      entityReference0.toString();
      entityReference0.getName();
      EntityType entityType1 = EntityType.CLASS_PROPERTY;
      EntityType entityType2 = EntityType.SPACE;
      entityReference0.equals(entityReference0, entityType1, entityType2);
      String string0 = null;
      EntityReference entityReference1 = new EntityReference((String) null, entityType0);
  }
}