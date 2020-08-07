/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 02:42:53 UTC 2020
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
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 1.0E-12;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      openMapRealVector0.getDistance(openMapRealVector0);
      openMapRealVector0.set(1.0E-12);
      RealVector realVector0 = openMapRealVector0.combine(0.75, 1.0E-12, doubleArray0);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(openMapRealVector0);
      OpenMapRealVector openMapRealVector2 = new OpenMapRealVector(openMapRealVector0);
      openMapRealVector1.sparseIterator();
      // Undeclared exception!
      openMapRealVector1.ebeMultiply(realVector0);
  }
}