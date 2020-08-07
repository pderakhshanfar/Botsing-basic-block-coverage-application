/*
 * This file was automatically generated by EvoSuite
 * Thu May 14 20:55:08 UTC 2020
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
      String string0 = "";
      WordUtils.uncapitalize("");
      WordUtils.abbreviate("", 1, 5, "");
      char[] charArray0 = new char[4];
      charArray0[0] = 'A';
      charArray0[1] = '8';
      charArray0[2] = 'R';
      char char0 = 'd';
      charArray0[3] = 'd';
      WordUtils.initials("OS/2", charArray0);
      // Undeclared exception!
      WordUtils.abbreviate("OS/2", 5, 2302, "KXH]D:%:Kz-iZD/");
  }
}