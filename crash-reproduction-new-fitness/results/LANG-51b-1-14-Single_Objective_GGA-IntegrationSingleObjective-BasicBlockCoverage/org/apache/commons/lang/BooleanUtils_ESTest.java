/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 21:33:33 UTC 2020
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
      BooleanUtils booleanUtils0 = new BooleanUtils();
      BooleanUtils.toBoolean("yes", "yes", "");
      BooleanUtils.toString(true, "bTVrY", " is not a valid number.");
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      BooleanUtils.toStringOnOff(boolean0);
      BooleanUtils.toIntegerObject((Boolean) null);
      BooleanUtils.toBooleanObject(46);
      BooleanUtils.toIntegerObject(false);
      BooleanUtils.toBoolean("off");
      // Undeclared exception!
      BooleanUtils.toBoolean("tru");
  }
}