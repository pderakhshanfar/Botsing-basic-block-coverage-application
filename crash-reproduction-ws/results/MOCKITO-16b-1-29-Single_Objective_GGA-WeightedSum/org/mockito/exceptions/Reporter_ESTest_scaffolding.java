/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Mar 31 12:29:06 UTC 2020
 */

package org.mockito.exceptions;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;

@EvoSuiteClassExclude
public class Reporter_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.mockito.exceptions.Reporter"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Reporter_ESTest_scaffolding.class.getClassLoader() ,
      "org.mockito.exceptions.misusing.UnfinishedStubbingException",
      "org.mockito.configuration.AnnotationEngine",
      "org.mockito.exceptions.misusing.UnfinishedVerificationException",
      "org.mockito.exceptions.verification.NoInteractionsWanted",
      "org.mockito.exceptions.Discrepancy",
      "org.mockito.exceptions.PrintableInvocation",
      "org.mockito.exceptions.Reporter",
      "org.mockito.exceptions.verification.VerificationInOrderFailure",
      "org.mockito.configuration.DefaultMockitoConfiguration",
      "org.mockito.internal.configuration.ClassPathLoader",
      "org.mockito.exceptions.base.MockitoException",
      "org.mockito.exceptions.misusing.NullInsteadOfMockException",
      "org.mockito.internal.exceptions.base.ConditionalStackTraceFilter",
      "org.mockito.stubbing.Answer",
      "org.mockito.internal.exceptions.base.StackTraceFilter",
      "org.mockito.exceptions.verification.WantedButNotInvoked",
      "org.mockito.internal.util.StringJoiner",
      "org.mockito.exceptions.misusing.NotAMockException",
      "org.mockito.internal.debugging.Location",
      "org.mockito.configuration.IMockitoConfiguration",
      "org.mockito.exceptions.misusing.MissingMethodInvocationException",
      "org.mockito.exceptions.verification.SmartNullPointerException",
      "org.mockito.exceptions.verification.TooLittleActualInvocations",
      "org.mockito.exceptions.misusing.WrongTypeOfReturnValue",
      "org.mockito.internal.configuration.GlobalConfiguration",
      "org.mockito.exceptions.base.MockitoAssertionError",
      "org.mockito.exceptions.verification.TooManyActualInvocations",
      "org.mockito.exceptions.verification.ArgumentsAreDifferent",
      "org.mockito.exceptions.verification.NeverWantedButInvoked",
      "org.mockito.exceptions.misusing.MockitoConfigurationException",
      "org.mockito.configuration.MockitoConfiguration",
      "org.mockito.exceptions.misusing.InvalidUseOfMatchersException"
    );
  } 
}