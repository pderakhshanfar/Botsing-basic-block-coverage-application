/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 11:43:33 UTC 2020
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
      double[] doubleArray0 = new double[10];
      doubleArray0[0] = (-149.31833557422826);
      doubleArray0[9] = (-149.31833557422826);
      doubleArray0[2] = (-149.31833557422826);
      double[] doubleArray1 = new double[9];
      doubleArray1[1] = 10.12556;
      doubleArray1[2] = (-149.31833557422826);
      doubleArray1[3] = (-149.31833557422826);
      doubleArray0[2] = (-149.31833557422826);
      doubleArray1[5] = (-149.31833557422826);
      doubleArray1[6] = 10.12556;
      doubleArray1[7] = 1572.24890982;
      doubleArray1[8] = (-149.31833557422826);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1297.79335));
  }
}