/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 01:20:45 UTC 2020
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
      NumberUtils numberUtils0 = new NumberUtils();
      short short0 = (short)1070;
      NumberUtils.max((short) (-294), (short)1070, (short) (-2117));
      byte[] byteArray0 = new byte[5];
      byte byte0 = (byte)0;
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-49);
      byte byte1 = (byte)63;
      byteArray0[2] = (byte)63;
      byte byte2 = (byte)43;
      byteArray0[3] = (byte)43;
      byteArray0[4] = (byte)45;
      NumberUtils.max(byteArray0);
      NumberUtils.max((int) (byte)0, 3242, 69);
      try { 
        NumberUtils.createNumber("D6@}5|%;|tsc");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // D6@}5|%;|tsc is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }
}