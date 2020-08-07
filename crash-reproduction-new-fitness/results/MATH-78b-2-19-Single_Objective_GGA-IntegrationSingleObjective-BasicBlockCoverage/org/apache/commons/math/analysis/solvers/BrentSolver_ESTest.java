/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 03:17:22 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.BrentSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BrentSolver_ESTest extends BrentSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      double double0 = 0.06923652518248882;
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, 1.1352864089531067E-4, 0.06923652518248882);
  }
}