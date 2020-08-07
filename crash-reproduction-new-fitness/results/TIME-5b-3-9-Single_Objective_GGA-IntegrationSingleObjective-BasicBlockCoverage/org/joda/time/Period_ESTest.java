/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 13:18:28 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DurationFieldType;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.Years;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 2441;
      Period period0 = Period.minutes(2441);
      Years years0 = Years.MIN_VALUE;
      Period period1 = period0.plus(years0);
      DurationFieldType durationFieldType0 = DurationFieldType.MONTHS_TYPE;
      Period period2 = period1.withField(durationFieldType0, 2441);
      PeriodType periodType0 = PeriodType.days();
      // Undeclared exception!
      period2.normalizedStandard(periodType0);
  }
}