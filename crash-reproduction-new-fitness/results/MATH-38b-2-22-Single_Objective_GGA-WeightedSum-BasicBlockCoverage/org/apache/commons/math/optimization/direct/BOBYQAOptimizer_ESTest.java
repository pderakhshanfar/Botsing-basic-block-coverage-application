/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 01:57:27 UTC 2020
 */

package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.MultivariateFunction;
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
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(50, 8.669609743538254E-25, (-75.5));
      SumSincFunction sumSincFunction0 = new SumSincFunction(50);
      MultivariateFunction multivariateFunction0 = sumSincFunction0.partialDerivative(4);
      GoalType goalType0 = GoalType.MINIMIZE;
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-75.5);
      doubleArray0[1] = (-75.5);
      doubleArray0[2] = 8.669609743538254E-25;
      doubleArray0[3] = 3.0;
      doubleArray0[4] = (double) 120;
      doubleArray0[5] = (double) 120;
      doubleArray0[6] = (double) 50;
      doubleArray0[7] = (-75.5);
      doubleArray0[8] = (double) 50;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(120, multivariateFunction0, goalType0, doubleArray0);
  }
}