/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 13:20:23 UTC 2020
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
import org.joda.time.tz.UTCProvider;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class FieldUtils_ESTest extends FieldUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 971;
      FieldUtils.safeNegate(971);
      FieldUtils.equals((Object) "$%LJLAb*AEKmIR|=Yy", (Object) "$%LJLAb*AEKmIR|=Yy");
      FieldUtils.safeNegate((-971));
      UTCProvider uTCProvider0 = new UTCProvider();
      uTCProvider0.getZone("uv8'>z:@0");
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) null);
      DateTimeField dateTimeField0 = buddhistChronology0.weekyearOfCentury();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 0, 971, (-205));
  }
}