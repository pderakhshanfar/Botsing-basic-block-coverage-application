/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 15:57:02 UTC 2020
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class RandomStringUtils_ESTest extends RandomStringUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RandomStringUtils.randomAscii(127);
      RandomStringUtils.random(127);
      RandomStringUtils.randomAscii(127);
      int int0 = 1;
      char[] charArray0 = new char[6];
      charArray0[0] = '`';
      charArray0[1] = 'h';
      charArray0[2] = '<';
      charArray0[3] = 'Q';
      charArray0[4] = '9';
      charArray0[5] = ' ';
      RandomStringUtils.random(1, charArray0);
      RandomStringUtils.randomAlphanumeric(127);
      int int1 = 261;
      Random random0 = mock(Random.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(random0).nextInt(anyInt());
      // Undeclared exception!
      RandomStringUtils.random(1, 261, 127, false, false, charArray0, random0);
  }
}