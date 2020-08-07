/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 11:42:31 UTC 2020
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
      doubleArray0[0] = 425.7125815928417;
      doubleArray0[1] = 0.0;
      doubleArray0[1] = 160.0;
      doubleArray0[3] = 2480.5641683069;
      doubleArray0[4] = 0.0;
      doubleArray0[5] = 0.0;
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = 425.7125815928417;
      doubleArray1[1] = 425.7125815928417;
      doubleArray1[2] = 2480.5641683069;
      doubleArray0[6] = 160.0;
      doubleArray1[4] = 0.0;
      doubleArray1[5] = 425.7125815928417;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
  }
}