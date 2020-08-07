/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 17:18:18 UTC 2020
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
import org.xwiki.model.reference.EntityReference;
import org.xwiki.model.reference.EntityReferenceProvider;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractStringEntityReferenceResolver_ESTest extends AbstractStringEntityReferenceResolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultSymbolScheme defaultSymbolScheme0 = new DefaultSymbolScheme();
      DefaultStringEntityReferenceResolver defaultStringEntityReferenceResolver0 = new DefaultStringEntityReferenceResolver();
      EntityReferenceProvider entityReferenceProvider0 = mock(EntityReferenceProvider.class, new ViolatedAssumptionAnswer());
      doReturn((EntityReference) null, (EntityReference) null).when(entityReferenceProvider0).getDefaultReference(any(org.xwiki.model.EntityType.class));
      Injector.inject(defaultStringEntityReferenceResolver0, (Class<?>) DefaultStringEntityReferenceResolver.class, "provider", (Object) entityReferenceProvider0);
      Injector.inject(defaultStringEntityReferenceResolver0, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) defaultSymbolScheme0);
      defaultStringEntityReferenceResolver0.initialize();
      DefaultSymbolScheme defaultSymbolScheme1 = new DefaultSymbolScheme();
      Object[] objectArray0 = new Object[3];
      objectArray0[0] = (Object) entityReferenceProvider0;
      objectArray0[1] = (Object) defaultSymbolScheme1;
      objectArray0[2] = (Object) defaultSymbolScheme0;
      DefaultSymbolScheme defaultSymbolScheme2 = new DefaultSymbolScheme();
      DefaultSymbolScheme defaultSymbolScheme3 = new DefaultSymbolScheme();
      SymbolScheme symbolScheme0 = defaultStringEntityReferenceResolver0.getSymbolScheme();
      DefaultSymbolScheme defaultSymbolScheme4 = new DefaultSymbolScheme();
      DefaultSymbolScheme defaultSymbolScheme5 = new DefaultSymbolScheme();
      ExplicitStringEntityReferenceResolver explicitStringEntityReferenceResolver0 = new ExplicitStringEntityReferenceResolver();
      DefaultSymbolScheme defaultSymbolScheme6 = new DefaultSymbolScheme();
      defaultSymbolScheme6.initialize();
      defaultSymbolScheme6.initialize();
      defaultSymbolScheme1.initialize();
      Injector.inject(explicitStringEntityReferenceResolver0, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) defaultSymbolScheme6);
      Injector.validateBean(explicitStringEntityReferenceResolver0, (Class<?>) ExplicitStringEntityReferenceResolver.class);
      defaultSymbolScheme1.initialize();
      EntityType entityType0 = EntityType.OBJECT;
      defaultStringEntityReferenceResolver0.getDefaultReference(entityType0, objectArray0);
      EntityType entityType1 = EntityType.OBJECT;
      explicitStringEntityReferenceResolver0.initialize();
      EntityType entityType2 = EntityType.DOCUMENT;
      defaultStringEntityReferenceResolver0.getDefaultReference(entityType2, objectArray0);
      Object[] objectArray1 = new Object[3];
      objectArray1[0] = (Object) symbolScheme0;
      objectArray1[2] = (Object) defaultSymbolScheme0;
      // Undeclared exception!
      explicitStringEntityReferenceResolver0.resolve("5-+<a?C0*l:(5", entityType1, objectArray1);
  }
}