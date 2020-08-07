/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 16:03:16 GMT+00:00 2020
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.apache.commons.lang3.time.FastDateParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class FastDateParser_ESTest extends FastDateParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TimeZone.getTimeZone("");
      String string0 = "GMT";
      Locale.Category locale_Category0 = Locale.Category.DISPLAY;
      Locale.getDefault(locale_Category0);
      Locale.Category locale_Category1 = Locale.Category.DISPLAY;
      Locale.getDefault(locale_Category1);
      int int0 = 108;
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(108, "Invalid pattern");
      Locale locale0 = FastDateParser.JAPANESE_IMPERIAL;
      FastDateParser fastDateParser0 = new FastDateParser("GMTAST", simpleTimeZone0, locale0);
  }
}