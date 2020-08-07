/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 13:22:54 UTC 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeFieldType;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket_ESTest extends DateTimeParserBucket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
      Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) set0, locale_FilteringMode0);
      Locale locale1 = Locale.getDefault();
      int int0 = 292278409;
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      locale1.getDisplayScript();
      Integer integer0 = new Integer((-23));
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(292278409, gregorianChronology0, locale1, integer0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 292278409);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "");
  }
}