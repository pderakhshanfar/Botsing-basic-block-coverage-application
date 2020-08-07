/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 02:05:16 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.XMinus5Function;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.IllinoisSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      int int0 = 0;
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(3275);
      int int1 = 2142710419;
      IllinoisSolver illinoisSolver1 = new IllinoisSolver();
      int int2 = 2;
      double double0 = (-4620.293427183);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      illinoisSolver1.solve(2, (UnivariateRealFunction) xMinus5Function0, (-4620.293427183), (double) 2142710419, allowedSolution0);
  }
}