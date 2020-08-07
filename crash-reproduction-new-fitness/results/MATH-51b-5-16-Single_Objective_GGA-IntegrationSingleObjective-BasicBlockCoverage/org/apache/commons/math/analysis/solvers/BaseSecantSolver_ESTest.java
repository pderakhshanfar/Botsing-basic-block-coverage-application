/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 02:41:57 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.IllinoisSolver;
import org.apache.commons.math.analysis.solvers.RegulaFalsiSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      IllinoisSolver illinoisSolver1 = new IllinoisSolver();
      SinFunction sinFunction0 = new SinFunction();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-2622.084660082), 0.25, 1.0);
      sinFunction0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      illinoisSolver0.solve(4, (UnivariateRealFunction) sinFunction0, 1.0000000000002656, (double) 4, 2750.88, allowedSolution0);
  }
}