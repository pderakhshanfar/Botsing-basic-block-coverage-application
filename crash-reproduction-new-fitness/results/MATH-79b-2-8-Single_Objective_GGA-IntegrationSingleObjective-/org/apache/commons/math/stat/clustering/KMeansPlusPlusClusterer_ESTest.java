/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 12:44:43 UTC 2020
 */

package org.apache.commons.math.stat.clustering;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.Random;
import org.apache.commons.math.stat.clustering.EuclideanIntegerPoint;
import org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class KMeansPlusPlusClusterer_ESTest extends KMeansPlusPlusClusterer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Random random0 = mock(Random.class, new ViolatedAssumptionAnswer());
      Random random1 = new Random();
      KMeansPlusPlusClusterer kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer(random0);
      LinkedList<EuclideanIntegerPoint> linkedList0 = new LinkedList<EuclideanIntegerPoint>();
      Random random2 = mock(Random.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(random2).nextInt(anyInt());
      int[] intArray0 = new int[6];
      intArray0[1] = 0;
      intArray0[2] = 0;
      int[] intArray1 = new int[7];
      intArray1[0] = 0;
      intArray1[1] = 0;
      intArray1[2] = 0;
      intArray1[3] = 0;
      intArray1[4] = 4194304;
      intArray1[5] = 0;
      intArray1[6] = 0;
      EuclideanIntegerPoint euclideanIntegerPoint0 = new EuclideanIntegerPoint(intArray1);
      linkedList0.add(0, euclideanIntegerPoint0);
      intArray0[3] = 0;
      intArray0[4] = 2084;
      intArray0[5] = 0;
      EuclideanIntegerPoint euclideanIntegerPoint1 = new EuclideanIntegerPoint(intArray0);
      euclideanIntegerPoint1.toString();
      linkedList0.add(euclideanIntegerPoint1);
      EuclideanIntegerPoint euclideanIntegerPoint2 = new EuclideanIntegerPoint(intArray0);
      EuclideanIntegerPoint euclideanIntegerPoint3 = new EuclideanIntegerPoint((int[]) null);
      KMeansPlusPlusClusterer<EuclideanIntegerPoint> kMeansPlusPlusClusterer1 = new KMeansPlusPlusClusterer<EuclideanIntegerPoint>(random2);
      // Undeclared exception!
      kMeansPlusPlusClusterer1.cluster(linkedList0, 0, 13);
  }
}