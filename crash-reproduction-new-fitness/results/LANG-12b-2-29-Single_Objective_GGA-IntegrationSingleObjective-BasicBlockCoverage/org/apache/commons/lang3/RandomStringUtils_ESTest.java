/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 15:58:09 UTC 2020
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
      RandomStringUtils.random(0, "W|z\"rw&,l");
      int int1 = (-2132);
      int int2 = (-2863);
      boolean boolean0 = true;
      boolean boolean1 = false;
      RandomStringUtils.random(0, (-2132), (-2863), true, false);
      char[] charArray0 = new char[0];
      RandomStringUtils.random(0, charArray0);
      int int3 = 1;
      // Undeclared exception!
      RandomStringUtils.random(1, "");
  }
}