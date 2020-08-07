/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 16:15:18 UTC 2020
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigDecimal;
import org.apache.commons.math.linear.BigMatrix;
import org.apache.commons.math.linear.BigMatrixImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BigMatrixImpl_ESTest extends BigMatrixImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BigDecimal[] bigDecimalArray0 = new BigDecimal[1];
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      bigDecimalArray0[0] = bigDecimal0;
      BigMatrixImpl bigMatrixImpl0 = new BigMatrixImpl(bigDecimalArray0);
      BigMatrixImpl bigMatrixImpl1 = bigMatrixImpl0.add(bigMatrixImpl0);
      BigDecimal bigDecimal1 = BigMatrixImpl.ONE;
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 0.0;
      BigDecimal[] bigDecimalArray1 = bigMatrixImpl1.operate(doubleArray0);
      bigMatrixImpl0.getColumnDimension();
      bigMatrixImpl1.subtract((BigMatrix) bigMatrixImpl0);
      BigDecimal[] bigDecimalArray2 = bigMatrixImpl0.solve(doubleArray0);
      BigMatrixImpl bigMatrixImpl2 = new BigMatrixImpl(bigDecimalArray2);
      BigDecimal[][] bigDecimalArray3 = new BigDecimal[9][8];
      BigDecimal[] bigDecimalArray4 = new BigDecimal[1];
      bigDecimalArray4[0] = bigDecimal1;
      bigDecimalArray3[0] = bigDecimalArray4;
      bigDecimalArray3[1] = bigDecimalArray1;
      bigDecimalArray3[2] = bigDecimalArray0;
      bigDecimalArray3[3] = bigDecimalArray2;
      bigDecimalArray3[4] = bigDecimalArray0;
      bigDecimalArray3[5] = bigDecimalArray2;
      bigDecimalArray3[6] = bigDecimalArray2;
      bigDecimalArray3[7] = bigDecimalArray0;
      bigDecimalArray3[8] = bigDecimalArray0;
      BigMatrixImpl bigMatrixImpl3 = new BigMatrixImpl(bigDecimalArray3, true);
      BigMatrixImpl bigMatrixImpl4 = bigMatrixImpl3.multiply(bigMatrixImpl1);
      BigDecimal bigDecimal2 = BigDecimal.TEN;
      // Undeclared exception!
      bigMatrixImpl4.operate(bigDecimalArray1);
  }
}