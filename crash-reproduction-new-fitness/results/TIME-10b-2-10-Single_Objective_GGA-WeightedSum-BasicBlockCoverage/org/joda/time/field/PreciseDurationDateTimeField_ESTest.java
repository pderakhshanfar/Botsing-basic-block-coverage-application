/*
 * This file was automatically generated by EvoSuite
 * Thu May 14 23:41:53 UTC 2020
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.field.MillisDurationField;
import org.joda.time.field.TestPreciseDateTimeField;
import org.joda.time.field.TestPreciseDurationDateTimeField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class PreciseDurationDateTimeField_ESTest extends PreciseDurationDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      TestPreciseDateTimeField.MockStandardDateTimeField testPreciseDateTimeField_MockStandardDateTimeField0 = new TestPreciseDateTimeField.MockStandardDateTimeField();
      testPreciseDateTimeField_MockStandardDateTimeField0.getDifference((-12219292800000L), (-12219292800000L));
      DurationField durationField0 = testPreciseDateTimeField_MockStandardDateTimeField0.getRangeDurationField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfHalfday();
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField(dateTimeFieldType0, durationField0);
      testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0.getRangeDurationField();
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      testPreciseDateTimeField_MockStandardDateTimeField0.getAsShortText(1000L, locale0);
      testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0.roundCeiling(1015L);
      // Undeclared exception!
      testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0.set((long) 146, (-414));
  }
}