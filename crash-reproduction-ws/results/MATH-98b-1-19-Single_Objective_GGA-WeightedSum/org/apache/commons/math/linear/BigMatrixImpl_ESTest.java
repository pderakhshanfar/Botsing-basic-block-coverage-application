/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 30 15:00:39 UTC 2020
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
      double[][] doubleArray0 = new double[6][4];
      BigMatrixImpl bigMatrixImpl0 = new BigMatrixImpl(doubleArray0);
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      BigDecimal[] bigDecimalArray0 = new BigDecimal[4];
      bigDecimalArray0[0] = bigDecimal0;
      bigDecimalArray0[1] = bigDecimal0;
      bigDecimalArray0[2] = bigDecimal0;
      bigDecimalArray0[3] = bigDecimal0;
      // Undeclared exception!
      bigMatrixImpl0.operate(bigDecimalArray0);
  }
}