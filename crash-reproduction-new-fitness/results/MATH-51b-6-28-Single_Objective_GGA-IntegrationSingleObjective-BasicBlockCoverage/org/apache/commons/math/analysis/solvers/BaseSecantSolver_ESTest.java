/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 02:45:14 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.SinFunction;
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
      PegasusSolver pegasusSolver0 = new PegasusSolver((-4489.9));
      pegasusSolver0.isSequence(3.4872179531861183E-4, 1.0E-6, (-2529.4192));
      pegasusSolver0.getMax();
      pegasusSolver0.isSequence(0.5, 0.5, 1.0E-15);
      pegasusSolver0.getAbsoluteAccuracy();
      pegasusSolver0.getFunctionValueAccuracy();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1.0E-6, 0.5);
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      illinoisSolver0.solve(4, (UnivariateRealFunction) sinFunction0, (-4489.9), (double) (-693), (-1.2743350979679807E-16));
  }
}