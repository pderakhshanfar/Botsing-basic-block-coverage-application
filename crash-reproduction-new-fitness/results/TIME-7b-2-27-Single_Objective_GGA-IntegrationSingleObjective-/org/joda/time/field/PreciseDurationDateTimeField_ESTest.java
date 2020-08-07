/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 18:37:45 UTC 2020
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalTime;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.field.TestPreciseDurationDateTimeField;
import org.joda.time.tz.UTCProvider;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class PreciseDurationDateTimeField_ESTest extends PreciseDurationDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = mock(DateTimeFieldType.class, new ViolatedAssumptionAnswer());
      Date date0 = new Date();
      LocalTime localTime0 = LocalTime.fromDateFields(date0);
      UTCProvider uTCProvider0 = new UTCProvider();
      uTCProvider0.getZone("@V#[tcMQ$)4N\";eo>");
      uTCProvider0.getZone("@V#[tcMQ$)4N\";eo>");
      uTCProvider0.getAvailableIDs();
      uTCProvider0.getAvailableIDs();
      localTime0.toDateTimeToday((DateTimeZone) null);
      JulianChronology.getInstance((DateTimeZone) null);
      LocalTime localTime1 = localTime0.plusSeconds((-635));
      LocalTime localTime2 = localTime0.withFields(localTime1);
      LocalTime localTime3 = localTime2.plusHours((-13));
      localTime3.minusMillis(17);
      int[] intArray0 = new int[8];
      intArray0[0] = (-635);
      intArray0[1] = (-635);
      intArray0[2] = (-635);
      intArray0[3] = 17;
      DateTimeFieldType.clockhourOfHalfday();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      buddhistChronology0.centuries();
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0.remainder((-635));
      testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0.isLenient();
      testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0.roundFloor(522L);
      // Undeclared exception!
      testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0.set(480L, (-2147483646));
  }
}