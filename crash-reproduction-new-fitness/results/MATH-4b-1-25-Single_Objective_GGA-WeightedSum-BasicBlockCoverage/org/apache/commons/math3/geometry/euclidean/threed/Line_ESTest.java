/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 00:55:51 UTC 2020
 */

package org.apache.commons.math3.geometry.euclidean.threed;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.geometry.Vector;
import org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D;
import org.apache.commons.math3.geometry.euclidean.threed.Line;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Line_ESTest extends Line_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      Line line0 = new Line(vector3D0, vector3D0);
      Line line1 = new Line(line0);
      Vector3D vector3D1 = line1.getOrigin();
      line0.isSimilarTo(line1);
      line1.toSubSpace(vector3D1);
      line1.distance(line0);
      Line line2 = new Line(vector3D0, vector3D0);
      line1.isSimilarTo(line2);
      Line line3 = new Line(line0);
      line2.getAbscissa(vector3D0);
      line2.pointAt(689.12412424);
      line2.getOrigin();
      line3.closestPoint(line2);
      line2.intersection(line3);
      // Undeclared exception!
      line1.toSubSpace((Vector<Euclidean3D>) null);
  }
}