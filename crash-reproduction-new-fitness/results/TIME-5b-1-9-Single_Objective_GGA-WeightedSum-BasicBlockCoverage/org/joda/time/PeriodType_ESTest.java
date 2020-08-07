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
import org.joda.time.Months;
import org.joda.time.PeriodType;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class PeriodType_ESTest extends PeriodType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearMonthDay();
      PeriodType periodType1 = PeriodType.hours();
      Months months0 = Months.FOUR;
      int[] intArray0 = new int[7];
      intArray0[0] = 0;
      intArray0[1] = 0;
      intArray0[2] = 0;
      intArray0[3] = 0;
      intArray0[4] = 0;
      intArray0[5] = 0;
      intArray0[6] = 0;
      int int0 = 2;
      periodType0.setIndexedField(months0, 0, intArray0, 2);
      PeriodType.weeks();
      periodType0.getFieldType(0);
      // Undeclared exception!
      periodType1.setIndexedField(months0, 0, intArray0, (-829));
  }
}