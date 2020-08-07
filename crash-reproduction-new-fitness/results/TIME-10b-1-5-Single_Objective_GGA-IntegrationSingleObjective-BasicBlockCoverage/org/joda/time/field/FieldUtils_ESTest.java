/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 00:18:10 UTC 2020
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeField;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.TestOffsetDateTimeField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class FieldUtils_ESTest extends FieldUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 369, 369, 369);
      FieldUtils.safeNegate(369);
      FieldUtils.safeMultiply(0L, 369);
      FieldUtils.getWrappedValue(369, 369, 59, 1990);
      int int0 = 0;
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 59, 1990, 0);
  }
}