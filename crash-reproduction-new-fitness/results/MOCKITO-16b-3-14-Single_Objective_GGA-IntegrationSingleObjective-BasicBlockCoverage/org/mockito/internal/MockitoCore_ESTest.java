/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 23:30:26 UTC 2020
 */

package org.mockito.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.internal.MockitoCore;
import org.mockito.internal.creation.MockitoMethodProxy;
import org.mockito.internal.invocation.realmethod.FilteredCGLIBProxyRealMethod;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class MockitoCore_ESTest extends MockitoCore_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockitoCore mockitoCore0 = new MockitoCore();
      Object[] objectArray0 = new Object[0];
      FilteredCGLIBProxyRealMethod filteredCGLIBProxyRealMethod0 = new FilteredCGLIBProxyRealMethod((MockitoMethodProxy) null);
      FilteredCGLIBProxyRealMethod filteredCGLIBProxyRealMethod1 = new FilteredCGLIBProxyRealMethod(filteredCGLIBProxyRealMethod0);
      FilteredCGLIBProxyRealMethod filteredCGLIBProxyRealMethod2 = new FilteredCGLIBProxyRealMethod(filteredCGLIBProxyRealMethod1);
      // Undeclared exception!
      mockitoCore0.when((Object) null);
  }
}