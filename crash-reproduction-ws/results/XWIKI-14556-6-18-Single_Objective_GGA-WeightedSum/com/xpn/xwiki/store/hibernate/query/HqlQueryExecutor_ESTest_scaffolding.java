/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Apr 01 13:53:33 UTC 2020
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
      "org.xwiki.query.internal.LanguageQueryFilter",
      "org.xwiki.security.authorization.Right",
      "org.xwiki.component.phase.Initializable",
      "org.xwiki.query.QueryFilter",
      "javatests.Associative",
      "org.xwiki.query.Query",
      "org.xwiki.model.reference.EntityReference",
      "org.hibernate.util.MarkerObject",
      "org.python.util.Generic",
      "org.hibernate.engine.RowSelection",
      "com.xpn.xwiki.store.XWikiStoreInterface",
      "org.xwiki.component.phase.InitializationException",
      "com.xpn.xwiki.store.hibernate.query.HqlQueryExecutor",
      "org.hibernate.NonUniqueResultException",
      "org.xwiki.component.annotation.Role",
      "org.hibernate.Query",
      "org.hibernate.engine.SessionImplementor",
      "org.hibernate.cfg.Configuration",
      "org.xwiki.query.SecureQuery",
      "org.hibernate.engine.query.OrdinalParameterDescriptor",
      "org.hibernate.impl.AbstractQueryImpl",
      "org.hibernate.LockOptions",
      "org.hibernate.impl.CollectionFilterImpl",
      "org.hibernate.ScrollableResults",
      "com.xpn.xwiki.store.XWikiHibernateStore",
      "org.hibernate.SessionFactory",
      "org.xwiki.security.authorization.AuthorizationException",
      "org.hibernate.engine.query.ParameterMetadata",
      "org.hibernate.CacheMode",
      "javatests.Seqable",
      "javatests.IFn",
      "com.xpn.xwiki.store.hibernate.HibernateSessionFactory",
      "org.xwiki.context.ExecutionContext",
      "org.xwiki.security.authorization.AccessDeniedException",
      "org.hibernate.MappingException",
      "org.hibernate.engine.query.NamedParameterDescriptor",
      "org.hibernate.ScrollMode",
      "org.hibernate.HibernateException",
      "org.xwiki.logging.Message",
      "org.hibernate.QueryException",
      "org.xwiki.query.QueryParameter",
      "org.hibernate.impl.QueryImpl",
      "org.hibernate.QueryParameterException",
      "org.xwiki.query.QueryException",
      "javatests.IPersistentCollection",
      "org.xwiki.component.annotation.Component",
      "org.hibernate.Session",
      "javatests.AFn",
      "org.xwiki.component.manager.ComponentLookupException",
      "org.xwiki.security.authorization.RightDescription",
      "org.xwiki.security.authorization.ContextualAuthorizationManager",
      "org.hibernate.PropertyNotFoundException",
      "org.xwiki.query.internal.DefaultQuery",
      "org.hibernate.property.Getter",
      "javatests.IPersistentMap",
      "javatests.Counted",
      "com.xpn.xwiki.store.XWikiHibernateBaseStore$HibernateCallback",
      "org.xwiki.context.Execution",
      "org.xwiki.query.QueryExecutor",
      "org.hibernate.LockMode",
      "org.hibernate.FlushMode",
      "javatests.ILookup",
      "javatests.DiamondIterableMapMRO",
      "org.hibernate.engine.Mapping",
      "org.hibernate.engine.QueryParameters",
      "com.xpn.xwiki.XWikiContext",
      "com.xpn.xwiki.store.XWikiHibernateBaseStore",
      "org.xwiki.job.event.status.JobProgressManager",
      "org.hibernate.type.Type",
      "org.hibernate.transform.ResultTransformer"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("com.xpn.xwiki.store.hibernate.HibernateSessionFactory", false, HqlQueryExecutor_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("javax.inject.Provider", false, HqlQueryExecutor_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.xwiki.context.Execution", false, HqlQueryExecutor_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.xwiki.job.event.status.JobProgressManager", false, HqlQueryExecutor_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.xwiki.security.authorization.ContextualAuthorizationManager", false, HqlQueryExecutor_ESTest_scaffolding.class.getClassLoader()));
  }
}