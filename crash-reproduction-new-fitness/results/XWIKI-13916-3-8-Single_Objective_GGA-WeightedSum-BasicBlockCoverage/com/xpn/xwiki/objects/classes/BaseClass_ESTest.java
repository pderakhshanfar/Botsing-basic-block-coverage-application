/*
 * This file was automatically generated by EvoSuite
 * Thu May 14 14:31:03 UTC 2020
 */

package com.xpn.xwiki.objects.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.objects.classes.TextAreaClass;
import com.xpn.xwiki.objects.meta.LevelsMetaClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseClass_ESTest extends BaseClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LevelsMetaClass levelsMetaClass0 = new LevelsMetaClass();
      TextAreaClass textAreaClass0 = new TextAreaClass(levelsMetaClass0);
      textAreaClass0.getxWikiClass();
      String string0 = "?=@nt7d";
      levelsMetaClass0.addTimezoneField((String) null, "?=@nt7d", 0);
      TextAreaClass.ContentType textAreaClass_ContentType0 = TextAreaClass.ContentType.VELOCITY_CODE;
      // Undeclared exception!
      levelsMetaClass0.addTextAreaField((String) null, "", 0, 2, textAreaClass_ContentType0);
  }
}