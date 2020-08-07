/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 02:39:41 UTC 2020
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
      double[] doubleArray0 = new double[13];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector();
      Double double0 = new Double((-2.829746289257847));
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector();
      double double1 = new Double((-2.829746289257847));
      OpenMapRealVector openMapRealVector2 = new OpenMapRealVector(doubleArray0);
      openMapRealVector1.iterator();
      openMapRealVector1.ebeMultiply((RealVector) openMapRealVector1);
      OpenMapRealVector openMapRealVector3 = new OpenMapRealVector(openMapRealVector1);
      openMapRealVector1.append(openMapRealVector3);
      OpenMapRealVector openMapRealVector4 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector5 = openMapRealVector4.mapAdd((-2.829746289257847));
      openMapRealVector3.iterator();
      // Undeclared exception!
      openMapRealVector5.ebeMultiply((RealVector) openMapRealVector4);
  }
}