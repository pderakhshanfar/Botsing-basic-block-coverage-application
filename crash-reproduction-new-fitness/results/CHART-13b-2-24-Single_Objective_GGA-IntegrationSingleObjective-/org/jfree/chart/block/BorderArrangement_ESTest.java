/*
 * This file was automatically generated by EvoSuite
 * Mon May 18 01:39:04 UTC 2020
 */

package org.jfree.chart.block;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.lowagie.text.Document;
import com.lowagie.text.pdf.PdfName;
import com.lowagie.text.pdf.PdfSpotColor;
import java.awt.Graphics2D;
import java.awt.SystemColor;
import javax.swing.JTextArea;
import javax.swing.plaf.basic.BasicEditorPaneUI;
import javax.swing.text.DefaultCaret;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.block.BlockBorder;
import org.jfree.chart.block.BlockContainer;
import org.jfree.chart.block.BorderArrangement;
import org.jfree.chart.block.LengthConstraintType;
import org.jfree.data.Range;
import org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BorderArrangement_ESTest extends BorderArrangement_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BlockContainer blockContainer0 = new BlockContainer();
      SystemColor systemColor0 = SystemColor.textInactiveText;
      BlockBorder blockBorder0 = BlockBorder.NONE;
      BasicEditorPaneUI basicEditorPaneUI0 = new BasicEditorPaneUI();
      JTextArea jTextArea0 = new JTextArea(8970, 8970);
      DefaultCaret defaultCaret0 = new DefaultCaret();
      blockContainer0.setFrame(blockBorder0);
      LengthConstraintType lengthConstraintType0 = LengthConstraintType.NONE;
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      BorderArrangement borderArrangement0 = new BorderArrangement();
      Document document0 = new Document();
      PdfName pdfName0 = PdfName.WIDTH;
      document0.close();
      PdfSpotColor pdfSpotColor0 = new PdfSpotColor("H:", 4.0F, systemColor0);
      DefaultBoxAndWhiskerXYDataset defaultBoxAndWhiskerXYDataset0 = new DefaultBoxAndWhiskerXYDataset(true);
      document0.newPage();
      defaultBoxAndWhiskerXYDataset0.setOutlierCoefficient(3412.63438);
      Range range0 = new Range(3412.63438, 'm');
  }
}