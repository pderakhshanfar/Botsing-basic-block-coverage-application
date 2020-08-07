/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 22:13:58 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver;
import org.apache.commons.math.analysis.solvers.MullerSolver;
import org.apache.commons.math.analysis.solvers.SecantSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver();
      double[] doubleArray0 = new double[18];
      doubleArray0[1] = (-0.23589219273177442);
      doubleArray0[2] = (-0.23589219273177442);
      doubleArray0[4] = (double) 2875;
      doubleArray0[7] = (-0.23589219273177442);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double double0 = SecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      polynomialFunction0.toString();
      double double1 = SecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, 2875);
      double double2 = (-1805.8354541);
      PolynomialFunction polynomialFunction1 = new PolynomialFunction(doubleArray0);
      polynomialFunction1.polynomialDerivative();
      polynomialFunction0.multiply(polynomialFunction1);
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) polynomialFunction0, (-0.23589219273177442), 2480.959833, 2010.00994951272);
  }
}