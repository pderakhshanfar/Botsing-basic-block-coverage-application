/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 04:40:55 UTC 2020
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeFieldType;
import org.joda.time.field.TestPreciseDurationDateTimeField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class PreciseDurationDateTimeField_ESTest extends PreciseDurationDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeFieldType.weekOfWeekyear();
      TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0 = new TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField();
      testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0.add((-1131L), (-1131L));
      testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0.roundHalfFloor(0L);
      testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0.toString();
      testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0.toString();
      testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0.toString();
      // Undeclared exception!
      testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0.set((-491L), 512);
  }
}