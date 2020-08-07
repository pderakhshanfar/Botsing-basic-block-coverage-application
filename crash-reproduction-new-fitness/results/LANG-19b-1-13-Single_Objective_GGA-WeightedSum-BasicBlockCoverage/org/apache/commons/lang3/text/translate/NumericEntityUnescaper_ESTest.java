/*
 * This file was automatically generated by EvoSuite
 * Thu May 14 20:49:04 UTC 2020
 */

package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.nio.CharBuffer;
import org.apache.commons.lang3.text.translate.CharSequenceTranslator;
import org.apache.commons.lang3.text.translate.NumericEntityUnescaper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class NumericEntityUnescaper_ESTest extends NumericEntityUnescaper_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CharSequence charSequence0 = mock(CharSequence.class, new ViolatedAssumptionAnswer());
      CharSequenceTranslator.hex('#');
      char[] charArray0 = new char[10];
      charArray0[0] = '&';
      charArray0[1] = '#';
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      CharBuffer.allocate('&');
      CharBuffer.wrap(charArray0);
      CharBuffer.wrap(charArray0);
      StringWriter stringWriter0 = new StringWriter();
      CharSequenceTranslator.hex('&');
      CharBuffer.wrap(charArray0);
      int int0 = 59;
      CharBuffer.allocate(59);
      CharBuffer.wrap(charArray0);
      CharSequenceTranslator.hex((-5267));
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[8];
      charSequenceTranslatorArray0[0] = (CharSequenceTranslator) numericEntityUnescaper0;
      charSequenceTranslatorArray0[1] = (CharSequenceTranslator) numericEntityUnescaper0;
      charSequenceTranslatorArray0[2] = (CharSequenceTranslator) numericEntityUnescaper0;
      StringWriter stringWriter1 = new StringWriter(59);
      numericEntityUnescaper0.translate((CharSequence) "23");
      stringWriter1.write(charArray0);
      CharBuffer charBuffer0 = CharBuffer.allocate(59);
      CharBuffer.wrap((CharSequence) charBuffer0);
      StringBuffer stringBuffer0 = stringWriter1.getBuffer();
      // Undeclared exception!
      numericEntityUnescaper0.translate((CharSequence) stringBuffer0);
  }
}