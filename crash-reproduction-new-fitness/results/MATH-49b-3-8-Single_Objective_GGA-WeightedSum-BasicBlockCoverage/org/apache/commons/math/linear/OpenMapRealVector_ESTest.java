/*
 * This file was automatically generated by EvoSuite
 * Thu May 14 21:34:29 UTC 2020
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
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-1356.3883677920123);
      doubleArray0[1] = (-1356.3883677920123);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 1.0);
      RealVector realVector0 = openMapRealVector0.add((RealVector) openMapRealVector0);
      realVector0.mapSubtractToSelf((-1356.3883677920123));
      openMapRealVector0.mapSubtractToSelf((-1356.3883677920123));
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.copy();
      openMapRealVector1.mapDivide(0.0);
      openMapRealVector1.setSubVector(0, realVector0);
      OpenMapRealVector openMapRealVector2 = new OpenMapRealVector(doubleArray0, 1.0);
      OpenMapRealVector openMapRealVector3 = openMapRealVector2.ebeMultiply(realVector0);
      openMapRealVector0.getLInfDistance((RealVector) openMapRealVector3);
      OpenMapRealVector openMapRealVector4 = new OpenMapRealVector(doubleArray0, 1583.97);
      openMapRealVector1.getSparsity();
      // Undeclared exception!
      openMapRealVector2.ebeMultiply((RealVector) openMapRealVector0);
  }
}