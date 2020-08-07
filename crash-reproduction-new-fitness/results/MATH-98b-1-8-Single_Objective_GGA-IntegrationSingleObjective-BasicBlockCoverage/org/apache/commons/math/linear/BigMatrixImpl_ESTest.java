/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 11:50:05 UTC 2020
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigDecimal;
import org.apache.commons.math.linear.BigMatrixImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BigMatrixImpl_ESTest extends BigMatrixImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BigDecimal[][] bigDecimalArray0 = new BigDecimal[5][8];
      BigDecimal[] bigDecimalArray1 = new BigDecimal[1];
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      bigDecimalArray1[0] = bigDecimal0;
      BigMatrixImpl bigMatrixImpl0 = new BigMatrixImpl(bigDecimalArray1);
      BigDecimal[] bigDecimalArray2 = bigMatrixImpl0.operate(bigDecimalArray1);
      BigDecimal bigDecimal1 = BigDecimal.ONE;
      BigDecimal[] bigDecimalArray3 = new BigDecimal[6];
      bigDecimalArray3[0] = bigDecimal0;
      bigDecimalArray3[1] = bigDecimal0;
      bigDecimalArray3[2] = bigDecimal0;
      bigDecimalArray3[3] = bigDecimal0;
      bigDecimalArray3[4] = bigDecimal0;
      BigDecimal bigDecimal2 = BigMatrixImpl.ZERO;
      bigDecimal2.floatValue();
      bigDecimalArray3[5] = bigDecimal2;
      BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl(bigDecimalArray3);
      BigDecimal[] bigDecimalArray4 = bigMatrixImpl0.operate(bigDecimalArray2);
      bigMatrixImpl1.getScale();
      bigDecimal0.add(bigDecimal2);
      bigMatrixImpl1.getDataAsDoubleArray();
      BigMatrixImpl bigMatrixImpl2 = new BigMatrixImpl(bigDecimalArray0);
      // Undeclared exception!
      bigMatrixImpl1.operate(bigDecimalArray4);
  }
}