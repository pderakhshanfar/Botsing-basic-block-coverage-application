/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 31 02:21:08 UTC 2020
 */

package com.xpn.xwiki.internal.skin;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ch.qos.logback.classic.Logger;
import com.xpn.xwiki.internal.ReadOnlyXWikiContextProvider;
import com.xpn.xwiki.internal.skin.EnvironmentSkin;
import com.xpn.xwiki.internal.skin.InternalSkinConfiguration;
import com.xpn.xwiki.internal.skin.InternalSkinManager;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.xwiki.context.Execution;
import org.xwiki.environment.Environment;
import org.xwiki.rendering.internal.syntax.DefaultSyntaxFactory;
import ucar.httpservices.CustomX509TrustManager;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractSkin_ESTest extends AbstractSkin_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      InternalSkinManager internalSkinManager0 = new InternalSkinManager();
      Logger logger0 = (Logger)CustomX509TrustManager.logger;
      DefaultSyntaxFactory defaultSyntaxFactory0 = new DefaultSyntaxFactory();
      ReadOnlyXWikiContextProvider readOnlyXWikiContextProvider0 = new ReadOnlyXWikiContextProvider();
      Execution execution0 = mock(Execution.class, new ViolatedAssumptionAnswer());
      Injector.inject(readOnlyXWikiContextProvider0, (Class<?>) ReadOnlyXWikiContextProvider.class, "execution", (Object) execution0);
      Injector.validateBean(readOnlyXWikiContextProvider0, (Class<?>) ReadOnlyXWikiContextProvider.class);
      EnvironmentSkin environmentSkin0 = new EnvironmentSkin("#Ebl[2@0+dVQ:/{l", internalSkinManager0, (InternalSkinConfiguration) null, logger0, defaultSyntaxFactory0, (Environment) null, readOnlyXWikiContextProvider0);
      // Undeclared exception!
      environmentSkin0.getOutputSyntax();
  }
}