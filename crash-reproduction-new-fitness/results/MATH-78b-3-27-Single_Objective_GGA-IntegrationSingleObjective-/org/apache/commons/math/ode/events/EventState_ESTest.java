/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 03:26:40 UTC 2020
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
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class EventState_ESTest extends EventState_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      EventState eventState0 = new EventState(eventHandler0, 3423, (-0.19367136904309), 3423);
      eventState0.getMaxIterationCount();
      StepProblem stepProblem0 = new StepProblem(3423, (-0.19367136904309), (-1176.897766575594));
      EventState eventState1 = new EventState(stepProblem0, 3423, 3423, 3423);
      double[] doubleArray0 = new double[10];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, true);
      eventState1.evaluateStep(dummyStepInterpolator0);
      eventState1.stepAccepted((-1176.897766575594), doubleArray0);
      dummyStepInterpolator0.storeTime(3423);
      eventState1.stop();
      // Undeclared exception!
      eventState1.evaluateStep(dummyStepInterpolator0);
  }
}