/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 15:56:43 UTC 2020
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
      RandomStringUtils.randomAlphabetic(0);
      RandomStringUtils randomStringUtils0 = new RandomStringUtils();
      int int1 = 855;
      char[] charArray0 = new char[0];
      // Undeclared exception!
      RandomStringUtils.random(855, charArray0);
  }
}