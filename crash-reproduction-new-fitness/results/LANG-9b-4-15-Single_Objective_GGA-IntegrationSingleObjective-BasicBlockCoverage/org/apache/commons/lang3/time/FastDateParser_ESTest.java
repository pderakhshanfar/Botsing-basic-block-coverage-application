/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 11:40:20 UTC 2020
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
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = new Locale("]");
      FastDateParser fastDateParser0 = new FastDateParser("]", timeZone0, locale0);
      TimeZone timeZone1 = TimeZone.getDefault();
      Locale locale1 = FastDateParser.JAPANESE_IMPERIAL;
      fastDateParser0.toString();
      FastDateParser fastDateParser1 = new FastDateParser("GMTPRT", timeZone1, locale1);
  }
}