/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 21:09:18 UTC 2020
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.StringUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class StringUtils_ESTest extends StringUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "p{InCombiningDiacriticalMarks}+";
      String string0 = "";
      char char0 = '';
      StringUtils.indexOf("", '');
      String string1 = "%N_$S6J\\~>0Tf";
      StringUtils.replace("*0aDm,", "%N_$S6J~>0Tf", "", 0);
      StringUtils.containsAny("", "...");
      // Undeclared exception!
      StringUtils.replaceEach("p{InCombiningDiacriticalMarks}+", stringArray0, stringArray0);
  }
}