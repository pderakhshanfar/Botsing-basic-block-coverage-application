/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 17:45:21 UTC 2020
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.field.FieldUtils;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class FieldUtils_ESTest extends FieldUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FieldUtils.safeMultiply(0L, (-470));
      FieldUtils.verifyValueBounds((DateTimeFieldType) null, (-470), (-470), 0);
      FieldUtils.safeMultiply(0L, 0L);
      FieldUtils.safeToInt(0L);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfMinute();
      FieldUtils.verifyValueBounds(dateTimeField0, 0, 0, 0);
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 1222, (-1351), 720);
  }
}