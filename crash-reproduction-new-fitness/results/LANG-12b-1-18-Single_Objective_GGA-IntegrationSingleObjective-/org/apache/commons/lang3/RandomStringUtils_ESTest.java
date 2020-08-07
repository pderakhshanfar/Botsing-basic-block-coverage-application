/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 15:55:27 UTC 2020
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
      int int0 = 1020;
      char[] charArray0 = new char[3];
      charArray0[0] = ':';
      charArray0[1] = 'L';
      charArray0[2] = '';
      Random random0 = mock(Random.class, new ViolatedAssumptionAnswer());
      RandomStringUtils.random(0, Integer.MAX_VALUE, 1020, false, false, charArray0, random0);
      RandomStringUtils.randomAscii(1020);
      int int1 = 56320;
      char[] charArray1 = new char[2];
      charArray1[0] = 'L';
      charArray1[1] = 'L';
      // Undeclared exception!
      RandomStringUtils.random(1020, 1020, 56320, false, false, charArray1);
  }
}