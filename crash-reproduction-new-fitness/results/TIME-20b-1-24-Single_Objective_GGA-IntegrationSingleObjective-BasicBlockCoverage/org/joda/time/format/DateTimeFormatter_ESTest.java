/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 05:08:10 UTC 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadableInstant;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeParser;
import org.joda.time.format.DateTimePrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeFormatter_ESTest extends DateTimeFormatter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null).when(dateTimePrinter0).toString();
      doReturn(0).when(dateTimePrinter0).estimatePrintedLength();
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null).when(dateTimeParser0).toString();
      doReturn(0, 0, 0, 0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZoneUTC();
      dateTimeFormatter0.print(1719L);
      DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter1.withOffsetParsed();
      DateTime dateTime0 = dateTimeFormatter2.parseDateTime("");
      dateTimeFormatter2.parseLocalTime("");
      dateTimeFormatter2.getPivotYear();
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "");
      dateTimeFormatter0.printTo(stringBuffer0, (ReadableInstant) dateTime0);
      dateTimeFormatter0.getDefaultYear();
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      dateTimeFormatter2.withZone(dateTimeZone0);
      dateTimeFormatter1.parseDateTime("");
      // Undeclared exception!
      dateTimeFormatter2.parseDateTime("h|qTs?XjL^VBKp");
  }
}