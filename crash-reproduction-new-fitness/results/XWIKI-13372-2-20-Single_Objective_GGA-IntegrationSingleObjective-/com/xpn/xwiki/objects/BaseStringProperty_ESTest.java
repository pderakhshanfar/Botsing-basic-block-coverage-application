/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 00:46:09 UTC 2020
 */

package com.xpn.xwiki.objects;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.objects.BaseCollection;
import com.xpn.xwiki.objects.LargeStringProperty;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.model.reference.AttachmentReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseStringProperty_ESTest extends BaseStringProperty_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BaseCollection<AttachmentReference> baseCollection0 = (BaseCollection<AttachmentReference>) mock(BaseCollection.class, new ViolatedAssumptionAnswer());
      LargeStringProperty largeStringProperty0 = new LargeStringProperty();
      largeStringProperty0.setObject(baseCollection0);
      largeStringProperty0.getValue();
      // Undeclared exception!
      largeStringProperty0.equals((Object) null);
  }
}