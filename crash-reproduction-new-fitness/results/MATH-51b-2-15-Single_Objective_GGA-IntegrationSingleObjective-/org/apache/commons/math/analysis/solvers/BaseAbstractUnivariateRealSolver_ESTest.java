/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 22:27:14 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.SincFunction;
import org.apache.commons.math.analysis.solvers.SecantSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SincFunction sincFunction0 = new SincFunction();
      SinFunction sinFunction0 = new SinFunction();
      sinFunction0.value(2582.59);
      double double0 = 0.0;
      int int0 = 0;
      SecantSolver secantSolver0 = new SecantSolver(0.0);
      double double1 = (-0.4879067359646915);
      // Undeclared exception!
      secantSolver0.doSolve();
  }
}