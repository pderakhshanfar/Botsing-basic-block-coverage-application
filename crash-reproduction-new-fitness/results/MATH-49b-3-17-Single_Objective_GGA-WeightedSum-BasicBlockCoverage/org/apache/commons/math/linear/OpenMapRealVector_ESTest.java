/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 02:00:05 UTC 2020
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.linear.ArrayRealVector;
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
      doubleArray0[0] = 0.0;
      doubleArray0[1] = 13.0985827;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.ebeMultiply((RealVector) openMapRealVector0);
      openMapRealVector0.dotProduct(doubleArray0);
      openMapRealVector1.toArray();
      openMapRealVector1.checkVectorDimensions(openMapRealVector0);
      RealVector realVector0 = openMapRealVector1.projection((RealVector) openMapRealVector0);
      OpenMapRealVector openMapRealVector2 = (OpenMapRealVector)openMapRealVector1.mapSubtract(2909.6);
      openMapRealVector1.dotProduct(openMapRealVector0);
      openMapRealVector1.equals(realVector0);
      openMapRealVector0.setSubVector(0, (RealVector) openMapRealVector1);
      openMapRealVector0.getDistance(openMapRealVector1);
      openMapRealVector1.toArray();
      openMapRealVector0.getSparsity();
      OpenMapRealVector openMapRealVector3 = openMapRealVector1.append((RealVector) openMapRealVector0);
      openMapRealVector3.mapAdd(538.9314221891351);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, false);
      // Undeclared exception!
      openMapRealVector2.ebeMultiply((RealVector) openMapRealVector0);
  }
}