/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 17:05:37 UTC 2020
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.DateFormatSymbols;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.xy.MatrixSeriesCollection;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XYPlot_ESTest extends XYPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MatrixSeriesCollection matrixSeriesCollection0 = new MatrixSeriesCollection();
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(2.0, 2.0, "0.000");
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      Locale locale0 = Locale.KOREA;
      DateFormatSymbols dateFormatSymbols0 = new DateFormatSymbols(locale0);
      SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("", dateFormatSymbols0);
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols();
      XYPlot xYPlot0 = new XYPlot(matrixSeriesCollection0, numberAxis3D0, numberAxis3D0, (XYItemRenderer) null);
  }
}