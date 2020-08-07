/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 02:49:27 UTC 2020
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
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      SinFunction sinFunction0 = new SinFunction();
      sinFunction0.derivative();
      sinFunction0.derivative();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      double double0 = 1.1430250008909141E-8;
      double double1 = (-2.66169276480121E-4);
      PegasusSolver pegasusSolver1 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      pegasusSolver1.solve(11, univariateRealFunction0, 11.0, 1863.447472211218, (-1280.042), allowedSolution0);
  }
}