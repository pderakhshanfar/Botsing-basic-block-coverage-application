/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 02:51:08 UTC 2020
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
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(comparator0).compare(any() , any());
      Frequency frequency0 = new Frequency(comparator0);
      String string0 = "";
      frequency0.addValue((Object) "");
      frequency0.getPct((Object) "");
      frequency0.addValue((Object) "");
      char char0 = 'G';
      frequency0.getCount('G');
      int int0 = 0;
      frequency0.getCount(0);
      frequency0.toString();
      frequency0.getPct((Object) "");
      Frequency frequency1 = new Frequency();
      // Undeclared exception!
      frequency1.addValue((Object) frequency0);
  }
}