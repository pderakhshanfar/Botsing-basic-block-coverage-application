/*
 * This file was automatically generated by EvoSuite
 * Thu May 14 20:49:11 UTC 2020
 */

package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.nio.CharBuffer;
import org.apache.commons.lang3.text.translate.CharSequenceTranslator;
import org.apache.commons.lang3.text.translate.NumericEntityUnescaper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class NumericEntityUnescaper_ESTest extends NumericEntityUnescaper_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[10];
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = new StringWriter();
      char[] charArray0 = new char[8];
      charArray0[0] = '#';
      charArray0[1] = '#';
      charArray0[2] = '&';
      charArray0[3] = '&';
      charArray0[4] = '#';
      StringWriter stringWriter2 = new StringWriter();
      StringWriter stringWriter3 = new StringWriter();
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      int int0 = 10;
      NumericEntityUnescaper numericEntityUnescaper1 = new NumericEntityUnescaper();
      int int1 = 823;
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      StringWriter stringWriter4 = stringWriter3.append((CharSequence) charBuffer0);
      StringBuffer stringBuffer0 = stringWriter4.getBuffer();
      // Undeclared exception!
      numericEntityUnescaper0.translate((CharSequence) stringBuffer0);
  }
}