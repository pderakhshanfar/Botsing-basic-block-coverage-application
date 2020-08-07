/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 03:07:37 UTC 2020
 */

package org.xwiki.rendering.listener.chaining;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xwiki.rendering.listener.Format;
import org.xwiki.rendering.listener.ListType;
import org.xwiki.rendering.listener.Listener;
import org.xwiki.rendering.listener.chaining.BlockStateChainingListener;
import org.xwiki.rendering.listener.chaining.EmptyBlockChainingListener;
import org.xwiki.rendering.listener.chaining.ListenerChain;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BlockStateChainingListener_ESTest extends BlockStateChainingListener_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ListenerChain listenerChain0 = new ListenerChain();
      ListType listType0 = ListType.BULLETED;
      BlockStateChainingListener blockStateChainingListener0 = new BlockStateChainingListener(listenerChain0);
      listenerChain0.popAllStackableListeners();
      Map<String, String> map0 = Listener.EMPTY_PARAMETERS;
      blockStateChainingListener0.beginList(listType0, map0);
      BlockStateChainingListener blockStateChainingListener1 = new BlockStateChainingListener(listenerChain0);
      blockStateChainingListener1.setListenerChain(listenerChain0);
      Class<BlockStateChainingListener> class0 = BlockStateChainingListener.class;
      listenerChain0.indexOf(class0);
      listenerChain0.addListener(blockStateChainingListener1);
      blockStateChainingListener0.beginDefinitionList(map0);
      blockStateChainingListener0.pushLinkDepth();
      blockStateChainingListener1.getInlineDepth();
      blockStateChainingListener0.onId("%P-Cz7;9!");
      EmptyBlockChainingListener emptyBlockChainingListener0 = new EmptyBlockChainingListener(listenerChain0);
      listenerChain0.addListener(emptyBlockChainingListener0);
      blockStateChainingListener1.onWord("BEGIN_TABLE_ROW");
      Format format0 = Format.UNDERLINED;
      // Undeclared exception!
      blockStateChainingListener0.endFormat(format0, map0);
  }
}