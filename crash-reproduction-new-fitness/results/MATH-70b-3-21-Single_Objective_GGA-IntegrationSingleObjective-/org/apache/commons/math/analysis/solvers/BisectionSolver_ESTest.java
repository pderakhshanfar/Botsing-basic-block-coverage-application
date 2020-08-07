/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 17:06:05 UTC 2020
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
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BisectionSolver bisectionSolver1 = new BisectionSolver(univariateRealFunction0);
      double double0 = 0.0;
      bisectionSolver0.setRelativeAccuracy(0.0);
      BisectionSolver bisectionSolver2 = new BisectionSolver();
      bisectionSolver2.getFunctionValueAccuracy();
      bisectionSolver2.getRelativeAccuracy();
      double double1 = 0.0;
      int int0 = 0;
      bisectionSolver1.setResult(0.0, 0);
      UnivariateRealFunction univariateRealFunction1 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      double double2 = 2380.84;
      // Undeclared exception!
      bisectionSolver0.solve(univariateRealFunction1, 1.0E-15, 2380.84, 1.0E-14);
  }
}