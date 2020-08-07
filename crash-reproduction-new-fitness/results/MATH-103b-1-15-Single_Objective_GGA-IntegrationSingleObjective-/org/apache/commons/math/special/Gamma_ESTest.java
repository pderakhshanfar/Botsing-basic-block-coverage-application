/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 21:49:52 UTC 2020
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
      Gamma.regularizedGammaQ(0.5, 0.5, 3.6899182659531625E-6, 2151);
      try { 
        Gamma.regularizedGammaP(1.0E-8, 0.5, (-1304.0), 3);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (3) exceeded
         //
         verifyException("org.apache.commons.math.special.Gamma", e);
      }
  }
}