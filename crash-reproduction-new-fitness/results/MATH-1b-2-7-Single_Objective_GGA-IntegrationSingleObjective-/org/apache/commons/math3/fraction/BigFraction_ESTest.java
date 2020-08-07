/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 21:50:27 UTC 2020
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
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-48);
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      BigFraction bigFraction0 = new BigFraction(bigInteger0, bigInteger0);
      BigFraction bigFraction1 = new BigFraction(bigInteger0);
      BigFraction bigFraction2 = new BigFraction((-1076.0242), (-1));
      bigFraction1.multiply((long) (-1));
      BigFraction bigFraction3 = new BigFraction((double) (-1), (int) (byte) (-48));
  }
}