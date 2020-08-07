/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 16:11:06 UTC 2020
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
      doubleArray0[0] = (-18.369211394608328);
      doubleArray0[1] = (-1035.923815908327);
      doubleArray0[2] = (-1035.923815908327);
      doubleArray0[4] = 0.0;
      doubleArray0[5] = (-18.369211394608328);
      doubleArray0[6] = (-1035.923815908327);
      doubleArray0[7] = 0.0;
      double[] doubleArray1 = new double[7];
      doubleArray1[1] = (-18.369211394608328);
      doubleArray1[2] = 2087.271525730325;
      doubleArray1[3] = (-2857.57);
      doubleArray1[4] = (-2857.57);
      doubleArray1[5] = 0.0;
      doubleArray1[6] = (-2857.57);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
  }
}