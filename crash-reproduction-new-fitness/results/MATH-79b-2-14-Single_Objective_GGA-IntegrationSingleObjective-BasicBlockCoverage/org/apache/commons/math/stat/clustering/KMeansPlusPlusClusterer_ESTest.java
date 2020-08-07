/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 12:43:34 UTC 2020
 */

package org.apache.commons.math.stat.clustering;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.Random;
import org.apache.commons.math.stat.clustering.Cluster;
import org.apache.commons.math.stat.clustering.EuclideanIntegerPoint;
import org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class KMeansPlusPlusClusterer_ESTest extends KMeansPlusPlusClusterer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<Cluster<EuclideanIntegerPoint>> linkedList0 = new LinkedList<Cluster<EuclideanIntegerPoint>>();
      LinkedList<EuclideanIntegerPoint> linkedList1 = new LinkedList<EuclideanIntegerPoint>();
      int[] intArray0 = new int[2];
      intArray0[0] = 1;
      intArray0[1] = (-2147483647);
      EuclideanIntegerPoint euclideanIntegerPoint0 = new EuclideanIntegerPoint(intArray0);
      linkedList1.add(euclideanIntegerPoint0);
      Integer integer0 = new Integer((-839));
      EuclideanIntegerPoint euclideanIntegerPoint1 = new EuclideanIntegerPoint(intArray0);
      linkedList1.add(euclideanIntegerPoint1);
      Random random0 = new Random((-749L));
      KMeansPlusPlusClusterer<EuclideanIntegerPoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<EuclideanIntegerPoint>(random0);
      LinkedList<EuclideanIntegerPoint> linkedList2 = new LinkedList<EuclideanIntegerPoint>();
      random0.doubles(39916800L);
      linkedList1.add(euclideanIntegerPoint1);
      // Undeclared exception!
      kMeansPlusPlusClusterer0.cluster(linkedList1, (-504), 1);
  }
}