/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 07:18:38 UTC 2020
 */

package org.xwiki.rendering.internal.macro.toc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.ZoneId;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.rendering.block.Block;
import org.xwiki.rendering.block.BulletedListBlock;
import org.xwiki.rendering.block.MacroBlock;
import org.xwiki.rendering.block.match.BlockMatcher;
import org.xwiki.rendering.internal.macro.toc.TreeParametersBuilder;
import org.xwiki.rendering.macro.toc.TocMacroParameters;
import org.xwiki.rendering.transformation.MacroTransformationContext;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class TreeParametersBuilder_ESTest extends TreeParametersBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Block block0 = mock(Block.class, new ViolatedAssumptionAnswer());
      TocMacroParameters tocMacroParameters0 = new TocMacroParameters();
      tocMacroParameters0.setScope((TocMacroParameters.Scope) null);
      MacroTransformationContext macroTransformationContext0 = new MacroTransformationContext();
      TreeParametersBuilder treeParametersBuilder0 = new TreeParametersBuilder();
      Stack<Block> stack0 = new Stack<Block>();
      BulletedListBlock bulletedListBlock0 = new BulletedListBlock(stack0);
      BlockMatcher[] blockMatcherArray0 = new BlockMatcher[1];
      LinkedList<BlockMatcher> linkedList0 = new LinkedList<BlockMatcher>();
      TocMacroParameters.Scope tocMacroParameters_Scope0 = TocMacroParameters.Scope.LOCAL;
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      MacroBlock macroBlock0 = new MacroBlock("AP", map0, "xUW^ez'S", true);
      macroTransformationContext0.setCurrentMacroBlock(macroBlock0);
      tocMacroParameters0.setScope(tocMacroParameters_Scope0);
      TreeParametersBuilder treeParametersBuilder1 = new TreeParametersBuilder();
      // Undeclared exception!
      treeParametersBuilder1.build(bulletedListBlock0, tocMacroParameters0, macroTransformationContext0);
  }
}