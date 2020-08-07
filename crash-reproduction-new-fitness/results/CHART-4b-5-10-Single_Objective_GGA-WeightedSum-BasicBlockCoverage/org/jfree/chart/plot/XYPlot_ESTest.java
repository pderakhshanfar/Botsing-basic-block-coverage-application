/*
 * This file was automatically generated by EvoSuite
 * Thu May 14 12:37:18 UTC 2020
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.DateFormat;
import java.text.DecimalFormat;
import javax.swing.JSpinner;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.labels.StandardXYToolTipGenerator;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import org.jfree.chart.urls.StandardXYURLGenerator;
import org.jfree.data.xy.CategoryTableXYDataset;
import org.jfree.data.xy.DefaultTableXYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XYPlot_ESTest extends XYPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      ValueAxis valueAxis0 = mock(ValueAxis.class, new ViolatedAssumptionAnswer());
      JSpinner jSpinner0 = new JSpinner();
      DecimalFormat decimalFormat0 = new DecimalFormat();
      StandardXYToolTipGenerator standardXYToolTipGenerator0 = new StandardXYToolTipGenerator("Null 'origin' argument.", decimalFormat0, (DateFormat) null);
      StandardXYURLGenerator standardXYURLGenerator0 = new StandardXYURLGenerator("Null 'origin' argument.");
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer((-14), standardXYToolTipGenerator0, standardXYURLGenerator0);
      XYPlot xYPlot0 = new XYPlot(categoryTableXYDataset0, valueAxis0, valueAxis0, xYStepAreaRenderer0);
      xYPlot0.setWeight(2356);
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset();
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(2356, 2356, "s<+mX'{y2(HD\"=O?c+@");
      XYPlot xYPlot1 = new XYPlot(defaultTableXYDataset0, cyclicNumberAxis0, cyclicNumberAxis0, (XYItemRenderer) null);
  }
}