/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 18:56:14 UTC 2020
 */

package com.xpn.xwiki.objects.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.objects.LargeStringProperty;
import com.xpn.xwiki.objects.classes.BaseClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseClass_ESTest extends BaseClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BaseClass baseClass0 = new BaseClass();
      String string0 = "Ewb22B #";
      baseClass0.setDefaultViewSheet("Ewb22B #");
      String string1 = null;
      int int0 = 1275;
      String string2 = null;
      baseClass0.addDBTreeListField((String) null, (String) null, 1275, false, (String) null);
      LargeStringProperty largeStringProperty0 = new LargeStringProperty();
      // Undeclared exception!
      baseClass0.addTextAreaField((String) null, (String) null, 1275, 1275);
  }
}