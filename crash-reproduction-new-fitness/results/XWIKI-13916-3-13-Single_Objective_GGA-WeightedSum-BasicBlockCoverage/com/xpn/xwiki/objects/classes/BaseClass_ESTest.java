/*
 * This file was automatically generated by EvoSuite
 * Thu May 14 14:37:35 UTC 2020
 */

package com.xpn.xwiki.objects.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.objects.classes.BaseClass;
import com.xpn.xwiki.objects.classes.TextAreaClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseClass_ESTest extends BaseClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BaseClass baseClass0 = new BaseClass();
      baseClass0.getValidationScript();
      baseClass0.addDBTreeListField("", "", (-897), false, false, "");
      TextAreaClass.ContentType textAreaClass_ContentType0 = TextAreaClass.ContentType.VELOCITY_CODE;
      // Undeclared exception!
      baseClass0.addTextAreaField("", "", 221, 0, textAreaClass_ContentType0);
  }
}