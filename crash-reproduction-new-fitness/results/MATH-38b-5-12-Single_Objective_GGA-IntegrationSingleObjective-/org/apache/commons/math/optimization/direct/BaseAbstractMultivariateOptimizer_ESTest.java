/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 22:15:12 UTC 2020
 */

package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Comparator;
import org.apache.commons.math.analysis.SumSincFunction;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.apache.commons.math.optimization.direct.BOBYQAOptimizer;
import org.apache.commons.math.optimization.direct.CMAESOptimizer;
import org.apache.commons.math.random.Well44497a;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractMultivariateOptimizer_ESTest extends BaseAbstractMultivariateOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = CMAESOptimizer.DEFAULT_STOPFITNESS;
      int int0 = 467;
      SumSincFunction sumSincFunction0 = new SumSincFunction(133);
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Comparator<RealPointValuePair> comparator1 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      double[][] doubleArray0 = new double[10][2];
      int int1 = 10;
      Well44497a well44497a0 = new Well44497a(133);
      byte[] byteArray0 = new byte[8];
      byte byte0 = (byte)107;
      byteArray0[2] = (byte)107;
      byteArray0[0] = (byte) (-17);
      byteArray0[6] = (byte)45;
      well44497a0.nextBytes(byteArray0);
      double double1 = 1.3404009342193604;
      RealPointValuePair[] realPointValuePairArray0 = new RealPointValuePair[4];
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer((byte)45, 94, 94);
      GoalType goalType0 = GoalType.MINIMIZE;
      double[] doubleArray1 = new double[9];
      byteArray0[0] = (byte)83;
      doubleArray1[1] = (double) (byte) (-95);
      doubleArray1[2] = (-2023.8);
      doubleArray1[3] = (double) (byte)27;
      doubleArray1[4] = (double) (byte) (-95);
      doubleArray1[5] = (double) 467;
      doubleArray1[6] = (double) (byte)107;
      doubleArray1[7] = (double) 10;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize((byte)107, sumSincFunction0, goalType0, doubleArray1);
  }
}