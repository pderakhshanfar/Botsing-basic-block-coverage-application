/*
 * This file was automatically generated by EvoSuite
 * Thu May 14 20:27:48 UTC 2020
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
      String[] stringArray0 = new String[7];
      stringArray0[1] = "KPV<";
      stringArray0[2] = "KPV<";
      stringArray0[3] = "KPV<";
      stringArray0[4] = "KPV<";
      stringArray0[5] = "KPV<";
      stringArray0[6] = "KPV<";
      // Undeclared exception!
      StringUtils.replaceEach("KPV<", stringArray0, stringArray0);
  }
}