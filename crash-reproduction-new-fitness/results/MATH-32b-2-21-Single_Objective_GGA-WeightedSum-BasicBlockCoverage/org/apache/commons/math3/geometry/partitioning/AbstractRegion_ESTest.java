/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 16:41:44 UTC 2020
 */

package org.apache.commons.math3.geometry.partitioning;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.Line;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math3.geometry.euclidean.twod.SubLine;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractRegion_ESTest extends AbstractRegion_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IntervalsSet intervalsSet0 = new IntervalsSet();
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>(intervalsSet0);
      Vector2D vector2D0 = Vector2D.NaN;
      Vector2D vector2D1 = new Vector2D((-1738.6952272), vector2D0, 1417.4472249329128, vector2D0, (-1738.6952272), vector2D0);
      Line line0 = new Line(vector2D1, (-2125.0));
      Line line1 = new Line(line0);
      SubLine subLine0 = line1.wholeHyperplane();
      BSPTree<Euclidean2D> bSPTree1 = bSPTree0.split(subLine0);
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree1);
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree0);
      polygonsSet1.getTree(true);
      // Undeclared exception!
      polygonsSet1.getSize();
  }
}