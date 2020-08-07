/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 03:37:25 UTC 2020
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
      normalDistributionImpl0.inverseCumulativeProbability(0.5);
      normalDistributionImpl0.setMean((-1.7976931348623157E308));
      Double double0 = new Double(0.0);
      // Undeclared exception!
      normalDistributionImpl0.inverseCumulativeProbability(4.652362892704858E-5);
  }
}