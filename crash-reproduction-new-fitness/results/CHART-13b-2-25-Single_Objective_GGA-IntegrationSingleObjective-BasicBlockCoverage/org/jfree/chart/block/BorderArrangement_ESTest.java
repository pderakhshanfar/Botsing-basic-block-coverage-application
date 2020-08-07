/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 01:35:37 UTC 2020
 */

package org.jfree.chart.block;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.block.Block;
import org.jfree.chart.block.BlockContainer;
import org.jfree.chart.block.BorderArrangement;
import org.jfree.chart.block.RectangleConstraint;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.util.Size2D;
import org.jfree.data.Range;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BorderArrangement_ESTest extends BorderArrangement_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      Block block0 = null;
      BlockContainer blockContainer0 = new BlockContainer();
      RectangleConstraint rectangleConstraint0 = new RectangleConstraint(0.0, (-912.0));
      RectangleConstraint rectangleConstraint1 = blockContainer0.toContentConstraint(rectangleConstraint0);
      RectangleConstraint rectangleConstraint2 = rectangleConstraint1.toFixedHeight((-851.56574677375));
      BorderArrangement borderArrangement1 = new BorderArrangement();
      Size2D size2D0 = new Size2D();
      borderArrangement1.clear();
      borderArrangement0.arrangeNN((BlockContainer) null, (Graphics2D) null);
      Graphics2D graphics2D0 = null;
      borderArrangement1.arrangeFF(blockContainer0, (Graphics2D) null, rectangleConstraint2);
      BorderArrangement borderArrangement2 = new BorderArrangement();
      NumberAxis numberAxis0 = new NumberAxis((String) null);
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      Range range0 = new Range(0.0, (-912.0));
  }
}