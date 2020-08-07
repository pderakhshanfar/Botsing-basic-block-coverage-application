/*
 * This file was automatically generated by EvoSuite
 * Thu May 14 21:34:02 UTC 2020
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.linear.OpenMapRealVector;
import org.apache.commons.math.linear.RealVector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class OpenMapRealVector_ESTest extends OpenMapRealVector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double[] doubleArray0 = new double[17];
      doubleArray0[0] = (-6.0);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      RealVector realVector0 = openMapRealVector0.mapToSelf(univariateRealFunction0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.ebeMultiply(realVector0);
      openMapRealVector1.getLInfDistance(doubleArray0);
      Double[] doubleArray1 = new Double[2];
      doubleArray1[0] = (Double) (-6.0);
      doubleArray1[1] = (Double) (-6.0);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      UnivariateRealFunction univariateRealFunction1 = quinticFunction0.derivative();
      openMapRealVector0.mapToSelf(univariateRealFunction1);
      // Undeclared exception!
      openMapRealVector0.ebeMultiply((RealVector) openMapRealVector1);
  }
}