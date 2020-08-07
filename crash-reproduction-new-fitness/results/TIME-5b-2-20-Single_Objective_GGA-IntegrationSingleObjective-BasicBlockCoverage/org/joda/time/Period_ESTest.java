/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 18:43:28 BST 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DurationFieldType;
import org.joda.time.Minutes;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.DAYS_TYPE;
      Minutes minutes0 = Minutes.MIN_VALUE;
      Period period0 = new Period();
      period0.withYears(1412);
      PeriodType periodType0 = minutes0.getPeriodType();
      Integer integer0 = new Integer((-289));
      Period period1 = new Period(minutes0, periodType0);
      // Undeclared exception!
      period1.withYears(1412);
  }
}