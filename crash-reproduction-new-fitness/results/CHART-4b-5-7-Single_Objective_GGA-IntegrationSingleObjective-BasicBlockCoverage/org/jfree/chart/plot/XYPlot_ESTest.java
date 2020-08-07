/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 12:34:08 UTC 2020
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.xy.MatrixSeries;
import org.jfree.data.xy.MatrixSeriesCollection;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XYPlot_ESTest extends XYPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MatrixSeriesCollection matrixSeriesCollection0 = new MatrixSeriesCollection((MatrixSeries) null);
      ValueAxis valueAxis0 = mock(ValueAxis.class, new ViolatedAssumptionAnswer());
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      XYPlot xYPlot0 = new XYPlot(matrixSeriesCollection0, valueAxis0, numberAxis3D0, (XYItemRenderer) null);
  }
}