/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 02:49:21 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.DifferentiableUnivariateRealFunction;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.solvers.NewtonSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = (-715.5);
      NewtonSolver newtonSolver0 = new NewtonSolver(1810.124938);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      newtonSolver0.solve((-2812), (DifferentiableUnivariateRealFunction) quinticFunction0, 1082.0, (-715.5));
  }
}