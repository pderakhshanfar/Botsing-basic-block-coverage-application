/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 18:24:01 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.MutablePeriod;
import org.joda.time.PeriodType;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class PeriodType_ESTest extends PeriodType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PeriodType periodType0 = PeriodType.days();
      MutablePeriod mutablePeriod0 = new MutablePeriod((Object) null);
      MutablePeriod mutablePeriod1 = mutablePeriod0.copy();
      int[] intArray0 = new int[8];
      intArray0[0] = 4;
      intArray0[1] = 4;
      intArray0[2] = 4;
      intArray0[3] = 4;
      intArray0[4] = 4;
      intArray0[5] = (-1245);
      intArray0[6] = 4;
      intArray0[7] = 4;
      // Undeclared exception!
      periodType0.setIndexedField(mutablePeriod1, 4, intArray0, 5853);
  }
}