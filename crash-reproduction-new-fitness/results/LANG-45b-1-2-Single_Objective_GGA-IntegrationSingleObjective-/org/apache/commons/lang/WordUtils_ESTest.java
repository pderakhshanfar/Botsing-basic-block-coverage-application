/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 21:35:04 UTC 2020
 */

package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang.WordUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class WordUtils_ESTest extends WordUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      char[] charArray0 = new char[3];
      charArray0[0] = '4';
      charArray0[1] = '\'';
      charArray0[2] = ')';
      WordUtils.capitalize(" ", charArray0);
      // Undeclared exception!
      WordUtils.abbreviate("Lh$w^(e~", (-2150), (-2150), " ");
  }
}