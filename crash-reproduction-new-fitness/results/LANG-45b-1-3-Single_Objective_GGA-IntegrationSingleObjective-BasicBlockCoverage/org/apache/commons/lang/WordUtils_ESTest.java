/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 21:32:23 UTC 2020
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
      WordUtils.initials(";/fb");
      WordUtils.wrap("Windows 9", (-1), "Solaris", true);
      WordUtils.abbreviate("Windows 9", (-1), (-1), " ");
      WordUtils.capitalizeFully("GAwAU*u=*^/c|S~h");
      WordUtils.abbreviate("WSolarisiSolarisnSolarisdSolarisoSolariswSolarissSolaris9", 0, 2, "Gawau*u=*^/c|s~h");
      WordUtils.swapCase("WSGawau*u=*^/c|s~h");
      WordUtils.wrap("WSolarisiSolarisnSolarisdSolarisoSolariswSolarissSolaris9", 0, "X1|:@3Rb\"d5W0c#-i", true);
      WordUtils.uncapitalize("3");
      char[] charArray0 = new char[3];
      charArray0[0] = '9';
      charArray0[1] = '0';
      charArray0[2] = '^';
      WordUtils.initials("", charArray0);
      WordUtils.initials("7", charArray0);
      WordUtils.abbreviate("2xq]Dk", (-1193), (-1), "");
      WordUtils.capitalizeFully("'oh5*N9e6P%B76+", charArray0);
      // Undeclared exception!
      WordUtils.abbreviate("Solaris", 1169, 1169, "");
  }
}