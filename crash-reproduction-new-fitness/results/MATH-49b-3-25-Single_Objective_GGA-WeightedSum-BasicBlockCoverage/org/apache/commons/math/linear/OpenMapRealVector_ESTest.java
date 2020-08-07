/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 02:00:52 UTC 2020
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
      Double[] doubleArray0 = new Double[5];
      Double double0 = new Double(1.0E-12);
      doubleArray0[0] = double0;
      Double double1 = new Double(1353.0);
      doubleArray0[1] = double1;
      Double double2 = new Double(0.0);
      doubleArray0[2] = double2;
      Double double3 = new Double(0.0);
      doubleArray0[3] = double3;
      Double double4 = new Double(0.0);
      doubleArray0[4] = double4;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.unitVector();
      // Undeclared exception!
      openMapRealVector1.ebeMultiply((RealVector) openMapRealVector0);
  }
}