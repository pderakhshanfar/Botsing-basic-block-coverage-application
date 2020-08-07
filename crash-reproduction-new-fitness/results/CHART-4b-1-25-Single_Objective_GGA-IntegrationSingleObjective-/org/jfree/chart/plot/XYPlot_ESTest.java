/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 17:00:40 UTC 2020
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.sql.Connection;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.util.Layer;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.data.jdbc.JDBCXYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XYPlot_ESTest extends XYPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AxisLocation axisLocation0 = AxisLocation.BOTTOM_OR_LEFT;
      PlotOrientation plotOrientation0 = PlotOrientation.HORIZONTAL;
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      XYPlot xYPlot0 = new XYPlot();
      ValueAxis valueAxis0 = mock(ValueAxis.class, new ViolatedAssumptionAnswer());
      xYPlot0.getDataRange(valueAxis0);
      Layer layer0 = mock(Layer.class, new ViolatedAssumptionAnswer());
      xYPlot0.getRangeMarkers(layer0);
      xYPlot0.getPlotType();
      DateAxis dateAxis0 = new DateAxis();
      xYPlot0.getDataRange(dateAxis0);
      xYPlot0.isOutlineVisible();
      xYPlot0.getOrientation();
      xYPlot0.getRangeAxisEdge((-175));
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCXYDataset jDBCXYDataset0 = new JDBCXYDataset(connection0);
      XYItemRenderer xYItemRenderer0 = null;
      XYPlot xYPlot1 = new XYPlot(jDBCXYDataset0, dateAxis0, dateAxis0, (XYItemRenderer) null);
  }
}