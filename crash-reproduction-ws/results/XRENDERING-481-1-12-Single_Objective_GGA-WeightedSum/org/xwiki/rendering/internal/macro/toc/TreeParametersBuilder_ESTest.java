/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 31 16:39:46 UTC 2020
 */

package org.xwiki.rendering.internal.macro.toc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xwiki.rendering.block.HorizontalLineBlock;
import org.xwiki.rendering.block.MacroBlock;
import org.xwiki.rendering.internal.macro.toc.TreeParametersBuilder;
import org.xwiki.rendering.listener.Listener;
import org.xwiki.rendering.macro.toc.TocMacroParameters;
import org.xwiki.rendering.transformation.MacroTransformationContext;
import org.xwiki.rendering.transformation.TransformationContext;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class TreeParametersBuilder_ESTest extends TreeParametersBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HorizontalLineBlock horizontalLineBlock0 = new HorizontalLineBlock();
      TocMacroParameters tocMacroParameters0 = new TocMacroParameters();
      TreeParametersBuilder treeParametersBuilder0 = new TreeParametersBuilder();
      TransformationContext transformationContext0 = new TransformationContext();
      MacroTransformationContext macroTransformationContext0 = new MacroTransformationContext(transformationContext0);
      Map<String, String> map0 = Listener.EMPTY_PARAMETERS;
      MacroBlock macroBlock0 = new MacroBlock("", map0, "OK9.I@_nS;x641bV", true);
      macroTransformationContext0.setCurrentMacroBlock(macroBlock0);
      TocMacroParameters.Scope tocMacroParameters_Scope0 = TocMacroParameters.Scope.LOCAL;
      tocMacroParameters0.setScope(tocMacroParameters_Scope0);
      // Undeclared exception!
      treeParametersBuilder0.build(horizontalLineBlock0, tocMacroParameters0, macroTransformationContext0);
  }
}