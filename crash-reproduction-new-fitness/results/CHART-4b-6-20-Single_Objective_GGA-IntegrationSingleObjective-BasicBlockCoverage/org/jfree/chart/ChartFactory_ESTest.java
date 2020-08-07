/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 16:57:53 UTC 2020
 */

package org.jfree.chart;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.ChartFactory;
import org.jfree.data.general.PieDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class ChartFactory_ESTest extends ChartFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = "(sr1xHXLqop$O";
      PieDataset pieDataset0 = mock(PieDataset.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(pieDataset0).getKeys();
      boolean boolean0 = true;
      // Undeclared exception!
      ChartFactory.createPieChart("(sr1xHXLqop$O", pieDataset0, pieDataset0, 0, false, false, false, false, false, true);
  }
}