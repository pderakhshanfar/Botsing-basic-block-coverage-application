/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 12:41:01 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.solvers.BisectionSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BisectionSolver_ESTest extends BisectionSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      bisectionSolver0.resetMaximalIterationCount();
      bisectionSolver0.getFunctionValueAccuracy();
      double double0 = 1.0E-14;
      bisectionSolver0.isSequence(1.0E-14, 2386.086843361, 0.0);
      double double1 = 0.0;
      double double2 = 2742.9513620582807;
      // Undeclared exception!
      bisectionSolver0.solve(0.0, 2742.9513620582807);
  }
}