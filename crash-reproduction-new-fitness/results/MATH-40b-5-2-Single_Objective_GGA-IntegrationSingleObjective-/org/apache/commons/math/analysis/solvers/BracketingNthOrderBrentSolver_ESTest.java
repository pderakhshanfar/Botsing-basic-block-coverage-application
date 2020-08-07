/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 22:15:19 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.SinFunction;
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
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      bracketingNthOrderBrentSolver0.solve(6219, (UnivariateFunction) expm1Function0, (-0.6781532043751085), (double) 6219, 827.0809086081543, allowedSolution0);
      SinFunction sinFunction0 = new SinFunction();
      UnivariateFunction univariateFunction0 = sinFunction0.derivative();
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver1 = new BracketingNthOrderBrentSolver(6.615274994459241E-11, 1.198363039426718E-70, 6219);
      // Undeclared exception!
      bracketingNthOrderBrentSolver1.solve(5, univariateFunction0, (-1.0618887218475019E15), 1.198363039426718E-70, (-1903.7971053), allowedSolution0);
  }
}