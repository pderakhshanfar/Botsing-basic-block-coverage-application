/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 18 06:36:06 UTC 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeFieldType;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket_ESTest extends DateTimeParserBucket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      Locale locale0 = Locale.JAPAN;
      Integer integer0 = new Integer(5638);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-3549L), gregorianChronology0, locale0, integer0, 2);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (-1659));
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "");
  }
}