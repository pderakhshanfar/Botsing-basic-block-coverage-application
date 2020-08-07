/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 17:03:49 UTC 2020
 */

package org.mockito.internal.invocation;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mockito.internal.invocation.Invocation;
import org.mockito.internal.invocation.MockitoMethod;
import org.mockito.internal.invocation.realmethod.RealMethod;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Invocation_ESTest extends Invocation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Object object0 = new Object();
      MockitoMethod mockitoMethod0 = mock(MockitoMethod.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(mockitoMethod0).toString();
      doReturn(false).when(mockitoMethod0).isVarArgs();
      Object[] objectArray0 = new Object[6];
      objectArray0[0] = (Object) mockitoMethod0;
      objectArray0[1] = objectArray0[0];
      objectArray0[2] = object0;
      objectArray0[3] = object0;
      objectArray0[4] = object0;
      objectArray0[5] = object0;
      Invocation invocation0 = new Invocation(object0, mockitoMethod0, objectArray0, (-478), (RealMethod) null);
      invocation0.getMethod();
      try { 
        invocation0.callRealMethod();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.internal.invocation.Invocation", e);
      }
  }
}