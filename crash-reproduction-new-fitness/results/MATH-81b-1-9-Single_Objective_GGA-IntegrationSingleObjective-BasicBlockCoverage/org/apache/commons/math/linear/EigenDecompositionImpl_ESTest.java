/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 11:46:49 UTC 2020
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
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = (-644.4308);
      double double0 = 0.0;
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = (-644.4308);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      eigenDecompositionImpl0.getVT();
      double[] doubleArray2 = eigenDecompositionImpl0.getImagEigenvalues();
      eigenDecompositionImpl0.getSolver();
      double[] doubleArray3 = new double[6];
      doubleArray3[0] = 1.5;
      doubleArray3[1] = (-1036.0);
      doubleArray3[2] = (-644.4308);
      doubleArray3[3] = 0.0;
      doubleArray3[4] = 1.8189894035458565E-12;
      doubleArray3[5] = 1.5;
      EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl(doubleArray2, doubleArray3, (-1036.0));
  }
}