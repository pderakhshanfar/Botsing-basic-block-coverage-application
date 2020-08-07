/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 01:24:35 UTC 2020
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
      LocaleUtils localeUtils0 = new LocaleUtils();
      LocaleUtils localeUtils1 = new LocaleUtils();
      LocaleUtils.isAvailableLocale((Locale) null);
      String string0 = "Invalid locale format: ";
      LocaleUtils.languagesByCountry("Invalid locale format: ");
      LocaleUtils localeUtils2 = new LocaleUtils();
      LocaleUtils.localeLookupList((Locale) null, (Locale) null);
      LocaleUtils.availableLocaleSet();
      LocaleUtils.countriesByLanguage("Invalid locale format: ");
      // Undeclared exception!
      LocaleUtils.toLocale("Invalid locale format: ");
  }
}