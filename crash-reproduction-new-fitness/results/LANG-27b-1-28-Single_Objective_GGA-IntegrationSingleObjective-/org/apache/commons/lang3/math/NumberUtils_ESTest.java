/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 01:56:51 UTC 2020
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
      NumberUtils.toInt("", 2008);
      NumberUtils.toDouble("", (double) 2008);
      float[] floatArray0 = new float[3];
      floatArray0[0] = (float) 2008;
      floatArray0[1] = (float) 2008;
      floatArray0[2] = 0.0F;
      NumberUtils.max(floatArray0);
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-103);
      byteArray0[1] = (byte)18;
      byteArray0[2] = (byte)105;
      byteArray0[3] = (byte) (-45);
      byteArray0[4] = (byte)46;
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte) (-93);
      // Undeclared exception!
      NumberUtils.createNumber("SXuOAePJ-'x@sE8");
  }
}