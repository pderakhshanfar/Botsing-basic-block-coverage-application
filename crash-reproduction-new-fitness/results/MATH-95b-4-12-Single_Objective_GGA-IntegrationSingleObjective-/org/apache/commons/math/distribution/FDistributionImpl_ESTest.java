/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 23:11:51 UTC 2020
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
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(857.6782262393, 857.6782262393);
      double double0 = 1.0E-14;
      fDistributionImpl0.setDenominatorDegreesOfFreedom(1.0E-14);
      // Undeclared exception!
      fDistributionImpl0.inverseCumulativeProbability(1.0E-14);
  }
}