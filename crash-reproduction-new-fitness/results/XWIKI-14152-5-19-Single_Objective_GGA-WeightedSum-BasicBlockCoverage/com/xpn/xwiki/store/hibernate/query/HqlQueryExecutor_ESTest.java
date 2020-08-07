/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 17:11:58 UTC 2020
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
import org.hibernate.loader.custom.sql.SQLCustomQuery;
import org.junit.runner.RunWith;
import org.xwiki.query.SecureQuery;
import org.xwiki.query.internal.CountDocumentFilter;
import org.xwiki.query.internal.DefaultQuery;
import org.xwiki.security.authorization.ContextualAuthorizationManager;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class HqlQueryExecutor_ESTest extends HqlQueryExecutor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HqlQueryExecutor hqlQueryExecutor0 = new HqlQueryExecutor();
      ContextualAuthorizationManager contextualAuthorizationManager0 = mock(ContextualAuthorizationManager.class, new ViolatedAssumptionAnswer());
      Session session0 = null;
      DefaultQuery defaultQuery0 = new DefaultQuery("xSikic%ntext", "xSikic%ntext", hqlQueryExecutor0);
      CountDocumentFilter countDocumentFilter0 = new CountDocumentFilter();
      Logger logger0 = (Logger)SQLCustomQuery.log;
      Injector.inject(countDocumentFilter0, (Class<?>) CountDocumentFilter.class, "logger", (Object) logger0);
      Injector.validateBean(countDocumentFilter0, (Class<?>) CountDocumentFilter.class);
      defaultQuery0.addFilter(countDocumentFilter0);
      SecureQuery secureQuery0 = defaultQuery0.checkCurrentAuthor(false);
      // Undeclared exception!
      hqlQueryExecutor0.createHibernateQuery((Session) null, secureQuery0);
  }
}