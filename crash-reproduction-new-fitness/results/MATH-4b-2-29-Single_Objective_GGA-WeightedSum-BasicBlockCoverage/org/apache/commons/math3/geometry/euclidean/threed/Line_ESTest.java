/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 00:56:24 UTC 2020
 */

package org.apache.commons.math3.geometry.euclidean.threed;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.geometry.Vector;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
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
      Vector1D vector1D0 = Vector1D.POSITIVE_INFINITY;
      Line line2 = new Line(line0);
      line0.pointAt((-832.6509));
      line0.getAbscissa(vector3D0);
      line2.isSimilarTo(line1);
      line2.getDirection();
      Line line3 = line1.revert();
      line2.intersection(line3);
      line3.getDirection();
      Line line4 = line1.revert();
      Line line5 = new Line(line1);
      line5.wholeLine();
      line5.intersection(line4);
      // Undeclared exception!
      line5.toSubSpace((Vector<Euclidean3D>) null);
  }
}