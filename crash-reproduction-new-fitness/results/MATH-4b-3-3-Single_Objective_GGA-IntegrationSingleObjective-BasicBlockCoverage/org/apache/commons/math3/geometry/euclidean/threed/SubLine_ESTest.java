/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 21:07:20 UTC 2020
 */

package org.apache.commons.math3.geometry.euclidean.threed;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
import org.apache.commons.math3.geometry.euclidean.threed.Line;
import org.apache.commons.math3.geometry.euclidean.threed.Plane;
import org.apache.commons.math3.geometry.euclidean.threed.Segment;
import org.apache.commons.math3.geometry.euclidean.threed.SubLine;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class SubLine_ESTest extends SubLine_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Line line0 = mock(Line.class, new ViolatedAssumptionAnswer());
      doReturn((Vector3D) null).when(line0).intersection(any(org.apache.commons.math3.geometry.euclidean.threed.Line.class));
      doReturn((Vector1D) null).when(line0).toSubSpace(nullable(org.apache.commons.math3.geometry.Vector.class));
      IntervalsSet intervalsSet0 = mock(IntervalsSet.class, new ViolatedAssumptionAnswer());
      Vector1D vector1D0 = Vector1D.ZERO;
      OrientedPoint orientedPoint0 = new OrientedPoint(vector1D0, true);
      LinkedList<SubHyperplane<Euclidean1D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean1D>>();
      IntervalsSet intervalsSet1 = new IntervalsSet(linkedList0);
      SubLine subLine0 = new SubLine(line0, intervalsSet1);
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      Plane plane0 = new Plane(vector3D0);
      Plane plane1 = new Plane(vector3D0, vector3D0, vector3D0);
      Plane plane2 = new Plane(plane1);
      Line line1 = plane0.intersection(plane2);
      Line line2 = new Line(line1);
      Segment segment0 = new Segment(vector3D0, vector3D0, line2);
      SubLine subLine1 = new SubLine(segment0);
      // Undeclared exception!
      subLine0.intersection(subLine1, true);
  }
}