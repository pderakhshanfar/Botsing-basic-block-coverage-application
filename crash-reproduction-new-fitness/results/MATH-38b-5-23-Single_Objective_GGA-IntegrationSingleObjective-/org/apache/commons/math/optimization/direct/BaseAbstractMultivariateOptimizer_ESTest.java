/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 02:37:10 UTC 2020
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
      double double0 = 1.1051958197593224;
      double[] doubleArray0 = new double[4];
      doubleArray0[2] = 1.1051958197593224;
      int int0 = 10;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(10, 10, 10);
      SumSincFunction sumSincFunction0 = new SumSincFunction((-1459.74436));
      SumSincFunction sumSincFunction1 = new SumSincFunction((-1459.74436));
      sumSincFunction1.partialDerivative((-703));
      int int1 = 1046;
      GoalType goalType0 = GoalType.MINIMIZE;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(1046, sumSincFunction0, goalType0, doubleArray0);
  }
}