/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 14:41:42 UTC 2020
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
import org.xwiki.model.reference.EntityReferenceResolver;
import org.xwiki.search.solr.internal.reference.SolrEntityReferenceResolver;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class SolrEntityReferenceResolver_ESTest extends SolrEntityReferenceResolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EntityReferenceResolver<DefaultReferenceEntityReferenceResolver> entityReferenceResolver0 = (EntityReferenceResolver<DefaultReferenceEntityReferenceResolver>) mock(EntityReferenceResolver.class, new ViolatedAssumptionAnswer());
      SolrEntityReferenceResolver solrEntityReferenceResolver0 = new SolrEntityReferenceResolver();
      EntityReferenceResolver<Integer> entityReferenceResolver1 = (EntityReferenceResolver<Integer>) mock(EntityReferenceResolver.class, new ViolatedAssumptionAnswer());
      Injector.inject(solrEntityReferenceResolver0, (Class<?>) SolrEntityReferenceResolver.class, "explicitReferenceEntityReferenceResolver", (Object) entityReferenceResolver1);
      Injector.validateBean(solrEntityReferenceResolver0, (Class<?>) SolrEntityReferenceResolver.class);
      EntityType entityType0 = EntityType.OBJECT;
      SolrEntityReferenceResolver solrEntityReferenceResolver1 = new SolrEntityReferenceResolver();
      Injector.inject(solrEntityReferenceResolver1, (Class<?>) SolrEntityReferenceResolver.class, "explicitReferenceEntityReferenceResolver", (Object) solrEntityReferenceResolver0);
      Injector.validateBean(solrEntityReferenceResolver1, (Class<?>) SolrEntityReferenceResolver.class);
      Object[] objectArray0 = new Object[0];
      SolrDocument solrDocument0 = new SolrDocument();
      solrDocument0.put("wiki", (Object) entityType0);
      EntityType entityType1 = EntityType.DOCUMENT;
      // Undeclared exception!
      solrEntityReferenceResolver0.resolve(solrDocument0, entityType1, objectArray0);
  }
}