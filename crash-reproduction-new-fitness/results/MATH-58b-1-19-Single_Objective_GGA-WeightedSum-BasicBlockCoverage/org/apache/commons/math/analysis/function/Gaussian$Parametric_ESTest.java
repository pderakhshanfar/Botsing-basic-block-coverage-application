/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 02:12:03 UTC 2020
 */

package org.apache.commons.math.analysis.function;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.function.Gaussian;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Gaussian$Parametric_ESTest extends Gaussian$Parametric_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Gaussian.Parametric gaussian_Parametric0 = new Gaussian.Parametric();
      double double0 = (-344.73578);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-344.73578);
      doubleArray0[1] = (-344.73578);
      doubleArray0[2] = 1885.200041729;
      double[] doubleArray1 = gaussian_Parametric0.gradient((-344.73578), doubleArray0);
      Gaussian.Parametric gaussian_Parametric1 = new Gaussian.Parametric();
      // Undeclared exception!
      gaussian_Parametric1.gradient(1885.200041729, doubleArray1);
  }
}