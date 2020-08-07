/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 23:09:36 UTC 2020
 */

package org.apache.commons.math.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.distribution.ChiSquaredDistributionImpl;
import org.apache.commons.math.distribution.FDistributionImpl;
import org.apache.commons.math.distribution.GammaDistributionImpl;
import org.apache.commons.math.distribution.TDistributionImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractContinuousDistribution_ESTest extends AbstractContinuousDistribution_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TDistributionImpl tDistributionImpl0 = new TDistributionImpl(0.47114013233374574);
      tDistributionImpl0.cumulativeProbability((-0.6861884158), 1078.6961062335322);
      tDistributionImpl0.inverseCumulativeProbability(0.47114013233374574);
      tDistributionImpl0.setDegreesOfFreedom(2218.7629923294467);
      tDistributionImpl0.cumulativeProbability((-3910.656462736147), (-925.248346168));
      GammaDistributionImpl gammaDistributionImpl0 = new GammaDistributionImpl(1078.6961062335322, 1078.6961062335322);
      ChiSquaredDistributionImpl chiSquaredDistributionImpl0 = new ChiSquaredDistributionImpl(0.47114013233374574, gammaDistributionImpl0);
      double double0 = 308.6476466;
      chiSquaredDistributionImpl0.getDomainLowerBound(308.6476466);
      TDistributionImpl tDistributionImpl1 = new TDistributionImpl(0.47114013233374574);
      chiSquaredDistributionImpl0.inverseCumulativeProbability(5.33E-321);
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.7976931348623157E308, 6561.3719411);
      fDistributionImpl0.setDenominatorDegreesOfFreedom(5.33E-321);
      // Undeclared exception!
      fDistributionImpl0.inverseCumulativeProbability(3.6899182659531625E-6);
  }
}