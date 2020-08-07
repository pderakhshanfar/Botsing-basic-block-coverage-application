/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 18 06:27:39 UTC 2020
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
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Period period0 = new Period(3540L, (Chronology) null);
      Period period1 = period0.withYears((-1768));
      PeriodType periodType0 = PeriodType.dayTime();
      // Undeclared exception!
      period1.normalizedStandard(periodType0);
  }
}