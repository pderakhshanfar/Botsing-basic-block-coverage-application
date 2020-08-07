/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 01:33:44 UTC 2020
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
      StringUtils.stripToNull("");
      StringUtils.stripToEmpty((String) null);
      StringUtils.removeEnd((String) null, "@vqZY@");
      StringUtils.mid((String) null, 0, 0);
      StringUtils.trimToNull((String) null);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "s$}5kqv";
      stringArray0[1] = null;
      stringArray0[2] = "";
      stringArray0[3] = null;
      stringArray0[4] = "@vqZY@";
      stringArray0[5] = null;
      stringArray0[6] = null;
      stringArray0[7] = "s$}5kqv";
      stringArray0[8] = "s$}5kqv";
      // Undeclared exception!
      StringUtils.replaceEach("s$}5kqv", stringArray0, stringArray0);
  }
}