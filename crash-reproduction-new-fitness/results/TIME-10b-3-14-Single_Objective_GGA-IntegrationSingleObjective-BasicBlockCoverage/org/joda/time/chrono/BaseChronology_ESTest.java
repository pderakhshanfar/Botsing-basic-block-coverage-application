/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 00:26:10 UTC 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.MonthDay;
import org.joda.time.Period;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.chrono.IslamicChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseChronology_ESTest extends BaseChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      Period period0 = Period.years(2);
      period0.minusMillis((-768));
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      islamicChronology0.getYearDifference(2, 1999L);
      Date date0 = new Date((-2383L));
      MonthDay monthDay0 = MonthDay.fromDateFields(date0);
      // Undeclared exception!
      islamicChronology0.set(monthDay0, 1999L);
  }
}