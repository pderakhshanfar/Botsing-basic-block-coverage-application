/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 12:52:31 UTC 2020
 */

package org.xwiki.model.internal.reference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.xwiki.model.EntityType;
import org.xwiki.model.internal.reference.AbstractStringEntityReferenceResolver;
import org.xwiki.model.internal.reference.DefaultSymbolScheme;
import org.xwiki.model.internal.reference.ExplicitStringEntityReferenceResolver;
import org.xwiki.model.internal.reference.RelativeStringEntityReferenceResolver;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractStringEntityReferenceResolver_ESTest extends AbstractStringEntityReferenceResolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultSymbolScheme defaultSymbolScheme0 = new DefaultSymbolScheme();
      RelativeStringEntityReferenceResolver relativeStringEntityReferenceResolver0 = new RelativeStringEntityReferenceResolver(defaultSymbolScheme0);
      DefaultSymbolScheme defaultSymbolScheme1 = new DefaultSymbolScheme();
      Injector.inject(relativeStringEntityReferenceResolver0, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) defaultSymbolScheme1);
      Injector.validateBean(relativeStringEntityReferenceResolver0, (Class<?>) RelativeStringEntityReferenceResolver.class);
      EntityType entityType0 = EntityType.BLOCK;
      Object[] objectArray0 = new Object[0];
      relativeStringEntityReferenceResolver0.resolveDefaultReference(entityType0, objectArray0);
      Object object0 = new Object();
      ExplicitStringEntityReferenceResolver explicitStringEntityReferenceResolver0 = new ExplicitStringEntityReferenceResolver();
      Injector.inject(explicitStringEntityReferenceResolver0, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) defaultSymbolScheme1);
      Injector.validateBean(explicitStringEntityReferenceResolver0, (Class<?>) ExplicitStringEntityReferenceResolver.class);
      DefaultSymbolScheme defaultSymbolScheme2 = new DefaultSymbolScheme();
      explicitStringEntityReferenceResolver0.initialize();
      EntityType entityType1 = EntityType.ATTACHMENT;
      // Undeclared exception!
      explicitStringEntityReferenceResolver0.resolve("Wildcard cannot have more than one lower bounds.", entityType1, objectArray0);
  }
}