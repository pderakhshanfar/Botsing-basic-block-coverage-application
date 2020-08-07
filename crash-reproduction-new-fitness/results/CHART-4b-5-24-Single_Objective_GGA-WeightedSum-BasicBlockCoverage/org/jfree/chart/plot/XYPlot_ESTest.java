/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 17:03:03 UTC 2020
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.geom.RoundRectangle2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.general.DatasetGroup;
import org.jfree.data.xy.DefaultXYZDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XYPlot_ESTest extends XYPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultXYZDataset defaultXYZDataset0 = new DefaultXYZDataset();
      DateAxis dateAxis0 = new DateAxis();
      XYBoxAndWhiskerRenderer xYBoxAndWhiskerRenderer0 = new XYBoxAndWhiskerRenderer();
      XYPlot xYPlot0 = new XYPlot(defaultXYZDataset0, dateAxis0, dateAxis0, xYBoxAndWhiskerRenderer0);
      DatasetGroup datasetGroup0 = new DatasetGroup("Sig");
      defaultXYZDataset0.setGroup(datasetGroup0);
      xYPlot0.isRangeZoomable();
      xYPlot0.getDatasetCount();
      xYPlot0.equals(defaultXYZDataset0);
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      RoundRectangle2D.Double roundRectangle2D_Double0 = new RoundRectangle2D.Double(1, (-1074.079564), 1.0E-6, Double.NaN, 0.0, 1.5E-5);
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0);
      XYPlot xYPlot1 = new XYPlot(defaultXYZDataset0, cyclicNumberAxis0, dateAxis0, (XYItemRenderer) null);
  }
}