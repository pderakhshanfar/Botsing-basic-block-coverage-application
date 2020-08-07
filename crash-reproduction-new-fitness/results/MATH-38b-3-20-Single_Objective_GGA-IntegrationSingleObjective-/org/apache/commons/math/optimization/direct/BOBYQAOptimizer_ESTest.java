/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 02:34:38 UTC 2020
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
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer((-1121));
      SumSincFunction sumSincFunction0 = new SumSincFunction((-1121));
      BOBYQAOptimizer bOBYQAOptimizer1 = new BOBYQAOptimizer(9);
      SumSincFunction sumSincFunction1 = new SumSincFunction((-1121));
      GoalType goalType0 = GoalType.MINIMIZE;
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 0.125;
      doubleArray0[1] = (double) 720;
      doubleArray0[2] = (double) 9;
      doubleArray0[1] = (double) 720;
      // Undeclared exception!
      bOBYQAOptimizer1.optimize(720, sumSincFunction1, goalType0, doubleArray0);
  }
}