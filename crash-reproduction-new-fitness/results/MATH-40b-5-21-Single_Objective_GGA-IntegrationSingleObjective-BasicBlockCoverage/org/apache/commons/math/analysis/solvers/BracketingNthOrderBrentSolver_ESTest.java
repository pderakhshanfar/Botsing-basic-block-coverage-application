/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 02:35:25 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.XMinus5Function;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BracketingNthOrderBrentSolver_ESTest extends BracketingNthOrderBrentSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      double double0 = 2.2979817390441895;
      int int0 = 1454;
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      bracketingNthOrderBrentSolver0.solve(1454, (UnivariateFunction) quinticFunction0, (-2681.990227), 1.0E-6, (-0.40003422139712874), allowedSolution0);
      AllowedSolution allowedSolution1 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(2, (UnivariateFunction) xMinus5Function0, 2.2979817390441895, 5644.37219, 102.86, allowedSolution1);
  }
}