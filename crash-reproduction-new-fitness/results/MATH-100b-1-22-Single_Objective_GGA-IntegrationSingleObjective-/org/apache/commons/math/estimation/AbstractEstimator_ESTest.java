/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 16:04:37 UTC 2020
 */

package org.apache.commons.math.estimation;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.estimation.EstimatedParameter;
import org.apache.commons.math.estimation.LevenbergMarquardtEstimator;
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
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      levenbergMarquardtEstimator0.setOrthoTolerance(0.4196377449711262);
      SimpleEstimationProblem simpleEstimationProblem0 = new SimpleEstimationProblem();
      EstimatedParameter estimatedParameter0 = new EstimatedParameter("$t4xX", 0.0, true);
      simpleEstimationProblem0.addParameter(estimatedParameter0);
      WeightedMeasurement weightedMeasurement0 = mock(WeightedMeasurement.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(weightedMeasurement0).getResidual();
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(weightedMeasurement0).getWeight();
      levenbergMarquardtEstimator0.estimate(simpleEstimationProblem0);
      simpleEstimationProblem0.addMeasurement(weightedMeasurement0);
      int int0 = 1000;
      levenbergMarquardtEstimator0.estimate(simpleEstimationProblem0);
      WeightedMeasurement weightedMeasurement1 = mock(WeightedMeasurement.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(weightedMeasurement1).getResidual();
      doReturn(0.0).when(weightedMeasurement1).getWeight();
      simpleEstimationProblem0.addMeasurement(weightedMeasurement1);
      WeightedMeasurement weightedMeasurement2 = mock(WeightedMeasurement.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(weightedMeasurement2).getResidual();
      doReturn(0.0).when(weightedMeasurement2).getWeight();
      simpleEstimationProblem0.addMeasurement(weightedMeasurement2);
      // Undeclared exception!
      levenbergMarquardtEstimator0.guessParametersErrors(simpleEstimationProblem0);
  }
}