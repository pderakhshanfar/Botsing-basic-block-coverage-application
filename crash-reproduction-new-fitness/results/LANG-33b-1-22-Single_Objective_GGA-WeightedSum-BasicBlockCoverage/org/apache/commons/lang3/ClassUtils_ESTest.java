/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 17:03:14 UTC 2020
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.ClassUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class ClassUtils_ESTest extends ClassUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ClassUtils.getPackageName((Object) null, "[m#!O@h2");
      ClassUtils classUtils0 = new ClassUtils();
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) "[m#!O@h2";
      objectArray0[1] = (Object) classUtils0;
      objectArray0[2] = (Object) "[m#!O@h2";
      objectArray0[3] = (Object) classUtils0;
      objectArray0[4] = (Object) "[m#!O@h2";
      objectArray0[5] = null;
      objectArray0[6] = (Object) "[m#!O@h2";
      objectArray0[7] = null;
      // Undeclared exception!
      ClassUtils.toClass(objectArray0);
  }
}