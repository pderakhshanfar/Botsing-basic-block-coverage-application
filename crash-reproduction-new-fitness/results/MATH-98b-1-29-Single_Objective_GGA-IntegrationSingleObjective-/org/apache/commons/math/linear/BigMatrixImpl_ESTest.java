/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 16:14:43 UTC 2020
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.commons.math.linear.BigMatrixImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BigMatrixImpl_ESTest extends BigMatrixImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BigDecimal[] bigDecimalArray0 = new BigDecimal[1];
      BigInteger bigInteger0 = BigInteger.ZERO;
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      bigDecimalArray0[0] = bigDecimal0;
      BigDecimal bigDecimal1 = new BigDecimal(bigInteger0);
      BigDecimal[] bigDecimalArray1 = new BigDecimal[8];
      bigDecimalArray1[0] = bigDecimal1;
      bigDecimalArray1[1] = bigDecimal1;
      BigDecimal bigDecimal2 = new BigDecimal((-113));
      bigDecimalArray1[2] = bigDecimal2;
      bigDecimalArray1[3] = bigDecimal0;
      bigDecimalArray1[4] = bigDecimal1;
      BigDecimal bigDecimal3 = BigDecimal.ONE;
      bigDecimalArray1[5] = bigDecimal3;
      bigDecimalArray1[6] = bigDecimal0;
      bigDecimalArray1[7] = bigDecimal1;
      BigMatrixImpl bigMatrixImpl0 = new BigMatrixImpl(bigDecimalArray1);
      // Undeclared exception!
      bigMatrixImpl0.operate(bigDecimalArray0);
  }
}