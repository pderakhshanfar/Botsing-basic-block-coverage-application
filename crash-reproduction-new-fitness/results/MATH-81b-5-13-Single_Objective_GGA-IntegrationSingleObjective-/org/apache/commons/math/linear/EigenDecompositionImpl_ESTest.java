/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 11:49:48 UTC 2020
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
      double double0 = (-0.9899924966004454);
      doubleArray0[2] = (-0.9899924966004454);
      doubleArray0[3] = (-1.0);
      double[] doubleArray1 = new double[3];
      doubleArray1[0] = (-1.0);
      doubleArray1[1] = 846.419973193122;
      doubleArray1[2] = (-1.0);
      double double1 = (-760.8);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-760.8));
  }
}