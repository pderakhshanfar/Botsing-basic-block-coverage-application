/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 12:51:20 UTC 2020
 */

package org.xwiki.model.internal.reference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.model.EntityType;
import org.xwiki.model.internal.reference.DefaultSymbolScheme;
import org.xwiki.model.internal.reference.ExplicitStringEntityReferenceResolver;
import org.xwiki.model.reference.EntityReferenceProvider;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractEntityReferenceResolver_ESTest extends AbstractEntityReferenceResolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ExplicitStringEntityReferenceResolver explicitStringEntityReferenceResolver0 = new ExplicitStringEntityReferenceResolver();
      EntityType entityType0 = EntityType.DOCUMENT;
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) entityType0;
      objectArray0[1] = (Object) explicitStringEntityReferenceResolver0;
      objectArray0[2] = (Object) explicitStringEntityReferenceResolver0;
      objectArray0[3] = (Object) explicitStringEntityReferenceResolver0;
      EntityReferenceProvider entityReferenceProvider0 = mock(EntityReferenceProvider.class, new ViolatedAssumptionAnswer());
      DefaultSymbolScheme defaultSymbolScheme0 = new DefaultSymbolScheme();
      EntityType entityType1 = EntityType.WIKI;
      Object[] objectArray1 = new Object[8];
      Object object0 = new Object();
      objectArray1[0] = object0;
      objectArray1[1] = (Object) defaultSymbolScheme0;
      objectArray1[2] = (Object) explicitStringEntityReferenceResolver0;
      Object object1 = new Object();
      objectArray1[3] = object1;
      objectArray1[4] = (Object) defaultSymbolScheme0;
      // Undeclared exception!
      explicitStringEntityReferenceResolver0.resolveDefaultReference(entityType1, objectArray1);
  }
}