/*
 * This file was automatically generated by EvoSuite
 * Thu May 14 14:25:27 UTC 2020
 */

package com.xpn.xwiki.objects.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.objects.meta.TextAreaMetaClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseClass_ESTest extends BaseClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TextAreaMetaClass textAreaMetaClass0 = new TextAreaMetaClass();
      textAreaMetaClass0.addLevelsField("", "yyMMddHHmmss'Z'");
      textAreaMetaClass0.addDBListField("yyMMddHHmmss'Z'", "", (-1908874351), true, true, "Wz'jOf4$_Z7`+Dw^h");
      // Undeclared exception!
      textAreaMetaClass0.addTextAreaField("", "", 5, 5, "", "");
  }
}