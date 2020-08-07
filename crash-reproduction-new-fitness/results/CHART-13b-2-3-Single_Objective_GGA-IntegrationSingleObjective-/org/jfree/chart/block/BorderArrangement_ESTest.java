/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 21:13:00 UTC 2020
 */

package org.jfree.chart.block;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.block.Block;
import org.jfree.chart.block.BorderArrangement;
import org.jfree.chart.block.LengthConstraintType;
import org.jfree.data.Range;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BorderArrangement_ESTest extends BorderArrangement_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      Block block0 = mock(Block.class, new ViolatedAssumptionAnswer());
      BorderArrangement borderArrangement1 = new BorderArrangement();
      LengthConstraintType lengthConstraintType0 = LengthConstraintType.NONE;
      double double0 = (-3671.38201842286);
      Range range0 = new Range(3040.0, 395.231840934);
  }
}