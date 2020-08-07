/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 13:18:44 UTC 2020
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
import org.joda.time.TestBasePartial;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = (-4251);
      Period period0 = Period.years((-4251));
      int int1 = 128;
      Period.months(128);
      TestBasePartial.MockPartial testBasePartial_MockPartial0 = new TestBasePartial.MockPartial();
      Chronology chronology0 = testBasePartial_MockPartial0.getChronology();
      PeriodType periodType0 = PeriodType.dayTime();
      Period period1 = new Period(31L, periodType0, chronology0);
      // Undeclared exception!
      period0.normalizedStandard(periodType0);
  }
}