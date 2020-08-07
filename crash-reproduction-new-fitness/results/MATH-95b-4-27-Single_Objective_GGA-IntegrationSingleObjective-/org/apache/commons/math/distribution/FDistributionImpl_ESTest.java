/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 03:36:31 UTC 2020
 */

package org.apache.commons.math.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.distribution.FDistributionImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class FDistributionImpl_ESTest extends FDistributionImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(0.9999999999999971, 0.9999999999999971);
      fDistributionImpl0.getDomainUpperBound(0.9999999999999971);
      fDistributionImpl0.getDenominatorDegreesOfFreedom();
      fDistributionImpl0.getNumeratorDegreesOfFreedom();
      double double0 = 540.53675816624;
      fDistributionImpl0.setNumeratorDegreesOfFreedom(540.53675816624);
      double double1 = 491.71469071;
      FDistributionImpl fDistributionImpl1 = new FDistributionImpl(491.71469071, 491.71469071);
      double double2 = 6.283185307179586;
      fDistributionImpl0.cumulativeProbability(6.283185307179586, 1.7976931348623157E308);
      // Undeclared exception!
      fDistributionImpl0.inverseCumulativeProbability(0.9999999999999971);
  }
}