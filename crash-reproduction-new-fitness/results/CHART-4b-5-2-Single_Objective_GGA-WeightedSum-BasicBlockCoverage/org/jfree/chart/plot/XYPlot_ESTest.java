/*
 * This file was automatically generated by EvoSuite
 * Thu May 14 12:31:11 UTC 2020
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
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.jdbc.JDBCXYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XYPlot_ESTest extends XYPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCXYDataset jDBCXYDataset0 = new JDBCXYDataset(connection0);
      ValueAxis valueAxis0 = mock(ValueAxis.class, new ViolatedAssumptionAnswer());
      XYItemRenderer xYItemRenderer0 = null;
      XYPlot xYPlot0 = new XYPlot(jDBCXYDataset0, valueAxis0, valueAxis0, (XYItemRenderer) null);
      boolean boolean0 = false;
      xYPlot0.setRangeCrosshairVisible(false);
      xYPlot0.getDatasetCount();
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      XYPlot xYPlot1 = new XYPlot(jDBCXYDataset0, numberAxis3D0, numberAxis3D0, (XYItemRenderer) null);
  }
}