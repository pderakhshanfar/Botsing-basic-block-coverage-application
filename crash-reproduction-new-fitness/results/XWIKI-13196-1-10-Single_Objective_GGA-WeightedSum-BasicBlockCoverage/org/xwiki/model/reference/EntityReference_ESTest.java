/*
 * This file was automatically generated by EvoSuite
 * Thu May 14 20:18:13 UTC 2020
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
      String string1 = "";
      EntityType entityType1 = EntityType.BLOCK;
      EntityType entityType2 = EntityType.ATTACHMENT;
      EntityReference entityReference0 = new EntityReference("jX5n.Ug0", entityType2);
      EntityReference entityReference1 = new EntityReference(entityReference0);
      Map<String, Serializable> map0 = null;
      EntityReference entityReference2 = new EntityReference("jX5n.Ug0", entityType0, entityReference1, (Map<String, Serializable>) null);
      EntityReference entityReference3 = new EntityReference("", entityType1, entityReference2);
  }
}