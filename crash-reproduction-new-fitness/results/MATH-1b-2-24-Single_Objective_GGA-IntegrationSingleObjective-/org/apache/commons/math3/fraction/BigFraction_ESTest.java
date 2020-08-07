/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 02:15:14 UTC 2020
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
      BigFraction bigFraction0 = BigFraction.TWO;
      bigFraction0.pow(2100.0);
      BigInteger bigInteger0 = bigFraction0.getDenominator();
      BigFraction bigFraction1 = BigFraction.getReducedFraction((-1008), (-1008));
      int int0 = 1;
      BigFraction bigFraction2 = new BigFraction(1, 1);
      bigFraction0.bigDecimalValue();
      bigFraction1.floatValue();
      BigFraction bigFraction3 = new BigFraction(1344.203159129896);
      bigFraction3.pow(1);
      BigFraction bigFraction4 = bigFraction0.reduce();
      BigFraction bigFraction5 = new BigFraction(0L);
      bigFraction5.add(bigFraction4);
      bigFraction4.doubleValue();
      bigFraction2.add(bigInteger0);
      int int1 = 0;
      BigFraction bigFraction6 = new BigFraction(2.0, 0);
  }
}