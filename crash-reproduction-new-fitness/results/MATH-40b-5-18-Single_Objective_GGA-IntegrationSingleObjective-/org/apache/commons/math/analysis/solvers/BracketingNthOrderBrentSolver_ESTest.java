/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 02:40:13 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
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
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      xMinus5Function0.derivative();
      xMinus5Function0.derivative();
      AllowedSolution allowedSolution1 = AllowedSolution.RIGHT_SIDE;
      bracketingNthOrderBrentSolver0.solve(2034, (UnivariateFunction) xMinus5Function0, (-1104.1071089910276), 1.3328680266667662E237, 0.0, allowedSolution0);
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(3, (UnivariateFunction) xMinus5Function0, 0.0, (double) 2034, 1.00001538E-6, allowedSolution1);
  }
}