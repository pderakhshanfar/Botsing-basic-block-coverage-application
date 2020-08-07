/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 22:57:11 UTC 2020
 */

package org.apache.commons.math.ode.events;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.ode.events.EventState;
import org.apache.commons.math.ode.nonstiff.StepProblem;
import org.apache.commons.math.ode.sampling.DummyStepInterpolator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class EventState_ESTest extends EventState_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem((-2793.732622958799), (-4919.901387711332), (-2793.732622958799));
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-333.60460989036346);
      doubleArray0[1] = (-2.0);
      doubleArray0[2] = (-333.60460989036346);
      doubleArray0[3] = (-4919.901387711332);
      doubleArray0[4] = (-2793.732622958799);
      doubleArray0[5] = (-333.60460989036346);
      doubleArray0[6] = (-2793.732622958799);
      doubleArray0[7] = (-4919.901387711332);
      doubleArray0[8] = (-4919.901387711332);
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = 2864.9639779015;
      stepProblem0.setRate(2864.9639779015);
      stepProblem0.setRate(5973.68);
      stepProblem0.setRate(1104.443);
      EventState eventState0 = new EventState(stepProblem0, (-1.0), 5973.68, (-1088));
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      DummyStepInterpolator dummyStepInterpolator1 = new DummyStepInterpolator(dummyStepInterpolator0);
      dummyStepInterpolator0.storeTime(4818.419150958799);
      dummyStepInterpolator1.copy();
      eventState0.evaluateStep(dummyStepInterpolator1);
      eventState0.stepAccepted(2095.145281936525, doubleArray1);
      // Undeclared exception!
      eventState0.evaluateStep(dummyStepInterpolator0);
  }
}