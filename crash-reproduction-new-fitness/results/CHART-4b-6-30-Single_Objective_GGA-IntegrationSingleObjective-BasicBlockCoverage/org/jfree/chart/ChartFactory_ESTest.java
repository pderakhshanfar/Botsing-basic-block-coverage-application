/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 17:04:35 UTC 2020
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
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.util.TableOrder;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.general.DatasetGroup;
import org.jfree.data.xy.IntervalXYDataset;
import org.jfree.data.xy.XYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class ChartFactory_ESTest extends ChartFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IntervalXYDataset intervalXYDataset0 = mock(IntervalXYDataset.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(intervalXYDataset0).toString();
      doReturn(0, 0, 0, 0, 0).when(intervalXYDataset0).getSeriesCount();
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = false;
      ChartFactory.createXYBarChart("Null 'marker' argument.", "OzfyBNuj4^I&W5!{d", false, "", intervalXYDataset0, plotOrientation0, true, true, false);
      CategoryDataset categoryDataset0 = mock(CategoryDataset.class, new ViolatedAssumptionAnswer());
      doReturn((DatasetGroup) null).when(categoryDataset0).getGroup();
      TableOrder tableOrder0 = mock(TableOrder.class, new ViolatedAssumptionAnswer());
      boolean boolean1 = false;
      ChartFactory.createMultiplePieChart3D("B,(lGM", categoryDataset0, tableOrder0, false, false, false);
      String string0 = "' already has a parent.";
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(xYDataset0).toString();
      doReturn(0).when(xYDataset0).getSeriesCount();
      PlotOrientation plotOrientation1 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot((String) null, "", "' already has a parent.", xYDataset0, plotOrientation1, false, false, false);
  }
}