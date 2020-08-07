/*
 * This file was automatically generated by EvoSuite
 * Fri May 15 12:19:13 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 1000;
      Period period0 = new Period(6, 6, 6, 6, 6, 1000, 1000, 0);
      PeriodType periodType0 = PeriodType.seconds();
      // Undeclared exception!
      period0.normalizedStandard(periodType0);
  }
}