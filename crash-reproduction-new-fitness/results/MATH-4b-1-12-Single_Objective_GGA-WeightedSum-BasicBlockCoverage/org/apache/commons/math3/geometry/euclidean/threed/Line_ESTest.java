/*
 * This file was automatically generated by EvoSuite
 * Thu May 14 20:29:17 UTC 2020
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
      Vector3D vector3D0 = Vector3D.NaN;
      Line line0 = new Line(vector3D0, vector3D0);
      line0.contains(vector3D0);
      Line line1 = line0.revert();
      Vector3D vector3D1 = line0.getOrigin();
      line1.intersection(line0);
      line1.getAbscissa(vector3D1);
      line1.intersection(line0);
      Vector3D vector3D2 = Vector3D.NaN;
      line0.toSubSpace(vector3D2);
      line1.getDirection();
      line0.wholeLine();
      // Undeclared exception!
      line1.toSubSpace((Vector<Euclidean3D>) null);
  }
}