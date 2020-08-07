/*
 * This file was automatically generated by EvoSuite
 * Thu May 14 12:51:47 UTC 2020
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
      DefaultSymbolScheme defaultSymbolScheme1 = new DefaultSymbolScheme();
      EntityType entityType0 = EntityType.DOCUMENT;
      RelativeStringEntityReferenceResolver relativeStringEntityReferenceResolver0 = new RelativeStringEntityReferenceResolver(defaultSymbolScheme1);
      Injector.inject(relativeStringEntityReferenceResolver0, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) defaultSymbolScheme1);
      Injector.validateBean(relativeStringEntityReferenceResolver0, (Class<?>) RelativeStringEntityReferenceResolver.class);
      DefaultSymbolScheme defaultSymbolScheme2 = new DefaultSymbolScheme();
      Object[] objectArray0 = new Object[6];
      objectArray0[0] = (Object) relativeStringEntityReferenceResolver0;
      objectArray0[1] = (Object) defaultSymbolScheme2;
      objectArray0[2] = (Object) defaultSymbolScheme1;
      Object object0 = new Object();
      objectArray0[3] = object0;
      objectArray0[4] = (Object) relativeStringEntityReferenceResolver0;
      objectArray0[5] = (Object) relativeStringEntityReferenceResolver0;
      relativeStringEntityReferenceResolver0.resolve("w>Lser29>DmO?`(`W", entityType0, objectArray0);
      DefaultSymbolScheme defaultSymbolScheme3 = new DefaultSymbolScheme();
      defaultSymbolScheme1.initialize();
      EntityType entityType1 = EntityType.DOCUMENT;
      ExplicitStringEntityReferenceResolver explicitStringEntityReferenceResolver0 = new ExplicitStringEntityReferenceResolver();
      Injector.inject(explicitStringEntityReferenceResolver0, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) defaultSymbolScheme3);
      Injector.validateBean(explicitStringEntityReferenceResolver0, (Class<?>) ExplicitStringEntityReferenceResolver.class);
      ExplicitStringEntityReferenceResolver explicitStringEntityReferenceResolver1 = new ExplicitStringEntityReferenceResolver();
      Injector.inject(explicitStringEntityReferenceResolver1, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) defaultSymbolScheme2);
      Injector.validateBean(explicitStringEntityReferenceResolver1, (Class<?>) ExplicitStringEntityReferenceResolver.class);
      explicitStringEntityReferenceResolver1.initialize();
      DefaultSymbolScheme defaultSymbolScheme4 = new DefaultSymbolScheme();
      EntityType entityType2 = EntityType.DOCUMENT;
      // Undeclared exception!
      explicitStringEntityReferenceResolver1.resolve("t]{u9^YkW ", entityType2, objectArray0);
  }
}