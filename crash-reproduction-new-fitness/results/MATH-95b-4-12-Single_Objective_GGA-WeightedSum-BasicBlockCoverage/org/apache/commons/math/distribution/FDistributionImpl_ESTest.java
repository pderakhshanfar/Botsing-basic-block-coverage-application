/*
 * This file was automatically generated by EvoSuite
 * Thu May 14 22:26:43 UTC 2020
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
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(137.102615, 596.2531187);
      fDistributionImpl0.cumulativeProbability((-1074.892261923288), 1.0);
      fDistributionImpl0.setDenominatorDegreesOfFreedom(1.0);
      fDistributionImpl0.getDenominatorDegreesOfFreedom();
      fDistributionImpl0.getDomainUpperBound(1.0);
      fDistributionImpl0.getDomainUpperBound(1.0);
      fDistributionImpl0.cumulativeProbability(1.0, 1395.26703194);
      fDistributionImpl0.inverseCumulativeProbability(1.0);
      // Undeclared exception!
      fDistributionImpl0.inverseCumulativeProbability(0.659608806622687);
  }
}