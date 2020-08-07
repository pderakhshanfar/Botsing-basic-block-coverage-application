/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 18:10:40 UTC 2020
 */

package org.xwiki.model.reference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Serializable;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xwiki.model.EntityType;
import org.xwiki.model.reference.EntityReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class EntityReference_ESTest extends EntityReference_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EntityType entityType0 = EntityType.OBJECT;
      EntityType entityType1 = EntityType.BLOCK;
      EntityReference entityReference0 = new EntityReference("9`*b`", entityType1);
      EntityReference entityReference1 = new EntityReference("_dG;(2.", entityType0, entityReference0);
      entityReference1.getParameter("9`*b`");
      entityReference1.setParameter("[EP<[*3@ww]j)bw*", "9`*b`");
      EntityType entityType2 = EntityType.OBJECT;
      EntityReference entityReference2 = new EntityReference("9`*b`", entityType2, entityReference1);
      HashMap<String, Serializable> hashMap0 = new HashMap<String, Serializable>();
      entityReference0.setParameters(hashMap0);
      entityReference0.equalsNonRecursive(entityReference2);
      EntityReference entityReference3 = entityReference1.replaceParent(entityReference0, entityReference2);
      EntityType entityType3 = EntityType.WIKI;
      EntityReference entityReference4 = new EntityReference("H$e62+sjrU|`UxhQG", entityType3, entityReference3);
      entityReference1.getRoot();
      EntityReference entityReference5 = new EntityReference("", entityType3);
  }
}