/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 13:20:51 UTC 2020
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.LenientDateTimeField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class FieldUtils_ESTest extends FieldUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FieldUtils.safeMultiplyToInt(356L, (-674L));
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      BuddhistChronology buddhistChronology1 = BuddhistChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = buddhistChronology1.halfdayOfDay();
      DateTimeField dateTimeField1 = LenientDateTimeField.getInstance(dateTimeField0, buddhistChronology0);
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField1, (-2136), (-239944), (-239944));
  }
}