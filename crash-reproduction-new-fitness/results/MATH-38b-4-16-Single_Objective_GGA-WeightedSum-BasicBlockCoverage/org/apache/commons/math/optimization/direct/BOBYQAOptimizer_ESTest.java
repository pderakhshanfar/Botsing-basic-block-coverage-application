/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 01:53:25 UTC 2020
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
      SumSincFunction sumSincFunction0 = new SumSincFunction((-1006.8607374634798));
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (-1006.8607374634798);
      doubleArray0[1] = (-1006.8607374634798);
      doubleArray0[3] = (-1006.8607374634798);
      doubleArray0[4] = (-1006.8607374634798);
      double[] doubleArray1 = new double[7];
      doubleArray1[1] = (-1006.8607374634798);
      doubleArray1[5] = (-3518.552);
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(19, (-1069.1990594777064), (-1065.862934764913));
      GoalType goalType0 = GoalType.MINIMIZE;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(50, sumSincFunction0, goalType0, doubleArray1);
  }
}