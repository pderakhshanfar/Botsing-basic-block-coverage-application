/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 19:14:04 UTC 2020
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
      baseClass0.addDBTreeListField("e+(C", "`[K7A63", 0, false, "`[K7A63");
      baseClass0.getStringValue("4<>k$vHSD");
      TextAreaClass.ContentType textAreaClass_ContentType0 = TextAreaClass.ContentType.WIKI_TEXT;
      // Undeclared exception!
      baseClass0.addTextAreaField("e+(C", "e+(C", 0, 0, textAreaClass_ContentType0);
  }
}