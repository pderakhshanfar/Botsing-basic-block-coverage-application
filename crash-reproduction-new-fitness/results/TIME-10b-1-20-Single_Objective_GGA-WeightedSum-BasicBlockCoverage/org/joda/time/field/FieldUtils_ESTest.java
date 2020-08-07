/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 04:07:06 UTC 2020
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
      FieldUtils.safeMultiply(35, 35);
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 35, 34, 1225);
      FieldUtils.safeToInt((-1576L));
      FieldUtils.safeMultiply((long) (-1576), (-1576L));
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 63, (-631), (-1444));
  }
}