/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 03:17:51 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.BrentSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BrentSolver_ESTest extends BrentSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      brentSolver0.resetAbsoluteAccuracy();
      brentSolver0.setMaximalIterationCount(3);
      double double0 = 0.0;
      brentSolver0.setResult(0.0, 0.0, 3);
      brentSolver0.setMaximalIterationCount(3);
      double double1 = 0.0;
      brentSolver0.setResult((-3393.0), 0.0, 3);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      UnivariateRealFunction univariateRealFunction0 = quinticFunction0.derivative();
      // Undeclared exception!
      brentSolver0.solve(univariateRealFunction0, 0.0, 1437.749);
  }
}