/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 01:59:44 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.MonitoredFunction;
import org.apache.commons.math.analysis.SincFunction;
import org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver;
import org.apache.commons.math.analysis.solvers.SecantSolver;
import org.apache.commons.math.exception.TooManyEvaluationsException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SincFunction sincFunction0 = new SincFunction();
      sincFunction0.derivative();
      sincFunction0.derivative();
      sincFunction0.derivative();
      sincFunction0.derivative();
      sincFunction0.derivative();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(sincFunction0);
      double double0 = (-687.7864869185);
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      double double1 = 1186.3;
      SecantSolver secantSolver0 = new SecantSolver(1186.3, (-687.7864869185));
      double double2 = (-4.068233003401932E-9);
      try { 
        secantSolver0.computeObjectiveValue((-687.7864869185));
        fail("Expecting exception: TooManyEvaluationsException");
      
      } catch(TooManyEvaluationsException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }
}