/*
 * This file was automatically generated by EvoSuite
 * Thu May 14 22:26:39 UTC 2020
 */

package org.apache.commons.math3.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Comparator;
import java.util.LinkedList;
import org.apache.commons.math3.distribution.DiscreteDistribution;
import org.apache.commons.math3.random.JDKRandomGenerator;
import org.apache.commons.math3.util.Pair;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DiscreteDistribution_ESTest extends DiscreteDistribution_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JDKRandomGenerator jDKRandomGenerator0 = new JDKRandomGenerator();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
      byte byte0 = (byte) (-115);
      Byte byte1 = new Byte((byte) (-115));
      Pair<Byte, Object> pair0 = new Pair<Byte, Object>(byte1, (Object) null);
      Double double0 = new Double(3596.532645214056);
      Pair<Object, Double> pair1 = new Pair<Object, Double>(pair0, double0);
      linkedList0.add(pair1);
      DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>(jDKRandomGenerator0, linkedList0);
      discreteDistribution0.sample();
      LinkedList<Object> linkedList1 = new LinkedList<Object>();
      int int0 = (-477);
      Pair<Object, Double> pair2 = new Pair<Object, Double>(linkedList0, double0);
      linkedList0.add(pair2);
      discreteDistribution0.sample();
      int int1 = 5356;
      DiscreteDistribution<Object> discreteDistribution1 = new DiscreteDistribution<Object>(jDKRandomGenerator0, linkedList0);
      // Undeclared exception!
      discreteDistribution1.sample(148);
  }
}