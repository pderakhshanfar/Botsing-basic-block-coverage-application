/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 03:37:49 UTC 2020
 */

package org.apache.commons.math.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.distribution.NormalDistributionImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractContinuousDistribution_ESTest extends AbstractContinuousDistribution_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
      NormalDistributionImpl normalDistributionImpl1 = new NormalDistributionImpl();
      NormalDistributionImpl normalDistributionImpl2 = new NormalDistributionImpl();
      NormalDistributionImpl normalDistributionImpl3 = new NormalDistributionImpl();
      NormalDistributionImpl normalDistributionImpl4 = new NormalDistributionImpl();
      NormalDistributionImpl normalDistributionImpl5 = new NormalDistributionImpl();
      NormalDistributionImpl normalDistributionImpl6 = new NormalDistributionImpl();
      Double double0 = new Double(0.5);
      normalDistributionImpl1.setMean(1.7976931348623157E308);
      NormalDistributionImpl normalDistributionImpl7 = new NormalDistributionImpl();
      NormalDistributionImpl normalDistributionImpl8 = new NormalDistributionImpl();
      NormalDistributionImpl normalDistributionImpl9 = new NormalDistributionImpl();
      normalDistributionImpl1.setStandardDeviation(0.5);
      double double1 = 1135.37;
      normalDistributionImpl8.cumulativeProbability(0.25596269849245334);
      // Undeclared exception!
      normalDistributionImpl1.inverseCumulativeProbability((double) double0);
  }
}