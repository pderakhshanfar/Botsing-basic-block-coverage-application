/*
 * This file was automatically generated by EvoSuite
 * Thu May 14 21:26:50 UTC 2020
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
public class BaseAbstractMultivariateOptimizer_ESTest extends BaseAbstractMultivariateOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MultivariateFunction multivariateFunction0 = mock(MultivariateFunction.class, new ViolatedAssumptionAnswer());
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(49, 49, 49);
      SumSincFunction sumSincFunction0 = new SumSincFunction((-2087.1275));
      sumSincFunction0.partialDerivative(1790);
      GoalType goalType0 = GoalType.MINIMIZE;
      bOBYQAOptimizer0.getEvaluations();
      double[] doubleArray0 = new double[15];
      double[] doubleArray1 = new double[9];
      doubleArray1[3] = (double) 1790;
      doubleArray1[4] = (double) 49;
      doubleArray1[6] = (double) 49;
      doubleArray1[3] = (-593.65369);
      doubleArray1[8] = (-2087.1275);
      sumSincFunction0.value(doubleArray1);
      doubleArray0[2] = (-2087.1275);
      sumSincFunction0.value(doubleArray1);
      sumSincFunction0.value(doubleArray0);
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(1790, sumSincFunction0, goalType0, doubleArray0);
  }
}