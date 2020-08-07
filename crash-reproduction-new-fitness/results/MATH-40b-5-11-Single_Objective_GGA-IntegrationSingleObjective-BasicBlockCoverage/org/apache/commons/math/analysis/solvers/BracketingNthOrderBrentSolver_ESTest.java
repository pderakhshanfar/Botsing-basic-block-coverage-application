/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 22:13:09 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.SincFunction;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BracketingNthOrderBrentSolver_ESTest extends BracketingNthOrderBrentSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(univariateFunction0).value(anyDouble());
      SincFunction sincFunction0 = new SincFunction();
      sincFunction0.derivative();
      bracketingNthOrderBrentSolver0.getStartValue();
      bracketingNthOrderBrentSolver0.isSequence(0.0, 0.0, (-15.2587));
      SinFunction sinFunction0 = new SinFunction();
      sinFunction0.value(4.669303258005617E15);
      sinFunction0.value(1696);
      bracketingNthOrderBrentSolver0.setup(1696, sinFunction0, 0.5, 0.5, 0.0);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      bracketingNthOrderBrentSolver0.solve(1696, univariateFunction0, 0.5, 2550.428970681758, allowedSolution0);
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      bracketingNthOrderBrentSolver0.doSolve();
      AllowedSolution allowedSolution1 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) sinFunction0, 0.0625, 2585.6677, 0.5827828645706177, allowedSolution1);
  }
}