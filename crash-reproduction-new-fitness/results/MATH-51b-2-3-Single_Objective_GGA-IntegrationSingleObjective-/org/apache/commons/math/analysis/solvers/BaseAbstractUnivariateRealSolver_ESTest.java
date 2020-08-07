/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 22:23:17 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.DifferentiableUnivariateRealFunction;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.analysis.solvers.NewtonSolver;
import org.apache.commons.math.analysis.solvers.RiddersSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver();
      riddersSolver0.getMaxEvaluations();
      double double0 = 0.0;
      riddersSolver0.verifyInterval((-0.6361803108825715), 0.0);
      double double1 = 1.0;
      double double2 = 2070.986099057485;
      riddersSolver0.isSequence(1.0, 2070.986099057485, 2070.986099057485);
      NewtonSolver newtonSolver0 = new NewtonSolver();
      int int0 = (-1120);
      double[] doubleArray0 = new double[8];
      doubleArray0[2] = 1.0;
      doubleArray0[2] = 2070.986099057485;
      newtonSolver0.getMaxEvaluations();
      doubleArray0[7] = (double) (-1120);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      PolynomialFunction polynomialFunction1 = polynomialFunction0.negate();
      polynomialFunction1.add(polynomialFunction0);
      polynomialFunction1.derivative();
      polynomialFunction1.subtract(polynomialFunction0);
      // Undeclared exception!
      newtonSolver0.solve((-1120), (DifferentiableUnivariateRealFunction) polynomialFunction0, 2070.986099057485);
  }
}