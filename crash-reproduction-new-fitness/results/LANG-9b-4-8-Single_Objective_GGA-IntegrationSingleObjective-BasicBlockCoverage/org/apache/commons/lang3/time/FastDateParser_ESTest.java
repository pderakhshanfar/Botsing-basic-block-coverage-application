/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 11:36:04 GMT+00:00 2020
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
      int int0 = (-1);
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-1), "N$<0'aFKv");
      Locale locale0 = FastDateParser.JAPANESE_IMPERIAL;
      String string0 = "GMTVST";
      FastDateParser fastDateParser0 = new FastDateParser("GMTVST", simpleTimeZone0, locale0);
  }
}