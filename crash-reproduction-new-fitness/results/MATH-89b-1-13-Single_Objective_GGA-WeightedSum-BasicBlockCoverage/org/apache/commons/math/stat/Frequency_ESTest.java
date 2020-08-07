/*
 * This file was automatically generated by EvoSuite
 * Thu May 14 12:26:42 UTC 2020
 */

package org.apache.commons.math.stat;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Comparator;
import java.util.Iterator;
import org.apache.commons.math.stat.Frequency;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Frequency_ESTest extends Frequency_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.toString();
      frequency0.getCount((-927));
      Iterator iterator0 = frequency0.valuesIterator();
      frequency0.getPct((Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
      Frequency frequency1 = new Frequency();
      frequency1.getCumFreq((Object) iterator0);
      frequency1.getCumPct(0L);
      frequency1.getCumPct((long) (-927));
      // Undeclared exception!
      frequency1.addValue((Object) frequency0);
  }
}