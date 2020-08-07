/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 12:16:05 UTC 2020
 */

package com.xpn.xwiki.store.hibernate.query;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.store.hibernate.query.HqlQueryExecutor;
import java.util.Map;
import javax.inject.Provider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.engine.query.OrdinalParameterDescriptor;
import org.hibernate.engine.query.ParameterMetadata;
import org.hibernate.impl.CollectionFilterImpl;
import org.junit.runner.RunWith;
import org.slf4j.helpers.NOPLogger;
import org.xwiki.context.Execution;
import org.xwiki.query.SecureQuery;
import org.xwiki.query.internal.DefaultQuery;
import org.xwiki.query.internal.UniqueDocumentFilter;
import org.xwiki.security.authorization.ContextualAuthorizationManager;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class HqlQueryExecutor_ESTest extends HqlQueryExecutor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HqlQueryExecutor hqlQueryExecutor0 = new HqlQueryExecutor();
      ContextualAuthorizationManager contextualAuthorizationManager0 = mock(ContextualAuthorizationManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class, "authorization", (Object) contextualAuthorizationManager0);
      Provider<UniqueDocumentFilter> provider0 = (Provider<UniqueDocumentFilter>) mock(Provider.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class, "componentManagerProvider", (Object) provider0);
      Execution execution0 = mock(Execution.class, new ViolatedAssumptionAnswer());
      UniqueDocumentFilter uniqueDocumentFilter0 = new UniqueDocumentFilter();
      NOPLogger nOPLogger0 = NOPLogger.NOP_LOGGER;
      Injector.inject(uniqueDocumentFilter0, (Class<?>) UniqueDocumentFilter.class, "logger", (Object) nOPLogger0);
      Injector.validateBean(uniqueDocumentFilter0, (Class<?>) UniqueDocumentFilter.class);
      ParameterMetadata parameterMetadata0 = new ParameterMetadata((OrdinalParameterDescriptor[]) null, (Map) null);
      CollectionFilterImpl collectionFilterImpl0 = new CollectionFilterImpl("order by text/csv", uniqueDocumentFilter0, (SessionImplementor) null, parameterMetadata0);
      DefaultQuery defaultQuery0 = new DefaultQuery("z7$,,(S3\"VQto?k@G<", "rO&Qt3+'bUN^?", hqlQueryExecutor0);
      SecureQuery secureQuery0 = defaultQuery0.checkCurrentAuthor(true);
      defaultQuery0.bindValue("zFeKN&u:XN[u5");
      // Undeclared exception!
      hqlQueryExecutor0.populateParameters(collectionFilterImpl0, secureQuery0);
  }
}