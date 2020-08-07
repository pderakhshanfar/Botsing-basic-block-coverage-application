/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 11:47:10 UTC 2020
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
      double[] doubleArray0 = new double[5];
      doubleArray0[2] = 3490.7175606955043;
      double[] doubleArray1 = new double[4];
      doubleArray1[0] = 3490.7175606955043;
      doubleArray1[1] = 0.563;
      doubleArray1[2] = (-298.0);
      doubleArray1[3] = 0.0;
      double[] doubleArray2 = new double[3];
      doubleArray2[0] = (double) 1657;
      doubleArray2[1] = (double) 2147176995;
      doubleArray2[2] = 0.563;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray1, doubleArray2, 0.0);
  }
}