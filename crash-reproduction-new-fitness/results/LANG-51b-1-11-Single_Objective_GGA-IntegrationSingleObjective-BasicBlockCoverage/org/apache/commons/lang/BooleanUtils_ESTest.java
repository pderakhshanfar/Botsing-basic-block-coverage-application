/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 21:36:13 UTC 2020
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
      BooleanUtils.isFalse((Boolean) null);
      BooleanUtils.toBoolean("!X ");
      Boolean boolean0 = Boolean.FALSE;
      BooleanUtils.isNotTrue((Boolean) null);
      Boolean.getBoolean("!X ");
      BooleanUtils.toBoolean("tKe");
      Boolean.getBoolean("!X ");
      Boolean.getBoolean("tKe");
      Boolean.logicalAnd(true, true);
      BooleanUtils.toBooleanDefaultIfNull((Boolean) null, true);
      BooleanUtils.toBoolean("PU");
      BooleanUtils.isNotTrue(boolean0);
      BooleanUtils.toBoolean("yes");
      BooleanUtils.toBoolean((Boolean) null);
      BooleanUtils.toBoolean((String) null);
      BooleanUtils.toBooleanObject(true);
      BooleanUtils.toBoolean("YH;9,k");
      Boolean boolean1 = new Boolean("!X ");
      // Undeclared exception!
      BooleanUtils.toBoolean("tru");
  }
}