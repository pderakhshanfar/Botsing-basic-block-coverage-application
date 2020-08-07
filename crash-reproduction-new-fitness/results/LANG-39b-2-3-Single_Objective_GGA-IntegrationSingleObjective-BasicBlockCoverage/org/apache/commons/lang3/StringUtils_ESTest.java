/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 21:05:53 UTC 2020
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
      StringUtils.replace("RB/be.q{*WcRK 3", (String) null, "iM!@d&J-VtQD", 0);
      String[] stringArray0 = new String[6];
      stringArray0[0] = null;
      stringArray0[1] = "iM!@d&J-VtQD";
      stringArray0[2] = "RB/be.q{*WcRK 3";
      stringArray0[3] = "kg:\"xi9| 2Poi|viSpI";
      stringArray0[4] = null;
      stringArray0[5] = "RB/be.q{*WcRK 3";
      // Undeclared exception!
      StringUtils.replaceEach("RB/be.q{*WcRK 3", stringArray0, stringArray0);
  }
}