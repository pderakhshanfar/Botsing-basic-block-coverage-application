/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 02:22:49 UTC 2020
 */

package org.xwiki.rendering.internal.macro.toc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xwiki.rendering.block.Block;
import org.xwiki.rendering.block.MacroBlock;
import org.xwiki.rendering.block.ParagraphBlock;
import org.xwiki.rendering.block.XDOM;
import org.xwiki.rendering.internal.macro.toc.TreeParameters;
import org.xwiki.rendering.internal.macro.toc.TreeParametersBuilder;
import org.xwiki.rendering.macro.toc.TocMacroParameters;
import org.xwiki.rendering.transformation.MacroTransformationContext;
import org.xwiki.rendering.transformation.TransformationContext;
import org.xwiki.rendering.util.IdGenerator;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class TreeParametersBuilder_ESTest extends TreeParametersBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TreeParametersBuilder treeParametersBuilder0 = new TreeParametersBuilder();
      ArrayList<Block> arrayList0 = new ArrayList<Block>();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      ParagraphBlock paragraphBlock0 = new ParagraphBlock(arrayList0, hashMap0);
      TocMacroParameters tocMacroParameters0 = new TocMacroParameters();
      MacroTransformationContext macroTransformationContext0 = new MacroTransformationContext();
      MacroTransformationContext macroTransformationContext1 = macroTransformationContext0.clone();
      TreeParameters treeParameters0 = treeParametersBuilder0.build(paragraphBlock0, tocMacroParameters0, macroTransformationContext1);
      TocMacroParameters tocMacroParameters1 = new TocMacroParameters();
      MacroTransformationContext macroTransformationContext2 = new MacroTransformationContext();
      TreeParameters treeParameters1 = treeParametersBuilder0.build(paragraphBlock0, tocMacroParameters1, macroTransformationContext2);
      TransformationContext transformationContext0 = new TransformationContext();
      MacroTransformationContext macroTransformationContext3 = new MacroTransformationContext(transformationContext0);
      TocMacroParameters.Scope tocMacroParameters_Scope0 = TocMacroParameters.Scope.LOCAL;
      tocMacroParameters1.setScope(tocMacroParameters_Scope0);
      MacroTransformationContext macroTransformationContext4 = new MacroTransformationContext();
      TocMacroParameters tocMacroParameters2 = new TocMacroParameters();
      tocMacroParameters1.setScope(tocMacroParameters_Scope0);
      MacroTransformationContext macroTransformationContext5 = new MacroTransformationContext();
      TocMacroParameters tocMacroParameters3 = new TocMacroParameters();
      paragraphBlock0.addChild(treeParameters0.rootBlock);
      IdGenerator idGenerator0 = new IdGenerator();
      XDOM xDOM0 = new XDOM(arrayList0, idGenerator0);
      MacroTransformationContext macroTransformationContext6 = new MacroTransformationContext();
      MacroBlock macroBlock0 = new MacroBlock("s2CWNB.xcea", hashMap0, "|i(`M2pG==AX;7", true);
      macroTransformationContext5.setCurrentMacroBlock(macroBlock0);
      TocMacroParameters tocMacroParameters4 = new TocMacroParameters();
      // Undeclared exception!
      treeParametersBuilder0.build(treeParameters1.rootBlock, tocMacroParameters1, macroTransformationContext5);
  }
}