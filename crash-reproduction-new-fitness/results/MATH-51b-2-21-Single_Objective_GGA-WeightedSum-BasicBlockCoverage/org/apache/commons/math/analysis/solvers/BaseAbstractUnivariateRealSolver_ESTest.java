/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 02:06:00 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.XMinus5Function;
import org.apache.commons.math.analysis.solvers.MullerSolver;
import org.apache.commons.math.exception.TooManyEvaluationsException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = 357.633491614326;
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      int int0 = 539;
      MullerSolver mullerSolver0 = new MullerSolver(539);
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      xMinus5Function0.derivative();
      double double1 = Double.POSITIVE_INFINITY;
      try { 
        mullerSolver0.computeObjectiveValue(421.047251848524);
        fail("Expecting exception: TooManyEvaluationsException");
      
      } catch(TooManyEvaluationsException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }
}