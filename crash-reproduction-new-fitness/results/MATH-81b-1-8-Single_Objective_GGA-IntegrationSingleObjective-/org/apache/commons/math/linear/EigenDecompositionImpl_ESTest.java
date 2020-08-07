/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 11:48:05 UTC 2020
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
      doubleArray0[0] = (-150.12732);
      doubleArray0[1] = (-150.12732);
      doubleArray0[2] = (-150.12732);
      int int0 = 3663;
      int int1 = 2147483177;
      double[] doubleArray1 = new double[4];
      doubleArray1[0] = (double) 3663;
      doubleArray1[1] = (double) 2147483177;
      doubleArray1[2] = (-150.12732);
      doubleArray1[3] = 2.147483177E9;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-668.4081230751832));
  }
}