/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 02:51:05 UTC 2020
 */

package org.apache.commons.math.stat;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Comparator;
import org.apache.commons.math.stat.Frequency;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Frequency_ESTest extends Frequency_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Frequency frequency1 = new Frequency();
      frequency0.getCount((-1));
      frequency1.getCumFreq((Object) frequency0);
      frequency0.valuesIterator();
      frequency0.valuesIterator();
      Integer integer0 = new Integer((-1882));
      frequency1.addValue((Object) integer0);
      frequency1.getCount((-1929));
      frequency0.getSumFreq();
      frequency0.toString();
      frequency1.getCumFreq(0L);
      frequency1.getSumFreq();
      // Undeclared exception!
      frequency1.addValue((Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
  }
}