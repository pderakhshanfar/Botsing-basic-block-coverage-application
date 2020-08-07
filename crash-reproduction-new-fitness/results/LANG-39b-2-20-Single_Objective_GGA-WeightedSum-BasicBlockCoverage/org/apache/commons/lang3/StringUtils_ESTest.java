/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 00:54:18 UTC 2020
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
      StringUtils.ordinalIndexOf("", "", 13);
      StringUtils stringUtils0 = new StringUtils();
      StringUtils.defaultIfEmpty("", "B");
      StringUtils.isEmpty("B");
      StringUtils.center((String) null, 0);
      StringUtils.center("s", 0);
      StringUtils.leftPad((String) null, 0);
      StringUtils.containsOnly("The Array must not be null", "");
      StringUtils.equalsIgnoreCase("B", "*7Pzkk=<");
      String[] stringArray0 = new String[8];
      stringArray0[0] = "s";
      stringArray0[1] = "The Array must not be null";
      stringArray0[2] = null;
      stringArray0[3] = "";
      stringArray0[4] = "The Array must not be null";
      stringArray0[5] = "The Array must not be null";
      stringArray0[6] = "^&";
      stringArray0[7] = "*7Pzkk=<";
      // Undeclared exception!
      StringUtils.replaceEach("s", stringArray0, stringArray0);
  }
}