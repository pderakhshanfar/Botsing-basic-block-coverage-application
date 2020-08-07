/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 22:23:14 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.RegulaFalsiSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, 25, 25);
      // Undeclared exception!
      regulaFalsiSolver0.solve(2063, (UnivariateRealFunction) expm1Function0, (-926.6860123296), 1.7664281737893E14, (-2612.9071199997));
  }
}