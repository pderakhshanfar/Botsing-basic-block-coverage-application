/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 15:59:07 UTC 2020
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.ParsePosition;
import java.util.Locale;
import java.util.TimeZone;
import org.apache.commons.lang3.time.FastDateParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class FastDateParser_ESTest extends FastDateParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("GMTAET");
      Locale locale0 = Locale.JAPANESE;
      FastDateParser fastDateParser0 = new FastDateParser("GMT", timeZone0, locale0);
      TimeZone timeZone1 = TimeZone.getDefault();
      Locale locale1 = Locale.ENGLISH;
      FastDateParser fastDateParser1 = new FastDateParser("GMT", timeZone1, locale0);
      ParsePosition parsePosition0 = new ParsePosition(604);
      Locale locale2 = FastDateParser.JAPANESE_IMPERIAL;
      FastDateParser fastDateParser2 = new FastDateParser("GMTAET", timeZone1, locale2);
  }
}