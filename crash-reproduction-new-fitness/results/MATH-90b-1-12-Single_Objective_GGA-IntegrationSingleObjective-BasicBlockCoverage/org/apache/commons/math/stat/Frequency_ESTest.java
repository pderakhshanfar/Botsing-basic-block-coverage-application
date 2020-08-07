/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 23:05:37 UTC 2020
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
      frequency0.valuesIterator();
      frequency0.getSumFreq();
      char char0 = '*';
      frequency0.getPct('*');
      frequency0.clear();
      frequency0.clear();
      Frequency frequency1 = new Frequency();
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      frequency0.addValue((Object) integer0);
      frequency1.clear();
      Object object0 = new Object();
      frequency1.getPct(object0);
      frequency1.getCount((-286L));
      frequency0.getPct(0);
      // Undeclared exception!
      frequency0.addValue((Object) "ewDryH@d*.j/dED,S");
  }
}