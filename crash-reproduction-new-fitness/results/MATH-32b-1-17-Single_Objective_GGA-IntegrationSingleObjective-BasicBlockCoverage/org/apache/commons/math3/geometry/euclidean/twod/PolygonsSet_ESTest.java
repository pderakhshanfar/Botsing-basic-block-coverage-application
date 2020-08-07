/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 16:38:06 UTC 2020
 */

package org.apache.commons.math3.geometry.euclidean.twod;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
import org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint;
import org.apache.commons.math3.geometry.euclidean.oned.SubOrientedPoint;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.partitioning.Region;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class PolygonsSet_ESTest extends PolygonsSet_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet();
      Vector1D vector1D0 = Vector1D.ONE;
      Vector1D vector1D1 = new Vector1D(Double.NEGATIVE_INFINITY, vector1D0, Double.NEGATIVE_INFINITY, vector1D0, Double.NEGATIVE_INFINITY, vector1D0, (-678.732), vector1D0);
      OrientedPoint orientedPoint0 = new OrientedPoint(vector1D1, true);
      SubOrientedPoint subOrientedPoint0 = orientedPoint0.wholeHyperplane();
      subOrientedPoint0.getRemainingRegion();
      SubOrientedPoint subOrientedPoint1 = new SubOrientedPoint(orientedPoint0, (Region<Euclidean1D>) null);
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>(subOrientedPoint1);
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree0);
      // Undeclared exception!
      polygonsSet1.computeGeometricalProperties();
  }
}