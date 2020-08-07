/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 16:13:13 UTC 2020
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
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 520.455356;
      doubleArray0[1] = (-797.0);
      doubleArray0[1] = 1.1368683772161603E-13;
      doubleArray0[4] = 0.0;
      doubleArray0[5] = 0.0;
      doubleArray0[6] = (-56.8);
      doubleArray0[7] = (-797.0);
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = (-797.0);
      doubleArray1[1] = (-56.8);
      doubleArray1[2] = 1.0986122886681096;
      doubleArray1[3] = 520.455356;
      doubleArray1[4] = 520.455356;
      doubleArray1[5] = (-797.0);
      doubleArray1[6] = (-797.0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
  }
}