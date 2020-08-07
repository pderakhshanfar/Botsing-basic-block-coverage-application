/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 01:56:25 UTC 2020
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
      GoalType goalType0 = GoalType.MINIMIZE;
      double[] doubleArray0 = new double[8];
      doubleArray0[1] = 0.0;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(12, 1029.0, 39.0);
      double double0 = 1029.0;
      double double1 = (-1813.7546186090144);
      BOBYQAOptimizer bOBYQAOptimizer1 = new BOBYQAOptimizer(36, 39.0, (-4576.277818416483));
      // Undeclared exception!
      bOBYQAOptimizer1.optimize(36, multivariateFunction0, goalType0, doubleArray0);
  }
}