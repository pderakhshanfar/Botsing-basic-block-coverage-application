/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 17 23:34:07 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.Partial;
import org.joda.time.ReadablePartial;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Days_ESTest extends Days_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("D");
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(timeZone0);
      LocalDate localDate0 = LocalDate.fromCalendarFields(gregorianCalendar0);
      Partial partial0 = new Partial(localDate0);
      int[] intArray0 = new int[4];
      intArray0[1] = 5;
      Partial partial1 = new Partial(partial0, intArray0);
      // Undeclared exception!
      Days.daysBetween((ReadablePartial) partial0, (ReadablePartial) partial1);
  }
}