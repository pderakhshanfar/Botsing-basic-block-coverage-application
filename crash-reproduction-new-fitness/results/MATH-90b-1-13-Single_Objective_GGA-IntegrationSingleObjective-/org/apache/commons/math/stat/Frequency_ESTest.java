/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 23:10:11 UTC 2020
 */

package org.apache.commons.math.stat;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Comparator;
import org.apache.commons.math.stat.Frequency;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Frequency_ESTest extends Frequency_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator) null);
      frequency0.getCumPct('5');
      frequency0.getCumFreq((Object) ")\"~^s");
      frequency0.getSumFreq();
      frequency0.addValue((Object) ")\"~^s");
      Integer integer0 = Integer.getInteger("", (-1));
      // Undeclared exception!
      frequency0.addValue(integer0);
  }
}