/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 17:06:19 UTC 2020
 */

package org.apache.commons.math.stat.clustering;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.Random;
import org.apache.commons.math.stat.clustering.EuclideanIntegerPoint;
import org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class KMeansPlusPlusClusterer_ESTest extends KMeansPlusPlusClusterer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Random random0 = new Random((-1591));
      KMeansPlusPlusClusterer<EuclideanIntegerPoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<EuclideanIntegerPoint>(random0);
      int[] intArray0 = new int[4];
      intArray0[0] = (-2147483643);
      intArray0[1] = (-2147483643);
      intArray0[2] = (-3988);
      LinkedList<EuclideanIntegerPoint> linkedList0 = new LinkedList<EuclideanIntegerPoint>();
      EuclideanIntegerPoint euclideanIntegerPoint0 = new EuclideanIntegerPoint(intArray0);
      linkedList0.offerLast(euclideanIntegerPoint0);
      EuclideanIntegerPoint euclideanIntegerPoint1 = linkedList0.removeLast();
      linkedList0.offerFirst(euclideanIntegerPoint0);
      kMeansPlusPlusClusterer0.cluster(linkedList0, (-1591), (-1591));
      linkedList0.offerLast(euclideanIntegerPoint0);
      linkedList0.add(euclideanIntegerPoint1);
      // Undeclared exception!
      kMeansPlusPlusClusterer0.cluster(linkedList0, (-2147483643), 2949);
  }
}