/*
 * This file was automatically generated by EvoSuite
 * Thu May 14 21:39:49 UTC 2020
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
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1318.5225887066263);
      int int0 = 1673;
      Expm1Function expm1Function0 = new Expm1Function();
      double double0 = 2.2250738585072014E-308;
      // Undeclared exception!
      regulaFalsiSolver0.solve(1673, (UnivariateRealFunction) expm1Function0, (-2737.105399944287), (double) 1673);
  }
}