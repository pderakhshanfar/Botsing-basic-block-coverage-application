/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 17:48:18 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.DateTimeZone;
import org.joda.time.tz.NameProvider;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeZone_ESTest extends DateTimeZone_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NameProvider nameProvider0 = mock(NameProvider.class, new ViolatedAssumptionAnswer());
      DateTimeZone.setNameProvider(nameProvider0);
      NameProvider nameProvider1 = mock(NameProvider.class, new ViolatedAssumptionAnswer());
      DateTimeZone.setNameProvider(nameProvider1);
      DateTimeZone.getAvailableIDs();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.getOffset(0L);
      dateTimeZone0.isStandardOffset(3381L);
      DateTimeZone.setDefault(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHoursMinutes(0, 0);
      dateTimeZone1.convertLocalToUTC(1181L, true);
      int int0 = (-790);
      try { 
        DateTimeZone.forOffsetHoursMinutes(0, (-790));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -790
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }
}