/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 14:42:32 UTC 2020
 */

package org.xwiki.search.solr.internal.reference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.function.Consumer;
import org.apache.solr.common.SolrDocument;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.xwiki.model.EntityType;
import org.xwiki.model.internal.reference.DefaultStringEntityReferenceResolver;
import org.xwiki.model.internal.reference.ExplicitStringEntityReferenceResolver;
import org.xwiki.model.reference.EntityReferenceProvider;
import org.xwiki.model.reference.EntityReferenceResolver;
import org.xwiki.search.solr.internal.reference.SolrEntityReferenceResolver;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class SolrEntityReferenceResolver_ESTest extends SolrEntityReferenceResolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultStringEntityReferenceResolver defaultStringEntityReferenceResolver0 = new DefaultStringEntityReferenceResolver();
      DefaultStringEntityReferenceResolver defaultStringEntityReferenceResolver1 = new DefaultStringEntityReferenceResolver();
      DefaultStringEntityReferenceResolver defaultStringEntityReferenceResolver2 = new DefaultStringEntityReferenceResolver();
      DefaultStringEntityReferenceResolver defaultStringEntityReferenceResolver3 = new DefaultStringEntityReferenceResolver();
      DefaultStringEntityReferenceResolver defaultStringEntityReferenceResolver4 = new DefaultStringEntityReferenceResolver();
      DefaultStringEntityReferenceResolver defaultStringEntityReferenceResolver5 = new DefaultStringEntityReferenceResolver();
      DefaultStringEntityReferenceResolver defaultStringEntityReferenceResolver6 = new DefaultStringEntityReferenceResolver();
      DefaultStringEntityReferenceResolver defaultStringEntityReferenceResolver7 = new DefaultStringEntityReferenceResolver();
      EntityReferenceProvider entityReferenceProvider0 = mock(EntityReferenceProvider.class, new ViolatedAssumptionAnswer());
      DefaultStringEntityReferenceResolver defaultStringEntityReferenceResolver8 = new DefaultStringEntityReferenceResolver();
      Object[] objectArray0 = null;
      SolrDocument solrDocument0 = new SolrDocument();
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      solrDocument0.forEach(consumer0);
      SolrDocument solrDocument1 = new SolrDocument();
      solrDocument0.put("wiki", (Object) solrDocument1);
      LinkedList<SolrDocument> linkedList0 = new LinkedList<SolrDocument>();
      linkedList0.pollFirst();
      solrDocument0.addChildDocuments(linkedList0);
      EntityType entityType0 = EntityType.BLOCK;
      SolrEntityReferenceResolver solrEntityReferenceResolver0 = new SolrEntityReferenceResolver();
      EntityReferenceResolver<ExplicitStringEntityReferenceResolver> entityReferenceResolver0 = (EntityReferenceResolver<ExplicitStringEntityReferenceResolver>) mock(EntityReferenceResolver.class, new ViolatedAssumptionAnswer());
      Injector.inject(solrEntityReferenceResolver0, (Class<?>) SolrEntityReferenceResolver.class, "explicitReferenceEntityReferenceResolver", (Object) entityReferenceResolver0);
      Injector.validateBean(solrEntityReferenceResolver0, (Class<?>) SolrEntityReferenceResolver.class);
      // Undeclared exception!
      solrEntityReferenceResolver0.resolve(solrDocument0, entityType0, (Object[]) null);
  }
}