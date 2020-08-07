/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 13:17:07 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Duration;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.TestBaseSingleFieldPeriod;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Duration duration0 = new Duration((Object) null);
      Period period0 = new Period(duration0, (ReadableInstant) null);
      Period period1 = period0.minusMonths(1417);
      TestBaseSingleFieldPeriod.Single testBaseSingleFieldPeriod_Single0 = new TestBaseSingleFieldPeriod.Single(1417);
      PeriodType periodType0 = testBaseSingleFieldPeriod_Single0.getPeriodType();
      // Undeclared exception!
      period1.normalizedStandard(periodType0);
  }
}