/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 02:10:15 UTC 2020
 */

package org.apache.commons.math3.fraction;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.fraction.BigFraction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BigFraction_ESTest extends BigFraction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(0.4425300359725952);
      bigFraction0.percentageValue();
      BigFraction bigFraction1 = new BigFraction(2197.739100883057, 942);
      double double0 = (-490.4135653942);
      BigFraction bigFraction2 = new BigFraction(2197.739100883057, (-490.4135653942), 942);
  }
}