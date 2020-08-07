/*
 * This file was automatically generated by EvoSuite
 * Thu May 14 22:18:55 UTC 2020
 */

package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.MultivariateRealFunction;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.SimpleScalarValueChecker;
import org.apache.commons.math.optimization.direct.MultiDirectional;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DirectSearchOptimizer_ESTest extends DirectSearchOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MultivariateRealFunction multivariateRealFunction0 = mock(MultivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(multivariateRealFunction0).value(any(double[].class));
      GoalType goalType0 = GoalType.MAXIMIZE;
      MultiDirectional multiDirectional0 = new MultiDirectional();
      SimpleScalarValueChecker simpleScalarValueChecker0 = new SimpleScalarValueChecker(2018.9, 2018.9);
      multiDirectional0.setConvergenceChecker(simpleScalarValueChecker0);
      multiDirectional0.setMaxIterations((-4812));
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (double) (-4812);
      doubleArray0[1] = 2018.9;
      doubleArray0[2] = 2018.9;
      doubleArray0[3] = (double) (-4812);
      doubleArray0[4] = 2018.9;
      doubleArray0[5] = (double) (-4812);
      doubleArray0[6] = (double) (-4812);
      try { 
        multiDirectional0.optimize(multivariateRealFunction0, goalType0, doubleArray0);
        fail("Expecting exception: OptimizationException");
      
      } catch(OptimizationException e) {
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-4,812) exceeded
         //
         verifyException("org.apache.commons.math.optimization.direct.DirectSearchOptimizer", e);
      }
  }
}