/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 21:50:05 UTC 2020
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
      BigFraction bigFraction0 = BigFraction.TWO_FIFTHS;
      BigFraction bigFraction1 = bigFraction0.add(1356L);
      bigFraction1.pow(1356L);
      BigFraction bigFraction2 = BigFraction.FOUR_FIFTHS;
      BigFraction bigFraction3 = new BigFraction(965L, 965L);
      BigFraction bigFraction4 = new BigFraction((double) 1356L, (-1));
  }
}