/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 01:03:20 UTC 2020
 */

package org.xwiki.extension.job.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.extension.ExtensionId;
import org.xwiki.extension.job.internal.AbstractInstallPlanJob;
import org.xwiki.extension.job.internal.UpgradePlanJob;
import org.xwiki.extension.job.plan.ExtensionPlanNode;
import org.xwiki.extension.test.ConfigurableDefaultCoreExtensionRepository;
import org.xwiki.job.DefaultRequest;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class UpgradePlanJob_ESTest extends UpgradePlanJob_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UpgradePlanJob upgradePlanJob0 = new UpgradePlanJob();
      AbstractInstallPlanJob.ModifableExtensionPlanTree abstractInstallPlanJob_ModifableExtensionPlanTree0 = new AbstractInstallPlanJob.ModifableExtensionPlanTree();
      upgradePlanJob0.extensionTree = abstractInstallPlanJob_ModifableExtensionPlanTree0;
      ConfigurableDefaultCoreExtensionRepository configurableDefaultCoreExtensionRepository0 = new ConfigurableDefaultCoreExtensionRepository();
      DefaultRequest defaultRequest0 = new DefaultRequest();
      DefaultRequest defaultRequest1 = new DefaultRequest();
      ExtensionId extensionId0 = new ExtensionId((String) null, (String) null);
      ExtensionPlanNode extensionPlanNode0 = mock(ExtensionPlanNode.class, new ViolatedAssumptionAnswer());
      abstractInstallPlanJob_ModifableExtensionPlanTree0.addIfAbsent(extensionPlanNode0);
      // Undeclared exception!
      upgradePlanJob0.tryInstallExtension(extensionId0, "Jj_],");
  }
}