/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 31 15:29:53 UTC 2020
 */

package org.xwiki.rendering.internal.macro.toc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Hashtable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xwiki.rendering.block.MacroBlock;
import org.xwiki.rendering.block.XDOM;
import org.xwiki.rendering.internal.macro.toc.TreeParametersBuilder;
import org.xwiki.rendering.macro.toc.TocMacroParameters;
import org.xwiki.rendering.syntax.Syntax;
import org.xwiki.rendering.transformation.MacroTransformationContext;
import org.xwiki.rendering.transformation.TransformationContext;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class TreeParametersBuilder_ESTest extends TreeParametersBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TocMacroParameters tocMacroParameters0 = new TocMacroParameters();
      TocMacroParameters.Scope tocMacroParameters_Scope0 = TocMacroParameters.Scope.LOCAL;
      tocMacroParameters0.setScope(tocMacroParameters_Scope0);
      TreeParametersBuilder treeParametersBuilder0 = new TreeParametersBuilder();
      Hashtable<String, String> hashtable0 = new Hashtable<String, String>();
      MacroBlock macroBlock0 = new MacroBlock((String) null, hashtable0, true);
      Syntax syntax0 = Syntax.ANNOTATED_XHTML_1_0;
      TransformationContext transformationContext0 = new TransformationContext((XDOM) null, syntax0, true);
      MacroTransformationContext macroTransformationContext0 = new MacroTransformationContext(transformationContext0);
      macroTransformationContext0.setCurrentMacroBlock(macroBlock0);
      // Undeclared exception!
      treeParametersBuilder0.build(macroBlock0, tocMacroParameters0, macroTransformationContext0);
  }
}