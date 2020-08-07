/*
 * This file was automatically generated by EvoSuite
 * Thu May 14 20:28:00 UTC 2020
 */

package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Locale;
import org.apache.commons.lang.LocaleUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class LocaleUtils_ESTest extends LocaleUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      LocaleUtils.localeLookupList(locale0);
      LocaleUtils.availableLocaleList();
      LocaleUtils.availableLocaleList();
      Locale locale1 = Locale.SIMPLIFIED_CHINESE;
      LocaleUtils.isAvailableLocale(locale1);
      LocaleUtils.localeLookupList(locale1);
      LocaleUtils.availableLocaleSet();
      LocaleUtils.isAvailableLocale(locale1);
  }
}