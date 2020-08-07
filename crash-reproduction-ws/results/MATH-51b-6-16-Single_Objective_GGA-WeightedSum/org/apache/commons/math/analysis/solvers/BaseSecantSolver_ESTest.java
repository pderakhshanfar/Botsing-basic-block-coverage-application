/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 17 22:46:53 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.IllinoisSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0, (-1163.790859));
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      illinoisSolver0.solve(19, (UnivariateRealFunction) quinticFunction0, (-1163.790859), (double) 19, (-0.6648621885683941));
  }
}