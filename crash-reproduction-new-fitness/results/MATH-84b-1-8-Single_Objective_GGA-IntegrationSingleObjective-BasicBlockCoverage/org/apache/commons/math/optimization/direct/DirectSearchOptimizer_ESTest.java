/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 22:58:17 UTC 2020
 */

package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Comparator;
import org.apache.commons.math.analysis.MultivariateRealFunction;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.apache.commons.math.optimization.SimpleRealPointChecker;
import org.apache.commons.math.optimization.direct.NelderMead;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DirectSearchOptimizer_ESTest extends DirectSearchOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NelderMead nelderMead0 = new NelderMead();
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-831.31554207);
      doubleArray0[1] = (double) (-1810);
      doubleArray0[2] = (double) (-1810);
      doubleArray0[3] = (double) (-1810);
      doubleArray0[4] = (double) (-1810);
      doubleArray0[5] = (double) (-1810);
      SimpleRealPointChecker simpleRealPointChecker0 = new SimpleRealPointChecker((-831.31554207), (-328.2395458139529));
      nelderMead0.setConvergenceChecker(simpleRealPointChecker0);
      doubleArray0[6] = (double) (-1810);
      doubleArray0[7] = (double) (-1810);
      doubleArray0[8] = (double) (-1810);
      nelderMead0.setStartConfiguration(doubleArray0);
      nelderMead0.setMaxIterations((-1810));
      MultivariateRealFunction multivariateRealFunction0 = mock(MultivariateRealFunction.class, new ViolatedAssumptionAnswer());
      nelderMead0.setMaxIterations((-1810));
      nelderMead0.getEvaluations();
      nelderMead0.getConvergenceChecker();
      nelderMead0.getMaxEvaluations();
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      try { 
        nelderMead0.iterateSimplex(comparator0);
        fail("Expecting exception: OptimizationException");
      
      } catch(OptimizationException e) {
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-1,810) exceeded
         //
         verifyException("org.apache.commons.math.optimization.direct.DirectSearchOptimizer", e);
      }
  }
}