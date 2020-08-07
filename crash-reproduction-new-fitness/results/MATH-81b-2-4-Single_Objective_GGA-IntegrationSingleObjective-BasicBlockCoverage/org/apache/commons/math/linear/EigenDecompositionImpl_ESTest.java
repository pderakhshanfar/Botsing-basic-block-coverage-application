/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 11:45:13 UTC 2020
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
      doubleArray0[0] = (-1139.095138855551);
      doubleArray0[1] = (-1156.8294921355473);
      doubleArray0[1] = 2055.911;
      doubleArray0[4] = (-2022.88418985);
      double double0 = 0.5403023058681398;
      doubleArray0[5] = 0.5403023058681398;
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = 2.493506493506493;
      doubleArray1[1] = (-2022.88418985);
      doubleArray1[2] = (-1197.1801058365052);
      doubleArray1[3] = (-2022.88418985);
      doubleArray1[4] = (-1197.1801058365052);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1197.1801058365052));
  }
}