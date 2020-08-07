/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon May 18 03:53:36 UTC 2020
 */

package org.mockito.internal;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;

@EvoSuiteClassExclude
public class MockitoCore_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.mockito.internal.MockitoCore"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(MockitoCore_ESTest_scaffolding.class.getClassLoader() ,
      "org.mockito.cglib.proxy.FixedValueGenerator",
      "org.mockito.cglib.proxy.InvocationHandlerGenerator",
      "org.mockito.internal.invocation.InvocationMatcher",
      "org.mockito.internal.util.ObjectMethodsGuru",
      "org.mockito.internal.verification.AtLeast",
      "org.mockito.internal.creation.jmock.ClassImposterizer$ClassWithSuperclassToWorkAroundCglibBug",
      "org.mockito.cglib.core.LocalVariablesSorter",
      "org.mockito.cglib.core.ClassNameReader$1",
      "org.mockito.cglib.core.ReflectUtils",
      "org.mockito.internal.invocation.realmethod.FilteredCGLIBProxyRealMethod",
      "org.mockito.cglib.proxy.CallbackGenerator",
      "org.mockito.cglib.core.ClassInfo",
      "org.mockito.cglib.core.ObjectSwitchCallback",
      "org.mockito.exceptions.misusing.NotAMockException",
      "org.mockito.internal.stubbing.OngoingStubbingImpl",
      "org.mockito.cglib.core.ClassEmitter$FieldInfo",
      "org.mockito.internal.creation.jmock.ClassImposterizer",
      "org.mockito.exceptions.verification.SmartNullPointerException",
      "org.mockito.internal.progress.MockingProgressImpl",
      "org.mockito.cglib.core.Local",
      "org.mockito.cglib.core.ClassNameReader$EarlyExitException",
      "org.mockito.internal.configuration.GlobalConfiguration",
      "org.objenesis.Objenesis",
      "org.mockito.cglib.proxy.CallbackGenerator$Context",
      "org.mockito.asm.Item",
      "org.mockito.cglib.core.Transformer",
      "org.mockito.exceptions.misusing.MockitoConfigurationException",
      "org.mockito.internal.progress.IOngoingStubbing",
      "org.mockito.cglib.proxy.MethodProxy$CreateInfo",
      "org.mockito.cglib.core.CodeEmitter$State",
      "org.mockito.internal.MockitoCore",
      "org.mockito.cglib.core.KeyFactory$Generator",
      "org.mockito.stubbing.Stubber",
      "org.mockito.asm.Type",
      "org.mockito.stubbing.Answer",
      "org.mockito.cglib.core.ClassEmitter$3",
      "org.mockito.internal.progress.ArgumentMatcherStorageImpl",
      "org.mockito.cglib.proxy.Enhancer",
      "org.mockito.cglib.core.ProcessArrayCallback",
      "org.mockito.internal.verification.NoMoreInteractions",
      "org.mockito.asm.Opcodes",
      "org.objenesis.instantiator.ObjectInstantiator",
      "org.objenesis.strategy.StdInstantiatorStrategy",
      "org.mockito.cglib.core.ClassEmitter$1",
      "org.mockito.exceptions.misusing.WrongTypeOfReturnValue",
      "org.mockito.MockSettings",
      "org.mockito.cglib.proxy.ProxyRefDispatcher",
      "org.mockito.cglib.core.EmitUtils$ArrayDelimiters",
      "org.mockito.exceptions.base.MockitoAssertionError",
      "org.mockito.internal.invocation.InvocationMarker",
      "org.mockito.asm.ClassVisitor",
      "org.mockito.exceptions.verification.NeverWantedButInvoked",
      "org.mockito.cglib.core.CodeGenerationException",
      "org.mockito.internal.util.CreationValidator",
      "org.mockito.cglib.core.CollectionUtils",
      "org.hamcrest.Matcher",
      "org.mockito.asm.MethodAdapter",
      "org.mockito.internal.util.MockName",
      "org.mockito.internal.creation.SerializableMockitoMethodProxy",
      "org.mockito.cglib.core.KeyFactory$2",
      "org.mockito.cglib.core.KeyFactory$1",
      "org.mockito.cglib.core.Customizer",
      "org.mockito.exceptions.Reporter",
      "org.mockito.cglib.reflect.FastClass",
      "org.mockito.stubbing.VoidMethodStubbable",
      "org.mockito.cglib.core.DebuggingClassWriter",
      "org.mockito.cglib.core.NamingPolicy",
      "org.mockito.cglib.proxy.NoOp",
      "org.mockito.internal.verification.RegisteredInvocations",
      "org.mockito.cglib.core.LocalVariablesSorter$State",
      "org.mockito.internal.MockHandler",
      "org.mockito.internal.verification.AtMost",
      "org.mockito.cglib.core.DebuggingClassWriter$1",
      "org.mockito.internal.creation.cglib.MockitoNamingPolicy",
      "org.mockito.exceptions.verification.ArgumentsAreDifferent",
      "org.hamcrest.SelfDescribing",
      "org.mockito.asm.FieldWriter",
      "org.mockito.configuration.MockitoConfiguration",
      "org.mockito.exceptions.misusing.InvalidUseOfMatchersException",
      "org.mockito.cglib.proxy.MethodInterceptorGenerator",
      "org.mockito.internal.invocation.Invocation",
      "org.mockito.cglib.proxy.Dispatcher",
      "org.mockito.internal.debugging.DebuggingInfo",
      "org.mockito.cglib.core.DefaultNamingPolicy",
      "org.mockito.cglib.core.CodeEmitter",
      "org.mockito.internal.configuration.ClassPathLoader",
      "org.mockito.exceptions.base.MockitoException",
      "org.mockito.internal.invocation.realmethod.HasCGLIBMethodProxy",
      "org.mockito.internal.exceptions.base.ConditionalStackTraceFilter",
      "org.mockito.internal.MockHandlerInterface",
      "org.mockito.internal.verification.Only",
      "org.mockito.internal.stubbing.ConsecutiveStubbing",
      "org.mockito.asm.Edge",
      "org.mockito.asm.Label",
      "org.mockito.cglib.core.Signature",
      "org.mockito.internal.stubbing.BaseStubbing",
      "org.mockito.internal.debugging.Location",
      "org.mockito.cglib.proxy.CallbackFilter",
      "org.mockito.cglib.core.EmitUtils$8",
      "org.mockito.cglib.core.EmitUtils$9",
      "org.mockito.cglib.core.EmitUtils$7",
      "org.mockito.asm.Frame",
      "org.mockito.asm.ClassWriter",
      "org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod",
      "org.mockito.cglib.core.MethodInfo",
      "org.mockito.cglib.proxy.Callback",
      "org.mockito.exceptions.misusing.UnfinishedVerificationException",
      "org.mockito.cglib.proxy.MethodInterceptorGenerator$1",
      "org.mockito.internal.stubbing.InvocationContainer",
      "org.mockito.internal.creation.MockSettingsImpl",
      "org.mockito.internal.creation.jmock.ClassImposterizer$3",
      "org.mockito.internal.stubbing.InvocationContainerImpl",
      "org.mockito.cglib.proxy.FixedValue",
      "org.mockito.internal.invocation.realmethod.RealMethod",
      "org.mockito.internal.creation.cglib.CGLIBHacker",
      "org.mockito.cglib.core.GeneratorStrategy",
      "org.objenesis.ObjenesisStd",
      "org.mockito.internal.progress.MockingProgress",
      "org.mockito.internal.util.MockitoLogger",
      "org.mockito.exceptions.misusing.MissingMethodInvocationException",
      "org.mockito.exceptions.verification.TooLittleActualInvocations",
      "org.mockito.internal.invocation.StubInfo",
      "org.mockito.stubbing.DeprecatedOngoingStubbing",
      "org.mockito.cglib.proxy.MethodInterceptor",
      "org.mockito.exceptions.verification.TooManyActualInvocations",
      "org.mockito.asm.FieldVisitor",
      "org.mockito.cglib.core.ClassEmitter",
      "org.objenesis.strategy.InstantiatorStrategy",
      "org.mockito.cglib.core.AbstractClassGenerator",
      "org.mockito.internal.invocation.MockitoMethod",
      "org.mockito.internal.debugging.Localized",
      "org.mockito.internal.util.ListUtil$Filter",
      "org.mockito.internal.invocation.SerializableMethod",
      "org.mockito.cglib.proxy.MethodProxy$FastClassInfo",
      "org.mockito.internal.verification.Times",
      "org.mockito.internal.exceptions.base.StackTraceFilter",
      "org.mockito.invocation.InvocationOnMock",
      "org.mockito.internal.verification.InOrderWrapper",
      "org.mockito.internal.creation.MethodInterceptorFilter",
      "org.mockito.configuration.IMockitoConfiguration",
      "org.mockito.stubbing.OngoingStubbing",
      "org.mockito.cglib.core.Predicate",
      "org.mockito.internal.progress.ArgumentMatcherStorage",
      "org.mockito.internal.creation.jmock.ClassImposterizer$1",
      "org.mockito.internal.creation.jmock.ClassImposterizer$2",
      "org.mockito.cglib.proxy.LazyLoaderGenerator",
      "org.objenesis.strategy.BaseInstantiatorStrategy",
      "org.mockito.configuration.AnnotationEngine",
      "org.mockito.cglib.core.EmitUtils",
      "org.mockito.internal.invocation.MatchersBinder",
      "org.mockito.cglib.core.Constants",
      "org.mockito.internal.stubbing.StubbedInvocationMatcher",
      "org.mockito.exceptions.verification.VerificationInOrderFailure",
      "org.mockito.configuration.DefaultMockitoConfiguration",
      "org.mockito.cglib.proxy.LazyLoader",
      "org.mockito.exceptions.misusing.NullInsteadOfMockException",
      "org.mockito.internal.creation.DelegatingMockitoMethodProxy",
      "org.mockito.internal.util.StringJoiner",
      "org.mockito.stubbing.ClonesArguments",
      "org.mockito.internal.creation.jmock.SearchingClassLoader",
      "org.mockito.cglib.proxy.InvocationHandler",
      "org.mockito.cglib.core.ReflectUtils$4",
      "org.mockito.cglib.core.ReflectUtils$2",
      "org.mockito.cglib.core.ReflectUtils$3",
      "org.mockito.asm.ByteVector",
      "org.mockito.cglib.core.ReflectUtils$1",
      "org.mockito.internal.creation.MockitoMethodProxy",
      "org.mockito.internal.reporting.PrintingFriendlyInvocation",
      "org.mockito.cglib.core.AbstractClassGenerator$1",
      "org.mockito.cglib.core.DefaultGeneratorStrategy",
      "org.mockito.cglib.core.ProcessSwitchCallback",
      "org.mockito.cglib.core.ClassNameReader",
      "org.mockito.cglib.core.AbstractClassGenerator$Source",
      "org.mockito.exceptions.misusing.UnfinishedStubbingException",
      "org.mockito.cglib.core.EmitUtils$ParameterTyper",
      "org.mockito.exceptions.verification.NoInteractionsWanted",
      "org.mockito.cglib.core.TypeUtils",
      "org.mockito.internal.creation.AbstractMockitoMethodProxy",
      "org.mockito.internal.invocation.CapturesArgumensFromInvocation",
      "org.mockito.cglib.proxy.DispatcherGenerator",
      "org.mockito.exceptions.PrintableInvocation",
      "org.mockito.asm.ClassReader",
      "org.mockito.internal.verification.VerificationDataImpl",
      "org.mockito.internal.verification.api.VerificationData",
      "org.mockito.exceptions.verification.WantedButNotInvoked",
      "org.mockito.internal.progress.ThreadSafeMockingProgress",
      "org.mockito.asm.MethodWriter",
      "org.mockito.internal.verification.api.VerificationMode",
      "org.mockito.internal.invocation.InvocationsFinder",
      "org.mockito.cglib.proxy.CallbackInfo",
      "org.mockito.asm.Attribute",
      "org.mockito.InOrder",
      "org.mockito.internal.MockitoInvocationHandler",
      "org.mockito.asm.AnnotationVisitor",
      "org.mockito.asm.ClassAdapter",
      "org.mockito.cglib.proxy.NoOpGenerator",
      "org.mockito.cglib.proxy.MethodProxy",
      "org.mockito.internal.util.MockUtil",
      "org.mockito.cglib.proxy.Enhancer$EnhancerKey",
      "org.mockito.cglib.proxy.Enhancer$1",
      "org.mockito.asm.MethodVisitor",
      "org.objenesis.ObjenesisBase",
      "org.mockito.internal.verification.api.VerificationInOrderMode",
      "org.mockito.cglib.core.KeyFactory",
      "org.mockito.internal.reporting.PrintSettings",
      "org.mockito.cglib.core.ClassGenerator"
    );
  } 
}