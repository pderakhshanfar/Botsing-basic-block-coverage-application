/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 02:47:48 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.MonitoredFunction;
import org.apache.commons.math.analysis.SincFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.BaseSecantSolver;
import org.apache.commons.math.analysis.solvers.RegulaFalsiSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, 0.0);
      int int0 = 1765;
      Expm1Function expm1Function0 = new Expm1Function();
      SincFunction sincFunction0 = new SincFunction();
      sincFunction0.derivative();
      RegulaFalsiSolver regulaFalsiSolver1 = new RegulaFalsiSolver(0.006073362379343039);
      BaseSecantSolver.Method.values();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(sincFunction0);
      // Undeclared exception!
      regulaFalsiSolver1.solve(5, (UnivariateRealFunction) monitoredFunction0, 0.006073362379343039, (double) 5, (double) 5);
  }
}