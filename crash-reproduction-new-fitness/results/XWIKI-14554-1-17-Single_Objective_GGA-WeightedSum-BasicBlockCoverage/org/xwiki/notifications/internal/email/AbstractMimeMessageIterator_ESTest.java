/*
 * This file was automatically generated by EvoSuite
 * Sun May 17 20:17:21 UTC 2020
 */

package org.xwiki.notifications.internal.email;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ch.qos.logback.classic.Logger;
import com.xpn.xwiki.XWikiContext;
import com.xpn.xwiki.doc.merge.MergeResult;
import com.xpn.xwiki.store.hibernate.HibernateSessionFactory;
import com.xpn.xwiki.store.migration.DataMigrationManager;
import java.time.chrono.ThaiBuddhistDate;
import java.util.Queue;
import javax.inject.Provider;
import javax.mail.internet.MimeMessage;
import javax.swing.JSpinner;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.hibernate.loader.custom.sql.SQLCustomQuery;
import org.jfree.data.xy.XYDatasetTableModel;
import org.jgroups.util.ExtendedUUID;
import org.jgroups.util.TimeScheduler3;
import org.junit.runner.RunWith;
import org.slf4j.event.EventRecodingLogger;
import org.slf4j.event.SubstituteLoggingEvent;
import org.slf4j.helpers.NOPLogger;
import org.slf4j.helpers.SubstituteLogger;
import org.xwiki.bridge.DocumentAccessBridge;
import org.xwiki.component.manager.ComponentManager;
import org.xwiki.configuration.ConfigurationSource;
import org.xwiki.logging.LoggerManager;
import org.xwiki.mail.MimeMessageFactory;
import org.xwiki.mail.internal.configuration.DefaultMailSenderConfiguration;
import org.xwiki.model.reference.DocumentReference;
import org.xwiki.model.reference.DocumentReferenceResolver;
import org.xwiki.model.reference.EntityReferenceSerializer;
import org.xwiki.notifications.NotificationManager;
import org.xwiki.notifications.email.NotificationEmailRenderer;
import org.xwiki.notifications.internal.email.AbstractMimeMessageIterator;
import org.xwiki.notifications.internal.email.PeriodicMimeMessageIterator;
import org.xwiki.wiki.descriptor.WikiDescriptorManager;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractMimeMessageIterator_ESTest extends AbstractMimeMessageIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NotificationManager notificationManager0 = mock(NotificationManager.class, new ViolatedAssumptionAnswer());
      EntityReferenceSerializer<XYDatasetTableModel> entityReferenceSerializer0 = (EntityReferenceSerializer<XYDatasetTableModel>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      NotificationEmailRenderer notificationEmailRenderer0 = mock(NotificationEmailRenderer.class, new ViolatedAssumptionAnswer());
      DocumentAccessBridge documentAccessBridge0 = mock(DocumentAccessBridge.class, new ViolatedAssumptionAnswer());
      MimeMessageFactory<Integer> mimeMessageFactory0 = (MimeMessageFactory<Integer>) mock(MimeMessageFactory.class, new ViolatedAssumptionAnswer());
      Logger logger0 = (Logger)SQLCustomQuery.log;
      ConfigurationSource configurationSource0 = mock(ConfigurationSource.class, new ViolatedAssumptionAnswer());
      MergeResult mergeResult0 = new MergeResult();
      ConfigurationSource configurationSource1 = mock(ConfigurationSource.class, new ViolatedAssumptionAnswer());
      ConfigurationSource configurationSource2 = mock(ConfigurationSource.class, new ViolatedAssumptionAnswer());
      WikiDescriptorManager wikiDescriptorManager0 = mock(WikiDescriptorManager.class, new ViolatedAssumptionAnswer());
      DocumentAccessBridge documentAccessBridge1 = mock(DocumentAccessBridge.class, new ViolatedAssumptionAnswer());
      NOPLogger nOPLogger0 = NOPLogger.NOP_LOGGER;
      EntityReferenceSerializer<ThaiBuddhistDate> entityReferenceSerializer1 = (EntityReferenceSerializer<ThaiBuddhistDate>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      DocumentReferenceResolver<Object> documentReferenceResolver0 = (DocumentReferenceResolver<Object>) mock(DocumentReferenceResolver.class, new ViolatedAssumptionAnswer());
      DocumentReferenceResolver<TimeScheduler3.Task> documentReferenceResolver1 = (DocumentReferenceResolver<TimeScheduler3.Task>) mock(DocumentReferenceResolver.class, new ViolatedAssumptionAnswer());
      EntityReferenceSerializer<DocumentReference> entityReferenceSerializer2 = (EntityReferenceSerializer<DocumentReference>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      EntityReferenceSerializer<MimeMessage> entityReferenceSerializer3 = (EntityReferenceSerializer<MimeMessage>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      ComponentManager componentManager0 = mock(ComponentManager.class, new ViolatedAssumptionAnswer());
      XWikiContext xWikiContext0 = new XWikiContext();
      DataMigrationManager dataMigrationManager0 = mock(DataMigrationManager.class, new ViolatedAssumptionAnswer());
      LoggerManager loggerManager0 = mock(LoggerManager.class, new ViolatedAssumptionAnswer());
      HibernateSessionFactory hibernateSessionFactory0 = mock(HibernateSessionFactory.class, new ViolatedAssumptionAnswer());
      Provider<ExtendedUUID> provider0 = (Provider<ExtendedUUID>) mock(Provider.class, new ViolatedAssumptionAnswer());
      DocumentReferenceResolver<Object> documentReferenceResolver2 = (DocumentReferenceResolver<Object>) mock(DocumentReferenceResolver.class, new ViolatedAssumptionAnswer());
      WikiDescriptorManager wikiDescriptorManager1 = mock(WikiDescriptorManager.class, new ViolatedAssumptionAnswer());
      PeriodicMimeMessageIterator periodicMimeMessageIterator0 = new PeriodicMimeMessageIterator();
      NotificationManager notificationManager1 = mock(NotificationManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(periodicMimeMessageIterator0, (Class<?>) PeriodicMimeMessageIterator.class, "notificationManager", (Object) notificationManager1);
      EntityReferenceSerializer<JSpinner.ListEditor> entityReferenceSerializer4 = (EntityReferenceSerializer<JSpinner.ListEditor>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      Injector.inject(periodicMimeMessageIterator0, (Class<?>) PeriodicMimeMessageIterator.class, "serializer", (Object) entityReferenceSerializer4);
      NotificationEmailRenderer notificationEmailRenderer1 = mock(NotificationEmailRenderer.class, new ViolatedAssumptionAnswer());
      Injector.inject(periodicMimeMessageIterator0, (Class<?>) AbstractMimeMessageIterator.class, "defaultNotificationEmailRenderer", (Object) notificationEmailRenderer1);
      DocumentAccessBridge documentAccessBridge2 = mock(DocumentAccessBridge.class, new ViolatedAssumptionAnswer());
      Injector.inject(periodicMimeMessageIterator0, (Class<?>) AbstractMimeMessageIterator.class, "documentAccessBridge", (Object) documentAccessBridge2);
      MimeMessageFactory<Integer> mimeMessageFactory1 = (MimeMessageFactory<Integer>) mock(MimeMessageFactory.class, new ViolatedAssumptionAnswer());
      Injector.inject(periodicMimeMessageIterator0, (Class<?>) AbstractMimeMessageIterator.class, "factory", (Object) mimeMessageFactory1);
      SubstituteLogger substituteLogger0 = new SubstituteLogger("@iC", (Queue<SubstituteLoggingEvent>) null, false);
      EventRecodingLogger eventRecodingLogger0 = new EventRecodingLogger(substituteLogger0, (Queue<SubstituteLoggingEvent>) null);
      Injector.inject(periodicMimeMessageIterator0, (Class<?>) AbstractMimeMessageIterator.class, "logger", (Object) eventRecodingLogger0);
      DefaultMailSenderConfiguration defaultMailSenderConfiguration0 = new DefaultMailSenderConfiguration();
      ConfigurationSource configurationSource3 = mock(ConfigurationSource.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(configurationSource3).getProperty(anyString() , nullable(java.lang.Class.class));
      Injector.inject(defaultMailSenderConfiguration0, (Class<?>) DefaultMailSenderConfiguration.class, "documentsSource", (Object) configurationSource3);
      Logger logger1 = (Logger)SQLCustomQuery.log;
      Injector.inject(defaultMailSenderConfiguration0, (Class<?>) DefaultMailSenderConfiguration.class, "logger", (Object) logger1);
      ConfigurationSource configurationSource4 = mock(ConfigurationSource.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(configurationSource4).getProperty(anyString() , nullable(java.lang.Object.class));
      Injector.inject(defaultMailSenderConfiguration0, (Class<?>) DefaultMailSenderConfiguration.class, "mailConfigSource", (Object) configurationSource4);
      ConfigurationSource configurationSource5 = mock(ConfigurationSource.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(configurationSource5).getProperty(anyString() , nullable(java.lang.Class.class));
      Injector.inject(defaultMailSenderConfiguration0, (Class<?>) DefaultMailSenderConfiguration.class, "xwikiPropertiesSource", (Object) configurationSource5);
      Injector.validateBean(defaultMailSenderConfiguration0, (Class<?>) DefaultMailSenderConfiguration.class);
      Injector.inject(periodicMimeMessageIterator0, (Class<?>) AbstractMimeMessageIterator.class, "mailSenderConfiguration", (Object) defaultMailSenderConfiguration0);
      WikiDescriptorManager wikiDescriptorManager2 = mock(WikiDescriptorManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(periodicMimeMessageIterator0, (Class<?>) AbstractMimeMessageIterator.class, "wikiDescriptorManager", (Object) wikiDescriptorManager2);
      Injector.validateBean(periodicMimeMessageIterator0, (Class<?>) PeriodicMimeMessageIterator.class);
      // Undeclared exception!
      periodicMimeMessageIterator0.next();
  }
}