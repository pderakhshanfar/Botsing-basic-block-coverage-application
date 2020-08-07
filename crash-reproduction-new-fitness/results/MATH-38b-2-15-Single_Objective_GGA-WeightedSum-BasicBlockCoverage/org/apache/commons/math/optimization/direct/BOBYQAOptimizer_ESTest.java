/*
 * This file was automatically generated by EvoSuite
 * Thu May 14 21:33:07 UTC 2020
 */

package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.SumSincFunction;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.direct.BOBYQAOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BOBYQAOptimizer_ESTest extends BOBYQAOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 21;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(21, (-303.942579855324), 21);
      double double0 = (-1.0);
      SumSincFunction sumSincFunction0 = new SumSincFunction((-1.0));
      GoalType goalType0 = GoalType.MINIMIZE;
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-1.0);
      doubleArray0[1] = (-1.0);
      doubleArray0[2] = (-303.942579855324);
      doubleArray0[3] = (-303.942579855324);
      sumSincFunction0.gradient();
      doubleArray0[4] = (-1.0);
      doubleArray0[5] = (double) 21;
      doubleArray0[6] = (double) 21;
      doubleArray0[7] = (-303.942579855324);
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(21, sumSincFunction0, goalType0, doubleArray0);
  }
}