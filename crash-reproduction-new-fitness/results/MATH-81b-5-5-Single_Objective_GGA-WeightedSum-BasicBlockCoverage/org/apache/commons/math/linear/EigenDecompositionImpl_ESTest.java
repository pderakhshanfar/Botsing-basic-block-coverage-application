/*
 * This file was automatically generated by EvoSuite
 * Thu May 14 11:45:15 UTC 2020
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
      doubleArray0[0] = 1368.069414333393;
      doubleArray0[1] = (-3.1217544940614967);
      doubleArray0[2] = 1368.069414333393;
      doubleArray0[3] = (-1453.9968115278275);
      doubleArray0[4] = (-0.001);
      doubleArray0[5] = 1368.069414333393;
      doubleArray0[6] = (-3.1217544940614967);
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = (-0.001);
      doubleArray1[1] = (-3.1217544940614967);
      doubleArray1[2] = (-5853.788812328112);
      doubleArray1[3] = (-0.001);
      doubleArray1[4] = (-1453.9968115278275);
      doubleArray1[5] = (-3.1217544940614967);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1152.63020810546));
  }
}