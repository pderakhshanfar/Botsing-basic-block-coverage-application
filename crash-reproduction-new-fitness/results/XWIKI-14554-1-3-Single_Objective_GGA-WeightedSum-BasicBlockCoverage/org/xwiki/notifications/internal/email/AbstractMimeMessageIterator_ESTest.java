/*
 * This file was automatically generated by EvoSuite
 * Thu May 14 15:50:49 UTC 2020
 */

package org.xwiki.notifications.internal.email;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xwiki.notifications.internal.email.PeriodicMimeMessageIterator;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractMimeMessageIterator_ESTest extends AbstractMimeMessageIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PeriodicMimeMessageIterator periodicMimeMessageIterator0 = new PeriodicMimeMessageIterator();
      // Undeclared exception!
      periodicMimeMessageIterator0.next();
  }
}