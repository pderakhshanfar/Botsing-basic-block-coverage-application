/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 01:42:46 UTC 2020
 */

package org.jfree.chart.block;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.block.BlockContainer;
import org.jfree.chart.block.BorderArrangement;
import org.jfree.chart.block.RectangleConstraint;
import org.jfree.chart.plot.ThermometerPlot;
import org.jfree.data.general.DefaultValueDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BorderArrangement_ESTest extends BorderArrangement_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BlockContainer blockContainer0 = new BlockContainer();
      Graphics2D graphics2D0 = null;
      RectangleConstraint rectangleConstraint0 = null;
      BorderArrangement borderArrangement0 = new BorderArrangement();
      borderArrangement0.clear();
      borderArrangement0.clear();
      DefaultValueDataset defaultValueDataset0 = new DefaultValueDataset();
      ThermometerPlot thermometerPlot0 = new ThermometerPlot(defaultValueDataset0);
      String string0 = ").";
      // Undeclared exception!
      thermometerPlot0.setRange(1.8398113F, 0.0);
  }
}