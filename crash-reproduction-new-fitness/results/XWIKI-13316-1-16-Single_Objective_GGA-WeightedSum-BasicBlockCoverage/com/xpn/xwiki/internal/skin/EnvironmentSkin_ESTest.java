/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 20:59:32 UTC 2020
 */

package com.xpn.xwiki.internal.skin;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.XWikiContext;
import com.xpn.xwiki.internal.skin.EnvironmentSkin;
import com.xpn.xwiki.internal.skin.InternalSkinConfiguration;
import com.xpn.xwiki.internal.skin.InternalSkinManager;
import java.net.URL;
import javax.inject.Provider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.xwiki.environment.Environment;
import org.xwiki.rendering.syntax.SyntaxFactory;
import org.xwiki.skin.Skin;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class EnvironmentSkin_ESTest extends EnvironmentSkin_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      InternalSkinManager internalSkinManager0 = mock(InternalSkinManager.class, new ViolatedAssumptionAnswer());
      doReturn((Skin) null, (Skin) null, (Skin) null).when(internalSkinManager0).getSkin(anyString());
      InternalSkinConfiguration internalSkinConfiguration0 = mock(InternalSkinConfiguration.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null).when(internalSkinConfiguration0).getDefaultParentSkinId();
      Logger logger0 = mock(Logger.class, new ViolatedAssumptionAnswer());
      SyntaxFactory syntaxFactory0 = mock(SyntaxFactory.class, new ViolatedAssumptionAnswer());
      Environment environment0 = mock(Environment.class, new ViolatedAssumptionAnswer());
      doReturn((URL) null).when(environment0).getResource(anyString());
      Provider<XWikiContext> provider0 = (Provider<XWikiContext>) mock(Provider.class, new ViolatedAssumptionAnswer());
      EnvironmentSkin environmentSkin0 = new EnvironmentSkin("", internalSkinManager0, internalSkinConfiguration0, logger0, syntaxFactory0, environment0, provider0);
      environmentSkin0.getOutputSyntaxString();
      environmentSkin0.getSkinFolder();
      environmentSkin0.getProperties();
      environmentSkin0.getProperties();
      environmentSkin0.getOutputSyntaxString();
      environmentSkin0.createResource((String) null, "*Q^.}YfW] ");
      environmentSkin0.getOutputSyntax();
      environmentSkin0.createResource((String) null, "/skins//");
      environmentSkin0.getParent();
      environmentSkin0.getParent();
      String string0 = "Direct access to template file [{}] refused. Possible break-in attempt!";
      InternalSkinManager internalSkinManager1 = mock(InternalSkinManager.class, new ViolatedAssumptionAnswer());
      InternalSkinConfiguration internalSkinConfiguration1 = mock(InternalSkinConfiguration.class, new ViolatedAssumptionAnswer());
      Logger logger1 = mock(Logger.class, new ViolatedAssumptionAnswer());
      SyntaxFactory syntaxFactory1 = mock(SyntaxFactory.class, new ViolatedAssumptionAnswer());
      Environment environment1 = null;
      Provider<XWikiContext> provider1 = (Provider<XWikiContext>) mock(Provider.class, new ViolatedAssumptionAnswer());
      EnvironmentSkin environmentSkin1 = new EnvironmentSkin("Direct access to template file [{}] refused. Possible break-in attempt!", internalSkinManager1, internalSkinConfiguration1, logger1, syntaxFactory1, (Environment) null, provider1);
      // Undeclared exception!
      environmentSkin1.getOutputSyntax();
  }
}