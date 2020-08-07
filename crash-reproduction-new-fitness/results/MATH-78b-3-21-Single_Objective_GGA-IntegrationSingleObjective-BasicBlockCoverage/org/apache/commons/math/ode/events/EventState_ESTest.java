/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 03:18:27 UTC 2020
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
import org.apache.commons.math.ode.sampling.NordsieckStepInterpolator;
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
      StepProblem stepProblem0 = new StepProblem(0, (-1151.46105394), (-3761.0));
      EventState eventState0 = new EventState(stepProblem0, 907.1204778425999, 2.0, 9983);
      stepProblem0.setRate(621.3473031);
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (-1032.621);
      doubleArray0[2] = (double) 0;
      doubleArray0[3] = (-1032.621);
      doubleArray0[4] = 1315.9;
      doubleArray0[5] = (-3761.0);
      doubleArray0[6] = (-1032.621);
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      eventState0.evaluateStep(dummyStepInterpolator0);
      eventState0.stepAccepted(3927.2200618245233, doubleArray0);
      NordsieckStepInterpolator nordsieckStepInterpolator0 = new NordsieckStepInterpolator();
      // Undeclared exception!
      eventState0.evaluateStep(stepInterpolator0);
  }
}