/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 04:41:38 UTC 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.chrono.BasicFixedMonthChronology;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.IslamicChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseChronology_ESTest extends BaseChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("Multiplication overflows an int: ");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      buddhistChronology0.seconds();
      buddhistChronology0.weekyears();
      LocalTime.now();
      long long0 = BasicFixedMonthChronology.MILLIS_PER_MONTH;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime(2592000000L);
      // Undeclared exception!
      islamicChronology0.set(localDateTime0, 2592000000L);
  }
}