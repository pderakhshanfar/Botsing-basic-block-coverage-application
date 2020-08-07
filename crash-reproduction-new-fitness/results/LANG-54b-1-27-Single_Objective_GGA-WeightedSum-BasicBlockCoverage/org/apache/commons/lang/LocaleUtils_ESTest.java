/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 01:26:54 UTC 2020
 */

package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.apache.commons.lang.LocaleUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class LocaleUtils_ESTest extends LocaleUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Locale locale0 = Locale.GERMANY;
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      LinkedList<Object> linkedList1 = new LinkedList<Object>();
      LinkedList<String> linkedList2 = new LinkedList<String>();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.MAP_EXTENDED_RANGES;
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) linkedList2, locale_FilteringMode0);
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      Locale.getISOCountries();
      Locale.lookupTag(linkedList0, set0);
      Locale.lookupTag(linkedList0, set0);
      LocaleUtils.localeLookupList(locale0, locale0);
      LocaleUtils localeUtils0 = new LocaleUtils();
      Locale locale1 = LocaleUtils.toLocale("sq");
      LocaleUtils.localeLookupList(locale0, (Locale) null);
      Locale.lookupTag(linkedList0, list0);
      LocaleUtils localeUtils1 = new LocaleUtils();
      LocaleUtils.toLocale((String) null);
      LocaleUtils.localeLookupList(locale1, (Locale) null);
      // Undeclared exception!
      LocaleUtils.toLocale("ob_%cDudx-~N");
  }
}