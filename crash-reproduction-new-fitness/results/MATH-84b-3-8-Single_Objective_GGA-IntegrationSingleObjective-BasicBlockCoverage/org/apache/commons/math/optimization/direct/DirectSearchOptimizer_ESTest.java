/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 23:00:08 UTC 2020
 */

package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Comparator;
import org.apache.commons.math.analysis.MultivariateRealFunction;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.apache.commons.math.optimization.direct.MultiDirectional;
import org.apache.commons.math.optimization.direct.NelderMead;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DirectSearchOptimizer_ESTest extends DirectSearchOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      MultivariateRealFunction multivariateRealFunction0 = mock(MultivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0).when(multivariateRealFunction0).value(any(double[].class));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      MultiDirectional multiDirectional1 = new MultiDirectional((-1278.411492327756), 0.0);
      NelderMead nelderMead0 = new NelderMead(7.0, 7.0, 2665.944623205913, 2.0);
      int int0 = (-448);
      nelderMead0.incrementIterationsCounter();
      multiDirectional0.setMaxIterations((-448));
      GoalType goalType0 = GoalType.MINIMIZE;
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = Double.NaN;
      doubleArray0[1] = (-1278.411492327756);
      try { 
        multiDirectional0.optimize(multivariateRealFunction0, goalType0, doubleArray0);
        fail("Expecting exception: OptimizationException");
      
      } catch(OptimizationException e) {
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-448) exceeded
         //
         verifyException("org.apache.commons.math.optimization.direct.DirectSearchOptimizer", e);
      }
  }
}