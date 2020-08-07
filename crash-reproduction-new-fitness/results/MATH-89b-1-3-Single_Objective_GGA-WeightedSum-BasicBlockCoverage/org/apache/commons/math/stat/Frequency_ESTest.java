/*
 * This file was automatically generated by EvoSuite
 * Thu May 14 12:26:13 UTC 2020
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
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.getPct('Q');
      int int0 = 0;
      frequency0.getPct(0);
      Frequency frequency1 = new Frequency();
      frequency0.getPct((long) 0);
      Object object0 = new Object();
      frequency0.getCount(object0);
      Object object1 = new Object();
      // Undeclared exception!
      frequency1.addValue(object1);
  }
}