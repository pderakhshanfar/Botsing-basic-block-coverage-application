/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 02:41:52 UTC 2020
 */

package org.apache.commons.math.ode.events;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.apache.commons.math.ode.events.EventHandler;
import org.apache.commons.math.ode.events.EventState;
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
      doReturn((-2155.3056566), 0.0, 0.0, 0.0).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, 2027.2960182603706, 2784.1628182070085, (-2237));
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-1931.8111993597);
      doubleArray0[1] = 2027.2960182603706;
      doubleArray0[2] = 2784.1628182070085;
      doubleArray0[3] = (-1798.4);
      eventState0.reset(2027.2960182603706, doubleArray0);
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      DummyStepInterpolator dummyStepInterpolator1 = new DummyStepInterpolator(dummyStepInterpolator0);
      eventState0.evaluateStep(dummyStepInterpolator1);
      dummyStepInterpolator0.getInterpolatedDerivatives();
      eventState0.reset(0.0, doubleArray0);
      eventState0.evaluateStep(dummyStepInterpolator1);
      eventState0.getMaxIterationCount();
  }
}