/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 17:02:38 UTC 2020
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.event.AxisChangeEvent;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.StandardXYItemRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.gantt.XYTaskDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XYPlot_ESTest extends XYPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      XYTaskDataset xYTaskDataset0 = new XYTaskDataset(taskSeriesCollection0);
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1392.962461289125, "lui>XA4I\"");
      StandardXYItemRenderer standardXYItemRenderer0 = new StandardXYItemRenderer();
      XYPlot xYPlot0 = new XYPlot(xYTaskDataset0, cyclicNumberAxis0, cyclicNumberAxis0, standardXYItemRenderer0);
      XYPlot xYPlot1 = new XYPlot(xYTaskDataset0, cyclicNumberAxis0, cyclicNumberAxis0, standardXYItemRenderer0);
      AxisChangeEvent axisChangeEvent0 = mock(AxisChangeEvent.class, new ViolatedAssumptionAnswer());
      xYPlot1.axisChanged(axisChangeEvent0);
      xYPlot0.isOutlineVisible();
      XYPlot xYPlot2 = new XYPlot(xYTaskDataset0, cyclicNumberAxis0, (ValueAxis) null, (XYItemRenderer) null);
  }
}