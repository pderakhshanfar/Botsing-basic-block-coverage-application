/*
 * This file was automatically generated by EvoSuite
 * Fri May 15 12:19:55 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.PeriodType;
import org.joda.time.ReadablePeriod;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class PeriodType_ESTest extends PeriodType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PeriodType periodType0 = PeriodType.dayTime();
      PeriodType.yearDay();
      PeriodType.days();
      PeriodType periodType1 = PeriodType.years();
      periodType1.getFieldType(0);
      PeriodType.hours();
      int[] intArray0 = new int[7];
      intArray0[0] = 10080;
      intArray0[1] = 0;
      intArray0[2] = 0;
      intArray0[3] = 0;
      intArray0[4] = 0;
      intArray0[5] = 0;
      intArray0[6] = 0;
      // Undeclared exception!
      periodType0.setIndexedField((ReadablePeriod) null, 0, intArray0, 0);
  }
}