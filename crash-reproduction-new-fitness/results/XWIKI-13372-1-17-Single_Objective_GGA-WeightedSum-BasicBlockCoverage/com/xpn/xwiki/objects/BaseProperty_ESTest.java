/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 00:00:31 UTC 2020
 */

package com.xpn.xwiki.objects;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.objects.BaseCollection;
import com.xpn.xwiki.objects.BaseProperty;
import com.xpn.xwiki.objects.LargeStringProperty;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.model.reference.ObjectReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseProperty_ESTest extends BaseProperty_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BaseProperty baseProperty0 = new BaseProperty();
      LargeStringProperty largeStringProperty0 = new LargeStringProperty();
      LargeStringProperty largeStringProperty1 = new LargeStringProperty();
      LargeStringProperty largeStringProperty2 = new LargeStringProperty();
      largeStringProperty0.equals(largeStringProperty0);
      LargeStringProperty largeStringProperty3 = new LargeStringProperty();
      BaseCollection<ObjectReference> baseCollection0 = (BaseCollection<ObjectReference>) mock(BaseCollection.class, new ViolatedAssumptionAnswer());
      largeStringProperty2.setObject(baseCollection0);
      LargeStringProperty largeStringProperty4 = new LargeStringProperty();
      LargeStringProperty largeStringProperty5 = new LargeStringProperty();
      // Undeclared exception!
      largeStringProperty2.equals((Object) null);
  }
}