/*
 * This file was automatically generated by EvoSuite
 * Thu May 14 11:29:58 UTC 2020
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.RandomStringUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class RandomStringUtils_ESTest extends RandomStringUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 0;
      RandomStringUtils.randomAscii(0);
      RandomStringUtils.random(0);
      int int1 = 1136;
      char[] charArray0 = new char[2];
      charArray0[0] = 'R';
      charArray0[1] = '4';
      RandomStringUtils.random(1136, charArray0);
      RandomStringUtils.random(1136, charArray0);
      RandomStringUtils.random(0, charArray0);
      // Undeclared exception!
      RandomStringUtils.random(32, "");
  }
}