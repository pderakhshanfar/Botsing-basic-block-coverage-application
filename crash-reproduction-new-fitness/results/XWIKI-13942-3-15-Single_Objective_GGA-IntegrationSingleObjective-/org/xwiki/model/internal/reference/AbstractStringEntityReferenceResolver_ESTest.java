/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 12:57:18 UTC 2020
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

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractStringEntityReferenceResolver_ESTest extends AbstractStringEntityReferenceResolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultSymbolScheme defaultSymbolScheme0 = new DefaultSymbolScheme();
      DefaultSymbolScheme defaultSymbolScheme1 = new DefaultSymbolScheme();
      DefaultSymbolScheme defaultSymbolScheme2 = new DefaultSymbolScheme();
      Object object0 = new Object();
      Object object1 = new Object();
      EntityType entityType0 = EntityType.OBJECT_PROPERTY;
      defaultSymbolScheme0.initialize();
      defaultSymbolScheme2.initialize();
      Object[] objectArray0 = new Object[15];
      objectArray0[0] = (Object) "{n";
      objectArray0[2] = object1;
      objectArray0[4] = object0;
      objectArray0[5] = (Object) "";
      objectArray0[6] = (Object) "";
      Object object2 = new Object();
      Object object3 = new Object();
      Object object4 = new Object();
      ExplicitStringEntityReferenceResolver explicitStringEntityReferenceResolver0 = new ExplicitStringEntityReferenceResolver();
      DefaultSymbolScheme defaultSymbolScheme3 = new DefaultSymbolScheme();
      Injector.inject(explicitStringEntityReferenceResolver0, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) defaultSymbolScheme3);
      Injector.validateBean(explicitStringEntityReferenceResolver0, (Class<?>) ExplicitStringEntityReferenceResolver.class);
      explicitStringEntityReferenceResolver0.initialize();
      explicitStringEntityReferenceResolver0.initialize();
      EntityType entityType1 = EntityType.SPACE;
      // Undeclared exception!
      explicitStringEntityReferenceResolver0.resolve("", entityType1, objectArray0);
  }
}