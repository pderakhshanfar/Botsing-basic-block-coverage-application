/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 12:34:42 UTC 2020
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
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.xy.XYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class ChartFactory_ESTest extends ChartFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      ChartFactory.createLineChart3D("!\"eo^l<", "OCProperties", "org.jfree.chart.util.ResourceBundleWrapper", (CategoryDataset) null, plotOrientation0, true, true, true);
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(xYDataset0).toString();
      doReturn(0).when(xYDataset0).getSeriesCount();
      PlotOrientation plotOrientation1 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("Ps9Iq?Lo\u0002SpAl", "org.jfree.chart.util.ResourceBundleWrapper", "", xYDataset0, plotOrientation1, true, true, false);
  }
}