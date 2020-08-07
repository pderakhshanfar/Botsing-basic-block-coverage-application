/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 23:01:01 UTC 2020
 */

package org.apache.commons.math.ode.events;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.ode.events.EventHandler;
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
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) null, (Object) null, (Object) null).when(stepInterpolator0).getInterpolatedState();
      doReturn(false, false).when(stepInterpolator0).isForward();
      StepProblem stepProblem0 = new StepProblem(325, (-4.855958966175046), (-1.0));
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (-1987.1225334085464);
      doubleArray0[1] = (-1.0);
      doubleArray0[2] = (-4.855958966175046);
      doubleArray0[3] = (-1.0);
      doubleArray0[4] = (-1987.1225334085464);
      stepProblem0.eventOccurred((-1987.1225334085464), doubleArray0, false);
      EventState eventState0 = new EventState(stepProblem0, 325, 207.683624571, 2);
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      DummyStepInterpolator dummyStepInterpolator1 = new DummyStepInterpolator(dummyStepInterpolator0);
      StepInterpolator stepInterpolator1 = dummyStepInterpolator1.copy();
      eventState0.evaluateStep(stepInterpolator1);
      eventState0.stepAccepted(1813.834, doubleArray0);
      // Undeclared exception!
      eventState0.evaluateStep(stepInterpolator0);
  }
}