/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 22:12:36 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.XMinus5Function;
import org.apache.commons.math.analysis.solvers.LaguerreSolver;
import org.apache.commons.math.analysis.solvers.PegasusSolver;
import org.apache.commons.math.exception.TooManyEvaluationsException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      xMinus5Function0.derivative();
      xMinus5Function0.derivative();
      xMinus5Function0.derivative();
      xMinus5Function0.derivative();
      xMinus5Function0.derivative();
      xMinus5Function0.derivative();
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(0.0);
      double double0 = (-77.0);
      double double1 = (-1.0);
      try { 
        laguerreSolver0.computeObjectiveValue(Double.POSITIVE_INFINITY);
        fail("Expecting exception: TooManyEvaluationsException");
      
      } catch(TooManyEvaluationsException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }
}