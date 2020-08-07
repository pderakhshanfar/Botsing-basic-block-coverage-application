/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 23:13:37 UTC 2020
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
public class AbstractContinuousDistribution_ESTest extends AbstractContinuousDistribution_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = 113.190437343;
      Double double1 = new Double(113.190437343);
      double double2 = 0.57877506784668;
      double double3 = 413.73;
      double double4 = 849.0102396149233;
      Double double5 = new Double((-0.492));
      Double double6 = new Double(113.190437343);
      double double7 = 1.0E-6;
      double double8 = 779.2974809451138;
      Double double9 = new Double(849.0102396149233);
      double double10 = 455.656877616201;
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(0.57877506784668, 0.57877506784668);
      // Undeclared exception!
      fDistributionImpl0.inverseCumulativeProbability(1.0E-6);
  }
}