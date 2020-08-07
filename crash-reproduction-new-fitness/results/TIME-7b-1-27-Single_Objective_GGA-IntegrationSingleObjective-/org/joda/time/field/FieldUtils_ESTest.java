/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 18:37:06 UTC 2020
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.MockZone;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.field.FieldUtils;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class FieldUtils_ESTest extends FieldUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 7678125;
      MockZone mockZone0 = new MockZone(0L, 7678125, 7678125);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) mockZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfMinute();
      int int1 = (-5277);
      int int2 = (-1166);
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, (-5277), 7678125, (-1166));
  }
}