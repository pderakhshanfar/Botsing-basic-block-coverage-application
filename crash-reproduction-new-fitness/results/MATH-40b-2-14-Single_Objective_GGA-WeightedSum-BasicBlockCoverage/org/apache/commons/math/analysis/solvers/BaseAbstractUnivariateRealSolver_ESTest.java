/*
 * This file was automatically generated by EvoSuite
 * Thu May 14 21:33:18 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.DifferentiableUnivariateFunction;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.NewtonSolver;
import org.apache.commons.math.analysis.solvers.SecantSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      expm1Function0.derivative();
      expm1Function0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      SecantSolver secantSolver0 = new SecantSolver((-3181.5387481));
      NewtonSolver newtonSolver0 = new NewtonSolver((-3181.5387481));
      int int0 = 0;
      expm1Function0.derivative();
      double double0 = 1279.437;
      // Undeclared exception!
      newtonSolver0.solve(0, (DifferentiableUnivariateFunction) expm1Function0, 0.0, 1279.437);
  }
}