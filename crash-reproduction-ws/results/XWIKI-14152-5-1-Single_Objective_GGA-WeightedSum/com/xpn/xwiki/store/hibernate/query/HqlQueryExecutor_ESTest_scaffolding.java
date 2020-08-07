/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Mar 30 16:47:37 UTC 2020
 */

package com.xpn.xwiki.store.hibernate.query;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class HqlQueryExecutor_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.xpn.xwiki.store.hibernate.query.HqlQueryExecutor"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 


  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(HqlQueryExecutor_ESTest_scaffolding.class.getClassLoader() ,
      "com.xpn.xwiki.XWikiException",
      "org.xwiki.security.authorization.Right",
      "org.xwiki.component.phase.Initializable",
      "org.xwiki.query.QueryFilter",
      "org.xwiki.query.Query",
      "org.hibernate.stat.SessionStatistics",
      "org.xwiki.model.reference.EntityReference",
      "org.hibernate.Filter",
      "org.hibernate.SQLQuery",
      "com.xpn.xwiki.store.XWikiStoreInterface",
      "org.xwiki.component.phase.InitializationException",
      "com.xpn.xwiki.store.hibernate.query.HqlQueryExecutor",
      "org.hibernate.Transaction",
      "org.hibernate.LobHelper",
      "org.xwiki.component.annotation.Role",
      "org.hibernate.Query",
      "org.hibernate.cfg.Configuration",
      "org.xwiki.query.SecureQuery",
      "org.hibernate.LockOptions",
      "org.hibernate.ScrollableResults",
      "com.xpn.xwiki.store.XWikiHibernateStore",
      "org.hibernate.SessionFactory",
      "org.xwiki.security.authorization.AuthorizationException",
      "org.hibernate.CacheMode",
      "org.hibernate.criterion.CriteriaSpecification",
      "com.xpn.xwiki.store.hibernate.HibernateSessionFactory",
      "org.xwiki.context.ExecutionContext",
      "org.xwiki.security.authorization.AccessDeniedException",
      "org.hibernate.ScrollMode",
      "org.hibernate.HibernateException",
      "org.xwiki.logging.Message",
      "org.hibernate.Criteria",
      "org.xwiki.query.QueryException",
      "org.xwiki.query.internal.CountDocumentFilter",
      "org.xwiki.component.annotation.Component",
      "org.hibernate.TypeHelper",
      "org.hibernate.Session",
      "org.xwiki.security.authorization.RightDescription",
      "org.xwiki.security.authorization.ContextualAuthorizationManager",
      "org.xwiki.query.internal.AbstractQueryFilter",
      "org.xwiki.query.internal.DefaultQuery",
      "com.xpn.xwiki.store.XWikiHibernateBaseStore$HibernateCallback",
      "org.xwiki.context.Execution",
      "org.xwiki.query.QueryExecutor",
      "org.hibernate.LockMode",
      "org.hibernate.EntityMode",
      "org.hibernate.Session$LockRequest",
      "org.hibernate.FlushMode",
      "org.hibernate.jdbc.Work",
      "org.hibernate.UnknownProfileException",
      "com.xpn.xwiki.XWikiContext",
      "com.xpn.xwiki.store.XWikiHibernateBaseStore",
      "org.xwiki.job.event.status.JobProgressManager",
      "org.hibernate.ReplicationMode",
      "org.hibernate.type.Type",
      "org.hibernate.transform.ResultTransformer"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("com.xpn.xwiki.store.hibernate.HibernateSessionFactory", false, HqlQueryExecutor_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.hibernate.Session", false, HqlQueryExecutor_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.xwiki.context.Execution", false, HqlQueryExecutor_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.xwiki.job.event.status.JobProgressManager", false, HqlQueryExecutor_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.xwiki.security.authorization.ContextualAuthorizationManager", false, HqlQueryExecutor_ESTest_scaffolding.class.getClassLoader()));
  }
}