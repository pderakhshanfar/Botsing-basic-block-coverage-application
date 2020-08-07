/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 02:50:20 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.XMinus5Function;
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
      int int0 = 0;
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      UnivariateRealFunction univariateRealFunction1 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      int int1 = 0;
      SinFunction sinFunction0 = new SinFunction();
      SinFunction sinFunction1 = new SinFunction();
      double double0 = (-600.8556435228);
      illinoisSolver0.setup(0, univariateRealFunction0, 0.5, (-600.8556435228), 0);
      double double1 = (-1409.695);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      illinoisSolver0.solve(5, (UnivariateRealFunction) sinFunction0, (-1409.695), 0.0952233225107193, (-1.4620645383216768), allowedSolution0);
  }
}