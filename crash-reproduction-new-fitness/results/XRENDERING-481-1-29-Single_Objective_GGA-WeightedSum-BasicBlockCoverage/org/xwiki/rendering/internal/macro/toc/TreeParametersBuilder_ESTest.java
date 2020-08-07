/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 06:24:32 UTC 2020
 */

package org.xwiki.rendering.internal.macro.toc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
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
      MacroTransformationContext macroTransformationContext0 = new MacroTransformationContext();
      ResourceType resourceType0 = ResourceType.UNKNOWN;
      ResourceReference resourceReference0 = new ResourceReference("2M", resourceType0);
      ResourceReference resourceReference1 = resourceReference0.clone();
      Map<String, String> map0 = resourceReference1.getParameters();
      MacroBlock macroBlock0 = new MacroBlock("", map0, true);
      macroTransformationContext0.setCurrentMacroBlock(macroBlock0);
      macroTransformationContext0.clone();
      TocMacroParameters tocMacroParameters0 = new TocMacroParameters();
      TocMacroParameters.Scope tocMacroParameters_Scope0 = TocMacroParameters.Scope.LOCAL;
      tocMacroParameters0.setScope(tocMacroParameters_Scope0);
      TreeParametersBuilder treeParametersBuilder0 = new TreeParametersBuilder();
      // Undeclared exception!
      treeParametersBuilder0.build(macroBlock0, tocMacroParameters0, macroTransformationContext0);
  }
}