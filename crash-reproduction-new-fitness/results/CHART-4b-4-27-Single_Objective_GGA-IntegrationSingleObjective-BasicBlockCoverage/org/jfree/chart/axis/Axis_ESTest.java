/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 17:03:33 UTC 2020
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.FastScatterPlot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.time.TimeTableXYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Axis_ESTest extends Axis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      float[][] floatArray0 = new float[4][1];
      FastScatterPlot fastScatterPlot0 = new FastScatterPlot(floatArray0, numberAxis0, numberAxis0);
      TimeTableXYDataset timeTableXYDataset0 = new TimeTableXYDataset();
      XYPlot xYPlot0 = new XYPlot(timeTableXYDataset0, numberAxis0, numberAxis0, (XYItemRenderer) null);
  }
}