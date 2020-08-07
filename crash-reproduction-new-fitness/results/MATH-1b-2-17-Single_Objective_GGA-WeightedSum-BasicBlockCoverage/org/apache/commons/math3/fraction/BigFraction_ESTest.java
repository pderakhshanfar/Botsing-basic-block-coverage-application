/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 01:36:21 UTC 2020
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
      BigFraction bigFraction0 = new BigFraction(3646.9841099, 3646.9841099, 460);
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)5;
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      BigFraction bigFraction1 = new BigFraction(bigInteger0);
      BigFraction bigFraction2 = new BigFraction((-241L));
      bigFraction1.getDenominatorAsLong();
      bigFraction0.getField();
      bigFraction2.equals(bigFraction0);
      BigFraction bigFraction3 = BigFraction.getReducedFraction(460, (byte)5);
      bigFraction3.toString();
      bigFraction2.getNumeratorAsInt();
      BigFraction bigFraction4 = new BigFraction(2.047863006591797, (-1));
      BigFraction bigFraction5 = new BigFraction((double) 460, 597);
  }
}