/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 21:25:19 UTC 2020
 */

package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.io.Writer;
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
      char char0 = '&';
      char char1 = ' ';
      char char2 = '#';
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      numericEntityUnescaper0.with(charSequenceTranslatorArray0);
      NumericEntityUnescaper numericEntityUnescaper1 = new NumericEntityUnescaper();
      int int0 = 3;
      int int1 = 117;
      StringWriter stringWriter0 = new StringWriter(65535);
      StringWriter stringWriter1 = stringWriter0.append('e');
      char[] charArray0 = new char[7];
      charArray0[0] = ' ';
      charArray0[1] = ' ';
      charArray0[2] = '#';
      charArray0[3] = '&';
      charArray0[4] = '&';
      charArray0[5] = '#';
      charArray0[6] = ' ';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      CharBuffer charBuffer1 = CharBuffer.wrap((CharSequence) charBuffer0);
      StringWriter stringWriter2 = stringWriter1.append((CharSequence) charBuffer1);
      StringBuffer stringBuffer0 = stringWriter2.getBuffer();
      // Undeclared exception!
      numericEntityUnescaper1.translate((CharSequence) stringBuffer0, (Writer) stringWriter1);
  }
}