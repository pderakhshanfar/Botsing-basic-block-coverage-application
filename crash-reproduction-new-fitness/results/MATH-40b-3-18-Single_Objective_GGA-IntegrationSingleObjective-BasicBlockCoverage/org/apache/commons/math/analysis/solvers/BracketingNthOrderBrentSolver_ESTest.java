/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 02:37:51 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BracketingNthOrderBrentSolver_ESTest extends BracketingNthOrderBrentSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      bracketingNthOrderBrentSolver0.getMaxEvaluations();
      bracketingNthOrderBrentSolver0.getEvaluations();
      bracketingNthOrderBrentSolver0.solve(1189, (UnivariateFunction) quinticFunction0, (-1.1775748573698224), (double) 1189);
      bracketingNthOrderBrentSolver0.getMaxEvaluations();
      QuinticFunction quinticFunction1 = new QuinticFunction();
      bracketingNthOrderBrentSolver0.doSolve();
      bracketingNthOrderBrentSolver0.solve(3657, (UnivariateFunction) quinticFunction1, (-901.7823837658816), 1.5670874118804932);
      bracketingNthOrderBrentSolver0.getMaxEvaluations();
      QuinticFunction quinticFunction2 = new QuinticFunction();
      bracketingNthOrderBrentSolver0.doSolve();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) quinticFunction0, (-1468.35), (double) 264);
  }
}