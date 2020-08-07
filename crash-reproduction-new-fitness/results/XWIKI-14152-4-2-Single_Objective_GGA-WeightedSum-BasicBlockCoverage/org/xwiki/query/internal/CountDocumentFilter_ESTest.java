/*
 * This file was automatically generated by EvoSuite
 * Thu May 14 12:41:57 UTC 2020
 */

package org.xwiki.query.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.xwiki.query.internal.CountDocumentFilter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class CountDocumentFilter_ESTest extends CountDocumentFilter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CountDocumentFilter countDocumentFilter0 = new CountDocumentFilter();
      Logger logger0 = mock(Logger.class, new ViolatedAssumptionAnswer());
      Injector.inject(countDocumentFilter0, (Class<?>) CountDocumentFilter.class, "logger", (Object) logger0);
      Injector.validateBean(countDocumentFilter0, (Class<?>) CountDocumentFilter.class);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      countDocumentFilter0.filterResults(linkedList0);
      countDocumentFilter0.filterStatement("", "");
      countDocumentFilter0.filterStatement("", "");
      countDocumentFilter0.filterStatement("m<j~A", "Qx/yyFp+");
      CountDocumentFilter countDocumentFilter1 = new CountDocumentFilter();
      Logger logger1 = mock(Logger.class, new ViolatedAssumptionAnswer());
      Injector.inject(countDocumentFilter1, (Class<?>) CountDocumentFilter.class, "logger", (Object) logger1);
      Injector.validateBean(countDocumentFilter1, (Class<?>) CountDocumentFilter.class);
      CountDocumentFilter countDocumentFilter2 = new CountDocumentFilter();
      Logger logger2 = mock(Logger.class, new ViolatedAssumptionAnswer());
      Injector.inject(countDocumentFilter2, (Class<?>) CountDocumentFilter.class, "logger", (Object) logger2);
      Injector.validateBean(countDocumentFilter2, (Class<?>) CountDocumentFilter.class);
      // Undeclared exception!
      countDocumentFilter1.filterStatement("", "hql");
  }
}