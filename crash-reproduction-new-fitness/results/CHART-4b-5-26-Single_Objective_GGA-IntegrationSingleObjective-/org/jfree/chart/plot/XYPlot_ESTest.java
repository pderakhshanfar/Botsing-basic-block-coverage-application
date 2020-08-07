/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 17:02:34 GMT+00:00 2020
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
import org.jfree.chart.axis.LogAxis;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.DeviationRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.jdbc.JDBCXYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XYPlot_ESTest extends XYPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCXYDataset jDBCXYDataset0 = new JDBCXYDataset(connection0);
      LogAxis logAxis0 = new LogAxis("#Oug>");
      XYLineAndShapeRenderer xYLineAndShapeRenderer0 = new XYLineAndShapeRenderer();
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("QJq");
      DeviationRenderer deviationRenderer0 = new DeviationRenderer(false, false);
      XYPlot xYPlot0 = new XYPlot(jDBCXYDataset0, numberAxis3D0, numberAxis3D0, deviationRenderer0);
      XYPlot xYPlot1 = new XYPlot(jDBCXYDataset0, logAxis0, numberAxis3D0, (XYItemRenderer) null);
  }
}