/*
 * This file was automatically generated by EvoSuite
 * Thu May 14 12:37:05 UTC 2020
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
      Class<Float>[] classArray0 = (Class<Float>[]) Array.newInstance(Class.class, 2);
      Class<Float> class0 = Float.class;
      classArray0[0] = class0;
      Class<Float> class1 = Float.TYPE;
      ClassUtils.getPackageCanonicalName(class1);
      // Undeclared exception!
      ClassUtils.toClass(classArray0);
  }
}