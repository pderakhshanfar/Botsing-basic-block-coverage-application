/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 01:13:26 UTC 2020
 */

package org.apache.commons.lang3.math;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.math.NumberUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class NumberUtils_ESTest extends NumberUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = null;
      NumberUtils.toDouble((String) null, 2007.521689378);
      NumberUtils.toLong((String) null);
      NumberUtils.toFloat("");
      String string1 = "";
      NumberUtils.toInt("", 2328);
      NumberUtils numberUtils0 = new NumberUtils();
      NumberUtils.toByte("");
      NumberUtils.toLong("");
      NumberUtils.toLong((String) null);
      NumberUtils.toFloat((String) null);
      NumberUtils.createInteger((String) null);
      NumberUtils.toInt((String) null, (int) (byte)0);
      NumberUtils.toDouble((String) null, (-1882.7026));
      NumberUtils.createBigDecimal((String) null);
      NumberUtils.max((-1.0), 153.17501780599966, (double) 2328);
      // Undeclared exception!
      NumberUtils.createInteger("");
  }
}