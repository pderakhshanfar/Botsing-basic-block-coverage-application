/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 03:35:20 UTC 2020
 */

package org.apache.commons.math.analysis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.UnivariateRealSolverUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class UnivariateRealSolverUtils_ESTest extends UnivariateRealSolverUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      UnivariateRealSolverUtils.solve(univariateRealFunction0, 0.0, 1420.7462667698117, 473.97);
      UnivariateRealFunction univariateRealFunction1 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(univariateRealFunction1).value(anyDouble());
      double double0 = 0.0;
      UnivariateRealSolverUtils.solve(univariateRealFunction1, 0.0, 473.97);
      UnivariateRealFunction univariateRealFunction2 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      double double1 = 0.0;
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction2, 0.0, 0.5, 1420.7462667698117, 1386);
  }
}