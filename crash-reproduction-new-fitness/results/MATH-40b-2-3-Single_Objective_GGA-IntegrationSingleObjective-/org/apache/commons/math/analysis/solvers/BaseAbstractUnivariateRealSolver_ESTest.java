/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 22:14:54 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.solvers.MullerSolver2;
import org.apache.commons.math.analysis.solvers.RiddersSolver;
import org.apache.commons.math.exception.TooManyEvaluationsException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UnivariateFunction univariateFunction0 = null;
      double double0 = 1.0E-14;
      MullerSolver2 mullerSolver2_0 = new MullerSolver2();
      RiddersSolver riddersSolver0 = new RiddersSolver(1.0E-14, 4.115012681497065);
      double[] doubleArray0 = new double[17];
      try { 
        riddersSolver0.computeObjectiveValue(0.0);
        fail("Expecting exception: TooManyEvaluationsException");
      
      } catch(TooManyEvaluationsException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }
}