/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 02:31:40 UTC 2020
 */

package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.SumSincFunction;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.direct.BOBYQAOptimizer;
import org.apache.commons.math.optimization.direct.CMAESOptimizer;
import org.apache.commons.math.optimization.direct.PowellOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractMultivariateOptimizer_ESTest extends BaseAbstractMultivariateOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = BOBYQAOptimizer.DEFAULT_STOPPING_RADIUS;
      double double1 = CMAESOptimizer.DEFAULT_STOPFITNESS;
      double double2 = BOBYQAOptimizer.DEFAULT_INITIAL_RADIUS;
      SumSincFunction sumSincFunction0 = new SumSincFunction(10.0);
      double[] doubleArray0 = new double[8];
      doubleArray0[2] = 1.0E-8;
      sumSincFunction0.partialDerivative(32);
      doubleArray0[1] = (double) 32;
      doubleArray0[3] = 1.0E-8;
      sumSincFunction0.partialDerivative(32);
      double double3 = BOBYQAOptimizer.DEFAULT_STOPPING_RADIUS;
      doubleArray0[5] = 558.0;
      doubleArray0[6] = 558.0;
      sumSincFunction0.value(doubleArray0);
      sumSincFunction0.gradient();
      PowellOptimizer powellOptimizer0 = new PowellOptimizer(1.0E-8, 558.0);
      double[][] doubleArray1 = new double[7][3];
      doubleArray1[5] = doubleArray0;
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(32, doubleArray0, doubleArray1);
      cMAESOptimizer0.getStatisticsSigmaHistory();
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(32);
      GoalType goalType0 = GoalType.MAXIMIZE;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(32, sumSincFunction0, goalType0, doubleArray0);
  }
}