/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 22:19:13 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.XMinus5Function;
import org.apache.commons.math.analysis.solvers.BaseSecantSolver;
import org.apache.commons.math.analysis.solvers.RegulaFalsiSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      double double0 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      BaseSecantSolver.Method.values();
      quinticFunction0.derivative();
      double double1 = 0.0;
      xMinus5Function0.derivative();
      xMinus5Function0.derivative();
      int int0 = 2;
      double double2 = 296.131;
      // Undeclared exception!
      regulaFalsiSolver0.solve(2, (UnivariateRealFunction) xMinus5Function0, (double) 2, 296.131, 1.0E-6);
  }
}