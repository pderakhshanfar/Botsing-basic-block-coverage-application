/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 16:06:28 UTC 2020
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
      doubleArray0[1] = 8.258861278030386;
      double double0 = 875.363760581191;
      doubleArray0[2] = 875.363760581191;
      doubleArray0[3] = (-1557.893);
      doubleArray0[4] = 747.4062104025013;
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = 54.0;
      doubleArray0[2] = 875.363760581191;
      doubleArray1[2] = (-1557.893);
      doubleArray1[3] = 875.363760581191;
      doubleArray1[4] = (-1557.893);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray1, doubleArray0, 0.0);
  }
}