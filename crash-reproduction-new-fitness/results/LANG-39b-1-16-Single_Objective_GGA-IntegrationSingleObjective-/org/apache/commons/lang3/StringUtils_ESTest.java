/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 01:32:25 UTC 2020
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
      String[] stringArray0 = new String[8];
      stringArray0[0] = "IllegalArgumentException occurred during 1.6 backcompat code";
      stringArray0[1] = "IllegalArgumentException occurred during 1.6 backcompat code";
      stringArray0[2] = "IllegalArgumentException occurred during 1.6 backcompat code";
      stringArray0[4] = "IllegalArgumentException occurred during 1.6 backcompat code";
      stringArray0[5] = "IllegalArgumentException occurred during 1.6 backcompat code";
      stringArray0[6] = "IllegalArgumentException occurred during 1.6 backcompat code";
      // Undeclared exception!
      StringUtils.replaceEach("IllegalArgumentException occurred during 1.6 backcompat code", stringArray0, stringArray0);
  }
}