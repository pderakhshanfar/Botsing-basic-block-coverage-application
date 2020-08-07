/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 16:00:19 UTC 2020
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
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
      Locale locale0 = Locale.CHINESE;
      Locale locale1 = Locale.ITALIAN;
      Locale locale2 = Locale.JAPAN;
      String string0 = "GMTBET";
      TimeZone timeZone0 = TimeZone.getDefault();
      FastDateParser fastDateParser0 = new FastDateParser("GMTBET", timeZone0, locale2);
      fastDateParser0.getParsePattern();
      TimeZone.getDefault();
      Locale locale3 = FastDateParser.JAPANESE_IMPERIAL;
      FastDateParser fastDateParser1 = new FastDateParser("GMTBET", timeZone0, locale3);
  }
}