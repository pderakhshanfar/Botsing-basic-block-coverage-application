/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 13:21:59 UTC 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.Hours;
import org.joda.time.MutableDateTime;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.DateTimePrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeFormatter_ESTest extends DateTimeFormatter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      Hours hours0 = Hours.FIVE;
      dateTimeFieldType0.isSupported(copticChronology0);
      DateTimeFormatterBuilder.TwoDigitYear dateTimeFormatterBuilder_TwoDigitYear0 = new DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, (-3656), false);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeFormatterBuilder_TwoDigitYear0);
      CopticChronology copticChronology1 = CopticChronology.getInstance();
      MutableDateTime mutableDateTime0 = new MutableDateTime((Chronology) copticChronology1);
      MutableDateTime mutableDateTime1 = mutableDateTime0.copy();
      mutableDateTime1.getMonthOfYear();
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withDefaultYear(9);
      dateTimeFormatter1.withOffsetParsed();
      DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withChronology(copticChronology1);
      dateTimeFormatter2.withPivotYear(8);
      dateTimeFormatter0.isParser();
      // Undeclared exception!
      dateTimeFormatter2.parseInto(mutableDateTime1, "2010-06-30T12:30/P1DT2H", 8);
  }
}