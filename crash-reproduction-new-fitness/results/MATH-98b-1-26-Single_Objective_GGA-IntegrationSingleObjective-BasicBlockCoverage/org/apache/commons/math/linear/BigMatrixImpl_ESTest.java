/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 16:15:42 UTC 2020
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
      BigMatrix bigMatrix0 = bigMatrixImpl0.transpose();
      bigMatrixImpl0.setRoundingMode(0);
      BigDecimal[] bigDecimalArray1 = bigMatrixImpl0.operate(bigDecimalArray0);
      BigDecimal[][] bigDecimalArray2 = new BigDecimal[6][0];
      bigDecimalArray2[0] = bigDecimalArray0;
      bigDecimalArray2[1] = bigDecimalArray0;
      bigDecimalArray2[2] = bigDecimalArray1;
      bigDecimalArray2[3] = bigDecimalArray0;
      bigDecimalArray2[4] = bigDecimalArray0;
      bigDecimalArray2[5] = bigDecimalArray0;
      bigMatrixImpl0.data = bigDecimalArray2;
      bigMatrix0.getColumnAsDoubleArray(0);
      bigMatrixImpl0.getScale();
      BigDecimal[][] bigDecimalArray3 = new BigDecimal[14][3];
      bigMatrixImpl0.toString();
      bigDecimalArray3[0] = bigDecimalArray1;
      BigDecimal[] bigDecimalArray4 = new BigDecimal[2];
      bigDecimalArray4[0] = bigDecimal0;
      // Undeclared exception!
      bigMatrixImpl0.operate(bigDecimalArray0);
  }
}