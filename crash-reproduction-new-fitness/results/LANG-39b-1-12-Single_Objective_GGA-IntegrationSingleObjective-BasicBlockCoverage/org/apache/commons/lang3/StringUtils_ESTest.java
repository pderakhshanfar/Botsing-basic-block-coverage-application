/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 21:06:34 UTC 2020
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
      StringUtils.isAllUpperCase("ayTP @s_a6S,&EA>_[$");
      StringUtils.lastIndexOf(".2+16b.Qw", (String) null, (-1771));
      String[] stringArray0 = new String[6];
      stringArray0[0] = ".2+16b.Qw";
      stringArray0[1] = ".2+16b.Qw";
      stringArray0[2] = "ayTP @s_a6S,&EA>_[$";
      stringArray0[3] = "YzQ'52|Ah\":s";
      stringArray0[4] = "r&}3^s $fsBpgyB:iU";
      stringArray0[5] = null;
      // Undeclared exception!
      StringUtils.replaceEach("ayTP @s_a6S,&EA>_[$", stringArray0, stringArray0);
  }
}