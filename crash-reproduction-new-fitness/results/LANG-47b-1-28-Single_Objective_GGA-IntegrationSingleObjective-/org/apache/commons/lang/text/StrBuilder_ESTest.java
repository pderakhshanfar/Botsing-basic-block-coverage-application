/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 01:32:26 UTC 2020
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
      StrBuilder strBuilder0 = new StrBuilder(2969);
      StrBuilder strBuilder1 = strBuilder0.appendln((double) 2969);
      strBuilder1.indexOf('9');
      strBuilder0.toString();
      StrBuilder strBuilder2 = new StrBuilder();
      strBuilder0.deleteAll('@');
      strBuilder1.appendFixedWidthPadLeft((Object) "2969.0\n", 5, 'p');
      int int0 = 3801;
      // Undeclared exception!
      strBuilder2.appendFixedWidthPadLeft((Object) null, 114, '@');
  }
}