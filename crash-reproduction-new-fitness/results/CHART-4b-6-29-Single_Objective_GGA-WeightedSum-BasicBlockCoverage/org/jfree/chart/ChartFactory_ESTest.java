/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 17:02:38 UTC 2020
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
import org.jfree.data.xy.XYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class ChartFactory_ESTest extends ChartFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ChartFactory.getChartTheme();
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn((DatasetGroup) null).when(xYDataset0).getGroup();
      doReturn(0, 0).when(xYDataset0).getSeriesCount();
      ChartFactory.createPolarChart("Legacy", xYDataset0, false, true, false);
      CategoryDataset categoryDataset0 = mock(CategoryDataset.class, new ViolatedAssumptionAnswer());
      doReturn((DatasetGroup) null).when(categoryDataset0).getGroup();
      TableOrder tableOrder0 = mock(TableOrder.class, new ViolatedAssumptionAnswer());
      ChartFactory.createMultiplePieChart("Legacy", categoryDataset0, tableOrder0, false, true, true);
      XYDataset xYDataset1 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(xYDataset1).getSeriesCount();
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("Pc>+a'wQ", "Legacy", "Pc>+a'wQ", xYDataset1, plotOrientation0, true, true, true);
  }
}