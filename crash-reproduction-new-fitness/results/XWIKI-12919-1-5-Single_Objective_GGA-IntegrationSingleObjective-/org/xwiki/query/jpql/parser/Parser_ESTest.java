/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 10:49:25 UTC 2020
 */

package org.xwiki.query.jpql.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PushbackReader;
import java.io.StringReader;
import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xwiki.query.jpql.lexer.Lexer;
import org.xwiki.query.jpql.node.AInnerJoinSpec;
import org.xwiki.query.jpql.parser.Parser;
import org.xwiki.query.jpql.parser.ParserException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Parser_ESTest extends Parser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ArrayList<AInnerJoinSpec> arrayList0 = new ArrayList<AInnerJoinSpec>();
      StringReader stringReader0 = new StringReader("org.xwiki.query.jpql.parser.Parser");
      PushbackReader pushbackReader0 = new PushbackReader(stringReader0, 165);
      Lexer lexer0 = new Lexer(pushbackReader0);
      Parser parser0 = new Parser(lexer0);
      lexer0.peek();
      try { 
        parser0.parse();
        fail("Expecting exception: ParserException");
      
      } catch(ParserException e) {
         //
         // [1,1] expecting: select
         //
         verifyException("org.xwiki.query.jpql.parser.Parser", e);
      }
  }
}