/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 02:42:47 UTC 2020
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
      doReturn(0.0, (-889.5772413602243), 0.0, 0.0).when(eventHandler0).g(anyDouble() , any(double[].class));
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 1731.269;
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      double[] doubleArray1 = new double[10];
      doubleArray1[3] = (double) (-1385);
      doubleArray1[6] = (double) (-1385);
      doubleArray1[7] = (double) (-1385);
      EventState eventState0 = new EventState(eventHandler0, (-2023.275974), 353.696, 7);
      eventState0.reset(353.696, doubleArray0);
      eventState0.reset(1.662337662337662, doubleArray1);
      eventState0.stop();
      eventState0.reinitializeBegin((-1.0), doubleArray1);
      eventState0.evaluateStep(dummyStepInterpolator0);
      eventState0.getEventTime();
      eventState0.reset(0.9640275800758169, doubleArray1);
      eventState0.getMaxIterationCount();
      eventState0.getConvergence();
      eventState0.getMaxCheckInterval();
  }
}