/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 11:41:09 UTC 2020
 */

package org.apache.commons.math.estimation;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.estimation.EstimatedParameter;
import org.apache.commons.math.estimation.EstimationProblem;
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
      SimpleEstimationProblem simpleEstimationProblem0 = new SimpleEstimationProblem();
      SimpleEstimationProblem simpleEstimationProblem1 = new SimpleEstimationProblem();
      EstimationProblem estimationProblem0 = null;
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      levenbergMarquardtEstimator0.estimate(simpleEstimationProblem1);
      WeightedMeasurement weightedMeasurement0 = mock(WeightedMeasurement.class, new ViolatedAssumptionAnswer());
      simpleEstimationProblem1.addMeasurement(weightedMeasurement0);
      EstimatedParameter estimatedParameter0 = new EstimatedParameter("", (-162.8124), false);
      simpleEstimationProblem1.addParameter(estimatedParameter0);
      levenbergMarquardtEstimator0.updateJacobian();
      // Undeclared exception!
      levenbergMarquardtEstimator0.getCovariances(simpleEstimationProblem1);
  }
}