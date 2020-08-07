/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 16:45:58 UTC 2020
 */

package org.apache.commons.math3.geometry.euclidean.twod;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.Line;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math3.geometry.euclidean.twod.Segment;
import org.apache.commons.math3.geometry.euclidean.twod.SubLine;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class PolygonsSet_ESTest extends PolygonsSet_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      PolygonsSet polygonsSet0 = new PolygonsSet();
      PolygonsSet polygonsSet1 = new PolygonsSet();
      polygonsSet0.getTree(true);
      PolygonsSet polygonsSet2 = new PolygonsSet(linkedList0);
      polygonsSet2.getVertices();
      BSPTree<Euclidean2D> bSPTree0 = polygonsSet0.getTree(false);
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      Vector2D vector2D1 = new Vector2D(313.82278097625, vector2D0, 313.82278097625, vector2D0);
      BSPTree<Euclidean2D> bSPTree1 = bSPTree0.getCell(vector2D1);
      Segment segment0 = new Segment(vector2D1, vector2D1, (Line) null);
      SubLine subLine0 = new SubLine(segment0);
      BSPTree<Euclidean2D> bSPTree2 = bSPTree1.split(subLine0);
      BSPTree<Euclidean2D> bSPTree3 = bSPTree2.getPlus();
      bSPTree2.copySelf();
      BSPTree<Euclidean2D> bSPTree4 = bSPTree3.getParent();
      PolygonsSet polygonsSet3 = polygonsSet0.buildNew(bSPTree4);
      // Undeclared exception!
      polygonsSet3.computeGeometricalProperties();
  }
}