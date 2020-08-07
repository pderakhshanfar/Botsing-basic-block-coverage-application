/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 02:35:31 UTC 2020
 */

package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.MultivariateFunction;
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
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(multivariateFunction0).value(any(double[].class));
      int int0 = 32;
      GoalType goalType0 = GoalType.MINIMIZE;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(32);
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (double) 32;
      doubleArray0[1] = (double) 32;
      doubleArray0[2] = (double) 32;
      doubleArray0[3] = (double) 1825;
      doubleArray0[4] = (double) 32;
      doubleArray0[5] = (double) 32;
      doubleArray0[6] = (double) 32;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(1825, multivariateFunction0, goalType0, doubleArray0);
  }
}