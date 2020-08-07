/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 16:48:32 UTC 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.MockPartial;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket_ESTest extends DateTimeParserBucket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockPartial mockPartial0 = new MockPartial();
      Chronology chronology0 = mockPartial0.getChronology();
      Locale locale0 = Locale.ITALY;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1L), chronology0, locale0);
      dateTimeParserBucket0.computeMillis(true, (String) null);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      int int0 = (-1837);
      dateTimeParserBucket0.saveField(dateTimeField0, (-1837));
      dateTimeParserBucket0.getOffsetInteger();
      String string0 = "";
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "");
  }
}