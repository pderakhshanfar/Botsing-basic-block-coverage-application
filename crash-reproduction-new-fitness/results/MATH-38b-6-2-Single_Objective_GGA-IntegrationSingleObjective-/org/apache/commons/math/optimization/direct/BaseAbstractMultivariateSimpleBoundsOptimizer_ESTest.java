/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 22:08:44 UTC 2020
 */

package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.MultivariateFunction;
import org.apache.commons.math.analysis.SumSincFunction;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.direct.BOBYQAOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractMultivariateSimpleBoundsOptimizer_ESTest extends BaseAbstractMultivariateSimpleBoundsOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MultivariateFunction multivariateFunction0 = mock(MultivariateFunction.class, new ViolatedAssumptionAnswer());
      int int0 = 9;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(9, 9, 9);
      SumSincFunction sumSincFunction0 = new SumSincFunction(9);
      double double0 = (-1.0);
      double double1 = 1588.0;
      BOBYQAOptimizer bOBYQAOptimizer1 = new BOBYQAOptimizer(9, (-1.0), 1588.0);
      sumSincFunction0.gradient();
      bOBYQAOptimizer1.getEvaluations();
      int int1 = 14;
      GoalType goalType0 = GoalType.MAXIMIZE;
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 14;
      doubleArray0[1] = (-1.0);
      doubleArray0[2] = (double) 9;
      // Undeclared exception!
      bOBYQAOptimizer1.optimize(1671, sumSincFunction0, goalType0, doubleArray0);
  }
}