/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 15:56:46 UTC 2020
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
      RandomStringUtils.random(0);
      RandomStringUtils.randomAscii(0);
      RandomStringUtils.randomAlphabetic(3632);
      RandomStringUtils.randomAscii(0);
      RandomStringUtils randomStringUtils0 = new RandomStringUtils();
      RandomStringUtils.randomAscii(0);
      int int1 = 3930;
      int int2 = 0;
      char[] charArray0 = new char[5];
      charArray0[0] = 'e';
      charArray0[1] = '1';
      char char0 = '4';
      charArray0[2] = '4';
      char char1 = 'j';
      charArray0[3] = 'j';
      charArray0[4] = '=';
      // Undeclared exception!
      RandomStringUtils.random(3930, 0, 805, false, true, charArray0);
  }
}