/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 23:03:29 UTC 2020
 */

package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.SimpleScalarValueChecker;
import org.apache.commons.math.optimization.direct.NelderMead;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DirectSearchOptimizer_ESTest extends DirectSearchOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NelderMead nelderMead0 = new NelderMead();
      double[][] doubleArray0 = new double[4][9];
      double[] doubleArray1 = new double[21];
      doubleArray0[1] = doubleArray1;
      doubleArray0[1] = doubleArray0[0];
      double[] doubleArray2 = new double[6];
      doubleArray2[0] = (-1284.5072080609);
      doubleArray0[3] = doubleArray0[0];
      nelderMead0.setMaxIterations(2);
      nelderMead0.getMaxIterations();
      nelderMead0.incrementIterationsCounter();
      nelderMead0.getMaxIterations();
      nelderMead0.getEvaluations();
      nelderMead0.getMaxIterations();
      SimpleScalarValueChecker simpleScalarValueChecker0 = new SimpleScalarValueChecker();
      nelderMead0.setConvergenceChecker(simpleScalarValueChecker0);
      nelderMead0.getMaxEvaluations();
      nelderMead0.getMaxIterations();
      nelderMead0.getEvaluations();
      nelderMead0.getEvaluations();
      NelderMead nelderMead1 = new NelderMead();
      nelderMead1.incrementIterationsCounter();
      nelderMead1.incrementIterationsCounter();
      nelderMead0.incrementIterationsCounter();
      nelderMead1.getConvergenceChecker();
      try { 
        nelderMead0.incrementIterationsCounter();
        fail("Expecting exception: OptimizationException");
      
      } catch(OptimizationException e) {
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (2) exceeded
         //
         verifyException("org.apache.commons.math.optimization.direct.DirectSearchOptimizer", e);
      }
  }
}