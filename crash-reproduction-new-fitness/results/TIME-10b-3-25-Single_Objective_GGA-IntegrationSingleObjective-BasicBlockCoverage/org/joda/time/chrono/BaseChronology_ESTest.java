/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 04:44:19 UTC 2020
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
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.IslamicChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseChronology_ESTest extends BaseChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0);
      islamicChronology0.dayOfYear();
      islamicChronology0.getZone();
      buddhistChronology0.days();
      buddhistChronology0.millisOfSecond();
      islamicChronology0.getZone();
      islamicChronology0.days();
      islamicChronology0.yearOfCentury();
      Chronology chronology0 = buddhistChronology0.getBase();
      LocalDate localDate0 = new LocalDate((-1L), chronology0);
      LocalDate localDate1 = localDate0.plusMonths((-9));
      // Undeclared exception!
      islamicChronology0.set(localDate1, (-12219033600000L));
  }
}