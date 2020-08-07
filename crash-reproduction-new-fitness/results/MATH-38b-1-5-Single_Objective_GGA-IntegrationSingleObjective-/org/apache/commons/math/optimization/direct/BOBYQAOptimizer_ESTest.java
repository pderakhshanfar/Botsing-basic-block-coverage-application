/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 22:09:41 UTC 2020
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
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(12);
      SumSincFunction sumSincFunction0 = new SumSincFunction(11);
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (double) 11;
      BOBYQAOptimizer bOBYQAOptimizer1 = new BOBYQAOptimizer(12);
      SumSincFunction sumSincFunction1 = new SumSincFunction(184.68456738588617);
      BOBYQAOptimizer bOBYQAOptimizer2 = new BOBYQAOptimizer(25, 11, 5082.958419);
      GoalType goalType0 = GoalType.MAXIMIZE;
      // Undeclared exception!
      bOBYQAOptimizer2.optimize(177, sumSincFunction0, goalType0, doubleArray0);
  }
}