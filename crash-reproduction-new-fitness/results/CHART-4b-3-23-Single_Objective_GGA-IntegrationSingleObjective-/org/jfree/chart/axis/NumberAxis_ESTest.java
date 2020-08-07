/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 17:00:38 UTC 2020
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.Axis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.event.AxisChangeEvent;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYAreaRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.time.TimeTableXYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class NumberAxis_ESTest extends NumberAxis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      float float0 = Axis.DEFAULT_TICK_MARK_OUTSIDE_LENGTH;
      numberAxis0.setTickMarkInsideLength(1290.6F);
      numberAxis0.setTickMarkOutsideLength(36.0F);
      AxisChangeEvent axisChangeEvent0 = new AxisChangeEvent(numberAxis0);
      numberAxis0.notifyListeners(axisChangeEvent0);
      numberAxis0.configure();
      NumberAxis.createStandardTickUnits();
      XYAreaRenderer xYAreaRenderer0 = new XYAreaRenderer(500);
      TimeTableXYDataset timeTableXYDataset0 = new TimeTableXYDataset();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      combinedDomainXYPlot0.getRendererForDataset(timeTableXYDataset0);
      XYPlot xYPlot0 = new XYPlot(timeTableXYDataset0, numberAxis0, numberAxis0, (XYItemRenderer) null);
  }
}