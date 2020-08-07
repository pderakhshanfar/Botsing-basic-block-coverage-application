/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 12:37:16 UTC 2020
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.lowagie.text.Phrase;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.ThermometerPlot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.util.Layer;
import org.jfree.data.general.DefaultValueDataset;
import org.jfree.data.xy.XYBarDataset;
import org.jfree.data.xy.YIntervalSeriesCollection;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XYPlot_ESTest extends XYPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XYPlot xYPlot0 = new XYPlot();
      Layer layer0 = mock(Layer.class, new ViolatedAssumptionAnswer());
      Phrase phrase0 = new Phrase();
      xYPlot0.getRangeGridlinePaint();
      ValueAxis valueAxis0 = mock(ValueAxis.class, new ViolatedAssumptionAnswer());
      xYPlot0.getDataRange(valueAxis0);
      xYPlot0.setBackgroundAlpha(2693.18F);
      ValueAxis valueAxis1 = null;
      xYPlot0.getDataRange((ValueAxis) null);
      AxisLocation axisLocation0 = mock(AxisLocation.class, new ViolatedAssumptionAnswer());
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      DefaultValueDataset defaultValueDataset0 = new DefaultValueDataset((-1057.2));
      DefaultValueDataset defaultValueDataset1 = new DefaultValueDataset();
      ThermometerPlot thermometerPlot0 = new ThermometerPlot();
      thermometerPlot0.getRangeAxis();
      YIntervalSeriesCollection yIntervalSeriesCollection0 = new YIntervalSeriesCollection();
      XYBarDataset xYBarDataset0 = new XYBarDataset(yIntervalSeriesCollection0, (-1057.2));
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1479.029999224784, 1479.029999224784);
      XYPlot xYPlot1 = new XYPlot(xYBarDataset0, cyclicNumberAxis0, (ValueAxis) null, (XYItemRenderer) null);
  }
}