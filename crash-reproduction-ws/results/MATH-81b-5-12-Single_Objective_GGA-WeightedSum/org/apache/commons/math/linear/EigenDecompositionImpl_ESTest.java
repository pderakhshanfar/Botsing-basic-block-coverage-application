/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 30 14:49:43 UTC 2020
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
      doubleArray0[1] = 8211430.6950336145;
      doubleArray0[2] = (-1002.2704327131066);
      doubleArray0[4] = (-373.4230583847);
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = 8211430.6950336145;
      doubleArray1[1] = (-1002.2704327131066);
      doubleArray1[2] = 8211430.6950336145;
      doubleArray1[3] = (-373.4230583847);
      doubleArray1[4] = (-1002.2704327131066);
      doubleArray1[5] = (-373.4230583847);
      doubleArray1[6] = 8211430.6950336145;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1002.2704327131066));
  }
}