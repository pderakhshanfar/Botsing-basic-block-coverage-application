/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 23:05:20 UTC 2020
 */

package org.apache.commons.math.stat;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.stat.Frequency;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Frequency_ESTest extends Frequency_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      int int0 = 1833;
      frequency0.getCount(1833);
      frequency0.getSumFreq();
      Integer integer0 = new Integer(642);
      frequency0.addValue((Object) integer0);
      Integer integer1 = new Integer(97);
      frequency0.addValue(integer1);
      frequency0.addValue((Object) integer1);
      Object object0 = new Object();
      // Undeclared exception!
      frequency0.addValue(object0);
  }
}