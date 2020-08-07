/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 00:24:37 UTC 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import org.joda.time.MutablePeriod;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseChronology_ESTest extends BaseChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      LocalDateTime localDateTime0 = new LocalDateTime((-40L));
      // Undeclared exception!
      ethiopicChronology0.set(localDateTime0, (-1592000L));
  }
}