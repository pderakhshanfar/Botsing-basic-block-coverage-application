/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 21:09:43 UTC 2020
 */

package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Locale;
import org.apache.commons.lang.LocaleUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class LocaleUtils_ESTest extends LocaleUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      Locale.lookup(linkedList0, (Collection<Locale>) null);
      LocaleUtils.isAvailableLocale((Locale) null);
      LocaleUtils.isAvailableLocale((Locale) null);
      LocaleUtils localeUtils0 = new LocaleUtils();
      LocaleUtils localeUtils1 = new LocaleUtils();
      LocaleUtils.isAvailableLocale((Locale) null);
      LocaleUtils.isAvailableLocale((Locale) null);
  }
}