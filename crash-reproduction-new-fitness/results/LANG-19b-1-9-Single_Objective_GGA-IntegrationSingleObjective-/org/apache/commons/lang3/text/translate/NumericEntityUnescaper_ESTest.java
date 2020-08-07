/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 21:28:22 UTC 2020
 */

package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.nio.CharBuffer;
import org.apache.commons.lang3.text.translate.NumericEntityUnescaper;
import org.apache.commons.lang3.text.translate.OctalUnescaper;
import org.apache.commons.lang3.text.translate.UnicodeEscaper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class NumericEntityUnescaper_ESTest extends NumericEntityUnescaper_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CharSequence charSequence0 = null;
      CharSequence charSequence1 = null;
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      char[] charArray0 = new char[9];
      charArray0[0] = '&';
      charArray0[1] = 'C';
      charArray0[2] = '&';
      charArray0[3] = '#';
      charArray0[4] = 'F';
      charArray0[5] = '&';
      charArray0[6] = '#';
      charArray0[7] = '-';
      charArray0[8] = '&';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      NumericEntityUnescaper numericEntityUnescaper1 = new NumericEntityUnescaper();
      int int0 = 255;
      StringWriter stringWriter0 = new StringWriter(255);
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) charBuffer0);
      StringBuffer stringBuffer0 = stringWriter1.getBuffer();
      // Undeclared exception!
      numericEntityUnescaper1.translate((CharSequence) stringBuffer0);
  }
}