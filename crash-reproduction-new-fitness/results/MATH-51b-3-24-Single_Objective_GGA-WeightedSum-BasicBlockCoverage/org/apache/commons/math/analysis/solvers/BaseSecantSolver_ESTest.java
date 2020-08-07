/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 02:07:15 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.PegasusSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      PegasusSolver pegasusSolver0 = new PegasusSolver(45.9);
      SinFunction sinFunction0 = new SinFunction();
      pegasusSolver0.solve(1966, (UnivariateRealFunction) sinFunction0, (-1.557839754267608E14), 45.9, allowedSolution0);
      pegasusSolver0.incrementEvaluationCount();
      AllowedSolution allowedSolution1 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      pegasusSolver0.solve(5, (UnivariateRealFunction) sinFunction0, 0.6366197723675814, 1241.581, allowedSolution1);
  }
}