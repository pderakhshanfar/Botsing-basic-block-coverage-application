/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 00:43:21 UTC 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeFieldType;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeFormatter_ESTest extends DateTimeFormatter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TextField0, dateTimeFormatterBuilder_TextField0);
      String string0 = "\"Qc~'[\\6jT}l";
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("\"Qc~'[\u0006jT}l");
  }
}