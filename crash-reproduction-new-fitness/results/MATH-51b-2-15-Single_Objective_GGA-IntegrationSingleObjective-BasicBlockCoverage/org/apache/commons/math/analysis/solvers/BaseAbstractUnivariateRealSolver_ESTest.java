/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 22:22:43 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.solvers.RiddersSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      quinticFunction0.derivative();
      quinticFunction0.derivative();
      quinticFunction0.derivative();
      quinticFunction0.derivative();
      double double0 = (-414.2783872383948);
      double double1 = 186.852791068246;
      double double2 = 2.1213078425996423;
      double double3 = 0.0;
      RiddersSolver riddersSolver0 = new RiddersSolver(0.0);
      // Undeclared exception!
      riddersSolver0.doSolve();
  }
}