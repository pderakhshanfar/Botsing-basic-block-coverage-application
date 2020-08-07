/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 16:02:49 UTC 2020
 */

package com.xpn.xwiki.store.hibernate.query;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.store.hibernate.query.HqlQueryExecutor;
import java.util.Hashtable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.hibernate.CacheMode;
import org.hibernate.Query;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.engine.query.OrdinalParameterDescriptor;
import org.hibernate.engine.query.ParameterMetadata;
import org.hibernate.impl.CollectionFilterImpl;
import org.junit.runner.RunWith;
import org.xwiki.component.internal.ContextRootComponentManager;
import org.xwiki.query.internal.DefaultQuery;
import org.xwiki.query.internal.ScriptQueryParameter;
import org.xwiki.rendering.block.CompositeBlock;
import org.xwiki.security.authorization.ContextualAuthorizationManager;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class HqlQueryExecutor_ESTest extends HqlQueryExecutor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HqlQueryExecutor hqlQueryExecutor0 = new HqlQueryExecutor();
      ContextualAuthorizationManager contextualAuthorizationManager0 = mock(ContextualAuthorizationManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class, "authorization", (Object) contextualAuthorizationManager0);
      DefaultQuery defaultQuery0 = new DefaultQuery("", "vznC)\"sm", hqlQueryExecutor0);
      CompositeBlock compositeBlock0 = new CompositeBlock();
      defaultQuery0.bindValue("=y*iqNCVD", (Object) compositeBlock0);
      SessionImplementor sessionImplementor0 = mock(SessionImplementor.class, new ViolatedAssumptionAnswer());
      Hashtable<ContextRootComponentManager, ScriptQueryParameter> hashtable0 = new Hashtable<ContextRootComponentManager, ScriptQueryParameter>();
      ParameterMetadata parameterMetadata0 = new ParameterMetadata((OrdinalParameterDescriptor[]) null, hashtable0);
      CollectionFilterImpl collectionFilterImpl0 = new CollectionFilterImpl("=y*iqNCVD", "where ", sessionImplementor0, parameterMetadata0);
      CacheMode.parse("tooltip");
      Query query0 = collectionFilterImpl0.setCacheMode((CacheMode) null);
      // Undeclared exception!
      hqlQueryExecutor0.populateParameters(query0, defaultQuery0);
  }
}