/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 22:19:53 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.SincFunction;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.XMinus5Function;
import org.apache.commons.math.analysis.solvers.BaseSecantSolver;
import org.apache.commons.math.analysis.solvers.BisectionSolver;
import org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      SincFunction sincFunction0 = new SincFunction();
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      int int0 = 3;
      sincFunction0.derivative();
      double double0 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      double double1 = 1.0E-6;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(3, (UnivariateFunction) xMinus5Function0, 1.0E-6, 290.8729126, (double) 3);
  }
}