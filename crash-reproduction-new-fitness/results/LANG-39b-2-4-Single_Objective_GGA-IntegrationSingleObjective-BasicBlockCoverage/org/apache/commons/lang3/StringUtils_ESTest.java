/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 21:05:57 UTC 2020
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
      StringUtils.indexOfAny("S zY9zEbE[t*cIAS", "v$?o&OLT(i8");
      StringUtils.indexOf("S zY9zEbE[t*cIAS", ']', 2847);
      StringUtils.indexOfAnyBut("6-^|.O7Nz3imRVLf", "S zY9zEbE[t*cIAS");
      String[] stringArray0 = new String[6];
      stringArray0[0] = "S zY9zEbE[t*cIAS";
      stringArray0[1] = "6-^|.O7Nz3imRVLf";
      stringArray0[2] = "S zY9zEbE[t*cIAS";
      // Undeclared exception!
      StringUtils.replaceEach("S zY9zEbE[t*cIAS", stringArray0, stringArray0);
  }
}