/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 16:50:02 UTC 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.DateTimeField;
import org.joda.time.DurationField;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket$SavedField_ESTest extends DateTimeParserBucket$SavedField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn((DurationField) null).when(dateTimeField0).getRangeDurationField();
      doReturn(0L).when(dateTimeField0).roundFloor(anyLong());
      doReturn(0L).when(dateTimeField0).set(anyLong() , anyString() , any(java.util.Locale.class));
      Locale locale0 = Locale.CANADA;
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new DateTimeParserBucket.SavedField(dateTimeField0, "xa2+j:KX  e?Q&l2w~", locale0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField1 = buddhistChronology0.dayOfMonth();
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField1 = new DateTimeParserBucket.SavedField(dateTimeField1, 745);
      dateTimeParserBucket_SavedField0.compareTo(dateTimeParserBucket_SavedField1);
      PeriodType periodType0 = PeriodType.months();
      Period period0 = new Period(745, 604800000L, periodType0, buddhistChronology0);
      Period period1 = period0.withMonths(1407);
      buddhistChronology0.get((ReadablePeriod) period1, (-313L), (-313L));
      dateTimeParserBucket_SavedField0.set(745, true);
      // Undeclared exception!
      dateTimeParserBucket_SavedField1.set(0L, true);
  }
}