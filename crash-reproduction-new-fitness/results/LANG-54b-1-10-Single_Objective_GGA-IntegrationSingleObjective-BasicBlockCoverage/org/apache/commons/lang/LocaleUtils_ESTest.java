/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 21:38:08 UTC 2020
 */

package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
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
      LinkedList<LinkedList<String>> linkedList0 = new LinkedList<LinkedList<String>>();
      LinkedList<Object> linkedList1 = new LinkedList<Object>();
      LinkedList<Object> linkedList2 = new LinkedList<Object>();
      LinkedList<Object> linkedList3 = new LinkedList<Object>();
      LinkedList<Object> linkedList4 = new LinkedList<Object>();
      LinkedList<Object> linkedList5 = new LinkedList<Object>();
      LinkedList<Object> linkedList6 = new LinkedList<Object>();
      LocaleUtils.availableLocaleSet();
      Locale locale0 = Locale.CANADA_FRENCH;
      LocaleUtils.localeLookupList(locale0);
      // Undeclared exception!
      LocaleUtils.toLocale("vq_}1`oGXeU~q2fw");
  }
}