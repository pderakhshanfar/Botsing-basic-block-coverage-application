/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 21:32:37 UTC 2020
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
      char[] charArray0 = new char[4];
      charArray0[0] = '5';
      charArray0[1] = 'P';
      charArray0[2] = 'B';
      charArray0[3] = '4';
      WordUtils.capitalize("", charArray0);
      WordUtils.abbreviate("", 2, 2, "");
      WordUtils.capitalize("");
      WordUtils.swapCase("");
      WordUtils.uncapitalize("6LmR\"h5]I}g;JP0Nf^'");
      String string0 = "";
      WordUtils.abbreviate("xWg} XQe;rf#", 0, 0, "");
      WordUtils.wrap("", 2, "", false);
      int int0 = (-710);
      // Undeclared exception!
      WordUtils.abbreviate("Cim", 3085, (-710), "");
  }
}