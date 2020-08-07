/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 13:18:04 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.Minutes;
import org.joda.time.MutableDateTime;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Days days0 = Days.ONE;
      Minutes minutes0 = days0.toStandardMinutes();
      Duration duration0 = minutes0.toStandardDuration();
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      PeriodType periodType0 = PeriodType.time();
      Period period0 = new Period(duration0, mutableDateTime0, periodType0);
      Period period1 = period0.withMillis(0);
      Period period2 = period1.normalizedStandard(periodType0);
      Period period3 = period2.plusSeconds(0);
      // Undeclared exception!
      period3.withYears((-3663));
  }
}