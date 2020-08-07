/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 21:35:26 UTC 2020
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.lang3.LocaleUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class LocaleUtils_ESTest extends LocaleUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      LocaleUtils.localeLookupList(locale0, locale0);
      String string0 = "j^2G>E~";
      Locale locale1 = Locale.forLanguageTag("j^2G>E~");
      LocaleUtils.localeLookupList(locale1);
      // Undeclared exception!
      LocaleUtils.toLocale("j^2G>E~");
  }
}