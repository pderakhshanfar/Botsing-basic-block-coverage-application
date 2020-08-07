/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 04:51:27 UTC 2020
 */

package org.xwiki.rendering.internal.macro.toc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.rendering.block.Block;
import org.xwiki.rendering.block.BulletedListBlock;
import org.xwiki.rendering.block.MacroBlock;
import org.xwiki.rendering.internal.macro.toc.TreeParametersBuilder;
import org.xwiki.rendering.macro.toc.TocMacroParameters;
import org.xwiki.rendering.transformation.MacroTransformationContext;
import org.xwiki.rendering.transformation.TransformationContext;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class TreeParametersBuilder_ESTest extends TreeParametersBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TreeParametersBuilder treeParametersBuilder0 = new TreeParametersBuilder();
      Block block0 = mock(Block.class, new ViolatedAssumptionAnswer());
      TransformationContext transformationContext0 = new TransformationContext();
      TocMacroParameters tocMacroParameters0 = new TocMacroParameters();
      TransformationContext transformationContext1 = new TransformationContext();
      MacroTransformationContext macroTransformationContext0 = new MacroTransformationContext(transformationContext0);
      TocMacroParameters tocMacroParameters1 = new TocMacroParameters();
      TocMacroParameters tocMacroParameters2 = new TocMacroParameters();
      tocMacroParameters0.setReference("");
      TocMacroParameters.Scope tocMacroParameters_Scope0 = TocMacroParameters.Scope.LOCAL;
      tocMacroParameters1.setScope(tocMacroParameters_Scope0);
      MacroTransformationContext macroTransformationContext1 = new MacroTransformationContext();
      MacroTransformationContext macroTransformationContext2 = new MacroTransformationContext();
      ArrayList<Block> arrayList0 = new ArrayList<Block>();
      Hashtable<String, String> hashtable0 = new Hashtable<String, String>();
      BulletedListBlock bulletedListBlock0 = new BulletedListBlock(arrayList0, hashtable0);
      Map<String, String> map0 = bulletedListBlock0.getParameters();
      MacroBlock macroBlock0 = new MacroBlock("_jd$]{Dv,CbY5&d)4o", map0, true);
      macroTransformationContext2.setCurrentMacroBlock(macroBlock0);
      macroTransformationContext2.setId("8w+m`|# ;5:vjlq6)Ie");
      treeParametersBuilder0.build((Block) null, tocMacroParameters2, macroTransformationContext0);
      // Undeclared exception!
      treeParametersBuilder0.build((Block) null, tocMacroParameters1, macroTransformationContext2);
  }
}