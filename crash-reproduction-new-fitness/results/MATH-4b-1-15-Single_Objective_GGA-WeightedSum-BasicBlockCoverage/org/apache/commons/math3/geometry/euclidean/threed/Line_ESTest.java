/*
 * This file was automatically generated by EvoSuite
 * Thu May 14 20:29:29 UTC 2020
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
      Vector3D vector3D0 = Vector3D.NaN;
      Line line0 = new Line(vector3D0, vector3D0);
      Line line1 = new Line(vector3D0, vector3D0);
      Vector3D vector3D1 = null;
      line0.getAbscissa(vector3D0);
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = Double.NaN;
      doubleArray0[1] = Double.NaN;
      doubleArray0[2] = Double.NaN;
      Line line2 = line1.revert();
      line2.wholeLine();
      // Undeclared exception!
      line2.getAbscissa((Vector3D) null);
  }
}