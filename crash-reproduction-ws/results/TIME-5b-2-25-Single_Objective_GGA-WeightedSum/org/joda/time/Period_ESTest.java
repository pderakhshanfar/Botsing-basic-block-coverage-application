/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 18 06:27:20 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.TestMonthDay_Basics;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PeriodType periodType0 = PeriodType.months();
      TestMonthDay_Basics testMonthDay_Basics0 = new TestMonthDay_Basics("");
      TestMonthDay_Basics.MockMD testMonthDay_Basics_MockMD0 = testMonthDay_Basics0.new MockMD();
      Chronology chronology0 = testMonthDay_Basics_MockMD0.getChronology();
      Period period0 = new Period((long) 9, periodType0, chronology0);
      // Undeclared exception!
      period0.withYears(9);
  }
}