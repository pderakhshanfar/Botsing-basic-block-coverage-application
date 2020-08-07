/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 21:06:31 UTC 2020
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
      int int0 = 59;
      StringUtils.leftPad("6%MUC:vP{Uy*QTulM", 59, 'C');
      String[] stringArray0 = new String[3];
      stringArray0[0] = "6%MUC:vP{Uy*QTulM";
      stringArray0[0] = "The stripAccents(String) method is not supported until Java 1.6";
      stringArray0[2] = "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC6%MUC:vP{Uy*QTulM";
      // Undeclared exception!
      StringUtils.replaceEach("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC6%MUC:vP{Uy*QTulM", stringArray0, stringArray0);
  }
}