/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 02:31:30 UTC 2020
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
      int int0 = (-1);
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(39, 0.1, 39);
      SumSincFunction sumSincFunction0 = new SumSincFunction(0.1);
      sumSincFunction0.partialDerivative(3829);
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 0.1;
      doubleArray0[1] = (double) 3829;
      doubleArray0[2] = (double) 3829;
      doubleArray0[3] = 1839.5238147;
      doubleArray0[4] = 0.1;
      doubleArray0[5] = 0.1;
      doubleArray0[6] = (double) 3829;
      int int1 = 1702;
      SumSincFunction sumSincFunction1 = new SumSincFunction(3965.0);
      GoalType goalType0 = GoalType.MAXIMIZE;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(1702, sumSincFunction1, goalType0, doubleArray0);
  }
}