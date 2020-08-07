/*
 * This file was automatically generated by EvoSuite
 * Thu May 14 20:58:17 UTC 2020
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
      LocaleUtils.isAvailableLocale((Locale) null);
      LocaleUtils localeUtils0 = new LocaleUtils();
      LocaleUtils.availableLocaleSet();
      LocaleUtils.countriesByLanguage((String) null);
      LocaleUtils.toLocale((String) null);
      LocaleUtils.countriesByLanguage((String) null);
      String string0 = "e$0=5^sov%";
      LocaleUtils.languagesByCountry("e$0=5^sov%");
      // Undeclared exception!
      LocaleUtils.toLocale("e$0=5^sov%");
  }
}