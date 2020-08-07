/*
 * This file was automatically generated by EvoSuite
 * Wed May 13 17:38:11 GMT-18:00 2020
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import java.util.SimpleTimeZone;
import org.apache.commons.lang3.time.FastDateParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class FastDateParser_ESTest extends FastDateParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      Locale locale1 = FastDateParser.JAPANESE_IMPERIAL;
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(2, "GMTVST");
      FastDateParser fastDateParser0 = new FastDateParser("GMTVST", simpleTimeZone0, locale1);
  }
}