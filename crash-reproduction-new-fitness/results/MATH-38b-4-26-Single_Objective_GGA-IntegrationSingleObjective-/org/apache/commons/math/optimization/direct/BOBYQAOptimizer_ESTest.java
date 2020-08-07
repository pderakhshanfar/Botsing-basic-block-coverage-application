/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 02:39:17 UTC 2020
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
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(233, 233, 233);
      GoalType goalType0 = GoalType.MAXIMIZE;
      GoalType goalType1 = GoalType.MAXIMIZE;
      double double0 = 17.0;
      int int0 = (-1482);
      double double1 = 1476.51651121;
      BOBYQAOptimizer bOBYQAOptimizer1 = new BOBYQAOptimizer((-1482), 1738.242, 1476.51651121);
      double double2 = 1.0;
      BOBYQAOptimizer bOBYQAOptimizer2 = new BOBYQAOptimizer(45, 2154, 902.660861504704);
      int int1 = 283;
      SumSincFunction sumSincFunction0 = new SumSincFunction(1.0);
      sumSincFunction0.partialDerivative(7);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      bOBYQAOptimizer2.optimize(283, sumSincFunction0, goalType1, doubleArray0);
  }
}