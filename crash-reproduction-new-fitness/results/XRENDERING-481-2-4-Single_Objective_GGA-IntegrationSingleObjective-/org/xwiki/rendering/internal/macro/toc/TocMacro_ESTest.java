/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 01:28:03 UTC 2020
 */

package org.xwiki.rendering.internal.macro.toc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Map;
import javax.inject.Provider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.xwiki.component.descriptor.ComponentDescriptor;
import org.xwiki.properties.BeanManager;
import org.xwiki.rendering.block.CompositeBlock;
import org.xwiki.rendering.block.FormatBlock;
import org.xwiki.rendering.block.GroupBlock;
import org.xwiki.rendering.block.MacroBlock;
import org.xwiki.rendering.internal.macro.toc.TocMacro;
import org.xwiki.rendering.macro.AbstractMacro;
import org.xwiki.rendering.macro.Macro;
import org.xwiki.rendering.macro.toc.TocMacroParameters;
import org.xwiki.rendering.parser.Parser;
import org.xwiki.rendering.renderer.reference.link.LinkLabelGenerator;
import org.xwiki.rendering.transformation.MacroTransformationContext;
import org.xwiki.rendering.transformation.Transformation;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class TocMacro_ESTest extends TocMacro_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkLabelGenerator linkLabelGenerator0 = mock(LinkLabelGenerator.class, new ViolatedAssumptionAnswer());
      Parser parser0 = mock(Parser.class, new ViolatedAssumptionAnswer());
      Provider<CompositeBlock> provider0 = (Provider<CompositeBlock>) mock(Provider.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(provider0).get();
      BeanManager beanManager0 = mock(BeanManager.class, new ViolatedAssumptionAnswer());
      ComponentDescriptor<GroupBlock> componentDescriptor0 = (ComponentDescriptor<GroupBlock>) mock(ComponentDescriptor.class, new ViolatedAssumptionAnswer());
      Macro<CompositeBlock> macro0 = (Macro<CompositeBlock>) mock(Macro.class, new ViolatedAssumptionAnswer());
      Macro<FormatBlock> macro1 = (Macro<FormatBlock>) mock(Macro.class, new ViolatedAssumptionAnswer());
      MacroTransformationContext macroTransformationContext0 = new MacroTransformationContext();
      TocMacroParameters tocMacroParameters0 = new TocMacroParameters();
      TocMacro tocMacro0 = new TocMacro();
      Injector.inject(tocMacro0, (Class<?>) TocMacro.class, "linkLabelGenerator", (Object) linkLabelGenerator0);
      Injector.inject(tocMacro0, (Class<?>) TocMacro.class, "plainTextParser", (Object) parser0);
      Injector.inject(tocMacro0, (Class<?>) TocMacro.class, "wikiModelProvider", (Object) provider0);
      CompositeBlock compositeBlock0 = new CompositeBlock();
      Map<String, String> map0 = compositeBlock0.getParameters();
      MacroBlock macroBlock0 = new MacroBlock("Error:Unknown type for field import", map0, false);
      macroTransformationContext0.setCurrentMacroBlock(macroBlock0);
      Injector.inject(tocMacro0, (Class<?>) AbstractMacro.class, "beanManager", (Object) beanManager0);
      Injector.inject(tocMacro0, (Class<?>) AbstractMacro.class, "componentDescriptor", (Object) componentDescriptor0);
      tocMacroParameters0.setNumbered(false);
      macroTransformationContext0.getTransformation();
      macroTransformationContext0.setTransformation((Transformation) null);
      TocMacroParameters.Scope tocMacroParameters_Scope0 = TocMacroParameters.Scope.LOCAL;
      tocMacroParameters0.setScope(tocMacroParameters_Scope0);
      Injector.validateBean(tocMacro0, (Class<?>) TocMacro.class);
      String string0 = "The 'month' argument must be in the range 1 to 12.";
      // Undeclared exception!
      tocMacro0.execute(tocMacroParameters0, "The 'month' argument must be in the range 1 to 12.", macroTransformationContext0);
  }
}