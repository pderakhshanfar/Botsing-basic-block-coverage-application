/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 16:02:06 UTC 2020
 */

package com.xpn.xwiki.store.hibernate.query;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.store.hibernate.HibernateSessionFactory;
import com.xpn.xwiki.store.hibernate.query.HqlQueryExecutor;
import javax.swing.text.StyledEditorKit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.hibernate.Query;
import org.hibernate.engine.NamedSQLQueryDefinition;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.engine.query.OrdinalParameterDescriptor;
import org.hibernate.engine.query.ParameterMetadata;
import org.hibernate.impl.CollectionFilterImpl;
import org.infinispan.atomic.impl.AtomicHashMap;
import org.junit.runner.RunWith;
import org.xwiki.component.internal.SpaceComponentManager;
import org.xwiki.context.Execution;
import org.xwiki.job.event.status.JobProgressManager;
import org.xwiki.query.internal.DefaultQuery;
import org.xwiki.query.internal.EscapeLikeParametersFilter;
import org.xwiki.rendering.block.EmptyLinesBlock;
import org.xwiki.security.authorization.ContextualAuthorizationManager;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class HqlQueryExecutor_ESTest extends HqlQueryExecutor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ContextualAuthorizationManager contextualAuthorizationManager0 = mock(ContextualAuthorizationManager.class, new ViolatedAssumptionAnswer());
      Execution execution0 = mock(Execution.class, new ViolatedAssumptionAnswer());
      JobProgressManager jobProgressManager0 = mock(JobProgressManager.class, new ViolatedAssumptionAnswer());
      HibernateSessionFactory hibernateSessionFactory0 = mock(HibernateSessionFactory.class, new ViolatedAssumptionAnswer());
      HqlQueryExecutor.isSafeSelect("");
      Query query0 = mock(Query.class, new ViolatedAssumptionAnswer());
      doReturn((Query) null).when(query0).setParameter(anyString() , any());
      HqlQueryExecutor.isSafeSelect("63IRER<DrwMOl");
      EscapeLikeParametersFilter escapeLikeParametersFilter0 = new EscapeLikeParametersFilter();
      HqlQueryExecutor hqlQueryExecutor0 = new HqlQueryExecutor();
      ContextualAuthorizationManager contextualAuthorizationManager1 = mock(ContextualAuthorizationManager.class, new ViolatedAssumptionAnswer());
      EscapeLikeParametersFilter escapeLikeParametersFilter1 = new EscapeLikeParametersFilter();
      StyledEditorKit.AlignmentAction styledEditorKit_AlignmentAction0 = new StyledEditorKit.AlignmentAction("I'3@ol", (-1804));
      styledEditorKit_AlignmentAction0.setEnabled(true);
      hqlQueryExecutor0.setNamedParameter(query0, "", styledEditorKit_AlignmentAction0);
      DefaultQuery defaultQuery0 = new DefaultQuery("I3TmKaG@Q|_DS!l^at*", hqlQueryExecutor0);
      org.xwiki.query.Query query1 = defaultQuery0.setWiki((String) null);
      hqlQueryExecutor0.checkAllowed(query1);
      StyledEditorKit.AlignmentAction styledEditorKit_AlignmentAction1 = new StyledEditorKit.AlignmentAction("", (-1804));
      SessionImplementor sessionImplementor0 = mock(SessionImplementor.class, new ViolatedAssumptionAnswer());
      OrdinalParameterDescriptor[] ordinalParameterDescriptorArray0 = new OrdinalParameterDescriptor[0];
      AtomicHashMap.ProxyMode atomicHashMap_ProxyMode0 = AtomicHashMap.ProxyMode.COARSE;
      AtomicHashMap<NamedSQLQueryDefinition, SpaceComponentManager> atomicHashMap0 = new AtomicHashMap<NamedSQLQueryDefinition, SpaceComponentManager>(false, atomicHashMap_ProxyMode0);
      ParameterMetadata parameterMetadata0 = new ParameterMetadata(ordinalParameterDescriptorArray0, atomicHashMap0);
      CollectionFilterImpl collectionFilterImpl0 = new CollectionFilterImpl("%*!)p5wP]f9", "63IRER<DrwMOl", sessionImplementor0, parameterMetadata0);
      Query query2 = collectionFilterImpl0.setCacheable(false);
      EmptyLinesBlock emptyLinesBlock0 = new EmptyLinesBlock((-1804));
      // Undeclared exception!
      hqlQueryExecutor0.setNamedParameter(query2, (String) null, emptyLinesBlock0);
  }
}