/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 02:08:21 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.IllinoisSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = 0.0;
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0);
      int int0 = 1675;
      Expm1Function expm1Function0 = new Expm1Function();
      illinoisSolver0.solve(1675, (UnivariateRealFunction) expm1Function0, 0.0, 0.0, 0.0);
      expm1Function0.derivative();
      double double1 = (-1411.1);
      illinoisSolver0.setup(1023, expm1Function0, (-1411.1), 2566.1623151, 1675);
      illinoisSolver0.isBracketing((-2129.944908674137), 1023);
      // Undeclared exception!
      illinoisSolver0.doSolve();
  }
}