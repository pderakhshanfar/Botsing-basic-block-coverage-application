/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 11:51:15 UTC 2020
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
      Double[] doubleArray0 = new Double[0];
      double[] doubleArray1 = new double[5];
      double[] doubleArray2 = new double[4];
      doubleArray1[4] = (-694.06372859);
      doubleArray2[1] = 8.0;
      doubleArray2[2] = (double) 2724;
      doubleArray2[3] = (-0.42);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray1, doubleArray2, 2724);
  }
}