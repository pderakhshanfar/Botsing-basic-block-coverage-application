/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 02:05:23 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.DifferentiableUnivariateRealFunction;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.solvers.BaseSecantSolver;
import org.apache.commons.math.analysis.solvers.NewtonSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      expm1Function0.derivative();
      expm1Function0.value(0.0);
      double double0 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      expm1Function0.derivative();
      // Undeclared exception!
      newtonSolver0.solve(212, (DifferentiableUnivariateRealFunction) expm1Function0, (-1964.5049624223695), (double) (-3159));
  }
}