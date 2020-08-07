/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 16:59:32 UTC 2020
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.time.TimeTableXYDataset;
import org.jfree.data.xy.XYBarDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Axis_ESTest extends Axis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      String string0 = "(<F%`qNo)#Vq>!<b^R";
      TimeZone timeZone0 = TimeZone.getTimeZone("(<F%`qNo)#Vq>!<b^R");
      Locale locale0 = Locale.GERMAN;
      TimeTableXYDataset timeTableXYDataset0 = new TimeTableXYDataset(timeZone0, locale0);
      XYBarDataset xYBarDataset0 = new XYBarDataset(timeTableXYDataset0, 743.28254);
      XYPlot xYPlot0 = new XYPlot(xYBarDataset0, numberAxis0, (ValueAxis) null, (XYItemRenderer) null);
  }
}