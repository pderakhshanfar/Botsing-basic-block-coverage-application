/*
 * This file was automatically generated by EvoSuite
 * Thu May 14 11:49:54 UTC 2020
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.linear.Array2DRowRealMatrix;
import org.apache.commons.math.linear.EigenDecompositionImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class EigenDecompositionImpl_ESTest extends EigenDecompositionImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix();
      double double0 = (-14.157060861636104);
      int int0 = 2147482393;
      double double1 = 1.047197551196598;
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 1.047197551196598;
      double double2 = (-1280.6);
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = 4.401105304623343E-4;
      doubleArray1[1] = (-1280.6);
      double double3 = 845.5;
      doubleArray1[2] = 845.5;
      doubleArray1[3] = (-1671.0);
      doubleArray1[4] = 4.401105304623343E-4;
      doubleArray1[5] = (-1280.6);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1671.0));
  }
}