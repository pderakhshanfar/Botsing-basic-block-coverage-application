/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 00:16:56 UTC 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.Minutes;
import org.joda.time.Period;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.IslamicChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseChronology_ESTest extends BaseChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      LocalDate localDate0 = new LocalDate((-7200000L), (DateTimeZone) null);
      Period period0 = new Period();
      localDate0.withPeriodAdded(period0, 1970);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      LocalDate localDate1 = LocalDate.now((Chronology) islamicChronology0);
      gregorianChronology0.set(localDate1, (-7200000L));
      // Undeclared exception!
      Minutes.minutesBetween((ReadablePartial) localDate1, (ReadablePartial) localDate0);
  }
}