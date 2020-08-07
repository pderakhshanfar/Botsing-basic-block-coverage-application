/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 13:17:13 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.TestMutableInterval_Constructors;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Period period0 = Period.days(930);
      TestMutableInterval_Constructors testMutableInterval_Constructors0 = new TestMutableInterval_Constructors("F$v");
      TestMutableInterval_Constructors.MockInterval testMutableInterval_Constructors_MockInterval0 = testMutableInterval_Constructors0.new MockInterval();
      DateTime dateTime0 = testMutableInterval_Constructors_MockInterval0.getStart();
      Duration duration0 = new Duration(dateTime0, dateTime0);
      DateTime dateTime1 = dateTime0.withDurationAdded((ReadableDuration) duration0, 930);
      DateTime dateTime2 = dateTime1.withMillis(930);
      Duration duration1 = period0.toDurationTo(dateTime2);
      Period period1 = duration1.toPeriodTo((ReadableInstant) dateTime1);
      Period period2 = period1.withDays(930);
      int int0 = (-3652);
      Period period3 = period2.plusHours((-3652));
      Period period4 = period3.withHours((-3652));
      int int1 = 0;
      period4.withDays(0);
      PeriodType periodType0 = PeriodType.days();
      PeriodType periodType1 = periodType0.withMinutesRemoved();
      PeriodType periodType2 = periodType1.withMonthsRemoved();
      // Undeclared exception!
      period3.normalizedStandard(periodType2);
  }
}