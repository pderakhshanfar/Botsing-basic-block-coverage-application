/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 22:19:19 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.XMinus5Function;
import org.apache.commons.math.analysis.solvers.IllinoisSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0, 0.0);
      int int0 = 2147483627;
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      double double0 = 2821.575;
      IllinoisSolver illinoisSolver1 = new IllinoisSolver(739.108);
      XMinus5Function xMinus5Function1 = new XMinus5Function();
      illinoisSolver1.solve(Integer.MAX_VALUE, (UnivariateRealFunction) xMinus5Function0, (-91.604937660947), (double) Integer.MAX_VALUE, (-1042.5892704676828));
      IllinoisSolver illinoisSolver2 = new IllinoisSolver((-2285.431982040836), (-1042.5892704676828), 1.0E-14);
      // Undeclared exception!
      illinoisSolver2.solve(2, (UnivariateRealFunction) xMinus5Function0, 2.404307984052299E-9, 2291.081789, 2821.575);
  }
}