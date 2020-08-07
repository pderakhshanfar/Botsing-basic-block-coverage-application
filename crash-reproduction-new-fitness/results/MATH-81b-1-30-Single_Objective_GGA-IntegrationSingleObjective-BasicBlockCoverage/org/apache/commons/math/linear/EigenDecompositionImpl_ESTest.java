/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 16:15:30 UTC 2020
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
      doubleArray0[2] = 0.0;
      doubleArray0[3] = 0.0;
      doubleArray0[4] = 54.0;
      doubleArray0[5] = (-2082.150075);
      doubleArray0[6] = 0.0;
      doubleArray0[8] = (-2082.150075);
      double[] doubleArray1 = new double[10];
      doubleArray1[1] = 379.008785174;
      doubleArray0[6] = (-2082.150075);
      double double0 = 1.047197551196598;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray1, doubleArray0, 1.047197551196598);
  }
}