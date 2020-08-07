/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 02:37:16 UTC 2020
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
public class BOBYQAOptimizer_ESTest extends BOBYQAOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(9);
      MultivariateFunction multivariateFunction0 = mock(MultivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(multivariateFunction0).value(any(double[].class));
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 9;
      doubleArray0[0] = (double) 9;
      BOBYQAOptimizer bOBYQAOptimizer1 = new BOBYQAOptimizer((-613));
      GoalType goalType0 = GoalType.MAXIMIZE;
      double[] doubleArray1 = new double[3];
      doubleArray1[0] = (double) 9;
      doubleArray1[1] = (-81.0);
      doubleArray1[2] = (double) (-613);
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(9, multivariateFunction0, goalType0, doubleArray1);
  }
}