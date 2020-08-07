/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 22:11:37 UTC 2020
 */

package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.SumSincFunction;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.direct.BOBYQAOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractMultivariateSimpleBoundsOptimizer_ESTest extends BaseAbstractMultivariateSimpleBoundsOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(11);
      double double0 = 1720.8094121598;
      bOBYQAOptimizer0.getEvaluations();
      bOBYQAOptimizer0.getEvaluations();
      GoalType goalType0 = GoalType.MINIMIZE;
      SumSincFunction sumSincFunction0 = new SumSincFunction(1.0);
      SumSincFunction sumSincFunction1 = new SumSincFunction(3931.2112514947);
      int int0 = 1793;
      GoalType goalType1 = GoalType.MAXIMIZE;
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (double) 11;
      doubleArray0[1] = 1720.8094121598;
      doubleArray0[2] = (double) (-509);
      doubleArray0[3] = (double) (-614);
      doubleArray0[4] = 1.0;
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = (double) 11;
      doubleArray1[1] = 1720.8094121598;
      doubleArray1[2] = (double) 1793;
      doubleArray1[3] = (-4070.59);
      doubleArray1[4] = (double) (-509);
      doubleArray1[5] = (double) 30;
      double[] doubleArray2 = new double[4];
      doubleArray2[0] = (double) (-614);
      doubleArray2[1] = (double) 1793;
      doubleArray2[2] = 1720.8094121598;
      doubleArray2[3] = (double) 0;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(11, sumSincFunction0, goalType0, doubleArray2);
  }
}