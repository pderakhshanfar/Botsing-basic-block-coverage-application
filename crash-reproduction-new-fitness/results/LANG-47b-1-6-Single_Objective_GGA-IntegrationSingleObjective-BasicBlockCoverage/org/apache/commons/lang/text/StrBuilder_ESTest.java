/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 21:05:03 UTC 2020
 */

package org.apache.commons.lang.text;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang.text.StrBuilder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class StrBuilder_ESTest extends StrBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder strBuilder1 = new StrBuilder(";3-gaq1U[rII");
      StrBuilder strBuilder2 = strBuilder0.appendln((Object) strBuilder1);
      char[] charArray0 = new char[3];
      charArray0[0] = 'o';
      charArray0[1] = ')';
      charArray0[2] = '(';
      StrBuilder strBuilder3 = strBuilder2.insert(9, charArray0);
      strBuilder0.size();
      StrBuilder strBuilder4 = strBuilder3.appendln(true);
      StrBuilder strBuilder5 = new StrBuilder();
      StrBuilder strBuilder6 = strBuilder4.appendFixedWidthPadLeft((Object) strBuilder5, 16, '?');
      // Undeclared exception!
      strBuilder6.appendFixedWidthPadLeft((Object) null, 32, '(');
  }
}