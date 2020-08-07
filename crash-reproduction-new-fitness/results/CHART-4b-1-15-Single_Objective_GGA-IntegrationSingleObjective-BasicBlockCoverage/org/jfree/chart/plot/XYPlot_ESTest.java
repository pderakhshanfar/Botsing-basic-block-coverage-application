/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 12:39:16 UTC 2020
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.lowagie.text.ListItem;
import com.lowagie.text.pdf.PdfName;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.data.statistics.SimpleHistogramDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XYPlot_ESTest extends XYPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AxisLocation axisLocation0 = mock(AxisLocation.class, new ViolatedAssumptionAnswer());
      PlotOrientation plotOrientation0 = PlotOrientation.HORIZONTAL;
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      PdfName pdfName0 = PdfName.DM;
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset(pdfName0);
      ValueAxis valueAxis0 = mock(ValueAxis.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(valueAxis0).toString();
      ValueAxis valueAxis1 = mock(ValueAxis.class, new ViolatedAssumptionAnswer());
      XYPlot xYPlot0 = new XYPlot(simpleHistogramDataset0, valueAxis0, valueAxis1, (XYItemRenderer) null);
      ValueAxis valueAxis2 = xYPlot0.getDomainAxis();
      ListItem listItem0 = new ListItem();
      AxisLocation axisLocation1 = mock(AxisLocation.class, new ViolatedAssumptionAnswer());
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.25, "Null 'location' for index 0 not permitted.");
      XYPlot xYPlot1 = new XYPlot(simpleHistogramDataset0, valueAxis2, cyclicNumberAxis0, (XYItemRenderer) null);
  }
}