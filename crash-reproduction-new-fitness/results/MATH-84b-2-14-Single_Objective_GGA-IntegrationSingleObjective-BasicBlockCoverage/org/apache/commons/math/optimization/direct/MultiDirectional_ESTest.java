/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 22:59:13 UTC 2020
 */

package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Comparator;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.RealConvergenceChecker;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.apache.commons.math.optimization.direct.MultiDirectional;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class MultiDirectional_ESTest extends MultiDirectional_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      double double0 = 0.0;
      MultiDirectional multiDirectional1 = new MultiDirectional(0.0, 0.0);
      RealConvergenceChecker realConvergenceChecker0 = mock(RealConvergenceChecker.class, new ViolatedAssumptionAnswer());
      multiDirectional1.setConvergenceChecker(realConvergenceChecker0);
      RealConvergenceChecker realConvergenceChecker1 = mock(RealConvergenceChecker.class, new ViolatedAssumptionAnswer());
      multiDirectional1.setConvergenceChecker(realConvergenceChecker1);
      multiDirectional0.setMaxIterations((-4271));
      int int0 = 0;
      multiDirectional1.setMaxEvaluations(0);
      multiDirectional1.setMaxIterations(0);
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      try { 
        multiDirectional0.iterateSimplex(comparator0);
        fail("Expecting exception: OptimizationException");
      
      } catch(OptimizationException e) {
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-4,271) exceeded
         //
         verifyException("org.apache.commons.math.optimization.direct.DirectSearchOptimizer", e);
      }
  }
}