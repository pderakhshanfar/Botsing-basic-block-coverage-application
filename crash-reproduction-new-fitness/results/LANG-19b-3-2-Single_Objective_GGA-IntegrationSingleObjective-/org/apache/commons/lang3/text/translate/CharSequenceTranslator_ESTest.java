/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 21:23:32 UTC 2020
 */

package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.CharBuffer;
import org.apache.commons.lang3.text.translate.CharSequenceTranslator;
import org.apache.commons.lang3.text.translate.NumericEntityEscaper;
import org.apache.commons.lang3.text.translate.NumericEntityUnescaper;
import org.apache.commons.lang3.text.translate.UnicodeEscaper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class CharSequenceTranslator_ESTest extends CharSequenceTranslator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CharSequence charSequence0 = mock(CharSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(charSequence0).length();
      char[] charArray0 = new char[10];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      CharBuffer charBuffer1 = CharBuffer.wrap(charArray0);
      CharBuffer charBuffer2 = charBuffer1.duplicate();
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.between(')', 108);
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      numericEntityEscaper0.translate((CharSequence) charBuffer0);
      charBuffer0.rewind();
      NumericEntityEscaper.between(65535, 65535);
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      StringWriter stringWriter0 = new StringWriter();
      numericEntityUnescaper0.translate((CharSequence) "&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;");
      stringWriter0.close();
      numericEntityUnescaper0.translate((CharSequence) charBuffer2, (Writer) stringWriter0);
      stringWriter0.close();
      numericEntityUnescaper0.translate((CharSequence) charBuffer0);
      NumericEntityUnescaper numericEntityUnescaper1 = new NumericEntityUnescaper();
      numericEntityUnescaper1.translate(charSequence0);
      unicodeEscaper0.translate((CharSequence) "&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;");
      numericEntityUnescaper1.translate((CharSequence) "&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;");
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[0];
      numericEntityUnescaper0.with(charSequenceTranslatorArray0);
  }
}