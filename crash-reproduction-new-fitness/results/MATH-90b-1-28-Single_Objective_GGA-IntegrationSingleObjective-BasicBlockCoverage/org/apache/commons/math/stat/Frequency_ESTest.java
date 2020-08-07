/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 03:29:11 UTC 2020
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
      Integer integer0 = new Integer(9);
      frequency0.addValue((Object) integer0);
      Object object0 = new Object();
      frequency0.getCumPct(object0);
      frequency0.valuesIterator();
      frequency0.clear();
      frequency0.valuesIterator();
      frequency0.addValue('Z');
      frequency0.getCount('[');
      // Undeclared exception!
      frequency0.addValue(0L);
  }
}