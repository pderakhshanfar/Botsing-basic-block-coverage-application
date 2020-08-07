/*
 * This file was automatically generated by EvoSuite
 * Thu May 14 20:29:24 UTC 2020
 */

package org.apache.commons.math3.geometry.euclidean.threed;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.euclidean.threed.Line;
import org.apache.commons.math3.geometry.euclidean.threed.Segment;
import org.apache.commons.math3.geometry.euclidean.threed.SubLine;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class SubLine_ESTest extends SubLine_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Line line0 = mock(Line.class, new ViolatedAssumptionAnswer());
      IntervalsSet intervalsSet0 = mock(IntervalsSet.class, new ViolatedAssumptionAnswer());
      SubLine subLine0 = new SubLine(line0, intervalsSet0);
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      Line line1 = new Line(vector3D0, vector3D0);
      Segment segment0 = new Segment(vector3D0, vector3D0, line1);
      SubLine subLine1 = line1.wholeLine();
      subLine1.getSegments();
      SubLine subLine2 = line1.wholeLine();
      subLine1.getSegments();
      // Undeclared exception!
      subLine2.intersection(subLine1, true);
  }
}