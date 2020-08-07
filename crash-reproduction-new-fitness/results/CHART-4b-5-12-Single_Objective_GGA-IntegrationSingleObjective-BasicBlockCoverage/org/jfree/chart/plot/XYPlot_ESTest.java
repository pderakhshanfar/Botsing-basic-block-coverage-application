/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 12:37:39 UTC 2020
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYBubbleRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.xy.DefaultWindDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XYPlot_ESTest extends XYPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultWindDataset defaultWindDataset0 = new DefaultWindDataset();
      NumberAxis numberAxis0 = new NumberAxis();
      XYBubbleRenderer xYBubbleRenderer0 = new XYBubbleRenderer();
      XYPlot xYPlot0 = new XYPlot(defaultWindDataset0, numberAxis0, numberAxis0, (XYItemRenderer) null);
  }
}