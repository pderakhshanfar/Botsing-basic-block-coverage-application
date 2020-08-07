/*
 * This file was automatically generated by EvoSuite
 * Thu May 14 21:40:05 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.SincFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.MullerSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SincFunction sincFunction0 = new SincFunction();
      SincFunction sincFunction1 = new SincFunction();
      sincFunction0.derivative();
      sincFunction0.derivative();
      double double0 = (-3079.1206100225554);
      MullerSolver mullerSolver0 = new MullerSolver();
      double double1 = 201.454519471;
      mullerSolver0.isSequence(201.454519471, 290.5666244531, (-2494.18697));
      // Undeclared exception!
      mullerSolver0.solve(0, (UnivariateRealFunction) sincFunction0, (-2771.3516011131537), 0.0);
  }
}