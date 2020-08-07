/*
 * This file was automatically generated by EvoSuite
 * Fri May 15 12:20:18 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Minutes;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      PeriodType periodType0 = minutes0.getPeriodType();
      PeriodType periodType1 = periodType0.withHoursRemoved();
      Period period0 = new Period(1760L, periodType1);
      period0.withPeriodType(periodType1);
      Period period1 = new Period(1760L);
      period0.plusMinutes((-3109));
      period1.getHours();
      period1.withSeconds((-3109));
      int int0 = (-6593);
      // Undeclared exception!
      period0.withYears((-6593));
  }
}