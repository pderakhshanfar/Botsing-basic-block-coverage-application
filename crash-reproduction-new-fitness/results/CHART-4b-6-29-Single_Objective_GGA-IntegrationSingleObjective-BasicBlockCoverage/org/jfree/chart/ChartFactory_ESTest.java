/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 17:04:11 UTC 2020
 */

package org.jfree.chart;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.axis.Timeline;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.general.DatasetGroup;
import org.jfree.data.xy.OHLCDataset;
import org.jfree.data.xy.XYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class ChartFactory_ESTest extends ChartFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn((DatasetGroup) null).when(xYDataset0).getGroup();
      doReturn(0, 0).when(xYDataset0).getSeriesCount();
      ChartFactory.createPolarChart("<eRo`", xYDataset0, true, true, true);
      OHLCDataset oHLCDataset0 = mock(OHLCDataset.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(oHLCDataset0).toString();
      doReturn(0, 0, 0, 0, 0).when(oHLCDataset0).getSeriesCount();
      Timeline timeline0 = mock(Timeline.class, new ViolatedAssumptionAnswer());
      doReturn(0L, 0L, 0L, 0L, 0L).when(timeline0).toMillisecond(anyLong());
      doReturn(0L, 0L, 0L, 0L, 0L).when(timeline0).toTimelineValue(anyLong());
      ChartFactory.createHighLowChart("<eRo`", "<eRo`", "<eRo`", oHLCDataset0, timeline0, true);
      String string0 = null;
      XYDataset xYDataset1 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(xYDataset1).toString();
      doReturn(0).when(xYDataset1).getSeriesCount();
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = false;
      boolean boolean1 = false;
      // Undeclared exception!
      ChartFactory.createScatterPlot((String) null, (String) null, (String) null, xYDataset1, plotOrientation0, false, false, false);
  }
}