/*
 * This file was automatically generated by EvoSuite
 * Thu May 14 20:27:02 UTC 2020
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.StringUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class StringUtils_ESTest extends StringUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StringUtils.substringBetween("Eh,=|GWAnK(", "Eh,=|GWAnK(", "Eh,=|GWAnK(");
      StringUtils.isNotEmpty((CharSequence) null);
      String[] stringArray0 = new String[4];
      stringArray0[0] = null;
      stringArray0[1] = "Eh,=|GWAnK(";
      stringArray0[2] = null;
      stringArray0[3] = "sIZZ|x-qJ.Ju[!gDJY";
      // Undeclared exception!
      StringUtils.replaceEach("Eh,=|GWAnK(", stringArray0, stringArray0);
  }
}