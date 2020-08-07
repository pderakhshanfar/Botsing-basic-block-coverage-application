/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 02:40:11 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.SincFunction;
import org.apache.commons.math.analysis.UnivariateFunction;
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
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver1 = new BracketingNthOrderBrentSolver();
      double double0 = (-1562.62914495547);
      SinFunction sinFunction0 = new SinFunction();
      int int0 = 1148;
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      bracketingNthOrderBrentSolver1.solve(1148, (UnivariateFunction) sinFunction0, (-2924.06), 0.0, allowedSolution0);
      SincFunction sincFunction0 = new SincFunction();
      sincFunction0.derivative();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      SincFunction sincFunction1 = new SincFunction();
      UnivariateFunction univariateFunction0 = sincFunction1.derivative();
      double double1 = (-906.305);
      // Undeclared exception!
      bracketingNthOrderBrentSolver1.solve(3, univariateFunction0, (-906.305), (-575.5872), allowedSolution0);
  }
}