/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 01:32:18 UTC 2020
 */

package org.jfree.chart.block;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.block.BlockContainer;
import org.jfree.chart.block.BorderArrangement;
import org.jfree.chart.block.RectangleConstraint;
import org.jfree.data.Range;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BorderArrangement_ESTest extends BorderArrangement_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      borderArrangement0.clear();
      BlockContainer blockContainer0 = mock(BlockContainer.class, new ViolatedAssumptionAnswer());
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      RectangleConstraint rectangleConstraint0 = mock(RectangleConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(rectangleConstraint0).getHeight();
      doReturn(0.0, 0.0, 0.0).when(rectangleConstraint0).getWidth();
      borderArrangement0.arrangeFF(blockContainer0, graphics2D0, rectangleConstraint0);
      BlockContainer blockContainer1 = mock(BlockContainer.class, new ViolatedAssumptionAnswer());
      Range range0 = new Range((-749.285), (-1212.688078778));
  }
}