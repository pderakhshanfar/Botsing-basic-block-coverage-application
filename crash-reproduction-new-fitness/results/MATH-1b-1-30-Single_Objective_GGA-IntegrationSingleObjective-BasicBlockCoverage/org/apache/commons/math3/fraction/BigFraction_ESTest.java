/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 02:10:39 UTC 2020
 */

package org.apache.commons.math3.fraction;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.fraction.BigFraction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BigFraction_ESTest extends BigFraction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = 1.7060482501983643;
      int int0 = 1143;
      BigFraction bigFraction0 = new BigFraction(1.7060482501983643, 1143);
      BigFraction bigFraction1 = new BigFraction((long) 1143);
      BigFraction bigFraction2 = new BigFraction((double) 1143, 1143);
  }
}