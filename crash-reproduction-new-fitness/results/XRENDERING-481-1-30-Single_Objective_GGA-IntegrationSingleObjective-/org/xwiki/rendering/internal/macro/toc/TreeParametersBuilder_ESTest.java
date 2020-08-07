/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 07:19:43 UTC 2020
 */

package org.xwiki.rendering.internal.macro.toc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.rendering.block.Block;
import org.xwiki.rendering.block.MacroBlock;
import org.xwiki.rendering.internal.macro.toc.TreeParametersBuilder;
import org.xwiki.rendering.listener.reference.ResourceReference;
import org.xwiki.rendering.listener.reference.ResourceType;
import org.xwiki.rendering.macro.toc.TocMacroParameters;
import org.xwiki.rendering.transformation.MacroTransformationContext;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class TreeParametersBuilder_ESTest extends TreeParametersBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Block block0 = mock(Block.class, new ViolatedAssumptionAnswer());
      MacroTransformationContext macroTransformationContext0 = mock(MacroTransformationContext.class, new ViolatedAssumptionAnswer());
      MacroTransformationContext macroTransformationContext1 = mock(MacroTransformationContext.class, new ViolatedAssumptionAnswer());
      TocMacroParameters tocMacroParameters0 = new TocMacroParameters();
      TocMacroParameters.Scope tocMacroParameters_Scope0 = TocMacroParameters.Scope.LOCAL;
      tocMacroParameters0.setScope(tocMacroParameters_Scope0);
      TocMacroParameters.Scope tocMacroParameters_Scope1 = TocMacroParameters.Scope.LOCAL;
      tocMacroParameters0.setScope(tocMacroParameters_Scope1);
      TreeParametersBuilder treeParametersBuilder0 = new TreeParametersBuilder();
      MacroTransformationContext macroTransformationContext2 = new MacroTransformationContext();
      ResourceType resourceType0 = ResourceType.DOCUMENT;
      ResourceReference resourceReference0 = new ResourceReference("SortOrder.ASCENDING", resourceType0);
      Map<String, String> map0 = resourceReference0.getParameters();
      MacroBlock macroBlock0 = new MacroBlock("SortOrder.ASCENDING", map0, "", false);
      MacroBlock macroBlock1 = new MacroBlock("SortOrder.ASCENDING", map0, "SortOrder.ASCENDING", false);
      macroTransformationContext2.setCurrentMacroBlock(macroBlock1);
      macroTransformationContext2.setInline(false);
      // Undeclared exception!
      treeParametersBuilder0.build(macroBlock0, tocMacroParameters0, macroTransformationContext2);
  }
}