/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 01:56:26 UTC 2020
 */

package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.MultivariateFunction;
import org.apache.commons.math.analysis.SumSincFunction;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.RealPointValuePair;
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
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(multivariateFunction0).value(any(double[].class));
      SumSincFunction sumSincFunction0 = new SumSincFunction(0.0);
      sumSincFunction0.partialDerivative((-2036));
      sumSincFunction0.partialDerivative((-2036));
      sumSincFunction0.partialDerivative(1167);
      double[] doubleArray0 = new double[9];
      sumSincFunction0.partialDerivative(50);
      sumSincFunction0.partialDerivative(1);
      sumSincFunction0.value(doubleArray0);
      doubleArray0[0] = (double) (-2036);
      doubleArray0[1] = (double) (-2036);
      doubleArray0[0] = 0.0;
      sumSincFunction0.gradient();
      doubleArray0[3] = (double) 50;
      RealPointValuePair realPointValuePair0 = new RealPointValuePair(doubleArray0, 50);
      doubleArray0[4] = 0.0;
      doubleArray0[6] = (double) 50;
      doubleArray0[5] = 0.0;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(50, 50.0, 0.0);
      GoalType goalType0 = GoalType.MAXIMIZE;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(893, multivariateFunction0, goalType0, doubleArray0);
  }
}