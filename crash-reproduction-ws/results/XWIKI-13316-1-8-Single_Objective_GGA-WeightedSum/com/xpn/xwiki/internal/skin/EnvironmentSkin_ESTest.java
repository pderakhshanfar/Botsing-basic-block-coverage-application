/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 31 02:16:10 UTC 2020
 */

package com.xpn.xwiki.internal.skin;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ch.qos.logback.classic.Logger;
import com.xpn.xwiki.XWikiContext;
import com.xpn.xwiki.internal.skin.EnvironmentSkin;
import com.xpn.xwiki.internal.skin.InternalSkinConfiguration;
import com.xpn.xwiki.internal.skin.InternalSkinManager;
import javax.inject.Provider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xwiki.environment.Environment;
import org.xwiki.rendering.syntax.SyntaxFactory;
import ucar.httpservices.CustomX509TrustManager;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class EnvironmentSkin_ESTest extends EnvironmentSkin_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Logger logger0 = (Logger)CustomX509TrustManager.logger;
      EnvironmentSkin environmentSkin0 = new EnvironmentSkin("", (InternalSkinManager) null, (InternalSkinConfiguration) null, logger0, (SyntaxFactory) null, (Environment) null, (Provider<XWikiContext>) null);
      // Undeclared exception!
      environmentSkin0.getOutputSyntax();
  }
}