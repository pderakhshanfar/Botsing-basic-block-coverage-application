/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 31 00:15:03 UTC 2020
 */

package org.xwiki.notifications.internal.email;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.TextField;
import java.util.Queue;
import javax.mail.internet.MimeMessage;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.slf4j.event.SubstituteLoggingEvent;
import org.slf4j.helpers.NOPLogger;
import org.slf4j.helpers.SubstituteLogger;
import org.xwiki.bridge.DocumentAccessBridge;
import org.xwiki.configuration.ConfigurationSource;
import org.xwiki.mail.MimeMessageFactory;
import org.xwiki.mail.internal.configuration.DefaultMailSenderConfiguration;
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
      SubstituteLogger substituteLogger0 = new SubstituteLogger("Q@1BYHN<3^-#q/F", (Queue<SubstituteLoggingEvent>) null, false);
      DefaultMailSenderConfiguration defaultMailSenderConfiguration0 = new DefaultMailSenderConfiguration();
      ConfigurationSource configurationSource0 = mock(ConfigurationSource.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(configurationSource0).getProperty(anyString() , nullable(java.lang.Class.class));
      Injector.inject(defaultMailSenderConfiguration0, (Class<?>) DefaultMailSenderConfiguration.class, "documentsSource", (Object) configurationSource0);
      NOPLogger nOPLogger0 = NOPLogger.NOP_LOGGER;
      Injector.inject(defaultMailSenderConfiguration0, (Class<?>) DefaultMailSenderConfiguration.class, "logger", (Object) nOPLogger0);
      ConfigurationSource configurationSource1 = mock(ConfigurationSource.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(configurationSource1).getProperty(anyString() , nullable(java.lang.Object.class));
      Injector.inject(defaultMailSenderConfiguration0, (Class<?>) DefaultMailSenderConfiguration.class, "mailConfigSource", (Object) configurationSource1);
      ConfigurationSource configurationSource2 = mock(ConfigurationSource.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(configurationSource2).getProperty(anyString() , nullable(java.lang.Class.class));
      Injector.inject(defaultMailSenderConfiguration0, (Class<?>) DefaultMailSenderConfiguration.class, "xwikiPropertiesSource", (Object) configurationSource2);
      Injector.validateBean(defaultMailSenderConfiguration0, (Class<?>) DefaultMailSenderConfiguration.class);
      PeriodicMimeMessageIterator periodicMimeMessageIterator0 = new PeriodicMimeMessageIterator();
      NotificationManager notificationManager0 = mock(NotificationManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(periodicMimeMessageIterator0, (Class<?>) PeriodicMimeMessageIterator.class, "notificationManager", (Object) notificationManager0);
      EntityReferenceSerializer<TextField> entityReferenceSerializer0 = (EntityReferenceSerializer<TextField>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      Injector.inject(periodicMimeMessageIterator0, (Class<?>) PeriodicMimeMessageIterator.class, "serializer", (Object) entityReferenceSerializer0);
      NotificationEmailRenderer notificationEmailRenderer0 = mock(NotificationEmailRenderer.class, new ViolatedAssumptionAnswer());
      Injector.inject(periodicMimeMessageIterator0, (Class<?>) AbstractMimeMessageIterator.class, "defaultNotificationEmailRenderer", (Object) notificationEmailRenderer0);
      DocumentAccessBridge documentAccessBridge0 = mock(DocumentAccessBridge.class, new ViolatedAssumptionAnswer());
      Injector.inject(periodicMimeMessageIterator0, (Class<?>) AbstractMimeMessageIterator.class, "documentAccessBridge", (Object) documentAccessBridge0);
      MimeMessageFactory<MimeMessage> mimeMessageFactory0 = (MimeMessageFactory<MimeMessage>) mock(MimeMessageFactory.class, new ViolatedAssumptionAnswer());
      Injector.inject(periodicMimeMessageIterator0, (Class<?>) AbstractMimeMessageIterator.class, "factory", (Object) mimeMessageFactory0);
      Injector.inject(periodicMimeMessageIterator0, (Class<?>) AbstractMimeMessageIterator.class, "logger", (Object) substituteLogger0);
      Injector.inject(periodicMimeMessageIterator0, (Class<?>) AbstractMimeMessageIterator.class, "mailSenderConfiguration", (Object) defaultMailSenderConfiguration0);
      WikiDescriptorManager wikiDescriptorManager0 = mock(WikiDescriptorManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(periodicMimeMessageIterator0, (Class<?>) AbstractMimeMessageIterator.class, "wikiDescriptorManager", (Object) wikiDescriptorManager0);
      Injector.validateBean(periodicMimeMessageIterator0, (Class<?>) PeriodicMimeMessageIterator.class);
      // Undeclared exception!
      periodicMimeMessageIterator0.next();
  }
}