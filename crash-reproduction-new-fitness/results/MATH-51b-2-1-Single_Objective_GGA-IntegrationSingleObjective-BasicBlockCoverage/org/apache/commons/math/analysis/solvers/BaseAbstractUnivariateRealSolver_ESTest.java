/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 22:18:35 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.BaseSecantSolver;
import org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver;
import org.apache.commons.math.analysis.solvers.SecantSolver;
import org.apache.commons.math.exception.TooManyEvaluationsException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 178;
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      double double0 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      double double1 = SecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      bracketingNthOrderBrentSolver0.getMaxEvaluations();
      UnivariateRealFunction univariateRealFunction1 = null;
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double2 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      double double3 = Double.NaN;
      try { 
        bracketingNthOrderBrentSolver0.computeObjectiveValue(0.0);
        fail("Expecting exception: TooManyEvaluationsException");
      
      } catch(TooManyEvaluationsException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }
}