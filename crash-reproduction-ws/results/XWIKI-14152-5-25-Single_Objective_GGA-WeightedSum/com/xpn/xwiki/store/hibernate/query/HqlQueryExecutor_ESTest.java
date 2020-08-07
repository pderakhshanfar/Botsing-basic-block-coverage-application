/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 30 17:00:23 UTC 2020
 */

package com.xpn.xwiki.store.hibernate.query;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ch.qos.logback.classic.Logger;
import com.xpn.xwiki.store.hibernate.query.HqlQueryExecutor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.hibernate.Session;
import org.junit.runner.RunWith;
import org.xwiki.component.manager.ComponentManager;
import org.xwiki.query.QueryFilter;
import org.xwiki.query.internal.CountDocumentFilter;
import org.xwiki.query.internal.DefaultQuery;
import org.xwiki.query.internal.ScriptQuery;
import org.xwiki.security.authorization.ContextualAuthorizationManager;
import ucar.nc2.util.net.URLStreamHandlerFactory;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class HqlQueryExecutor_ESTest extends HqlQueryExecutor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HqlQueryExecutor hqlQueryExecutor0 = new HqlQueryExecutor();
      ContextualAuthorizationManager contextualAuthorizationManager0 = mock(ContextualAuthorizationManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class, "authorization", (Object) contextualAuthorizationManager0);
      DefaultQuery defaultQuery0 = new DefaultQuery("`fqK}w", "`fqK}w", hqlQueryExecutor0);
      ScriptQuery scriptQuery0 = new ScriptQuery(defaultQuery0, (ComponentManager) null);
      CountDocumentFilter countDocumentFilter0 = new CountDocumentFilter();
      Logger logger0 = (Logger)URLStreamHandlerFactory.log;
      Injector.inject(countDocumentFilter0, (Class<?>) CountDocumentFilter.class, "logger", (Object) logger0);
      Injector.validateBean(countDocumentFilter0, (Class<?>) CountDocumentFilter.class);
      scriptQuery0.addFilter((QueryFilter) countDocumentFilter0);
      // Undeclared exception!
      hqlQueryExecutor0.createHibernateQuery((Session) null, defaultQuery0);
  }
}