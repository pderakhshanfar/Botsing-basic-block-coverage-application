/*
 * This file was automatically generated by EvoSuite
 * Thu May 14 20:28:57 UTC 2020
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
      Vector3D vector3D0 = Vector3D.PLUS_I;
      Vector3D vector3D1 = Vector3D.MINUS_J;
      Vector3D vector3D2 = new Vector3D(3.145894820876798E-6, vector3D1);
      double double0 = (-3968.4);
      Vector3D vector3D3 = new Vector3D((-3968.4), vector3D2, 1.0, vector3D0, 3667.473498805, vector3D0, 0.0, vector3D2);
      Vector3D vector3D4 = Vector3D.MINUS_J;
      Line line0 = new Line(vector3D1, vector3D0);
      line0.toSubSpace(vector3D3);
      line0.contains(vector3D2);
      Line line1 = new Line(vector3D3, vector3D4);
      Vector3D vector3D5 = new Vector3D(325.424463928, vector3D4);
      Line line2 = new Line(vector3D5, vector3D3);
      // Undeclared exception!
      line2.toSubSpace((Vector<Euclidean3D>) null);
  }
}