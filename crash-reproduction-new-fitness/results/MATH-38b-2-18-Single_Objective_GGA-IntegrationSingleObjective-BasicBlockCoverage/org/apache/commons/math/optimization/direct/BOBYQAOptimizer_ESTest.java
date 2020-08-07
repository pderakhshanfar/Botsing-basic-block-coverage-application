/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 02:30:38 UTC 2020
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
      double[] doubleArray0 = new double[10];
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(26);
      int int0 = BOBYQAOptimizer.MINIMUM_PROBLEM_DIMENSION;
      int int1 = (-409);
      BOBYQAOptimizer bOBYQAOptimizer1 = new BOBYQAOptimizer((-105));
      SumSincFunction sumSincFunction0 = new SumSincFunction(26);
      int int2 = (-409);
      GoalType goalType0 = GoalType.MINIMIZE;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(127, sumSincFunction0, goalType0, doubleArray0);
  }
}