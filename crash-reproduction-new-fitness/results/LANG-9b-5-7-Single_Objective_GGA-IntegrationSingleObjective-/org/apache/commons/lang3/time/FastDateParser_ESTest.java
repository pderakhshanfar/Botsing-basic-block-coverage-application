/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 11:37:48 UTC 2020
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.apache.commons.lang3.time.FastDateParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class FastDateParser_ESTest extends FastDateParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      LinkedList<Locale> linkedList1 = new LinkedList<Locale>();
      Locale.filter((List<Locale.LanguageRange>) linkedList0, (Collection<Locale>) linkedList1);
      Locale locale1 = Locale.CHINA;
      locale0.getDisplayLanguage(locale1);
      TimeZone timeZone0 = mock(TimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(timeZone0).getOffset(anyLong());
      doReturn(0).when(timeZone0).getRawOffset();
      locale0.getDisplayCountry();
      FastDateParser fastDateParser0 = new FastDateParser("GMTCST", timeZone0, locale0);
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-2889), "-9D2V#}Sv5");
      Locale locale2 = Locale.TRADITIONAL_CHINESE;
      FastDateParser fastDateParser1 = new FastDateParser("[f!]H", simpleTimeZone0, locale0);
      Locale locale3 = FastDateParser.JAPANESE_IMPERIAL;
      FastDateParser fastDateParser2 = new FastDateParser("GMTAST", simpleTimeZone0, locale3);
  }
}