/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Mar 30 16:31:22 UTC 2020
 */

package org.jfree.chart.plot;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;

@EvoSuiteClassExclude
public class XYPlot_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jfree.chart.plot.XYPlot"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 


  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(XYPlot_ESTest_scaffolding.class.getClassLoader() ,
      "org.jfree.chart.entity.AxisEntity",
      "org.jfree.chart.text.TextMeasurer",
      "org.jfree.chart.axis.TickUnit",
      "org.jfree.chart.LegendItemSource",
      "org.jfree.chart.ChartColor",
      "org.jfree.data.DomainOrder",
      "org.jfree.chart.axis.AxisState",
      "org.jfree.data.DomainInfo",
      "org.jfree.data.general.DatasetChangeListener",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.chart.plot.Zoomable",
      "org.jfree.chart.axis.MarkerAxisBand",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.chart.renderer.xy.XYItemRenderer",
      "org.jfree.chart.axis.AxisSpace",
      "org.jfree.data.RangeInfo",
      "org.jfree.chart.util.ObjectList",
      "org.jfree.chart.axis.TickUnitSource",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.chart.plot.XYPlot",
      "org.jfree.chart.event.ChartChangeEventType",
      "org.jfree.data.general.DatasetSelectionState",
      "org.jfree.data.xy.OHLCDataset",
      "org.jfree.data.xy.AbstractXYDataset",
      "org.jfree.chart.entity.ChartEntity",
      "org.jfree.data.general.SeriesDataset",
      "org.jfree.chart.plot.Pannable",
      "org.jfree.chart.event.MarkerChangeListener",
      "org.jfree.data.xy.XYDataset",
      "org.jfree.data.Values2D",
      "org.jfree.data.general.SeriesChangeEvent",
      "org.jfree.chart.plot.Plot",
      "org.jfree.chart.event.PlotChangeEvent",
      "org.jfree.chart.plot.ValueAxisPlot",
      "org.jfree.data.RangeType",
      "org.jfree.data.general.DatasetChangeEvent",
      "org.jfree.chart.axis.TickUnits",
      "org.jfree.data.general.SeriesChangeListener",
      "org.jfree.data.xy.XYDatasetSelectionState",
      "org.jfree.data.general.Dataset",
      "org.jfree.chart.plot.SeriesRenderingOrder",
      "org.jfree.chart.plot.PlotRenderingInfo",
      "org.jfree.chart.plot.PlotOrientation",
      "org.jfree.chart.axis.NumberAxis",
      "org.jfree.chart.axis.Axis",
      "org.jfree.data.xy.DefaultWindDataset",
      "org.jfree.chart.axis.NumberTickUnit",
      "org.jfree.data.general.PieDataset",
      "org.jfree.chart.plot.DrawingSupplier",
      "org.jfree.data.statistics.BoxAndWhiskerCategoryDataset",
      "org.jfree.chart.entity.AxisLabelEntity",
      "org.jfree.data.general.DatasetUtilities",
      "org.jfree.chart.util.UnitType",
      "org.jfree.chart.util.AbstractObjectList",
      "org.jfree.chart.axis.AxisLocation",
      "org.jfree.data.xy.IntervalXYDataset",
      "org.jfree.chart.axis.ValueAxis",
      "org.jfree.data.xy.WindDataset",
      "org.jfree.chart.util.PublicCloneable",
      "org.jfree.chart.util.RectangleEdge",
      "org.jfree.chart.plot.Selectable",
      "org.jfree.chart.plot.DefaultDrawingSupplier",
      "org.jfree.chart.event.ChartChangeEvent",
      "org.jfree.data.Values",
      "org.jfree.data.KeyedValues2D",
      "org.jfree.chart.event.AxisChangeListener",
      "org.jfree.data.category.CategoryDataset",
      "org.jfree.data.Range",
      "org.jfree.chart.plot.DatasetRenderingOrder",
      "org.jfree.chart.event.RendererChangeListener",
      "org.jfree.data.KeyedValues",
      "org.jfree.chart.util.RectangleInsets",
      "org.jfree.chart.util.ResourceBundleWrapper",
      "org.jfree.chart.entity.PlotEntity"
    );
  } 
}