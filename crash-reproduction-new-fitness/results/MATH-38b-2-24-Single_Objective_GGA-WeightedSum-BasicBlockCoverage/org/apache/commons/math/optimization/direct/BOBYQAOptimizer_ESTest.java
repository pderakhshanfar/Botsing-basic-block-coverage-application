/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 01:56:21 UTC 2020
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
public class BOBYQAOptimizer_ESTest extends BOBYQAOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(11);
      SumSincFunction sumSincFunction0 = new SumSincFunction(2053);
      BOBYQAOptimizer bOBYQAOptimizer1 = new BOBYQAOptimizer(266, 177, 1.0);
      SumSincFunction sumSincFunction1 = new SumSincFunction(177);
      sumSincFunction1.partialDerivative(37);
      GoalType goalType0 = GoalType.MINIMIZE;
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 1.5;
      doubleArray0[1] = 1168.73499586;
      doubleArray0[2] = (double) (-2739);
      doubleArray0[3] = (double) 1362;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(1528, sumSincFunction1, goalType0, doubleArray0);
  }
}