/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Mar 31 02:29:15 UTC 2020
 */

package com.xpn.xwiki.internal.skin;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class AbstractSkin_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.xpn.xwiki.internal.skin.AbstractSkin"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AbstractSkin_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.http.conn.scheme.LayeredSocketFactory",
      "org.xwiki.component.phase.Initializable",
      "org.apache.http.impl.conn.HttpConnPool",
      "org.xwiki.model.reference.EntityReference",
      "org.xwiki.component.phase.InitializationException",
      "org.xwiki.skin.Resource",
      "com.xpn.xwiki.internal.skin.AbstractResource",
      "org.apache.commons.lang.exception.NestableException",
      "org.apache.http.impl.conn.SystemDefaultDnsResolver",
      "org.apache.http.HttpMessage",
      "org.apache.http.conn.ssl.SSLSocketFactory",
      "org.xwiki.skin.Skin",
      "com.xpn.xwiki.internal.ReadOnlyXWikiContextProvider",
      "org.apache.http.pool.AbstractConnPool",
      "org.apache.http.conn.HttpInetSocketAddress",
      "org.apache.http.conn.ClientConnectionManager",
      "org.apache.http.conn.scheme.SchemeSocketFactory",
      "org.apache.http.impl.conn.SchemeRegistryFactory",
      "org.apache.http.HttpInetConnection",
      "com.xpn.xwiki.internal.skin.AbstractSkin",
      "org.apache.http.HttpRequest",
      "org.apache.http.pool.ConnPoolControl",
      "org.apache.http.pool.AbstractConnPool$1",
      "org.apache.http.conn.ssl.AllowAllHostnameVerifier",
      "org.xwiki.context.ExecutionContext",
      "org.apache.http.conn.socket.ConnectionSocketFactory",
      "org.apache.http.impl.conn.HttpPoolEntry",
      "org.xwiki.observation.EventListener",
      "org.apache.http.client.CredentialsProvider",
      "org.apache.commons.configuration.ConfigurationException",
      "org.apache.http.params.SyncBasicHttpParams",
      "org.apache.commons.configuration.Configuration",
      "org.apache.http.conn.scheme.PlainSocketFactory",
      "org.apache.http.pool.RouteSpecificPool",
      "org.apache.http.pool.PoolEntry",
      "org.apache.http.impl.conn.HttpConnPool$InternalConnFactory",
      "org.apache.http.params.AbstractHttpParams",
      "org.apache.http.client.methods.HttpUriRequest",
      "com.xpn.xwiki.internal.skin.WikiSkin",
      "org.apache.http.conn.ssl.AbstractVerifier",
      "org.apache.http.conn.ConnectTimeoutException",
      "org.apache.http.client.HttpClient",
      "org.apache.http.impl.conn.PoolingClientConnectionManager",
      "org.xwiki.context.Execution",
      "org.xwiki.environment.Environment",
      "org.apache.http.HttpClientConnection",
      "org.apache.http.conn.ConnectionPoolTimeoutException",
      "org.apache.http.conn.ssl.SSLContexts",
      "org.xwiki.rendering.internal.syntax.DefaultSyntaxFactory",
      "org.apache.http.pool.ConnPool",
      "org.xwiki.skin.ResourceRepository",
      "org.xwiki.model.reference.DocumentReference",
      "org.apache.http.protocol.HttpContext",
      "org.apache.http.params.HttpParams",
      "com.xpn.xwiki.XWikiContext",
      "org.xwiki.rendering.parser.ParseException",
      "org.apache.http.impl.client.DefaultHttpClient",
      "org.apache.http.params.BasicHttpParams",
      "ucar.httpservices.HTTPSession$Settings",
      "org.apache.http.conn.scheme.LayeredSchemeSocketFactory",
      "org.apache.http.conn.scheme.SchemeLayeredSocketFactory",
      "org.apache.http.conn.ssl.StrictHostnameVerifier",
      "org.xwiki.rendering.syntax.Syntax",
      "org.xwiki.component.annotation.Role",
      "org.apache.http.conn.ssl.X509HostnameVerifier",
      "com.xpn.xwiki.internal.skin.InternalSkinManager",
      "com.xpn.xwiki.internal.skin.AbstractSkin$1",
      "org.xwiki.cache.config.CacheConfiguration",
      "org.apache.http.conn.ssl.SSLInitializationException",
      "org.apache.http.params.HttpParamsNames",
      "ucar.httpservices.HTTPSession",
      "org.apache.http.util.Args",
      "org.apache.http.HttpEntity",
      "org.apache.http.pool.PoolEntryCallback",
      "org.xwiki.cache.config.LRUCacheConfiguration",
      "org.apache.http.conn.socket.LayeredConnectionSocketFactory",
      "org.apache.http.conn.OperatedClientConnection",
      "org.apache.http.pool.ConnFactory",
      "org.apache.http.conn.scheme.Scheme",
      "org.apache.http.conn.ssl.BrowserCompatHostnameVerifier",
      "org.apache.http.conn.scheme.SocketFactory",
      "ucar.httpservices.HTTPException",
      "com.xpn.xwiki.internal.skin.InternalSkinConfiguration",
      "org.xwiki.component.annotation.Component",
      "org.apache.http.conn.DnsResolver",
      "org.apache.http.conn.ClientConnectionRequest",
      "com.xpn.xwiki.internal.skin.AbstractEnvironmentResource",
      "org.apache.http.conn.ClientConnectionOperator",
      "org.apache.http.impl.client.AbstractHttpClient",
      "ucar.httpservices.CustomSSLProtocolSocketFactory",
      "org.apache.http.conn.scheme.SchemeRegistry",
      "org.apache.http.impl.client.CloseableHttpClient",
      "org.apache.http.conn.ManagedClientConnection",
      "org.apache.http.conn.HttpRoutedConnection",
      "ucar.httpservices.CustomX509TrustManager",
      "com.xpn.xwiki.internal.skin.SkinEnvironmentResource",
      "org.xwiki.rendering.syntax.SyntaxFactory",
      "org.apache.commons.lang.exception.Nestable",
      "org.apache.http.impl.conn.DefaultClientConnectionOperator",
      "org.apache.http.conn.ConnectionReleaseTrigger",
      "org.apache.http.HttpConnection",
      "org.apache.http.conn.ManagedHttpClientConnection",
      "org.xwiki.cache.CacheException",
      "com.xpn.xwiki.internal.skin.EnvironmentSkin"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.xwiki.context.Execution", false, AbstractSkin_ESTest_scaffolding.class.getClassLoader()));
  }
}