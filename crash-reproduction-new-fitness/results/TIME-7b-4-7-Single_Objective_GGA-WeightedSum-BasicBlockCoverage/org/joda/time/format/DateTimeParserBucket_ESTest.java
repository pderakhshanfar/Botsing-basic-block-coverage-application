/*
 * This file was automatically generated by EvoSuite
 * Fri May 15 12:22:19 UTC 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.UnsupportedDateTimeField;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket_ESTest extends DateTimeParserBucket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      Locale locale0 = Locale.KOREAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1746L, iSOChronology0, locale0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.minutes();
      UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField0);
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.dayOfWeek();
      int int0 = 2409;
      dateTimeParserBucket0.saveField(dateTimeFieldType1, 2409);
      dateTimeParserBucket0.getLocale();
      boolean boolean0 = true;
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "U2^YE");
  }
}