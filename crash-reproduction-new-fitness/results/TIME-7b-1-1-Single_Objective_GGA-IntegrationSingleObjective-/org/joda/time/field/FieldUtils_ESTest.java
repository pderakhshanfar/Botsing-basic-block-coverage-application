/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 13:18:49 UTC 2020
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.MockPartial;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.LenientDateTimeField;
import org.joda.time.field.SkipDateTimeField;
import org.joda.time.field.SkipUndoDateTimeField;
import org.joda.time.field.StrictDateTimeField;
import org.joda.time.field.TestBaseDateTimeField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class FieldUtils_ESTest extends FieldUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 0;
      FieldUtils.safeNegate(0);
      FieldUtils.safeMultiply(0, 0);
      FieldUtils.safeAdd(0, 0);
      FieldUtils.safeMultiply(Integer.MIN_VALUE, 0);
      int int1 = 0;
      FieldUtils.safeMultiply(0, 0);
      MockPartial mockPartial0 = new MockPartial();
      Chronology chronology0 = mockPartial0.getChronology();
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      SkipDateTimeField skipDateTimeField0 = new SkipDateTimeField(chronology0, testBaseDateTimeField_MockBaseDateTimeField0);
      LenientDateTimeField lenientDateTimeField0 = new LenientDateTimeField(skipDateTimeField0, chronology0);
      StrictDateTimeField strictDateTimeField0 = new StrictDateTimeField(lenientDateTimeField0);
      SkipUndoDateTimeField skipUndoDateTimeField0 = new SkipUndoDateTimeField(chronology0, strictDateTimeField0);
      int int2 = (-2369);
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) skipUndoDateTimeField0, 0, 0, (-2369));
  }
}