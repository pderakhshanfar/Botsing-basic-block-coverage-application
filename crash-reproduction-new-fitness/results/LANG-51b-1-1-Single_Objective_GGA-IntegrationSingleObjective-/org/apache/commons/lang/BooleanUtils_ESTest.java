/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 21:36:12 UTC 2020
 */

package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang.BooleanUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BooleanUtils_ESTest extends BooleanUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      Boolean boolean1 = Boolean.FALSE;
      BooleanUtils.toBoolean("sKzO");
      Boolean boolean2 = Boolean.FALSE;
      Boolean.logicalOr(true, false);
      String string0 = "tru";
      // Undeclared exception!
      BooleanUtils.toBoolean("tru");
  }
}