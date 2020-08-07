/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 17:19:23 UTC 2020
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
import org.xwiki.model.internal.reference.DefaultSymbolScheme;
import org.xwiki.model.internal.reference.ExplicitStringEntityReferenceResolver;
import org.xwiki.model.internal.reference.RelativeStringEntityReferenceResolver;
import org.xwiki.model.internal.reference.SymbolScheme;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractStringEntityReferenceResolver_ESTest extends AbstractStringEntityReferenceResolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SymbolScheme symbolScheme0 = mock(SymbolScheme.class, new ViolatedAssumptionAnswer());
      EntityType entityType0 = EntityType.OBJECT_PROPERTY;
      Object[] objectArray0 = new Object[9];
      objectArray0[0] = (Object) objectArray0;
      objectArray0[3] = (Object) "] does not belong to the parents chain of the reference [";
      DefaultSymbolScheme defaultSymbolScheme0 = new DefaultSymbolScheme();
      DefaultSymbolScheme defaultSymbolScheme1 = new DefaultSymbolScheme();
      defaultSymbolScheme1.initialize();
      ExplicitStringEntityReferenceResolver explicitStringEntityReferenceResolver0 = new ExplicitStringEntityReferenceResolver();
      DefaultSymbolScheme defaultSymbolScheme2 = new DefaultSymbolScheme();
      Injector.inject(explicitStringEntityReferenceResolver0, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) defaultSymbolScheme2);
      Injector.validateBean(explicitStringEntityReferenceResolver0, (Class<?>) ExplicitStringEntityReferenceResolver.class);
      explicitStringEntityReferenceResolver0.initialize();
      explicitStringEntityReferenceResolver0.initialize();
      RelativeStringEntityReferenceResolver relativeStringEntityReferenceResolver0 = new RelativeStringEntityReferenceResolver(defaultSymbolScheme0);
      Injector.inject(relativeStringEntityReferenceResolver0, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) defaultSymbolScheme0);
      Injector.validateBean(relativeStringEntityReferenceResolver0, (Class<?>) RelativeStringEntityReferenceResolver.class);
      DefaultSymbolScheme defaultSymbolScheme3 = new DefaultSymbolScheme();
      EntityType entityType1 = EntityType.CLASS_PROPERTY;
      relativeStringEntityReferenceResolver0.getDefaultReference(entityType1, objectArray0);
      // Undeclared exception!
      explicitStringEntityReferenceResolver0.resolve("", entityType0, objectArray0);
  }
}