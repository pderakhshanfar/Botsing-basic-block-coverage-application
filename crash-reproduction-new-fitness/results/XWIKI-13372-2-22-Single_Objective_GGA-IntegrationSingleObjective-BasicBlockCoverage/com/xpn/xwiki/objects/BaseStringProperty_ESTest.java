/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 00:48:28 UTC 2020
 */

package com.xpn.xwiki.objects;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.objects.BaseCollection;
import com.xpn.xwiki.objects.BaseStringProperty;
import java.time.chrono.ThaiBuddhistEra;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.model.reference.LocalDocumentReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseStringProperty_ESTest extends BaseStringProperty_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BaseStringProperty baseStringProperty0 = new BaseStringProperty();
      BaseStringProperty baseStringProperty1 = baseStringProperty0.clone();
      baseStringProperty1.getDocumentReference();
      baseStringProperty1.setClassType(";z*%m,<");
      baseStringProperty1.getDocumentReference();
      BaseStringProperty baseStringProperty2 = new BaseStringProperty();
      BaseCollection<LocalDocumentReference> baseCollection0 = (BaseCollection<LocalDocumentReference>) mock(BaseCollection.class, new ViolatedAssumptionAnswer());
      baseStringProperty0.setObject(baseCollection0);
      baseStringProperty2.getCustomMappingValue();
      baseStringProperty0.getCustomMappingValue();
      baseStringProperty2.setValue("");
      boolean boolean0 = new Boolean("");
      ThaiBuddhistEra thaiBuddhistEra0 = ThaiBuddhistEra.BEFORE_BE;
      baseStringProperty2.cloneInternal(baseStringProperty0);
      baseStringProperty0.setId((-162L));
      // Undeclared exception!
      baseStringProperty0.equals((Object) null);
  }
}