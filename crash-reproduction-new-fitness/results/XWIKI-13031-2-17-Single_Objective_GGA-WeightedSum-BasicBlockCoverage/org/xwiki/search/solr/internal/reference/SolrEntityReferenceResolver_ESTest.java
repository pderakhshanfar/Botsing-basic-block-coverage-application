/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 18:45:20 UTC 2020
 */

package org.xwiki.search.solr.internal.reference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.function.BiFunction;
import org.apache.solr.common.SolrDocument;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.xwiki.model.EntityType;
import org.xwiki.model.internal.reference.DefaultStringEntityReferenceResolver;
import org.xwiki.model.internal.reference.RelativeStringEntityReferenceResolver;
import org.xwiki.model.reference.EntityReferenceProvider;
import org.xwiki.search.solr.internal.reference.SolrEntityReferenceResolver;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class SolrEntityReferenceResolver_ESTest extends SolrEntityReferenceResolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultStringEntityReferenceResolver defaultStringEntityReferenceResolver0 = new DefaultStringEntityReferenceResolver();
      DefaultStringEntityReferenceResolver defaultStringEntityReferenceResolver1 = new DefaultStringEntityReferenceResolver();
      EntityReferenceProvider entityReferenceProvider0 = mock(EntityReferenceProvider.class, new ViolatedAssumptionAnswer());
      DefaultStringEntityReferenceResolver defaultStringEntityReferenceResolver2 = new DefaultStringEntityReferenceResolver();
      Injector.inject(defaultStringEntityReferenceResolver2, (Class<?>) DefaultStringEntityReferenceResolver.class, "provider", (Object) entityReferenceProvider0);
      Injector.validateBean(defaultStringEntityReferenceResolver2, (Class<?>) DefaultStringEntityReferenceResolver.class);
      DefaultStringEntityReferenceResolver defaultStringEntityReferenceResolver3 = new DefaultStringEntityReferenceResolver();
      EntityReferenceProvider entityReferenceProvider1 = mock(EntityReferenceProvider.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultStringEntityReferenceResolver3, (Class<?>) DefaultStringEntityReferenceResolver.class, "provider", (Object) entityReferenceProvider1);
      Injector.validateBean(defaultStringEntityReferenceResolver3, (Class<?>) DefaultStringEntityReferenceResolver.class);
      DefaultStringEntityReferenceResolver defaultStringEntityReferenceResolver4 = new DefaultStringEntityReferenceResolver();
      EntityReferenceProvider entityReferenceProvider2 = mock(EntityReferenceProvider.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultStringEntityReferenceResolver4, (Class<?>) DefaultStringEntityReferenceResolver.class, "provider", (Object) entityReferenceProvider2);
      Injector.validateBean(defaultStringEntityReferenceResolver4, (Class<?>) DefaultStringEntityReferenceResolver.class);
      Object object0 = new Object();
      SolrDocument solrDocument0 = new SolrDocument();
      BiFunction<Object, Object, RelativeStringEntityReferenceResolver> biFunction0 = (BiFunction<Object, Object, RelativeStringEntityReferenceResolver>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      solrDocument0.replaceAll(biFunction0);
      SolrEntityReferenceResolver solrEntityReferenceResolver0 = new SolrEntityReferenceResolver();
      Injector.inject(solrEntityReferenceResolver0, (Class<?>) SolrEntityReferenceResolver.class, "explicitReferenceEntityReferenceResolver", (Object) defaultStringEntityReferenceResolver4);
      Injector.validateBean(solrEntityReferenceResolver0, (Class<?>) SolrEntityReferenceResolver.class);
      EntityType entityType0 = EntityType.OBJECT;
      Object[] objectArray0 = null;
      solrDocument0.putIfAbsent("wiki", object0);
      // Undeclared exception!
      solrEntityReferenceResolver0.resolve(solrDocument0, entityType0, (Object[]) null);
  }
}