/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 21:43:42 UTC 2020
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
      double double0 = 2047.1727589545;
      double double1 = 1.0E-8;
      Gamma.regularizedGammaP(2047.1727589545, 1.0E-8);
      Gamma.regularizedGammaQ(0.0, 0.0);
      int int0 = 709;
      Gamma.regularizedGammaQ(2047.1727589545, 1.0E-8, 0.0, 709);
      int int1 = 0;
      Gamma.regularizedGammaP(0.0, (double) 709, 1685.87, 0);
      Gamma.regularizedGammaQ(1.0, (double) 0);
      int int2 = 0;
      try { 
        Gamma.regularizedGammaP(1.7976931348623157E308, 0.5, 1.0, 0);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (0) exceeded
         //
         verifyException("org.apache.commons.math.special.Gamma", e);
      }
  }
}