/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 04:42:02 UTC 2020
 */

package org.joda.time.base;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDateTime;
import org.joda.time.Minutes;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.chrono.CopticChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseSingleFieldPeriod_ESTest extends BaseSingleFieldPeriod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      Minutes minutes0 = Minutes.ZERO;
      minutes0.getFieldType();
      DurationFieldType durationFieldType0 = minutes0.getFieldType();
      minutes0.isSupported(durationFieldType0);
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((-3074L), (Chronology) copticChronology0);
      LocalDateTime localDateTime1 = new LocalDateTime((long) 17);
      LocalDateTime localDateTime2 = localDateTime1.minusSeconds(1960);
      localDateTime1.withMinuteOfHour(0);
      // Undeclared exception!
      BaseSingleFieldPeriod.between(localDateTime0, localDateTime2, minutes0);
  }
}