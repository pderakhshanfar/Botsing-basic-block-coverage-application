/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 03:38:06 UTC 2020
 */

package org.apache.commons.math.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.distribution.CauchyDistributionImpl;
import org.apache.commons.math.distribution.FDistributionImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractContinuousDistribution_ESTest extends AbstractContinuousDistribution_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Double double0 = new Double(21.87999165123112);
      Double double1 = new Double(21.87999165123112);
      CauchyDistributionImpl cauchyDistributionImpl0 = new CauchyDistributionImpl(0.0, 1544.8617820756554);
      cauchyDistributionImpl0.getDomainLowerBound(3.730931494002192);
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(827.35, 3.399464998481189E-5);
      fDistributionImpl0.getDomainUpperBound(172.11993305083539);
      // Undeclared exception!
      fDistributionImpl0.inverseCumulativeProbability(0.730931494002192);
  }
}