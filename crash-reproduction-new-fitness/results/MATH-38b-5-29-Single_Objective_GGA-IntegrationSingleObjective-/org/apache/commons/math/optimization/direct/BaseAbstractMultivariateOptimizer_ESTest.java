/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 02:41:10 UTC 2020
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
public class BaseAbstractMultivariateOptimizer_ESTest extends BaseAbstractMultivariateOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double[] doubleArray0 = new double[19];
      int int0 = 3;
      int int1 = 182;
      GoalType goalType0 = GoalType.MINIMIZE;
      int int2 = 41;
      SumSincFunction sumSincFunction0 = new SumSincFunction((-2467));
      sumSincFunction0.gradient();
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(41);
      bOBYQAOptimizer0.getMaxEvaluations();
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(182, sumSincFunction0, goalType0, doubleArray0);
  }
}