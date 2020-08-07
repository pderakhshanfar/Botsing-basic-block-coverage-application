/*
 * This file was automatically generated by EvoSuite
 * Thu May 14 11:36:35 GMT+00:00 2020
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.ParsePosition;
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
      String string0 = "";
      Locale locale0 = Locale.CANADA_FRENCH;
      String string1 = "GMTPL+T";
      int int0 = 103;
      ParsePosition parsePosition0 = new ParsePosition(103);
      Locale locale1 = null;
      Locale locale2 = FastDateParser.JAPANESE_IMPERIAL;
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(103, "");
      TimeZone.getDefault();
      Integer integer0 = new Integer(103);
      simpleTimeZone0.getDisplayName(locale0);
      FastDateParser fastDateParser0 = new FastDateParser("GMTPL+T", simpleTimeZone0, locale2);
  }
}