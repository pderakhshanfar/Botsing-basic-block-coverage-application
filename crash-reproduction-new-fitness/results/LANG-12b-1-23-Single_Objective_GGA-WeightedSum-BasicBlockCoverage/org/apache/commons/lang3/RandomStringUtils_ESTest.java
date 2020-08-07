/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 15:56:53 UTC 2020
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
      RandomStringUtils randomStringUtils0 = new RandomStringUtils();
      RandomStringUtils.random(52, "&7Kg");
      RandomStringUtils.randomNumeric(52);
      RandomStringUtils randomStringUtils1 = new RandomStringUtils();
      RandomStringUtils.random(52);
      RandomStringUtils.random(52);
      RandomStringUtils randomStringUtils2 = new RandomStringUtils();
      RandomStringUtils randomStringUtils3 = new RandomStringUtils();
      char[] charArray0 = new char[5];
      charArray0[0] = 'F';
      charArray0[1] = 'H';
      charArray0[2] = 'f';
      charArray0[3] = 'F';
      charArray0[4] = '0';
      RandomStringUtils.random(1, charArray0);
      int int0 = 1506;
      char[] charArray1 = new char[0];
      // Undeclared exception!
      RandomStringUtils.random(469, 52, 1506, false, true, charArray1);
  }
}