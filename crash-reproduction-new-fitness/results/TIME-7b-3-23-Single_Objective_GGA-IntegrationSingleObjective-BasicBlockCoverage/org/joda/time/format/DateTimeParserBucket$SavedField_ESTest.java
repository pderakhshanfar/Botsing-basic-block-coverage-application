/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 17:46:12 UTC 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket$SavedField_ESTest extends DateTimeParserBucket$SavedField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      DateTimeField dateTimeField0 = dateTimeFieldType0.getField(buddhistChronology0);
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new DateTimeParserBucket.SavedField(dateTimeField0, 859);
      boolean boolean0 = true;
      // Undeclared exception!
      dateTimeParserBucket_SavedField0.set(3511L, true);
  }
}