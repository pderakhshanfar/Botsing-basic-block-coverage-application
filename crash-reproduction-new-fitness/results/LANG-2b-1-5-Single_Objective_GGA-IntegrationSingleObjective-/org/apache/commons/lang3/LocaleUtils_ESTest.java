/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 21:33:02 UTC 2020
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import org.apache.commons.lang3.LocaleUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class LocaleUtils_ESTest extends LocaleUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      List<Locale> list0 = LocaleUtils.countriesByLanguage("E+m-7)A>$-LticwPEm");
      Locale.lookup(linkedList0, list0);
      LocaleUtils.localeLookupList((Locale) null, (Locale) null);
      LocaleUtils.languagesByCountry("lS_lo})of]qGML<");
      LocaleUtils.countriesByLanguage("lS_lo})of]qGML<");
      LocaleUtils.isAvailableLocale((Locale) null);
      LocaleUtils localeUtils0 = new LocaleUtils();
      LocaleUtils.countriesByLanguage("");
      LocaleUtils.languagesByCountry("");
      LocaleUtils.localeLookupList((Locale) null, (Locale) null);
      LocaleUtils.localeLookupList((Locale) null, (Locale) null);
      LocaleUtils.availableLocaleSet();
      LocaleUtils.isAvailableLocale((Locale) null);
      LocaleUtils.localeLookupList((Locale) null, (Locale) null);
      LocaleUtils.localeLookupList((Locale) null);
      LocaleUtils.localeLookupList((Locale) null);
      LocaleUtils.languagesByCountry("W=6aJ9m,[`e)ogX<n*/");
      LocaleUtils.localeLookupList((Locale) null, (Locale) null);
      // Undeclared exception!
      LocaleUtils.toLocale("");
  }
}