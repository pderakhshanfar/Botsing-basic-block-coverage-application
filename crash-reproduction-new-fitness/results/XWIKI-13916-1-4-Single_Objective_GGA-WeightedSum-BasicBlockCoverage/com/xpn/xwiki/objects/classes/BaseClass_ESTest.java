/*
 * This file was automatically generated by EvoSuite
 * Thu May 14 14:26:38 UTC 2020
 */

package com.xpn.xwiki.objects.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.XWikiContext;
import com.xpn.xwiki.objects.classes.BaseClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseClass_ESTest extends BaseClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BaseClass baseClass0 = new BaseClass();
      baseClass0.addDBListField("N", "$Mappings", "$Mappings");
      baseClass0.getNumber();
      baseClass0.addTextAreaField("$Mappings", "$Mappings", 190, 190, " (singleton=", "xFuK6D/e9l{44:7I");
      baseClass0.addDBTreeListField("Requires 'xSamples' > 0", "N", 2, true, "9%>\"");
      XWikiContext xWikiContext0 = new XWikiContext();
      XWikiContext xWikiContext1 = xWikiContext0.clone();
      baseClass0.newCustomClassInstance(xWikiContext1);
      // Undeclared exception!
      baseClass0.addTextAreaField("Requires 'xSamples' > 0", "N", 2, (-2951), " (singleton=", "</>");
  }
}