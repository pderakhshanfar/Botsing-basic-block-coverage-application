/*
 * This file was automatically generated by EvoSuite
 * Thu May 14 20:27:59 UTC 2020
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
      StringUtils.substringBetween("(Vt'5=[;1T]zjGEk.b", "(Vt'5=[;1T]zjGEk.b", (String) null);
      StringUtils.strip((String) null, ".0&a0y}C84");
      String[] stringArray0 = new String[4];
      stringArray0[0] = "O";
      stringArray0[1] = ".0&a0y}C84";
      stringArray0[2] = "J=y{i";
      stringArray0[3] = null;
      // Undeclared exception!
      StringUtils.replaceEach("J=y{i", stringArray0, stringArray0);
  }
}