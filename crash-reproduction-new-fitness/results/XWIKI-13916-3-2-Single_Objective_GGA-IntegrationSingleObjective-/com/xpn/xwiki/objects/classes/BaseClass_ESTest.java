/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 14:49:44 UTC 2020
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
      String string0 = null;
      baseClass0.removeField((String) null);
      int int0 = 0;
      baseClass0.addDBTreeListField((String) null, (String) null, 0, false, (String) null);
      int int1 = 1073741824;
      TextAreaClass.ContentType textAreaClass_ContentType0 = TextAreaClass.ContentType.PURE_TEXT;
      // Undeclared exception!
      baseClass0.addTextAreaField((String) null, (String) null, 0, 1073741824, textAreaClass_ContentType0);
  }
}