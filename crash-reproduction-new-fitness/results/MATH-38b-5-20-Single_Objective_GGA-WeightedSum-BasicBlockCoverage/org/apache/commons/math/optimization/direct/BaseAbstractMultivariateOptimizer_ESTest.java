/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 01:53:55 UTC 2020
 */

package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.SumSincFunction;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.direct.BOBYQAOptimizer;
import org.apache.commons.math.optimization.direct.CMAESOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractMultivariateOptimizer_ESTest extends BaseAbstractMultivariateOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 20;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(20);
      double double0 = 1.2890510559082031;
      SumSincFunction sumSincFunction0 = new SumSincFunction(20);
      GoalType goalType0 = GoalType.MINIMIZE;
      int int1 = CMAESOptimizer.DEFAULT_MAXITERATIONS;
      sumSincFunction0.partialDerivative(20);
      double[] doubleArray0 = new double[8];
      sumSincFunction0.partialDerivative(2089);
      doubleArray0[1] = 1.2890510559082031;
      doubleArray0[0] = 1.2890510559082031;
      doubleArray0[4] = (double) 20;
      doubleArray0[5] = (double) 20;
      doubleArray0[1] = 1.2890510559082031;
      sumSincFunction0.gradient();
      doubleArray0[0] = 1.2890510559082031;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(20, sumSincFunction0, goalType0, doubleArray0);
  }
}