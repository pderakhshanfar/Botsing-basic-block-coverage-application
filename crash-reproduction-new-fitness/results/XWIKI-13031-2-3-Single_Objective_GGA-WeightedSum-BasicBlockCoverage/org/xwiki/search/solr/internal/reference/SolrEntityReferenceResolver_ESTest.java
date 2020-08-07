/*
 * This file was automatically generated by EvoSuite
 * Thu May 14 14:18:10 UTC 2020
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
import org.xwiki.model.internal.reference.ExplicitStringEntityReferenceResolver;
import org.xwiki.model.reference.EntityReferenceProvider;
import org.xwiki.search.solr.internal.reference.SolrEntityReferenceResolver;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class SolrEntityReferenceResolver_ESTest extends SolrEntityReferenceResolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EntityReferenceProvider entityReferenceProvider0 = mock(EntityReferenceProvider.class, new ViolatedAssumptionAnswer());
      Object[] objectArray0 = null;
      SolrEntityReferenceResolver solrEntityReferenceResolver0 = new SolrEntityReferenceResolver();
      ExplicitStringEntityReferenceResolver explicitStringEntityReferenceResolver0 = new ExplicitStringEntityReferenceResolver();
      Injector.inject(solrEntityReferenceResolver0, (Class<?>) SolrEntityReferenceResolver.class, "explicitReferenceEntityReferenceResolver", (Object) explicitStringEntityReferenceResolver0);
      Injector.validateBean(solrEntityReferenceResolver0, (Class<?>) SolrEntityReferenceResolver.class);
      SolrDocument solrDocument0 = new SolrDocument();
      Object[] objectArray1 = new Object[6];
      SolrDocument solrDocument1 = new SolrDocument();
      solrDocument1.put("wiki", (Object) explicitStringEntityReferenceResolver0);
      EntityType entityType0 = EntityType.WIKI;
      // Undeclared exception!
      solrEntityReferenceResolver0.resolve(solrDocument1, entityType0, objectArray1);
  }
}