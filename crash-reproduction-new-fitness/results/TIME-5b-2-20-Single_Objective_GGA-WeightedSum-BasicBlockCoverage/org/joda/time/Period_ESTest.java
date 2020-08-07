/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 16:45:29 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.Instant;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PeriodType periodType0 = PeriodType.minutes();
      Period period0 = new Period(1284L, 1284L, periodType0);
      Instant instant0 = new Instant();
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      instant0.toDateTime();
      period0.plusMonths(0);
      // Undeclared exception!
      period0.withYears(0);
  }
}