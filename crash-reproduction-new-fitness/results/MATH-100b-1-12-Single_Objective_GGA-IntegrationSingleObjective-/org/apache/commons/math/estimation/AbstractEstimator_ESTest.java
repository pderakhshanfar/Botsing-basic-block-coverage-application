/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 11:43:42 UTC 2020
 */

package org.apache.commons.math.estimation;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.estimation.LevenbergMarquardtEstimator;
import org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractEstimator_ESTest extends AbstractEstimator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest0 = new LevenbergMarquardtEstimatorTest("");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem0 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      levenbergMarquardtEstimator0.estimate(levenbergMarquardtEstimatorTest_QuadraticProblem0);
      levenbergMarquardtEstimator0.setParRelativeTolerance((-1680.0));
      levenbergMarquardtEstimator0.getJacobianEvaluations();
      levenbergMarquardtEstimatorTest_QuadraticProblem0.addPoint(1, Double.NEGATIVE_INFINITY, 1);
      levenbergMarquardtEstimator0.updateResidualsAndCost();
      // Undeclared exception!
      levenbergMarquardtEstimator0.getCovariances(levenbergMarquardtEstimatorTest_QuadraticProblem0);
  }
}