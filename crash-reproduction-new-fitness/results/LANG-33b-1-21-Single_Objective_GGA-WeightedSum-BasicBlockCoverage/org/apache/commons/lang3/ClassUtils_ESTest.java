/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 17:03:19 UTC 2020
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Array;
import org.apache.commons.lang3.ClassUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class ClassUtils_ESTest extends ClassUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<Integer> class0 = Integer.TYPE;
      ClassUtils classUtils0 = new ClassUtils();
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 1);
      ClassUtils.isAssignable(classArray0, classArray0);
      // Undeclared exception!
      ClassUtils.toClass(classArray0);
  }
}