/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 30 14:55:39 UTC 2020
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
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-80.0);
      doubleArray0[1] = (-1634.6983643500146);
      doubleArray0[2] = (-1634.6983643500146);
      doubleArray0[3] = 3398.9605027878165;
      double[] doubleArray1 = new double[5];
      doubleArray1[1] = (-1634.6983643500146);
      doubleArray1[3] = (-1635.1262821556174);
      doubleArray1[4] = 3765.6242;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray1, doubleArray0, (-1001.0357));
  }
}