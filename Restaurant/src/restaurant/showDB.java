/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import java.awt.Color;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author STUDY fuckin HARD
 */
public class showDB {
    private ArrayList<myOrderDB> myoDB = new ArrayList<myOrderDB>();
    private Map map = new TreeMap(); //Because Treemap -> order of key is important;
    
    public Map getPricePerDay(){
        for(int i=0; i<myoDB.size(); i++){
            int date_temp = myoDB.get(i).getDate().getDate();
            int month_temp = myoDB.get(i).getDate().getMonth();
            int year_temp = myoDB.get(i).getDate().getYear()+1900;
            String temp  = String.valueOf(date_temp) + String.valueOf(month_temp) + String.valueOf(year_temp);
            int date_out = Integer.parseInt(temp);
            if(map.containsKey(date_out)){
                double value = (double) map.get(date_out);
                value += myoDB.get(i).getPrice_include_vat();
                map.replace(date_out, value);
            }
            else{
                map.put(date_out, myoDB.get(i).getPrice_include_vat());
            }
        }
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
        Set keys = run.getPricePerDay().keySet();
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for(Iterator i = keys.iterator(); i.hasNext();){
            int key = (int) i.next();
            double value = (double) run.getPricePerDay().get(key);
            String key_s = String.valueOf(key);
            dataset.setValue(value, "Value", key_s);
        }
        JFreeChart chart = ChartFactory.createLineChart("Price per day", "Date", "Price", (CategoryDataset) dataset, PlotOrientation.VERTICAL, false, true, true);
        chart.setBackgroundPaint(Color.yellow);
        BarRenderer renderer = new BarRenderer();
        CategoryPlot plot = chart.getCategoryPlot();
        ChartPanel panel = new ChartPanel(chart);
        panel.setSize(450,350);
        panel.setVisible(true);
        return panel;
    }
}
