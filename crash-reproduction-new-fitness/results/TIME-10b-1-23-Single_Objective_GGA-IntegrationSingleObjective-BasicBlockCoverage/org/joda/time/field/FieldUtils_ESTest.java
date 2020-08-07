/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 04:43:00 UTC 2020
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeField;
import org.joda.time.LocalDate;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.OffsetDateTimeField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class FieldUtils_ESTest extends FieldUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      DateTimeField dateTimeField0 = localDate0.getField(0);
      OffsetDateTimeField offsetDateTimeField0 = new OffsetDateTimeField(dateTimeField0, (-3038));
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) offsetDateTimeField0, 0, 1209, 1209);
  }
}