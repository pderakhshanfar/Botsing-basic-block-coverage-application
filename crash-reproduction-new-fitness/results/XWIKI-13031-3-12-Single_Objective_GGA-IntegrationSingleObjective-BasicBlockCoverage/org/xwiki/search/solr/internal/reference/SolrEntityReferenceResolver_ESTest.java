/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 14:43:10 UTC 2020
 */

package org.xwiki.search.solr.internal.reference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.solr.common.SolrDocument;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.xwiki.model.EntityType;
import org.xwiki.model.internal.reference.DefaultReferenceEntityReferenceResolver;
import org.xwiki.model.internal.reference.ExplicitStringEntityReferenceResolver;
import org.xwiki.model.internal.reference.RelativeStringEntityReferenceResolver;
import org.xwiki.model.reference.EntityReferenceResolver;
import org.xwiki.search.solr.internal.reference.SolrEntityReferenceResolver;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class SolrEntityReferenceResolver_ESTest extends SolrEntityReferenceResolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EntityReferenceResolver<DefaultReferenceEntityReferenceResolver> entityReferenceResolver0 = (EntityReferenceResolver<DefaultReferenceEntityReferenceResolver>) mock(EntityReferenceResolver.class, new ViolatedAssumptionAnswer());
      EntityReferenceResolver<ExplicitStringEntityReferenceResolver> entityReferenceResolver1 = (EntityReferenceResolver<ExplicitStringEntityReferenceResolver>) mock(EntityReferenceResolver.class, new ViolatedAssumptionAnswer());
      SolrEntityReferenceResolver solrEntityReferenceResolver0 = new SolrEntityReferenceResolver();
      EntityReferenceResolver<RelativeStringEntityReferenceResolver> entityReferenceResolver2 = (EntityReferenceResolver<RelativeStringEntityReferenceResolver>) mock(EntityReferenceResolver.class, new ViolatedAssumptionAnswer());
      Injector.inject(solrEntityReferenceResolver0, (Class<?>) SolrEntityReferenceResolver.class, "explicitReferenceEntityReferenceResolver", (Object) entityReferenceResolver2);
      Injector.validateBean(solrEntityReferenceResolver0, (Class<?>) SolrEntityReferenceResolver.class);
      SolrDocument solrDocument0 = new SolrDocument();
      Object object0 = new Object();
      EntityType entityType0 = EntityType.OBJECT_PROPERTY;
      Object[] objectArray0 = new Object[5];
      Object object1 = new Object();
      objectArray0[0] = object1;
      Object object2 = new Object();
      solrDocument0.put("wiki", object2);
      objectArray0[1] = (Object) entityReferenceResolver0;
      objectArray0[2] = object0;
      objectArray0[3] = (Object) entityType0;
      objectArray0[4] = (Object) entityReferenceResolver1;
      // Undeclared exception!
      solrEntityReferenceResolver0.resolve(solrDocument0, entityType0, objectArray0);
  }
}