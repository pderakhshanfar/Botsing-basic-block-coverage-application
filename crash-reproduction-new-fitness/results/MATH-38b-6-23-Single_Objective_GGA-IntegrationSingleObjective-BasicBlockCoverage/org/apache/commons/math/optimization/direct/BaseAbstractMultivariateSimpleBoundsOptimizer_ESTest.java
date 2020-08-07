/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 02:33:08 UTC 2020
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
      int int0 = 109;
      SumSincFunction sumSincFunction0 = new SumSincFunction((-3170.73895430275));
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (double) 109;
      doubleArray0[1] = (double) 109;
      doubleArray0[2] = (double) 109;
      doubleArray0[3] = (double) 109;
      doubleArray0[4] = (-3170.73895430275);
      doubleArray0[5] = (-3170.73895430275);
      doubleArray0[6] = (double) 109;
      sumSincFunction0.gradient();
      sumSincFunction0.value(doubleArray0);
      sumSincFunction0.partialDerivative(109);
      SumSincFunction sumSincFunction1 = new SumSincFunction((-2059.793623242565));
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(28);
      double[] doubleArray1 = new double[9];
      doubleArray1[0] = (double) 170;
      sumSincFunction1.gradient();
      doubleArray1[1] = (double) 4;
      sumSincFunction0.gradient();
      GoalType goalType0 = GoalType.MAXIMIZE;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(170, sumSincFunction0, goalType0, doubleArray0);
  }
}