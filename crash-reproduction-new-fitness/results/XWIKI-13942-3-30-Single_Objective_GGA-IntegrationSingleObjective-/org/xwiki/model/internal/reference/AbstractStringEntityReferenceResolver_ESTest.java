/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 17:22:05 UTC 2020
 */

package org.xwiki.model.internal.reference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.xwiki.model.EntityType;
import org.xwiki.model.internal.reference.AbstractStringEntityReferenceResolver;
import org.xwiki.model.internal.reference.DefaultStringEntityReferenceResolver;
import org.xwiki.model.internal.reference.DefaultSymbolScheme;
import org.xwiki.model.internal.reference.ExplicitStringEntityReferenceResolver;
import org.xwiki.model.internal.reference.RelativeStringEntityReferenceResolver;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractStringEntityReferenceResolver_ESTest extends AbstractStringEntityReferenceResolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultStringEntityReferenceResolver defaultStringEntityReferenceResolver0 = new DefaultStringEntityReferenceResolver();
      DefaultStringEntityReferenceResolver defaultStringEntityReferenceResolver1 = new DefaultStringEntityReferenceResolver();
      DefaultStringEntityReferenceResolver defaultStringEntityReferenceResolver2 = new DefaultStringEntityReferenceResolver();
      DefaultSymbolScheme defaultSymbolScheme0 = new DefaultSymbolScheme();
      DefaultSymbolScheme defaultSymbolScheme1 = new DefaultSymbolScheme();
      EntityType entityType0 = EntityType.SPACE;
      Object object0 = new Object();
      RelativeStringEntityReferenceResolver relativeStringEntityReferenceResolver0 = new RelativeStringEntityReferenceResolver(defaultSymbolScheme1);
      Injector.inject(relativeStringEntityReferenceResolver0, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) defaultSymbolScheme0);
      Injector.validateBean(relativeStringEntityReferenceResolver0, (Class<?>) RelativeStringEntityReferenceResolver.class);
      DefaultSymbolScheme defaultSymbolScheme2 = new DefaultSymbolScheme();
      EntityType entityType1 = EntityType.DOCUMENT;
      Object object1 = new Object();
      EntityType entityType2 = EntityType.DOCUMENT;
      Object[] objectArray0 = new Object[9];
      objectArray0[0] = (Object) defaultStringEntityReferenceResolver1;
      objectArray0[1] = object0;
      objectArray0[2] = (Object) defaultStringEntityReferenceResolver0;
      objectArray0[3] = (Object) entityType0;
      objectArray0[4] = (Object) defaultSymbolScheme2;
      objectArray0[5] = (Object) entityType1;
      objectArray0[6] = (Object) entityType1;
      objectArray0[7] = (Object) defaultStringEntityReferenceResolver1;
      objectArray0[8] = object1;
      relativeStringEntityReferenceResolver0.resolve((String) null, entityType2, objectArray0);
      ExplicitStringEntityReferenceResolver explicitStringEntityReferenceResolver0 = new ExplicitStringEntityReferenceResolver();
      Injector.inject(explicitStringEntityReferenceResolver0, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) defaultSymbolScheme1);
      Injector.validateBean(explicitStringEntityReferenceResolver0, (Class<?>) ExplicitStringEntityReferenceResolver.class);
      explicitStringEntityReferenceResolver0.initialize();
      DefaultSymbolScheme defaultSymbolScheme3 = new DefaultSymbolScheme();
      EntityType entityType3 = EntityType.DOCUMENT;
      HashMap<Character, EntityType> hashMap0 = new HashMap<Character, EntityType>();
      // Undeclared exception!
      explicitStringEntityReferenceResolver0.resolve("WIKI", entityType3, objectArray0);
  }
}