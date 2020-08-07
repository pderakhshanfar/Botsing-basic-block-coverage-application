/*
 * This file was automatically generated by EvoSuite
 * Thu May 14 20:54:30 UTC 2020
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
      NumberUtils.toShort("");
      NumberUtils.toInt("", 0);
      NumberUtils.isDigits("");
      NumberUtils.toLong("", 2158L);
      NumberUtils.min((byte) (-41), (byte) (-41), (byte)79);
      NumberUtils.max(1619.5F, (float) (byte) (-41), (-2121.0F));
      NumberUtils numberUtils0 = new NumberUtils();
      long[] longArray0 = new long[9];
      longArray0[0] = 0L;
      longArray0[1] = (long) (byte)79;
      longArray0[2] = (long) (short)0;
      longArray0[3] = (long) 0;
      longArray0[4] = (long) (byte)79;
      longArray0[5] = 2158L;
      longArray0[6] = 2158L;
      longArray0[7] = (long) (byte) (-41);
      longArray0[8] = 0L;
      NumberUtils.min(longArray0);
      NumberUtils.toByte(")1VlK7?", (byte)0);
      NumberUtils.max(0.0F, 0.0F, (-1907.0F));
      try { 
        NumberUtils.createNumber(")1VlK7?");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // )1VlK7? is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }
}