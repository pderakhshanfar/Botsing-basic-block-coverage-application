/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 16:36:21 UTC 2020
 */

package org.apache.commons.math3.geometry.partitioning;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D;
import org.apache.commons.math3.geometry.euclidean.threed.Plane;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.Line;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math3.geometry.euclidean.twod.Segment;
import org.apache.commons.math3.geometry.euclidean.twod.SubLine;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractRegion_ESTest extends AbstractRegion_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      Plane plane0 = new Plane(vector3D0, vector3D0, vector3D0);
      Plane plane1 = new Plane(plane0);
      plane1.wholeSpace();
      Euclidean3D.getInstance();
      Plane plane2 = new Plane(plane1);
      PolygonsSet polygonsSet0 = new PolygonsSet(669.9886637779307, 1.0, 679.38, 0.0);
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>(plane0);
      Vector2D vector2D0 = new Vector2D(1.0, 679.38);
      Vector2D vector2D1 = new Vector2D(0.0, vector2D0, 679.38, vector2D0);
      Line line0 = new Line(vector2D0, vector2D1);
      Segment segment0 = new Segment(vector2D0, vector2D0, line0);
      SubLine subLine0 = new SubLine(segment0);
      bSPTree0.split(subLine0);
      PolygonsSet polygonsSet1 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet1.getSize();
  }
}