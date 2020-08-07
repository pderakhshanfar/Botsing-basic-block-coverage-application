/*
 * This file was automatically generated by EvoSuite
 * Thu May 14 12:50:32 UTC 2020
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
import org.xwiki.model.internal.reference.DefaultReferenceEntityReferenceResolver;
import org.xwiki.model.internal.reference.DefaultSymbolScheme;
import org.xwiki.model.internal.reference.ExplicitStringEntityReferenceResolver;
import org.xwiki.model.reference.EntityReferenceProvider;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractEntityReferenceResolver_ESTest extends AbstractEntityReferenceResolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultReferenceEntityReferenceResolver defaultReferenceEntityReferenceResolver0 = new DefaultReferenceEntityReferenceResolver();
      EntityReferenceProvider entityReferenceProvider0 = mock(EntityReferenceProvider.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultReferenceEntityReferenceResolver0, (Class<?>) DefaultReferenceEntityReferenceResolver.class, "provider", (Object) entityReferenceProvider0);
      Injector.validateBean(defaultReferenceEntityReferenceResolver0, (Class<?>) DefaultReferenceEntityReferenceResolver.class);
      ExplicitStringEntityReferenceResolver explicitStringEntityReferenceResolver0 = new ExplicitStringEntityReferenceResolver();
      DefaultSymbolScheme defaultSymbolScheme0 = new DefaultSymbolScheme();
      Injector.inject(explicitStringEntityReferenceResolver0, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) defaultSymbolScheme0);
      Injector.validateBean(explicitStringEntityReferenceResolver0, (Class<?>) ExplicitStringEntityReferenceResolver.class);
      EntityType entityType0 = EntityType.BLOCK;
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) explicitStringEntityReferenceResolver0;
      objectArray0[1] = (Object) defaultReferenceEntityReferenceResolver0;
      objectArray0[2] = (Object) defaultSymbolScheme0;
      objectArray0[3] = (Object) entityReferenceProvider0;
      objectArray0[4] = (Object) entityReferenceProvider0;
      objectArray0[5] = (Object) entityType0;
      objectArray0[6] = (Object) defaultSymbolScheme0;
      objectArray0[7] = (Object) explicitStringEntityReferenceResolver0;
      // Undeclared exception!
      explicitStringEntityReferenceResolver0.resolveDefaultReference(entityType0, objectArray0);
  }
}