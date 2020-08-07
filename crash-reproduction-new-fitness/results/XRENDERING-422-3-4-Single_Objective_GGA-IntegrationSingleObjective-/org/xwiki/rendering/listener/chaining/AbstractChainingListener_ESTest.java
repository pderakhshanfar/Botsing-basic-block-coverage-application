/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 03:16:07 UTC 2020
 */

package org.xwiki.rendering.listener.chaining;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xwiki.rendering.listener.Format;
import org.xwiki.rendering.listener.Listener;
import org.xwiki.rendering.listener.MetaData;
import org.xwiki.rendering.listener.chaining.BlockStateChainingListener;
import org.xwiki.rendering.listener.chaining.ConsecutiveNewLineStateChainingListener;
import org.xwiki.rendering.listener.chaining.EmptyBlockChainingListener;
import org.xwiki.rendering.listener.chaining.ListenerChain;
import org.xwiki.rendering.listener.reference.ResourceReference;
import org.xwiki.rendering.listener.reference.ResourceType;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractChainingListener_ESTest extends AbstractChainingListener_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      HashMap<String, Object> hashMap1 = new HashMap<String, Object>();
      MetaData metaData0 = new MetaData();
      Map<String, Object> map0 = metaData0.getMetaData();
      MetaData metaData1 = new MetaData(map0);
      ListenerChain listenerChain0 = new ListenerChain();
      BlockStateChainingListener blockStateChainingListener0 = new BlockStateChainingListener(listenerChain0);
      Map<String, String> map1 = Listener.EMPTY_PARAMETERS;
      blockStateChainingListener0.endTable(map1);
      blockStateChainingListener0.endTable(map1);
      hashMap0.remove((Object) null);
      listenerChain0.addListener(blockStateChainingListener0);
      ConsecutiveNewLineStateChainingListener consecutiveNewLineStateChainingListener0 = new ConsecutiveNewLineStateChainingListener(listenerChain0);
      ResourceType resourceType0 = ResourceType.ICON;
      blockStateChainingListener0.beginSection(hashMap0);
      ResourceReference resourceReference0 = new ResourceReference("=\")9llJj/y~H:}x", resourceType0);
      Map<String, String> map2 = Listener.EMPTY_PARAMETERS;
      blockStateChainingListener0.endQuotationLine();
      EmptyBlockChainingListener emptyBlockChainingListener0 = new EmptyBlockChainingListener(listenerChain0);
      listenerChain0.addListener(emptyBlockChainingListener0);
      HashMap<String, String> hashMap2 = new HashMap<String, String>();
      Format format0 = Format.UNDERLINED;
      // Undeclared exception!
      blockStateChainingListener0.endFormat(format0, map1);
  }
}