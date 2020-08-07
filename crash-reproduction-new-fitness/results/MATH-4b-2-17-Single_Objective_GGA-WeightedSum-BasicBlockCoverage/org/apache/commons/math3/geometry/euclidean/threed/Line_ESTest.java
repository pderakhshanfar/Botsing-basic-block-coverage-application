/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 00:55:26 UTC 2020
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
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      Line line0 = new Line(vector3D0, vector3D0);
      line0.distance(vector3D0);
      line0.distance(vector3D0);
      Vector3D vector3D1 = new Vector3D(Double.NaN, Double.NaN, Double.NaN);
      line0.distance(line0);
      line0.toSubSpace(vector3D0);
      line0.getOrigin();
      Line line1 = new Line(line0);
      Vector3D vector3D2 = line1.getDirection();
      Vector3D vector3D3 = Vector3D.MINUS_I;
      Vector3D vector3D4 = Vector3D.PLUS_I;
      line0.toSubSpace(vector3D4);
      line1.contains(vector3D3);
      line0.toSubSpace(vector3D2);
      line1.distance(line0);
      Vector3D vector3D5 = new Vector3D(Double.NaN, vector3D0);
      line1.distance(vector3D5);
      line0.intersection(line1);
      // Undeclared exception!
      line1.toSubSpace((Vector<Euclidean3D>) null);
  }
}