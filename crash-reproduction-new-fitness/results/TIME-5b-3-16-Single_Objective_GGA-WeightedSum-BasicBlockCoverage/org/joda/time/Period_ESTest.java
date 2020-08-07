/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 16:44:33 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 2;
      Period period0 = new Period(7, 326565, 3221, 5, 0, 1271, 2, (-4232));
      period0.plusMinutes(326565);
      Period period1 = period0.minusHours((-4232));
      PeriodType periodType0 = PeriodType.weeks();
      // Undeclared exception!
      period1.normalizedStandard(periodType0);
  }
}