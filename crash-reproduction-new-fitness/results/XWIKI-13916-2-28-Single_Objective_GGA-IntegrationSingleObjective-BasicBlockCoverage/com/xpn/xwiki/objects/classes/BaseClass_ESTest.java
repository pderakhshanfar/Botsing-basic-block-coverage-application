/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 19:22:02 UTC 2020
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
      baseClass0.getPropertyList();
      String string0 = "auth";
      TextAreaClass.EditorType textAreaClass_EditorType0 = TextAreaClass.EditorType.WYSIWYG;
      TextAreaClass.ContentType textAreaClass_ContentType0 = TextAreaClass.ContentType.PURE_TEXT;
      baseClass0.hasExternalCustomMapping();
      baseClass0.addPasswordField("auth", "Ok[y*N0K?9{w6/F", 5);
      baseClass0.addStaticListField((String) null, "Ok[y*N0K?9{w6/F", 636, true, (String) null, (String) null, "8g$6[l%iN.#2");
      int int0 = 16777215;
      baseClass0.addTextField("Ok[y*N0K?9{w6/F", "", 16777215);
      String string1 = baseClass0.toXMLString();
      baseClass0.addEmailField(string1, "auth", 15);
      // Undeclared exception!
      baseClass0.addTextAreaField("auth", "Calling perform() on %s", (-3098), 1, textAreaClass_EditorType0, textAreaClass_ContentType0);
  }
}