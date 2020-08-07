/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 11:46:40 UTC 2020
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
      double[] doubleArray0 = new double[6];
      doubleArray0[1] = (-3540.767616715701);
      doubleArray0[1] = 8.617177967837675;
      double[] doubleArray1 = new double[5];
      doubleArray1[1] = 8.617177967837675;
      doubleArray1[2] = (-1506.894161514141);
      doubleArray1[3] = 8.617177967837675;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1506.894161514141));
  }
}