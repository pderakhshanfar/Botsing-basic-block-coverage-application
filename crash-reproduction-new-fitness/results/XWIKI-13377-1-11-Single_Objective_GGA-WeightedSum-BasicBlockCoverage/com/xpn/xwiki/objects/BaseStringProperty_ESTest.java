/*
 * This file was automatically generated by EvoSuite
 * Thu May 14 14:06:30 UTC 2020
 */

package com.xpn.xwiki.objects;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.objects.BaseStringProperty;
import com.xpn.xwiki.objects.LargeStringProperty;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseStringProperty_ESTest extends BaseStringProperty_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BaseStringProperty baseStringProperty0 = new BaseStringProperty();
      LargeStringProperty largeStringProperty0 = new LargeStringProperty();
      // Undeclared exception!
      baseStringProperty0.setValue(largeStringProperty0);
  }
}