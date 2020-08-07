/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 21:50:40 UTC 2020
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
import com.xpn.xwiki.internal.skin.WikiSkinUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.hibernate.type.OrderedSetType;
import org.hibernate.type.TypeFactory;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.xwiki.component.embed.EmbeddableComponentManager;
import org.xwiki.component.embed.GenericProvider;
import org.xwiki.component.internal.RoleHint;
import org.xwiki.configuration.ConfigurationSource;
import org.xwiki.configuration.internal.AbstractConfigurationSourceProvider;
import org.xwiki.configuration.internal.DefaultConfigurationSourceProvider;
import org.xwiki.environment.Environment;
import org.xwiki.rendering.internal.syntax.DefaultSyntaxFactory;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractSkin_ESTest extends AbstractSkin_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      InternalSkinConfiguration internalSkinConfiguration0 = new InternalSkinConfiguration();
      Logger logger0 = mock(Logger.class, new ViolatedAssumptionAnswer());
      InternalSkinConfiguration internalSkinConfiguration1 = new InternalSkinConfiguration();
      DefaultSyntaxFactory defaultSyntaxFactory0 = new DefaultSyntaxFactory();
      WikiSkinUtils wikiSkinUtils0 = new WikiSkinUtils();
      InternalSkinConfiguration internalSkinConfiguration2 = new InternalSkinConfiguration();
      DefaultConfigurationSourceProvider defaultConfigurationSourceProvider0 = new DefaultConfigurationSourceProvider();
      EmbeddableComponentManager embeddableComponentManager0 = new EmbeddableComponentManager("");
      Injector.inject(defaultConfigurationSourceProvider0, (Class<?>) AbstractConfigurationSourceProvider.class, "componentManager", (Object) embeddableComponentManager0);
      Injector.validateBean(defaultConfigurationSourceProvider0, (Class<?>) DefaultConfigurationSourceProvider.class);
      defaultConfigurationSourceProvider0.get();
      ConfigurationSource configurationSource0 = defaultConfigurationSourceProvider0.get();
      Injector.inject(internalSkinConfiguration2, (Class<?>) InternalSkinConfiguration.class, "xwikicfg", (Object) configurationSource0);
      Injector.validateBean(internalSkinConfiguration2, (Class<?>) InternalSkinConfiguration.class);
      TypeFactory.TypeScope typeFactory_TypeScope0 = mock(TypeFactory.TypeScope.class, new ViolatedAssumptionAnswer());
      OrderedSetType orderedSetType0 = new OrderedSetType(typeFactory_TypeScope0, "", (String) null, true);
      Class class0 = orderedSetType0.getReturnedClass();
      RoleHint<XWikiContext> roleHint0 = new RoleHint<XWikiContext>(class0);
      GenericProvider<XWikiContext> genericProvider0 = new GenericProvider<XWikiContext>(embeddableComponentManager0, roleHint0);
      EnvironmentSkin environmentSkin0 = new EnvironmentSkin((String) null, (InternalSkinManager) null, internalSkinConfiguration2, logger0, defaultSyntaxFactory0, (Environment) null, genericProvider0);
      // Undeclared exception!
      environmentSkin0.getOutputSyntax();
  }
}