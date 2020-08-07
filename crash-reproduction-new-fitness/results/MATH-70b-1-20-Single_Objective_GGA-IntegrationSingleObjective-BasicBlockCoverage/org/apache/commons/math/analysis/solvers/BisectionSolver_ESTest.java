/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 17:06:28 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.BisectionSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BisectionSolver_ESTest extends BisectionSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      bisectionSolver0.getMaximalIterationCount();
      BisectionSolver bisectionSolver1 = new BisectionSolver();
      bisectionSolver1.clearResult();
      double double0 = (-1578.96092);
      double double1 = 547.047;
      bisectionSolver1.isSequence(100, (-1578.96092), 547.047);
      bisectionSolver1.resetRelativeAccuracy();
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      double double2 = 1.0;
      bisectionSolver1.solve(univariateRealFunction0, (-2364.081), 1.0);
      UnivariateRealFunction univariateRealFunction1 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(univariateRealFunction1).value(anyDouble());
      bisectionSolver1.solve(univariateRealFunction1, (double) 100, 1641.414006133913);
      // Undeclared exception!
      bisectionSolver1.solve((UnivariateRealFunction) null, (-2364.081), (-1874.58), 1150.0);
  }
}