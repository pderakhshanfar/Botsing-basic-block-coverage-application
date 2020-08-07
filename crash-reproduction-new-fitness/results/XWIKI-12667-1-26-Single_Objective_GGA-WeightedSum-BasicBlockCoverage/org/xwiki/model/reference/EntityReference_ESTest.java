/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 17:50:38 UTC 2020
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
      EntityType entityType0 = EntityType.SPACE;
      EntityReference entityReference0 = new EntityReference("ka<;#iG.tU IZ*y", entityType0);
      EntityReference entityReference1 = new EntityReference("ka<;#iG.tU IZ*y", entityType0);
      entityReference1.getReversedReferenceChain();
      entityReference1.setName("ka<;#iG.tU IZ*y");
      EntityReference entityReference2 = entityReference1.getRoot();
      entityReference0.getParameter("ka<;#iG.tU IZ*y");
      entityReference1.equals(entityReference2, entityType0);
      entityReference0.equals((Object) "");
      entityReference2.hashCode();
      Map<String, Serializable> map0 = entityReference1.getParameters();
      entityReference1.getType();
      entityReference1.setParameters(map0);
      EntityReference entityReference3 = entityReference0.replaceParent(entityReference2, entityReference2);
      entityReference2.hashCode();
      entityReference3.getParameter("DOCUMENT");
      String string0 = "";
      // Undeclared exception!
      entityReference2.setName("");
  }
}