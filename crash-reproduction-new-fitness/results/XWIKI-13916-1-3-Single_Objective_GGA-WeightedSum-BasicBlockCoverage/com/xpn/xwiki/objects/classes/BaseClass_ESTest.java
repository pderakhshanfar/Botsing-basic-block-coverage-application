/*
 * This file was automatically generated by EvoSuite
 * Thu May 14 14:26:16 UTC 2020
 */

package com.xpn.xwiki.objects.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.objects.classes.BaseClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseClass_ESTest extends BaseClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BaseClass baseClass0 = new BaseClass();
      baseClass0.setId(1865L);
      baseClass0.toXML(baseClass0);
      baseClass0.addTextAreaField("", "", (-95), (-95), "", "");
      baseClass0.addGroupsField("defaultEditSheet", (String) null);
      baseClass0.getPropertyList();
      baseClass0.getXClassReference();
      // Undeclared exception!
      baseClass0.addTextAreaField("defaultEditSheet", "M>", (-95), 5, "", "A");
  }
}