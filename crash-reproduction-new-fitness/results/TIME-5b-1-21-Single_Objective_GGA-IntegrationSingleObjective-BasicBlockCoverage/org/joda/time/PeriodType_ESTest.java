/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 17:42:54 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Days;
import org.joda.time.Hours;
import org.joda.time.PeriodType;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class PeriodType_ESTest extends PeriodType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Hours hours0 = Hours.EIGHT;
      Days days0 = hours0.toStandardDays();
      PeriodType periodType0 = days0.getPeriodType();
      PeriodType periodType1 = periodType0.withMinutesRemoved();
      periodType1.size();
      int[] intArray0 = new int[8];
      intArray0[0] = 0;
      intArray0[1] = 1;
      intArray0[2] = 1;
      intArray0[3] = 0;
      intArray0[4] = 1;
      intArray0[5] = 0;
      intArray0[6] = 1;
      intArray0[7] = 1;
      // Undeclared exception!
      periodType1.setIndexedField(days0, 0, intArray0, (-64));
  }
}