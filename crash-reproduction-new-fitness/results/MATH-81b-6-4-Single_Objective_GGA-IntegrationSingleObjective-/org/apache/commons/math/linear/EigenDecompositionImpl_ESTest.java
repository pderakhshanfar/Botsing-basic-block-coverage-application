/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 11:46:20 UTC 2020
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.linear.EigenDecompositionImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class EigenDecompositionImpl_ESTest extends EigenDecompositionImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-1795.0);
      doubleArray0[1] = (-11.38);
      int int0 = (-31);
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = (-11.38);
      doubleArray1[1] = 180.529;
      doubleArray1[2] = (double) (-31);
      doubleArray1[3] = (-1795.0);
      doubleArray1[4] = (-380.40445939);
      doubleArray1[5] = (-1795.0);
      doubleArray1[6] = (double) (-31);
      doubleArray1[7] = (-1795.0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 67.1062532);
  }
}