/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 21:43:23 UTC 2020
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
      Gamma.regularizedGammaP((-4139.438), (-4139.438), 8.441822398385275E-5, 331);
      double double0 = 3556.989122543027;
      int int0 = (-3905);
      Gamma.regularizedGammaQ(Double.NaN, 213.418417, 3556.989122543027, (-3905));
      try { 
        Gamma.regularizedGammaP(3114.324, 2919.0, Double.NaN, 0);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (0) exceeded
         //
         verifyException("org.apache.commons.math.special.Gamma", e);
      }
  }
}