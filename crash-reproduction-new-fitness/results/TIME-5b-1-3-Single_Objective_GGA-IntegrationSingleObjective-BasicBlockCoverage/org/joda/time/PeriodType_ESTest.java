/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 13:17:22 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.LocalDate;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.TestDateMidnight_Basics;
import org.joda.time.TestDateTime_Basics;
import org.joda.time.TestDuration_Basics;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class PeriodType_ESTest extends PeriodType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PeriodType periodType0 = PeriodType.hours();
      long long0 = (-2166L);
      TestDuration_Basics.MockMutableDuration testDuration_Basics_MockMutableDuration0 = new TestDuration_Basics.MockMutableDuration((-2166L));
      Duration duration0 = testDuration_Basics_MockMutableDuration0.toDuration();
      TestDateMidnight_Basics testDateMidnight_Basics0 = new TestDateMidnight_Basics("Property[");
      TestDateMidnight_Basics.MockInstant testDateMidnight_Basics_MockInstant0 = testDateMidnight_Basics0.new MockInstant();
      DateTimeZone dateTimeZone0 = testDateMidnight_Basics_MockInstant0.getZone();
      DateTime dateTime0 = new DateTime(dateTimeZone0);
      DateTime dateTime1 = dateTime0.minusHours((-2383));
      LocalDate localDate0 = dateTime1.toLocalDate();
      TestDateTime_Basics testDateTime_Basics0 = new TestDateTime_Basics("Property[");
      TestDateTime_Basics.MockEqualsChronology testDateTime_Basics_MockEqualsChronology0 = testDateTime_Basics0.new MockEqualsChronology();
      testDateTime_Basics_MockEqualsChronology0.getZone();
      DateTime dateTime2 = localDate0.toDateTimeAtStartOfDay((DateTimeZone) null);
      PeriodType periodType1 = PeriodType.days();
      Period period0 = duration0.toPeriodTo((ReadableInstant) dateTime2, periodType1);
      Period period1 = period0.plusDays(0);
      int[] intArray0 = new int[1];
      intArray0[0] = (-2383);
      // Undeclared exception!
      periodType0.setIndexedField(period1, 2, intArray0, 0);
  }
}