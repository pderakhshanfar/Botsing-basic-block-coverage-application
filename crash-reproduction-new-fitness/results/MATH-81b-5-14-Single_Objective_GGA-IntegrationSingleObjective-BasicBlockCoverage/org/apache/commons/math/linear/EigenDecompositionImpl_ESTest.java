/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 11:50:29 UTC 2020
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
      double double0 = 10.432566691855095;
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = 0.1411200080598672;
      doubleArray1[1] = (-1080.1345413);
      doubleArray1[2] = 10.432566691855095;
      doubleArray0[7] = 10.432566691855095;
      doubleArray1[4] = 10.432566691855095;
      doubleArray1[5] = 0.1411200080598672;
      doubleArray1[6] = 10.432566691855095;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 10.432566691855095);
  }
}