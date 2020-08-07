/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 17:46:47 UTC 2020
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.ReadablePartial;
import org.joda.time.field.TestPreciseDurationDateTimeField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class PreciseDurationDateTimeField_ESTest extends PreciseDurationDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = mock(DateTimeFieldType.class, new ViolatedAssumptionAnswer());
      DurationField durationField0 = mock(DurationField.class, new ViolatedAssumptionAnswer());
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      ReadablePartial readablePartial0 = mock(ReadablePartial.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(readablePartial0).size();
      int[] intArray0 = new int[4];
      intArray0[1] = 0;
      intArray0[1] = 0;
      intArray0[2] = 0;
      testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0.roundHalfFloor(0);
      intArray0[3] = 0;
      testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0.roundHalfCeiling((-1372L));
      testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0.set(readablePartial0, 0, intArray0, 0);
      testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0.getLeapAmount((-1380L));
      ReadablePartial readablePartial1 = mock(ReadablePartial.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0.set((long) 0, (-2705));
  }
}