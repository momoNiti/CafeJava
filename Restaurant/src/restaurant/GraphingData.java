/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

/**
 *
 * @author STUDY fuckin HARD
 */
import java.awt.*;
import java.util.Iterator;
import java.util.Set;
import javax.swing.*;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

 
public class GraphingData extends JPanel {
    
    OrderController ordc = new OrderController();
    showDB run = new showDB();
    public GraphingData(){
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
        ChartFrame frame = new ChartFrame("Price per day", chart);
        frame.setVisible(true);
        frame.setSize(450,350);
    }


    public static void main(String[] args) {
        GraphingData graph = new GraphingData();
 
    }
}
