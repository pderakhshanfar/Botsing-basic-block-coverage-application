/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 22:56:31 UTC 2020
 */

package org.apache.commons.math.ode.events;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.ode.events.EventState;
import org.apache.commons.math.ode.nonstiff.StepProblem;
import org.apache.commons.math.ode.sampling.DummyStepInterpolator;
import org.apache.commons.math.ode.sampling.StepInterpolator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class EventState_ESTest extends EventState_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[2] = 0.0;
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) null, (Object) null, (Object) null).when(stepInterpolator0).getInterpolatedState();
      doReturn(false, false).when(stepInterpolator0).isForward();
      StepProblem stepProblem0 = new StepProblem(0.0, 3016.82162289, 0.0);
      EventState eventState0 = new EventState(stepProblem0, 0.0, 3016.82162289, 9961);
      eventState0.reinitializeBegin((-911.99063335), doubleArray0);
      eventState0.stepAccepted(0.6931471805599453, doubleArray0);
      stepProblem0.eventOccurred(222.5, doubleArray0, true);
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, true);
      eventState0.evaluateStep(dummyStepInterpolator0);
      stepProblem0.eventOccurred(222.5, doubleArray0, true);
      eventState0.getEventTime();
      eventState0.getEventTime();
      eventState0.stepAccepted(9961, doubleArray0);
      eventState0.getEventHandler();
      // Undeclared exception!
      eventState0.evaluateStep(stepInterpolator0);
  }
}