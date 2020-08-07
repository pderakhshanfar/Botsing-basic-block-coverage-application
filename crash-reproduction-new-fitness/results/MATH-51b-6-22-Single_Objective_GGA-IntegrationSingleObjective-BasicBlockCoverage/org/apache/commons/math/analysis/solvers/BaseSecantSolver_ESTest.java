/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 02:43:26 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.MonitoredFunction;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.IllinoisSolver;
import org.apache.commons.math.analysis.solvers.PegasusSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-425.0), (-425.0), (-425.0));
      QuinticFunction quinticFunction0 = new QuinticFunction();
      UnivariateRealFunction univariateRealFunction0 = quinticFunction0.derivative();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(univariateRealFunction0);
      PegasusSolver pegasusSolver0 = new PegasusSolver(1332.051, (-775.95), 0.0);
      pegasusSolver0.getRelativeAccuracy();
      illinoisSolver0.getFunctionValueAccuracy();
      PegasusSolver pegasusSolver1 = new PegasusSolver(0.08713622391223907, 387.498, 1241.31565);
      // Undeclared exception!
      pegasusSolver1.solve(2, (UnivariateRealFunction) quinticFunction0, (-995.8889845), 1713.8, 387.498);
  }
}