/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 21:13:43 UTC 2020
 */

package org.jfree.chart.block;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.sql.Connection;
import java.text.AttributedCharacterIterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.block.BlockContainer;
import org.jfree.chart.block.BorderArrangement;
import org.jfree.chart.block.LengthConstraintType;
import org.jfree.chart.renderer.category.StackedAreaRenderer;
import org.jfree.data.Range;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BorderArrangement_ESTest extends BorderArrangement_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AttributedCharacterIterator.Attribute attributedCharacterIterator_Attribute0 = AttributedCharacterIterator.Attribute.INPUT_METHOD_SEGMENT;
      Graphics2D graphics2D0 = null;
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      String string0 = "]";
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      double double0 = 0.0;
      boolean boolean0 = false;
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(false);
      stackedAreaRenderer0.findRangeBounds(defaultStatisticalCategoryDataset0);
      LengthConstraintType lengthConstraintType0 = LengthConstraintType.RANGE;
      Range range0 = new Range(1.0, 0.0);
  }
}