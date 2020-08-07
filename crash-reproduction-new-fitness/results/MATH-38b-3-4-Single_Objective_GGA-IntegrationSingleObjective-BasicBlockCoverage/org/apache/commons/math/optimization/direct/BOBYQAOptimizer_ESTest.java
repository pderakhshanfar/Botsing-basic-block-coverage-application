/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 22:05:24 UTC 2020
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
      int int0 = (-363);
      int int1 = 30;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(30, (-363), (-605.0));
      SumSincFunction sumSincFunction0 = new SumSincFunction(1.0);
      int int2 = 1364;
      GoalType goalType0 = GoalType.MAXIMIZE;
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (double) (-18);
      doubleArray0[1] = (double) 30;
      doubleArray0[2] = (-605.0);
      doubleArray0[3] = (double) (-363);
      doubleArray0[4] = (double) (-363);
      doubleArray0[5] = (double) (-18);
      doubleArray0[6] = (double) 1364;
      doubleArray0[7] = (double) 1364;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(30, sumSincFunction0, goalType0, doubleArray0);
  }
}