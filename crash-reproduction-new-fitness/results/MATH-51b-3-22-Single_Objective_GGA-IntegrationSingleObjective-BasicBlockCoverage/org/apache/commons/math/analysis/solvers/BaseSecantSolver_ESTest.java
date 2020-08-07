/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 02:43:23 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.SincFunction;
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
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1423.5435211018244));
      SincFunction sincFunction0 = new SincFunction();
      SincFunction sincFunction1 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      int int0 = 5;
      // Undeclared exception!
      pegasusSolver0.solve(5, (UnivariateRealFunction) sincFunction0, 0.005633107113294778, (double) 5, (-2451.8666), allowedSolution0);
  }
}