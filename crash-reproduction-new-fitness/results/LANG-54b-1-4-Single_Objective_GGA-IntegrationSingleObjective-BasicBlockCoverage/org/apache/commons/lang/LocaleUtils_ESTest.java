/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 21:37:27 UTC 2020
 */

package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.List;
import org.apache.commons.lang.LocaleUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class LocaleUtils_ESTest extends LocaleUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = null;
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      HashMap<String, List<String>> hashMap1 = new HashMap<String, List<String>>();
      String string1 = "ej]H:<cEl/p?1`";
      LocaleUtils.toLocale((String) null);
      LocaleUtils.toLocale((String) null);
      LocaleUtils localeUtils0 = new LocaleUtils();
      // Undeclared exception!
      LocaleUtils.toLocale("pe_T:\"INq3=!N Y");
  }
}