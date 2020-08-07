/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 22:22:47 UTC 2020
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.linear.OpenMapRealVector;
import org.apache.commons.math.linear.RealVector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class OpenMapRealVector_ESTest extends OpenMapRealVector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (-3291.71293549);
      doubleArray0[1] = 2356.3;
      doubleArray0[3] = 696.2955651033;
      doubleArray0[4] = 1557.151770669721;
      doubleArray0[5] = 1280.77793932575;
      doubleArray0[6] = 0.0;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      openMapRealVector0.isNaN();
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.mapAdd(2356.3);
      OpenMapRealVector openMapRealVector2 = openMapRealVector0.ebeMultiply((RealVector) openMapRealVector1);
      openMapRealVector1.getData();
      // Undeclared exception!
      openMapRealVector1.ebeMultiply((RealVector) openMapRealVector2);
  }
}