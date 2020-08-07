/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 22:13:11 UTC 2020
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
public class BaseAbstractMultivariateSimpleBoundsOptimizer_ESTest extends BaseAbstractMultivariateSimpleBoundsOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SumSincFunction sumSincFunction0 = new SumSincFunction(1474.3944352318615);
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) (-224);
      doubleArray0[1] = (double) (-224);
      doubleArray0[2] = 1474.3944352318615;
      doubleArray0[3] = 1474.3944352318615;
      doubleArray0[4] = (double) (-224);
      doubleArray0[5] = (double) (-224);
      sumSincFunction0.value(doubleArray0);
      GoalType goalType0 = GoalType.MAXIMIZE;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(24);
      sumSincFunction0.gradient();
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(679, sumSincFunction0, goalType0, doubleArray0);
  }
}