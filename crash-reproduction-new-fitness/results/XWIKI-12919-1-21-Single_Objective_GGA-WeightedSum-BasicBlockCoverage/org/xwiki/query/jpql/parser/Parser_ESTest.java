/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 14:36:51 UTC 2020
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
import org.xwiki.query.jpql.node.AAgrSelectExpression;
import org.xwiki.query.jpql.node.AArithmeticExpression;
import org.xwiki.query.jpql.node.ANullIsExpression;
import org.xwiki.query.jpql.node.AParamStringPrimary;
import org.xwiki.query.jpql.node.ARangeVariableDeclaration;
import org.xwiki.query.jpql.parser.Parser;
import org.xwiki.query.jpql.parser.ParserException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Parser_ESTest extends Parser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ArrayList<AParamStringPrimary> arrayList0 = new ArrayList<AParamStringPrimary>();
      ArrayList<AAgrSelectExpression> arrayList1 = new ArrayList<AAgrSelectExpression>();
      ArrayList<ANullIsExpression> arrayList2 = new ArrayList<ANullIsExpression>();
      char[] charArray0 = new char[5];
      charArray0[0] = 'O';
      ArrayList<ARangeVariableDeclaration> arrayList3 = new ArrayList<ARangeVariableDeclaration>();
      ArrayList<AArithmeticExpression> arrayList4 = new ArrayList<AArithmeticExpression>();
      StringReader stringReader0 = new StringReader("(#YN0w8f^#<Ib2");
      PushbackReader pushbackReader0 = new PushbackReader(stringReader0);
      PushbackReader pushbackReader1 = new PushbackReader(pushbackReader0, 64);
      Lexer lexer0 = new Lexer(pushbackReader1);
      Parser parser0 = new Parser(lexer0);
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