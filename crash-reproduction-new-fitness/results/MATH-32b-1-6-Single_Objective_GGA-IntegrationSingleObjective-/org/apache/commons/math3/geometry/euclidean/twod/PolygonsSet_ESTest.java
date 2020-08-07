/*
 * This file was automatically generated by EvoSuite
 * Sat May 16 12:18:14 UTC 2020
 */

package org.apache.commons.math3.geometry.euclidean.twod;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.geom.AffineTransform;
import java.text.NumberFormat;
import java.util.LinkedList;
import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.Line;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math3.geometry.euclidean.twod.SubLine;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
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
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>();
      Vector2D vector2D0 = Vector2D.NaN;
      NumberFormat numberFormat0 = NumberFormat.getIntegerInstance();
      vector2D0.toString(numberFormat0);
      Line line0 = new Line(vector2D0, vector2D0);
      line0.getAngle();
      IntervalsSet intervalsSet0 = new IntervalsSet();
      Transform<Euclidean1D, Euclidean1D> transform0 = (Transform<Euclidean1D, Euclidean1D>) mock(Transform.class, new ViolatedAssumptionAnswer());
      intervalsSet0.applyTransform(transform0);
      SubLine subLine0 = new SubLine(line0, intervalsSet0);
      bSPTree0.setAttribute(intervalsSet0);
      AffineTransform.getTranslateInstance(2720.0603F, 2720.0603F);
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      PolygonsSet polygonsSet0 = new PolygonsSet(linkedList0);
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree0);
      polygonsSet1.getVertices();
      // Undeclared exception!
      polygonsSet1.computeGeometricalProperties();
  }
}