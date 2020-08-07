/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 22:13:37 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.SincFunction;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.XMinus5Function;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.BaseSecantSolver;
import org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver;
import org.apache.commons.math.analysis.solvers.LaguerreSolver;
import org.apache.commons.math.analysis.solvers.SecantSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      int int0 = 1455;
      int int1 = 2569;
      Expm1Function expm1Function0 = new Expm1Function();
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      SincFunction sincFunction0 = new SincFunction();
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
      double double0 = 2179.7351608748;
      double double1 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      double double2 = (-14.864184504246946);
      double double3 = (-681.424);
      double double4 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      double double5 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      sincFunction0.derivative();
      double double6 = SecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      double double7 = Double.NaN;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) expm1Function0, Double.NaN, 710.4848643556289, (-0.0625), allowedSolution0);
  }
}