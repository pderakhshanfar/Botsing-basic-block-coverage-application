/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 02:30:37 UTC 2020
 */

package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.MultivariateFunction;
import org.apache.commons.math.analysis.SumSincFunction;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.direct.BOBYQAOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BOBYQAOptimizer_ESTest extends BOBYQAOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(16, 16, 31.652577605798534);
      SumSincFunction sumSincFunction0 = new SumSincFunction(0.0);
      MultivariateFunction multivariateFunction0 = sumSincFunction0.partialDerivative(5);
      GoalType goalType0 = GoalType.MAXIMIZE;
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (double) 16;
      doubleArray0[1] = (double) 16;
      doubleArray0[2] = (double) 16;
      doubleArray0[3] = (-2413.29635203);
      doubleArray0[4] = 0.0;
      doubleArray0[5] = (double) 16;
      doubleArray0[6] = 31.652577605798534;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(16, multivariateFunction0, goalType0, doubleArray0);
  }
}