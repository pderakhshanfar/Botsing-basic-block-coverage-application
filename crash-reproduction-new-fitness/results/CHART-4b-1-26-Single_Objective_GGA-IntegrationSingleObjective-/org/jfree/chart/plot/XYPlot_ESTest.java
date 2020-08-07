/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 17:01:30 UTC 2020
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.lowagie.text.pdf.PdfName;
import java.util.SimpleTimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XYPlot_ESTest extends XYPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AxisLocation axisLocation0 = mock(AxisLocation.class, new ViolatedAssumptionAnswer());
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      PdfName pdfName0 = PdfName.PRINT;
      TimeSeries timeSeries0 = new TimeSeries(pdfName0);
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-1073741823), "");
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeSeries0, simpleTimeZone0);
      DateAxis dateAxis0 = new DateAxis();
      XYPlot xYPlot0 = new XYPlot(timeSeriesCollection0, dateAxis0, dateAxis0, (XYItemRenderer) null);
  }
}