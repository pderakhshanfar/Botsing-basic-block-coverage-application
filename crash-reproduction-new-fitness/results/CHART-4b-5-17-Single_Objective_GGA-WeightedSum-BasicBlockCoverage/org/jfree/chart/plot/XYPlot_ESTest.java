/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 16:56:46 UTC 2020
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.SamplingXYLineRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.xy.DefaultTableXYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XYPlot_ESTest extends XYPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset();
      ValueAxis valueAxis0 = mock(ValueAxis.class, new ViolatedAssumptionAnswer());
      SamplingXYLineRenderer samplingXYLineRenderer0 = new SamplingXYLineRenderer();
      XYPlot xYPlot0 = new XYPlot(defaultTableXYDataset0, valueAxis0, valueAxis0, samplingXYLineRenderer0);
      xYPlot0.setDomainMinorGridlinesVisible(false);
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("");
      XYPlot xYPlot1 = new XYPlot(defaultTableXYDataset0, numberAxis3D0, numberAxis3D0, (XYItemRenderer) null);
  }
}