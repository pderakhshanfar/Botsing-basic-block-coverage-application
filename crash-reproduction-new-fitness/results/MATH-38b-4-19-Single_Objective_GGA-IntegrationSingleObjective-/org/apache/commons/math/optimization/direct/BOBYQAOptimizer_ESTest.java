/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 02:32:56 UTC 2020
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
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(1014, 2699.551332408755, 0.0);
      BOBYQAOptimizer bOBYQAOptimizer1 = new BOBYQAOptimizer(106);
      BOBYQAOptimizer bOBYQAOptimizer2 = new BOBYQAOptimizer(21);
      SumSincFunction sumSincFunction0 = new SumSincFunction(1.1102230246251565E-14);
      SumSincFunction sumSincFunction1 = new SumSincFunction(2699.551332408755);
      GoalType goalType0 = GoalType.MAXIMIZE;
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (double) 784;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = (double) 106;
      doubleArray0[3] = 2699.551332408755;
      doubleArray0[4] = (double) 1014;
      // Undeclared exception!
      bOBYQAOptimizer2.optimize(784, sumSincFunction1, goalType0, doubleArray0);
  }
}