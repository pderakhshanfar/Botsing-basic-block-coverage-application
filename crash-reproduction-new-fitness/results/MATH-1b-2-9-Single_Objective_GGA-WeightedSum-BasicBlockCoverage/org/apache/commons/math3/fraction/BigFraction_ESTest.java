/*
 * This file was automatically generated by EvoSuite
 * Thu May 14 21:10:28 UTC 2020
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
      BigInteger bigInteger0 = BigInteger.ONE;
      BigFraction bigFraction0 = new BigFraction(bigInteger0, bigInteger0);
      BigFraction bigFraction1 = new BigFraction(1253.790788007464, 0);
      BigInteger bigInteger1 = BigInteger.TEN;
      BigFraction bigFraction2 = new BigFraction(bigInteger0, bigInteger1);
      bigFraction1.getDenominatorAsInt();
      int int0 = 906;
      BigFraction bigFraction3 = new BigFraction(0, 906);
      BigFraction bigFraction4 = new BigFraction((double) 906, 1);
  }
}