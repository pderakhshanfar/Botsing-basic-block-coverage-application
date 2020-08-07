/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 11:34:48 UTC 2020
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
      char[] charArray0 = new char[5];
      charArray0[0] = 'K';
      charArray0[1] = 'j';
      charArray0[2] = 'p';
      charArray0[3] = 'O';
      charArray0[4] = 'L';
      RandomStringUtils.random(1905, charArray0);
      RandomStringUtils randomStringUtils0 = new RandomStringUtils();
      RandomStringUtils.randomAlphabetic(1905);
      Random random0 = mock(Random.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(random0).nextInt(anyInt());
      // Undeclared exception!
      RandomStringUtils.random(1905, 1905, 1905, true, false, charArray0, random0);
  }
}