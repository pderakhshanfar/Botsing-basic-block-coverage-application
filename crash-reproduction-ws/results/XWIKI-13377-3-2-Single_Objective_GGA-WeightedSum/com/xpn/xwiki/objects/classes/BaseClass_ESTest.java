/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 30 19:30:30 UTC 2020
 */

package com.xpn.xwiki.objects.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.objects.BaseCollection;
import com.xpn.xwiki.objects.meta.BooleanMetaClass;
import com.xpn.xwiki.objects.meta.UsersMetaClass;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseClass_ESTest extends BaseClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BooleanMetaClass booleanMetaClass0 = new BooleanMetaClass();
      ConcurrentSkipListMap<String, UsersMetaClass> concurrentSkipListMap0 = new ConcurrentSkipListMap<String, UsersMetaClass>();
      UsersMetaClass usersMetaClass0 = new UsersMetaClass();
      concurrentSkipListMap0.put("displayFormType", usersMetaClass0);
      // Undeclared exception!
      booleanMetaClass0.fromMap((Map<String, ?>) concurrentSkipListMap0, (BaseCollection) booleanMetaClass0);
  }
}