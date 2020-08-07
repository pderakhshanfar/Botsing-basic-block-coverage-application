/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 21:47:41 UTC 2020
 */

package org.apache.commons.math3.fraction;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigInteger;
import org.apache.commons.math3.fraction.BigFraction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BigFraction_ESTest extends BigFraction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_THIRD;
      bigFraction0.intValue();
      bigFraction0.floatValue();
      bigFraction0.longValue();
      BigFraction bigFraction1 = new BigFraction((-1576L), (-968L));
      BigInteger bigInteger0 = BigInteger.ONE;
      BigFraction bigFraction2 = new BigFraction(bigInteger0);
      BigFraction bigFraction3 = new BigFraction((double) 0L, 0);
  }
}