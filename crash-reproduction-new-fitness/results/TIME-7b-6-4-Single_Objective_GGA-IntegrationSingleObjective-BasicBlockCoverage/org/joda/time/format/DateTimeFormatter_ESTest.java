/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 13:24:14 UTC 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.CharBuffer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationFieldType;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeFormatter_ESTest extends DateTimeFormatter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      DurationFieldType.halfdays();
      DurationFieldType.weeks();
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 100, false);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_FixedNumber0, dateTimeFormatterBuilder_FixedNumber0);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      mutableDateTime0.toString(dateTimeFormatter1);
      CharBuffer charBuffer0 = CharBuffer.allocate(100);
      DateTime dateTime0 = DateTime.now();
      dateTime0.withDurationAdded((long) 100, 100);
      dateTimeFormatter0.printTo((Appendable) charBuffer0, (ReadableInstant) dateTime0);
      int int0 = (-643);
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber1 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 1, false);
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral((String) null);
      dateTimeFormatter0.withOffsetParsed();
      MutableDateTime mutableDateTime1 = new MutableDateTime();
      mutableDateTime1.toString(dateTimeFormatter1);
      CharBuffer.allocate(606);
      // Undeclared exception!
      dateTimeFormatter0.parseInto(mutableDateTime0, "1970-01-01T01:00:00.000+01:00", 1);
  }
}