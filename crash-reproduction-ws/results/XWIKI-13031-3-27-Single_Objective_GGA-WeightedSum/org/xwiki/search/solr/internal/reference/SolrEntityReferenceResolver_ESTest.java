/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 17 17:50:58 UTC 2020
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
      Object[] objectArray0 = new Object[1];
      SolrEntityReferenceResolver solrEntityReferenceResolver0 = new SolrEntityReferenceResolver();
      SolrDocument solrDocument0 = new SolrDocument();
      EntityType entityType0 = EntityType.ATTACHMENT;
      solrDocument0.put("wiki", (Object) entityReferenceResolver0);
      // Undeclared exception!
      solrEntityReferenceResolver0.resolve(solrDocument0, entityType0, objectArray0);
  }
}