/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 01:07:21 UTC 2020
 */

package org.apache.commons.lang3.math;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.math.NumberUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class NumberUtils_ESTest extends NumberUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NumberUtils.toFloat("", (-808.3F));
      short short0 = (short)70;
      NumberUtils.min((short)70, (short)70, (short)70);
      short short1 = (short)2163;
      NumberUtils.toShort("", (short)2163);
      int[] intArray0 = new int[9];
      intArray0[0] = (int) (short)2163;
      intArray0[1] = (int) (short)2163;
      intArray0[2] = (int) (short)2163;
      intArray0[3] = (int) (short)2163;
      intArray0[4] = (int) (short)70;
      intArray0[5] = (int) (short)70;
      intArray0[6] = (-518);
      intArray0[7] = 1472;
      intArray0[8] = (-3371);
      NumberUtils.min(intArray0);
      NumberUtils.toByte("", (byte) (-70));
      try { 
        NumberUtils.createNumber("NFD");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // NFD is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }
}