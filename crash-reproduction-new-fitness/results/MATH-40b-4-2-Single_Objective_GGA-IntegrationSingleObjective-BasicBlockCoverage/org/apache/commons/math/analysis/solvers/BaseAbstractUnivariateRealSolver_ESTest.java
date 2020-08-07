/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 22:13:02 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.MonitoredFunction;
import org.apache.commons.math.analysis.SincFunction;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.solvers.BaseSecantSolver;
import org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver;
import org.apache.commons.math.analysis.solvers.SecantSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SincFunction sincFunction0 = new SincFunction();
      UnivariateFunction univariateFunction0 = sincFunction0.derivative();
      double double0 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(sincFunction0);
      Expm1Function expm1Function0 = new Expm1Function();
      sincFunction0.derivative();
      int int0 = (-1);
      SecantSolver secantSolver0 = new SecantSolver(3);
      MonitoredFunction monitoredFunction1 = new MonitoredFunction(univariateFunction0);
      double double1 = (-0.5785545915);
      double double2 = SecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      double double3 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(1.0E-6, (-3453.7369570377905), (-22.3), 3);
      bracketingNthOrderBrentSolver0.getEvaluations();
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(9, univariateFunction0, 1.0, 1521.6191773563758);
  }
}