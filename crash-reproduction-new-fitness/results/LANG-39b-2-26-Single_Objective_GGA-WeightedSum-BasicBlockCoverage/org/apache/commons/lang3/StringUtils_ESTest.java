/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 00:54:40 UTC 2020
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
      Object[] objectArray0 = new Object[6];
      objectArray0[0] = (Object) objectArray0;
      objectArray0[1] = objectArray0[0];
      objectArray0[2] = objectArray0[1];
      objectArray0[3] = objectArray0[2];
      objectArray0[4] = objectArray0[3];
      objectArray0[5] = objectArray0[4];
      char char0 = 'b';
      int int0 = (-1128);
      StringUtils.join(objectArray0, 'b', (-1128), (-1128));
      StringUtils.isBlank("");
      StringUtils.substringBetween("java.vm.vendor", "", "user.dir");
      StringUtils.defaultString("m5[ 0d&L");
      String[] stringArray0 = new String[4];
      stringArray0[0] = "java.vm.vendor";
      stringArray0[1] = null;
      stringArray0[2] = "m5[ 0d&L";
      stringArray0[3] = "m5[ 0d&L";
      // Undeclared exception!
      StringUtils.replaceEach("java.vm.vendor", stringArray0, stringArray0);
  }
}