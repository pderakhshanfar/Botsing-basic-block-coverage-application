/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 30 21:10:05 UTC 2020
 */

package com.xpn.xwiki.objects.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.objects.classes.TextAreaClass;
import com.xpn.xwiki.objects.meta.PasswordMetaClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseClass_ESTest extends BaseClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PasswordMetaClass passwordMetaClass0 = new PasswordMetaClass();
      passwordMetaClass0.addUsersField("GlycxyFdJ|l|z", "GlycxyFdJ|l|z", 0);
      TextAreaClass.ContentType textAreaClass_ContentType0 = TextAreaClass.ContentType.VELOCITY_CODE;
      // Undeclared exception!
      passwordMetaClass0.addTextAreaField("GlycxyFdJ|l|z", "XWiki.XWikiPreferences", 0, 0, textAreaClass_ContentType0);
  }
}