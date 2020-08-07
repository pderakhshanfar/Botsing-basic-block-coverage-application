/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 02:07:48 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.IllinoisSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = 507.0158;
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(507.0158, 507.0158);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      double double1 = 1.0E-15;
      double double2 = (-1030.35242);
      // Undeclared exception!
      illinoisSolver0.solve(2, (UnivariateRealFunction) quinticFunction0, (-1030.35242), 2296.875801431, 1451.81518138175);
  }
}