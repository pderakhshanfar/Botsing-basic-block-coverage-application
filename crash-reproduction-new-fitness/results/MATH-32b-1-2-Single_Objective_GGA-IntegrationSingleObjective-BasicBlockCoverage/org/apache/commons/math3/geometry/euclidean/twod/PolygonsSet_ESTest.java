/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 12:12:05 UTC 2020
 */

package org.apache.commons.math3.geometry.euclidean.twod;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.Line;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.partitioning.Transform;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class PolygonsSet_ESTest extends PolygonsSet_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet();
      polygonsSet0.getBarycenter();
      PolygonsSet polygonsSet1 = new PolygonsSet();
      AffineTransform affineTransform0 = AffineTransform.getRotateInstance((-1.0E-10));
      Point2D.Float point2D_Float0 = new Point2D.Float(0.0F, 0.0F);
      Point2D point2D0 = affineTransform0.inverseTransform((Point2D) point2D_Float0, (Point2D) point2D_Float0);
      affineTransform0.inverseTransform(point2D0, point2D0);
      affineTransform0.isIdentity();
      Line.getTransform(affineTransform0);
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      polygonsSet0.getTree(false);
      Transform<Euclidean2D, Euclidean1D> transform0 = (Transform<Euclidean2D, Euclidean1D>) mock(Transform.class, new ViolatedAssumptionAnswer());
      polygonsSet1.contains(polygonsSet0);
      Vector2D vector2D1 = Vector2D.POSITIVE_INFINITY;
      Vector2D vector2D2 = Vector2D.POSITIVE_INFINITY;
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>();
      Object object0 = new Object();
      bSPTree0.setAttribute(object0);
      bSPTree0.getParent();
      polygonsSet0.checkPoint(vector2D2);
      polygonsSet1.getVertices();
      PolygonsSet polygonsSet2 = polygonsSet1.buildNew(bSPTree0);
      PolygonsSet polygonsSet3 = polygonsSet0.buildNew(bSPTree0);
      polygonsSet0.computeGeometricalProperties();
      polygonsSet3.getVertices();
      // Undeclared exception!
      polygonsSet2.computeGeometricalProperties();
  }
}