/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 31 14:45:58 UTC 2020
 */

package org.xwiki.extension.job.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.PriorityQueue;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.extension.job.internal.AbstractInstallPlanJob;
import org.xwiki.extension.job.plan.ExtensionPlanAction;
import org.xwiki.extension.job.plan.internal.DefaultExtensionPlanNode;
import org.xwiki.extension.version.Version;
import org.xwiki.extension.version.VersionRangeCollection;
import org.xwiki.extension.version.internal.DefaultVersion;
import org.xwiki.extension.version.internal.DefaultVersionConstraint;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractInstallPlanJob$ModifableExtensionPlanTree_ESTest extends AbstractInstallPlanJob$ModifableExtensionPlanTree_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AbstractInstallPlanJob.ModifableExtensionPlanTree abstractInstallPlanJob_ModifableExtensionPlanTree0 = new AbstractInstallPlanJob.ModifableExtensionPlanTree();
      ExtensionPlanAction extensionPlanAction0 = mock(ExtensionPlanAction.class, new ViolatedAssumptionAnswer());
      PriorityQueue<VersionRangeCollection> priorityQueue0 = new PriorityQueue<VersionRangeCollection>();
      LinkedList<VersionRangeCollection> linkedList0 = new LinkedList<VersionRangeCollection>(priorityQueue0);
      Version version0 = mock(Version.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(version0).getValue();
      DefaultVersion defaultVersion0 = new DefaultVersion(version0);
      DefaultVersionConstraint defaultVersionConstraint0 = new DefaultVersionConstraint(linkedList0, defaultVersion0);
      DefaultExtensionPlanNode defaultExtensionPlanNode0 = new DefaultExtensionPlanNode(extensionPlanAction0, defaultVersionConstraint0);
      abstractInstallPlanJob_ModifableExtensionPlanTree0.addIfAbsent(defaultExtensionPlanNode0);
      // Undeclared exception!
      abstractInstallPlanJob_ModifableExtensionPlanTree0.clone();
  }
}