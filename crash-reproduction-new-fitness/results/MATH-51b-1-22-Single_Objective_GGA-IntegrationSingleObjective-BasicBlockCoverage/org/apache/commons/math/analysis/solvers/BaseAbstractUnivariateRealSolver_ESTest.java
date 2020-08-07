/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 02:43:05 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.XMinus5Function;
import org.apache.commons.math.analysis.solvers.PegasusSolver;
import org.apache.commons.math.analysis.solvers.SecantSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0);
      SecantSolver secantSolver0 = new SecantSolver(0.0, 0.0);
      secantSolver0.isSequence((-1.0), (-1.0), 0.0);
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      UnivariateRealFunction univariateRealFunction0 = xMinus5Function0.derivative();
      secantSolver0.setup((-1), univariateRealFunction0, (-1), (-1), (-1));
      secantSolver0.isBracketing(0.2352252543019926, 0.0);
      // Undeclared exception!
      secantSolver0.doSolve();
  }
}