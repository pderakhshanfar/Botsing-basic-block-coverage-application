/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 18:11:41 UTC 2020
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
      String string0 = "4x&$Sr]Li}1%j4";
      EntityType entityType0 = EntityType.OBJECT_PROPERTY;
      EntityReference entityReference0 = new EntityReference("4x&$Sr]Li}1%j4", entityType0);
      EntityType entityType1 = EntityType.OBJECT_PROPERTY;
      entityReference0.equals(entityReference0, entityType1);
      entityReference0.getType();
      entityReference0.compareTo(entityReference0);
      entityReference0.equals((EntityReference) null, entityType0, entityType1);
      EntityReference entityReference1 = new EntityReference("4x&$Sr]Li}1%j4", entityType1);
      EntityReference entityReference2 = entityReference1.extractReference(entityType0);
      EntityType entityType2 = EntityType.DOCUMENT;
      entityReference2.equals(entityReference1, entityType2);
      EntityType entityType3 = EntityType.SPACE;
      EntityReference entityReference3 = new EntityReference("", entityType3);
  }
}