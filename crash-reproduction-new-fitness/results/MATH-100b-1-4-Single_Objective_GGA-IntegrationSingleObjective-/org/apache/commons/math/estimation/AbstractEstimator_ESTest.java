/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 11:43:32 UTC 2020
 */

package org.apache.commons.math.estimation;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import junit.framework.TestCase;
import org.apache.commons.math.estimation.EstimatedParameter;
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
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      Object object0 = new Object();
      Object object1 = new Object();
      Object object2 = new Object();
      TestCase.assertNotSame("P<M4mx<F1O02*+%O{Z", (Object) "?(K;4IX-|\"&JE`", object2);
      levenbergMarquardtEstimator0.setMaxCostEval(1830);
      levenbergMarquardtEstimator0.setCostRelativeTolerance((-1772.04016));
      EstimatedParameter estimatedParameter0 = new EstimatedParameter((String) null, 1830);
      levenbergMarquardtEstimator0.setParRelativeTolerance(1830);
      levenbergMarquardtEstimator0.incrementJacobianEvaluationsCounter();
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest0 = new LevenbergMarquardtEstimatorTest("gnS\"BnHv*");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem0 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      levenbergMarquardtEstimator0.initializeEstimate(levenbergMarquardtEstimatorTest_QuadraticProblem0);
      levenbergMarquardtEstimator0.setCostRelativeTolerance((-1302.089));
      SimpleEstimationProblem simpleEstimationProblem0 = new SimpleEstimationProblem();
      simpleEstimationProblem0.addParameter(estimatedParameter0);
      WeightedMeasurement weightedMeasurement0 = mock(WeightedMeasurement.class, new ViolatedAssumptionAnswer());
      simpleEstimationProblem0.addMeasurement(weightedMeasurement0);
      // Undeclared exception!
      levenbergMarquardtEstimator0.getCovariances(simpleEstimationProblem0);
  }
}