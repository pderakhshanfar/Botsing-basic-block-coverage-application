/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 00:44:30 UTC 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Writer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeParser;
import org.joda.time.format.DateTimePrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeFormatter_ESTest extends DateTimeFormatter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimePrinter0).toString();
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      DateTimePrinter dateTimePrinter1 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser1 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null).when(dateTimeParser1).toString();
      doReturn(0, 0, 0).when(dateTimeParser1).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter1 = new DateTimeFormatter(dateTimePrinter1, dateTimeParser1);
      DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withDefaultYear((-2550));
      dateTimeFormatter2.isPrinter();
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      dateTimeFormatter2.printTo(writer0, (-507L));
      dateTimeFormatter1.getChronolgy();
      dateTimeFormatter1.parseMillis("");
      Integer integer0 = new Integer((-2550));
      DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter1.withPivotYear(integer0);
      DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter0.withZoneUTC();
      dateTimeFormatter1.parseDateTime("");
      dateTimeFormatter4.getZone();
      dateTimeFormatter4.getLocale();
      // Undeclared exception!
      dateTimeFormatter3.parseDateTime("Days");
  }
}