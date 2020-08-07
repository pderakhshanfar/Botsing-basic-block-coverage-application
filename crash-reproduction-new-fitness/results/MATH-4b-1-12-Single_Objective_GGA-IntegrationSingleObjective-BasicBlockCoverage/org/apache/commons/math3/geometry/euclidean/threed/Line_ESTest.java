/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 21:07:55 UTC 2020
 */

package org.apache.commons.math3.geometry.euclidean.threed;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
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
      line0.getAbscissa(vector3D0);
      Line line1 = new Line(line0);
      line0.intersection(line1);
      Vector3D vector3D1 = line1.getDirection();
      line0.distance(line1);
      line1.getDirection();
      Line line2 = line1.revert();
      line0.closestPoint(line1);
      Vector3D vector3D2 = Vector3D.MINUS_K;
      Line line3 = new Line(vector3D2, vector3D1);
      line2.getDirection();
      line3.pointAt(Double.NaN);
      Line line4 = new Line(line3);
      line0.getDirection();
      vector3D1.orthogonal();
      line4.isSimilarTo(line2);
      line3.wholeLine();
      line2.getAbscissa(vector3D1);
      line2.distance(line0);
      line4.toSubSpace(vector3D1);
      line3.pointAt(Double.NaN);
      // Undeclared exception!
      line2.getAbscissa((Vector3D) null);
  }
}