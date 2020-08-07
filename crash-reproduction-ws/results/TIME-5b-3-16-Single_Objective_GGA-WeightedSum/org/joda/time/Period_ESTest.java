/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 18 06:26:08 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.TestInterval_Basics;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TestInterval_Basics testInterval_Basics0 = new TestInterval_Basics("Duration");
      TestInterval_Basics.MockInterval testInterval_Basics_MockInterval0 = testInterval_Basics0.new MockInterval();
      Period period0 = testInterval_Basics_MockInterval0.toPeriod();
      PeriodType periodType0 = PeriodType.time();
      // Undeclared exception!
      period0.normalizedStandard(periodType0);
  }
}