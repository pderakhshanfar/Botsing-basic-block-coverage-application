/*
 * This file was automatically generated by EvoSuite
 * Thu May 14 11:46:48 UTC 2020
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.linear.DefaultRealMatrixChangingVisitor;
import org.apache.commons.math.linear.EigenDecompositionImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class EigenDecompositionImpl_ESTest extends EigenDecompositionImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultRealMatrixChangingVisitor defaultRealMatrixChangingVisitor0 = new DefaultRealMatrixChangingVisitor();
      DefaultRealMatrixChangingVisitor defaultRealMatrixChangingVisitor1 = new DefaultRealMatrixChangingVisitor();
      int int0 = 512310185;
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 54.0;
      doubleArray0[1] = (-515.571);
      doubleArray0[2] = (double) 512310185;
      doubleArray0[3] = 54.0;
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = (double) 512310185;
      doubleArray1[1] = 611.54218;
      doubleArray1[2] = 611.54218;
      doubleArray1[3] = (-1546.2169914);
      doubleArray1[4] = (double) 512310185;
      doubleArray1[5] = 5.12310185E8;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1121.67231);
  }
}