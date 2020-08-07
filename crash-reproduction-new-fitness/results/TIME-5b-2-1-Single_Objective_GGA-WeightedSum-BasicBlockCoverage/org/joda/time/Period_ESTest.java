/*
 * This file was automatically generated by EvoSuite
 * Fri May 15 12:18:02 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DurationFieldType;
import org.joda.time.Interval;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableDuration;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Interval interval0 = new Interval(0L, 0L);
      ReadableDuration readableDuration0 = mock(ReadableDuration.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(readableDuration0).getMillis();
      Interval interval1 = interval0.withDurationBeforeEnd(readableDuration0);
      DateTime dateTime0 = interval1.getStart();
      DateTime dateTime1 = dateTime0.withEarlierOffsetAtOverlap();
      DateTime dateTime2 = dateTime1.plusMinutes(2208);
      DateTime dateTime3 = dateTime2.withMillisOfDay(2208);
      DateTime dateTime4 = dateTime3.minusSeconds(2208);
      DateTime dateTime5 = dateTime4.minusMinutes((-2848));
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((int[]) null).when(chronology0).get(any(org.joda.time.ReadablePeriod.class) , anyLong() , anyLong());
      DateTime dateTime6 = dateTime5.withChronology(chronology0);
      PeriodType periodType0 = mock(PeriodType.class, new ViolatedAssumptionAnswer());
      doReturn(false, false, false, false, false).when(periodType0).isSupported(any(org.joda.time.DurationFieldType.class));
      Period period0 = new Period(dateTime6, dateTime5, periodType0);
      period0.plusMonths(0);
      PeriodType periodType1 = mock(PeriodType.class, new ViolatedAssumptionAnswer());
      Chronology chronology1 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((int[]) null).when(chronology1).get(any(org.joda.time.ReadablePeriod.class) , anyLong());
      Period period1 = new Period((long) 2208, periodType1, chronology1);
      DurationFieldType durationFieldType0 = DurationFieldType.ERAS_TYPE;
      PeriodType periodType2 = PeriodType.millis();
      Period period2 = new Period((-2344L), 2208, periodType2);
      period2.get(durationFieldType0);
      // Undeclared exception!
      period2.withYears(0);
  }
}