/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 02:11:22 UTC 2020
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
      Gamma.regularizedGammaP((-2069.99), 0.0);
      int int0 = (-1229);
      Gamma.regularizedGammaQ(Double.NaN, Double.NaN, 0.0, (-1229));
      Gamma.regularizedGammaQ((double) (-1229), Double.NaN);
      Gamma.regularizedGammaP(Double.NaN, Double.NaN);
      Gamma.regularizedGammaQ(452.8159, Double.NaN, Double.NaN, (-1229));
      double double0 = 119.1190674;
      Gamma.regularizedGammaP(Double.NaN, 0.0, 119.1190674, 256);
      try { 
        Gamma.regularizedGammaP(2126.261504239995, 1.580887032249125E-4, Double.NaN, (-1229));
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (-1,229) exceeded
         //
         verifyException("org.apache.commons.math.special.Gamma", e);
      }
  }
}