/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 16:58:26 UTC 2020
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Axis_ESTest extends Axis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[1];
      String string0 = "9'";
      NumberAxis numberAxis0 = new NumberAxis();
      boolean boolean0 = false;
      XYSeries xYSeries0 = new XYSeries("9'", false);
      XYSeriesCollection xYSeriesCollection0 = new XYSeriesCollection(xYSeries0);
      XYPlot xYPlot0 = new XYPlot(xYSeriesCollection0, numberAxis0, numberAxis0, (XYItemRenderer) null);
  }
}