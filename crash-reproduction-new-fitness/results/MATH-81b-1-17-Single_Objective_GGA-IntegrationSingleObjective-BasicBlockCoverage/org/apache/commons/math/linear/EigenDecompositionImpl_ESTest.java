/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 16:09:58 UTC 2020
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.linear.EigenDecompositionImpl;
import org.apache.commons.math.linear.OpenMapRealVector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class EigenDecompositionImpl_ESTest extends EigenDecompositionImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      double[] doubleArray1 = new double[5];
      double[] doubleArray2 = new double[4];
      doubleArray2[0] = 1814.628;
      doubleArray2[1] = 286.0;
      doubleArray2[2] = (-924.5064);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector((-2147139540), (-862.654905612704));
      double[] doubleArray3 = new double[4];
      doubleArray0[0] = 1814.628;
      doubleArray3[1] = 1.5;
      doubleArray3[2] = (-3057.3512395751227);
      doubleArray3[3] = (-924.5064);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray1, doubleArray3, (-862.654905612704));
  }
}