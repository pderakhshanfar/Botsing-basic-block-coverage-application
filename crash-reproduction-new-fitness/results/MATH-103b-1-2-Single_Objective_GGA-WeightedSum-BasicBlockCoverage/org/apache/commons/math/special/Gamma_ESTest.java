/*
 * This file was automatically generated by EvoSuite
 * Thu May 14 21:05:13 UTC 2020
 */

package org.apache.commons.math.special;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.special.Gamma;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Gamma_ESTest extends Gamma_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = 1.0E-8;
      Gamma.regularizedGammaQ(1.0E-8, 1.0E-8);
      int int0 = 571;
      Gamma.regularizedGammaQ(0.0, (-1.0), 387.87415169, 571);
      Gamma.logGamma(Double.NaN);
      Gamma.regularizedGammaP(0.0, (double) 571, 0.0, 571);
      double double1 = 0.0;
      Gamma.logGamma(0.0);
      try { 
        Gamma.regularizedGammaP(481.715, 57.15623566586292, (-1737.84), 571);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (571) exceeded
         //
         verifyException("org.apache.commons.math.special.Gamma", e);
      }
  }
}