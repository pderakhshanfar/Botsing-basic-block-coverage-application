/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 02:41:32 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.solvers.BrentSolver;
import org.apache.commons.math.analysis.solvers.MullerSolver;
import org.apache.commons.math.analysis.solvers.MullerSolver2;
import org.apache.commons.math.analysis.solvers.SecantSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      MullerSolver2 mullerSolver2_0 = new MullerSolver2(26.92703537827417, 26.92703537827417);
      double double0 = SecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      SinFunction sinFunction0 = new SinFunction();
      sinFunction0.value((-2640.888734448048));
      brentSolver0.getEvaluations();
      MullerSolver mullerSolver0 = new MullerSolver((-138.8030764217602));
      // Undeclared exception!
      mullerSolver0.incrementEvaluationCount();
  }
}