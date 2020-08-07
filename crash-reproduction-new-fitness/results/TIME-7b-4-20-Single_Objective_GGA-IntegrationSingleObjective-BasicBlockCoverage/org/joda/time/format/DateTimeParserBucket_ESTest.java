/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 17:45:21 UTC 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket_ESTest extends DateTimeParserBucket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DurationField durationField0 = mock(DurationField.class, new ViolatedAssumptionAnswer());
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((DateTimeZone) null).when(chronology0).getZone();
      doReturn((Chronology) null).when(chronology0).withUTC();
      CopticChronology.getInstance();
      DateTimeFieldType.secondOfMinute();
      Integer integer0 = new Integer((-2961));
      Integer integer1 = new Integer(776);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1000L, chronology0, (Locale) null, integer1);
      dateTimeParserBucket0.setOffset(integer0);
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.weekOfWeekyear();
      dateTimeParserBucket0.saveField(dateTimeField0, Integer.MIN_VALUE);
      dateTimeParserBucket0.getPivotYear();
      dateTimeParserBucket0.getLocale();
      dateTimeParserBucket0.saveState();
      dateTimeParserBucket0.restoreState(dateTimeField0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, (String) null);
  }
}