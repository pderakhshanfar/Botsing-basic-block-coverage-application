/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 16:45:38 UTC 2020
 */

package org.apache.commons.math3.geometry.euclidean.twod;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
import org.apache.commons.math3.geometry.euclidean.threed.Plane;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.Line;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.geometry.partitioning.AbstractRegion;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.partitioning.Hyperplane;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;
import org.apache.commons.math3.geometry.partitioning.Transform;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class PolygonsSet_ESTest extends PolygonsSet_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet((-609.0), (-524.8957185324), (-609.0), (-524.8957185324));
      polygonsSet0.computeGeometricalProperties();
      polygonsSet0.getSize();
      Transform<Euclidean2D, Euclidean1D> transform0 = (Transform<Euclidean2D, Euclidean1D>) mock(Transform.class, new ViolatedAssumptionAnswer());
      doReturn((Hyperplane) null, (Hyperplane) null, (Hyperplane) null, (Hyperplane) null, (Hyperplane) null).when(transform0).apply(nullable(org.apache.commons.math3.geometry.partitioning.Hyperplane.class));
      doReturn((SubHyperplane) null, (SubHyperplane) null, (SubHyperplane) null, (SubHyperplane) null, (SubHyperplane) null).when(transform0).apply(nullable(org.apache.commons.math3.geometry.partitioning.SubHyperplane.class) , nullable(org.apache.commons.math3.geometry.partitioning.Hyperplane.class) , nullable(org.apache.commons.math3.geometry.partitioning.Hyperplane.class));
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      Plane plane0 = new Plane(vector3D0);
      Plane plane1 = new Plane(vector3D0, vector3D0, vector3D0);
      Vector2D vector2D0 = plane1.toSubSpace(vector3D0);
      Line line0 = new Line(vector2D0, (-609.0));
      Line line1 = new Line(line0);
      polygonsSet0.side(line1);
      polygonsSet0.side(line1);
      polygonsSet0.computeGeometricalProperties();
      polygonsSet0.getSize();
      polygonsSet0.getBarycenter();
      polygonsSet0.getBoundarySize();
      AbstractRegion<Euclidean2D, Euclidean1D> abstractRegion0 = polygonsSet0.applyTransform(transform0);
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>(abstractRegion0);
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree0);
      polygonsSet0.getSize();
      polygonsSet1.getVertices();
      // Undeclared exception!
      polygonsSet1.getSize();
  }
}