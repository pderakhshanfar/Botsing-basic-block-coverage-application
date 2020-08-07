/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 12:42:49 UTC 2020
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
      double double0 = 0.0;
      double double1 = 1.0E-14;
      BisectionSolver bisectionSolver1 = new BisectionSolver();
      bisectionSolver1.setResult(1.1609494686126708E-6, 1965);
      bisectionSolver1.getIterationCount();
      double double2 = 0.0;
      // Undeclared exception!
      bisectionSolver1.solve((-953.8612501094), 1.1609494686126708E-6);
  }
}