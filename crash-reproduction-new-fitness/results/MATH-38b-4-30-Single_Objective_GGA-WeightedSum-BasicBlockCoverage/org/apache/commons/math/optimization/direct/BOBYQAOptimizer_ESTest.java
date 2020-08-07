/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 01:58:13 UTC 2020
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
      int int0 = (-9);
      int int1 = 16;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(16);
      SumSincFunction sumSincFunction0 = new SumSincFunction((-9));
      double[] doubleArray0 = new double[5];
      BOBYQAOptimizer bOBYQAOptimizer1 = new BOBYQAOptimizer(16);
      SumSincFunction sumSincFunction1 = new SumSincFunction(0.0);
      GoalType goalType0 = GoalType.MAXIMIZE;
      // Undeclared exception!
      bOBYQAOptimizer1.optimize(18, sumSincFunction0, goalType0, doubleArray0);
  }
}