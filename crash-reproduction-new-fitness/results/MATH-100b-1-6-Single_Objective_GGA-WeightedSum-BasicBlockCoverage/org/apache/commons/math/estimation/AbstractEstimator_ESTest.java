/*
 * This file was automatically generated by EvoSuite
 * Thu May 14 11:39:16 UTC 2020
 */

package org.apache.commons.math.estimation;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.estimation.LevenbergMarquardtEstimator;
import org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest;
import org.apache.commons.math.estimation.SimpleEstimationProblem;
import org.apache.commons.math.estimation.WeightedMeasurement;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractEstimator_ESTest extends AbstractEstimator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SimpleEstimationProblem simpleEstimationProblem0 = new SimpleEstimationProblem();
      WeightedMeasurement weightedMeasurement0 = mock(WeightedMeasurement.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(weightedMeasurement0).getResidual();
      doReturn(0.0, 0.0, 0.0, 0.0).when(weightedMeasurement0).getWeight();
      simpleEstimationProblem0.addMeasurement(weightedMeasurement0);
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest0 = new LevenbergMarquardtEstimatorTest("Rj)`wKN@&R5't{rq%");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem0 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      WeightedMeasurement weightedMeasurement1 = mock(WeightedMeasurement.class, new ViolatedAssumptionAnswer());
      levenbergMarquardtEstimatorTest_QuadraticProblem0.addMeasurement(weightedMeasurement1);
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      levenbergMarquardtEstimatorTest_QuadraticProblem0.addMeasurement((WeightedMeasurement) null);
      levenbergMarquardtEstimator0.estimate(simpleEstimationProblem0);
      // Undeclared exception!
      levenbergMarquardtEstimator0.getCovariances(levenbergMarquardtEstimatorTest_QuadraticProblem0);
  }
}