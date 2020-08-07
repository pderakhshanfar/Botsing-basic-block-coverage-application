/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 02:05:22 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.IllinoisSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 3;
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-338.568));
      // Undeclared exception!
      illinoisSolver0.solve(3, (UnivariateRealFunction) sinFunction0, (-1.2641293280831055E-13), 239.036223389, (-1.2641293280831055E-13), allowedSolution0);
  }
}