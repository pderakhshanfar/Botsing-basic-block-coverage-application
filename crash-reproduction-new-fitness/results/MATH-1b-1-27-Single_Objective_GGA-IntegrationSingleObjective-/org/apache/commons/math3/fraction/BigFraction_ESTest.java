/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 02:15:07 UTC 2020
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
      BigFraction bigFraction0 = BigFraction.ONE_HALF;
      BigFraction bigFraction1 = BigFraction.ONE_THIRD;
      BigFraction bigFraction2 = bigFraction0.add(bigFraction1);
      BigFraction bigFraction3 = bigFraction2.reciprocal();
      bigFraction1.negate();
      BigFraction bigFraction4 = bigFraction0.abs();
      BigFraction bigFraction5 = bigFraction0.add(0L);
      BigFraction bigFraction6 = bigFraction3.divide(bigFraction4);
      bigFraction1.pow(0L);
      bigFraction3.getNumeratorAsLong();
      BigFraction bigFraction7 = bigFraction6.add((-837));
      BigFraction bigFraction8 = new BigFraction(774);
      bigFraction4.pow((-837));
      bigFraction5.getDenominatorAsInt();
      bigFraction8.shortValue();
      bigFraction5.reduce();
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)1;
      byteArray0[1] = (byte) (-12);
      byteArray0[2] = (byte)7;
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      bigFraction7.divide(bigInteger0);
      double double0 = (-2.792046157580119E-8);
      BigFraction bigFraction9 = new BigFraction((-2.792046157580119E-8), 4);
      BigFraction bigFraction10 = new BigFraction((double) (-837), (-837));
  }
}