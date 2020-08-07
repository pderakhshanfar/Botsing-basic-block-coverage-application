/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 07:05:27 UTC 2020
 */

package org.xwiki.rendering.listener.chaining;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xwiki.rendering.listener.Format;
import org.xwiki.rendering.listener.MetaData;
import org.xwiki.rendering.listener.chaining.ChainingListener;
import org.xwiki.rendering.listener.chaining.ConsecutiveNewLineStateChainingListener;
import org.xwiki.rendering.listener.chaining.EmptyBlockChainingListener;
import org.xwiki.rendering.listener.chaining.GroupStateChainingListener;
import org.xwiki.rendering.listener.chaining.ListenerChain;
import org.xwiki.rendering.listener.chaining.MetaDataStateChainingListener;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractChainingListener_ESTest extends AbstractChainingListener_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ListenerChain listenerChain0 = new ListenerChain();
      ListenerChain listenerChain1 = new ListenerChain();
      GroupStateChainingListener groupStateChainingListener0 = new GroupStateChainingListener(listenerChain1);
      listenerChain1.addListener(groupStateChainingListener0);
      Class<ChainingListener> class0 = ChainingListener.class;
      listenerChain1.removeListener(class0);
      ListenerChain listenerChain2 = new ListenerChain();
      EmptyBlockChainingListener emptyBlockChainingListener0 = new EmptyBlockChainingListener(listenerChain0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      EmptyBlockChainingListener emptyBlockChainingListener1 = new EmptyBlockChainingListener(listenerChain2);
      ConsecutiveNewLineStateChainingListener consecutiveNewLineStateChainingListener0 = new ConsecutiveNewLineStateChainingListener(listenerChain1);
      consecutiveNewLineStateChainingListener0.endMetaData((MetaData) null);
      ListenerChain listenerChain3 = new ListenerChain();
      ListenerChain listenerChain4 = new ListenerChain();
      listenerChain1.addListener(emptyBlockChainingListener1);
      MetaDataStateChainingListener metaDataStateChainingListener0 = new MetaDataStateChainingListener(listenerChain1);
      Format format0 = Format.NONE;
      // Undeclared exception!
      groupStateChainingListener0.endFormat(format0, hashMap0);
  }
}