/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 00:59:07 UTC 2020
 */

package org.xwiki.extension.job.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Comparator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.extension.job.internal.AbstractInstallPlanJob;
import org.xwiki.extension.job.plan.internal.DefaultExtensionPlanNode;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractInstallPlanJob$ModifableExtensionPlanTree_ESTest extends AbstractInstallPlanJob$ModifableExtensionPlanTree_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AbstractInstallPlanJob.ModifableExtensionPlanTree abstractInstallPlanJob_ModifableExtensionPlanTree0 = new AbstractInstallPlanJob.ModifableExtensionPlanTree();
      DefaultExtensionPlanNode defaultExtensionPlanNode0 = new DefaultExtensionPlanNode();
      DefaultExtensionPlanNode defaultExtensionPlanNode1 = new DefaultExtensionPlanNode();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      abstractInstallPlanJob_ModifableExtensionPlanTree0.sort(comparator0);
      AbstractInstallPlanJob.ModifableExtensionPlanTree abstractInstallPlanJob_ModifableExtensionPlanTree1 = abstractInstallPlanJob_ModifableExtensionPlanTree0.clone();
      abstractInstallPlanJob_ModifableExtensionPlanTree1.retainAll(abstractInstallPlanJob_ModifableExtensionPlanTree0);
      abstractInstallPlanJob_ModifableExtensionPlanTree1.isEmpty();
      abstractInstallPlanJob_ModifableExtensionPlanTree1.add(defaultExtensionPlanNode0);
      abstractInstallPlanJob_ModifableExtensionPlanTree1.stream();
      // Undeclared exception!
      abstractInstallPlanJob_ModifableExtensionPlanTree1.clone();
  }
}