/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 17:16:45 UTC 2020
 */

package org.xwiki.model.internal.reference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.xwiki.model.EntityType;
import org.xwiki.model.internal.reference.AbstractStringEntityReferenceResolver;
import org.xwiki.model.internal.reference.DefaultStringEntityReferenceResolver;
import org.xwiki.model.internal.reference.DefaultSymbolScheme;
import org.xwiki.model.internal.reference.ExplicitStringEntityReferenceResolver;
import org.xwiki.model.internal.reference.SymbolScheme;
import org.xwiki.model.reference.EntityReferenceProvider;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractEntityReferenceResolver_ESTest extends AbstractEntityReferenceResolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ExplicitStringEntityReferenceResolver explicitStringEntityReferenceResolver0 = new ExplicitStringEntityReferenceResolver();
      DefaultStringEntityReferenceResolver defaultStringEntityReferenceResolver0 = new DefaultStringEntityReferenceResolver();
      EntityReferenceProvider entityReferenceProvider0 = mock(EntityReferenceProvider.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultStringEntityReferenceResolver0, (Class<?>) DefaultStringEntityReferenceResolver.class, "provider", (Object) entityReferenceProvider0);
      DefaultSymbolScheme defaultSymbolScheme0 = new DefaultSymbolScheme();
      Injector.inject(defaultStringEntityReferenceResolver0, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) defaultSymbolScheme0);
      Injector.validateBean(defaultStringEntityReferenceResolver0, (Class<?>) DefaultStringEntityReferenceResolver.class);
      SymbolScheme symbolScheme0 = defaultStringEntityReferenceResolver0.getSymbolScheme();
      Injector.inject(explicitStringEntityReferenceResolver0, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) symbolScheme0);
      Injector.validateBean(explicitStringEntityReferenceResolver0, (Class<?>) ExplicitStringEntityReferenceResolver.class);
      EntityType entityType0 = EntityType.BLOCK;
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) explicitStringEntityReferenceResolver0;
      Object object0 = new Object();
      objectArray0[1] = object0;
      objectArray0[2] = (Object) symbolScheme0;
      objectArray0[3] = (Object) defaultStringEntityReferenceResolver0;
      // Undeclared exception!
      explicitStringEntityReferenceResolver0.resolveDefaultReference(entityType0, objectArray0);
  }
}