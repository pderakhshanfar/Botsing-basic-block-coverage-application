/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 03:34:17 UTC 2020
 */

package org.apache.commons.math3.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.apache.commons.math3.distribution.DiscreteDistribution;
import org.apache.commons.math3.random.JDKRandomGenerator;
import org.apache.commons.math3.util.Pair;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DiscreteDistribution_ESTest extends DiscreteDistribution_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JDKRandomGenerator jDKRandomGenerator0 = new JDKRandomGenerator();
      LinkedList<Byte> linkedList0 = new LinkedList<Byte>();
      Byte byte0 = new Byte((byte)9);
      linkedList0.offerFirst(byte0);
      LinkedList<Pair<Object, Double>> linkedList1 = new LinkedList<Pair<Object, Double>>();
      Double double0 = new Double(1.1974215507507324);
      Byte byte1 = new Byte((byte)9);
      Pair<Object, Double> pair0 = new Pair<Object, Double>(byte1, double0);
      Pair<Object, Double> pair1 = new Pair<Object, Double>(pair0);
      linkedList1.add(pair1);
      Pair<Object, Double> pair2 = new Pair<Object, Double>(linkedList0, double0);
      linkedList1.addFirst(pair2);
      DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>(jDKRandomGenerator0, linkedList1);
      // Undeclared exception!
      discreteDistribution0.sample((int) (byte)9);
  }
}