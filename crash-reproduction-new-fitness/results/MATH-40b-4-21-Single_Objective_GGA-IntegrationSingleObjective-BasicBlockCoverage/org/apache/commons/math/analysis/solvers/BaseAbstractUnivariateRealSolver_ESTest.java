/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 02:35:29 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.BaseSecantSolver;
import org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      double double1 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(2.46537446975708, 5663);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) quinticFunction0, (-1964.128153929739), (double) 5, allowedSolution0);
  }
}