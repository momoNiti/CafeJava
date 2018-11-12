/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import static java.lang.String.format;
import static java.lang.String.format;
import static java.lang.String.format;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.PolarChartPanel;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.axis.SymbolAxis;
import org.jfree.chart.labels.StandardXYItemLabelGenerator;
import org.jfree.chart.labels.StandardXYToolTipGenerator;
import org.jfree.chart.labels.XYItemLabelGenerator;
import org.jfree.chart.labels.XYToolTipGenerator;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author STUDY fuckin HARD
 */
public class showDB {
    private ArrayList<myOrderDB> myoDB = new ArrayList<myOrderDB>();
    private Map map = new TreeMap(); //Because Treemap -> order of key is important;
    public Map getPricePerDay(){
        for(int i=0; i<myoDB.size(); i++){
            Timestamp time = myoDB.get(i).getDate();
            Date date = new Date(time.getTime());
            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            String date_formated = formatter.format(date);
            if(map.containsKey(date_formated)){
                double value = (double) map.get(date_formated);
                value += myoDB.get(i).getPrice_include_vat();
                map.put(date_formated, value);
//                map.replace(date_formated, value);
            }
            else{
                map.put(date_formated, myoDB.get(i).getPrice_include_vat());           
            }
        }
//        System.out.println(map.entrySet());
        return map;
    }
    public ArrayList<myOrderDB> getMyoDB() {
        return myoDB;
    }
    public void setMyoDB(ArrayList<myOrderDB> myoDB) {
        this.myoDB = myoDB;
    }
    public ChartPanel getGraph(){
        OrderController ordc = new OrderController();
        showDB run = new showDB();
        run.setMyoDB(ordc.collectData());
        Set set = run.getPricePerDay().entrySet();
        Iterator iterator = set.iterator();
        
        String[] xDate = new String[set.size()];
        XYSeriesCollection dataset = new XYSeriesCollection();
        XYSeries series = new XYSeries("Price per day");
        
        int k = 0;
        while(iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();
            String key = (String) mentry.getKey();
            double value = (double) mentry.getValue();
            xDate[k] = key;
            series.add(k, value);
            k++;
        }
        
        dataset.addSeries(series);
        JFreeChart chart = ChartFactory.createXYLineChart("Price per day", "Date", "Price", dataset, PlotOrientation.VERTICAL, true, true, false);
        
        XYPlot plot = (XYPlot) chart.getPlot();
        plot.setForegroundAlpha(0.7f);
        
        SymbolAxis domainAxis = new SymbolAxis("Date", xDate);
        domainAxis.setTickUnit(new NumberTickUnit(1));
//        domainAxis.setRange(0, xDate.length);
        plot.setDomainAxis(domainAxis);
        
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer( );
        renderer.setSeriesPaint(0, Color.GREEN);
        renderer.setSeriesStroke(0, new BasicStroke(3.0f));
        plot.setRenderer(renderer);
        
        chart.setBackgroundPaint(Color.red);
                
        NumberFormat format = NumberFormat.getNumberInstance();
        format.setMaximumFractionDigits(2); 
        XYItemLabelGenerator generator = new StandardXYItemLabelGenerator("{2}", format, format);
        renderer.setBaseItemLabelGenerator(generator);
        renderer.setBaseItemLabelsVisible(true);
        
        ChartPanel panel = new ChartPanel(chart);
        panel.setDomainZoomable(true);
        panel.setVisible(true);
        panel.setPreferredSize(new Dimension(1143, 616));
        return panel;
    }
    
}
