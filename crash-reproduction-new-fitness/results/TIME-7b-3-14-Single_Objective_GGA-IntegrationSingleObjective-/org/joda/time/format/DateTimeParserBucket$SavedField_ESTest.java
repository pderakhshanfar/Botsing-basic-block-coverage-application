/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 13:23:14 UTC 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeField;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket$SavedField_ESTest extends DateTimeParserBucket$SavedField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      buddhistChronology0.clockhourOfHalfday();
      Locale locale0 = Locale.CANADA_FRENCH;
      buddhistChronology0.millisOfDay();
      Locale locale1 = Locale.UK;
      int int0 = 1160;
      buddhistChronology0.year();
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfMonth();
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new DateTimeParserBucket.SavedField(dateTimeField0, 961);
      // Undeclared exception!
      dateTimeParserBucket_SavedField0.set(961, true);
  }
}