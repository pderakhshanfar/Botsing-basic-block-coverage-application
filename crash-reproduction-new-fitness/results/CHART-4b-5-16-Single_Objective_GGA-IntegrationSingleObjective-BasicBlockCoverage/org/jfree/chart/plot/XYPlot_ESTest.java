/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 16:54:08 UTC 2020
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.xy.MatrixSeriesCollection;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XYPlot_ESTest extends XYPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MatrixSeriesCollection matrixSeriesCollection0 = new MatrixSeriesCollection();
      NumberAxis numberAxis0 = new NumberAxis();
      XYPlot xYPlot0 = new XYPlot(matrixSeriesCollection0, numberAxis0, numberAxis0, (XYItemRenderer) null);
  }
}