/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import db.OrderController;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
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
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.axis.SymbolAxis;
import org.jfree.chart.labels.StandardXYItemLabelGenerator;
import org.jfree.chart.labels.XYItemLabelGenerator;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author STUDY fuckin HARD
 */
public class ShowDB {
    private ArrayList<MyOrderDB> myoDB = new ArrayList<MyOrderDB>();
    private Map map = new TreeMap(); //Because Treemap -> order of key is important;
    public Map getPricePerDay(){
        for(int i=0; i<myoDB.size(); i++){
            Timestamp time = myoDB.get(i).getDate(); //ดึงเวลาจาก database (เป็น format ของ sql)
            Date date = new Date(time.getTime()); // แปลงจาก sql เป็น Date
            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); // สร้าง Format ตามที่ต้องการ
            String date_formated = formatter.format(date); //ได้วันเดือนปีตามที่ format ไว้
            if(map.containsKey(date_formated)){ // ถ้า map มี key อยู่แล้ว ให้เพิ่มค่าเข้าไป ซึ่ง key คือ วันเดือนปี ถ้าไม่มีให้เพิ่มค่าใหม่เข้าไป
                double value = (double) map.get(date_formated);
                value += myoDB.get(i).getPrice_include_vat();
                map.put(date_formated, value);
            }
            else{
                map.put(date_formated, myoDB.get(i).getPrice_include_vat());
            }
        }
        return map;
    }
    public ArrayList<MyOrderDB> getMyoDB() {
        return myoDB;
    }
    public void setMyoDB(ArrayList<MyOrderDB> myoDB) {
        this.myoDB = myoDB;
    }
    public ChartPanel getGraph(Map map){
        Set set = map.entrySet(); //make map to set to get key and value from map
        Iterator iterator = set.iterator(); //ดึงข้อมูลจาก set

        String[] xDate = new String[set.size()]; // แก้ไขตัวแปรในแกน x ที่แสดงในกราฟ
        XYSeriesCollection dataset = new XYSeriesCollection(); //ประกาศ Dataset ที่ใช้ในการเก็บ Series
        XYSeries series = new XYSeries("PPD"); // ประกาศซีรี่ส์
        
        int k = 0; // เก็บ index ของ []xDate
        while(iterator.hasNext()) {
            Map.Entry mapentry = (Map.Entry)iterator.next(); // เรียก map แต่ละตัว
            String key = (String) mapentry.getKey(); // set key ของ map (วันที่ขาย)
            double value = (double) mapentry.getValue(); //set value ของ map (ยอดขาย)
            xDate[k] = key; // เก็บ key ลงใน xDate
            series.add(k, value); //เพิ่มค่าลงใน Series (x, y)
            k++; // เพิ่มค่า k
        }
        
        dataset.addSeries(series); // เพิ่ม series ลงใน dataset
        //สรา้ง chart 
        JFreeChart chart = ChartFactory.createXYLineChart("Price per day", "Date", "Price", dataset, PlotOrientation.VERTICAL, true, true, false);
        chart.setBackgroundPaint(Color.red);
        
        XYPlot plot = (XYPlot) chart.getPlot();
        
        //แก้ไขแกน X
        SymbolAxis domainAxis = new SymbolAxis("Date", xDate); //SymbolAxis แก้แกนจากตัวเลขเป็น String 
        domainAxis.setTickUnit(new NumberTickUnit(1)); //กำหนดระยะห่างของแกน x
        plot.setDomainAxis(domainAxis); // set แกน x เป็นค่าที่บันทึกไว้ใน xDate #ถ้าsetRange จะเป็นค่าในแกน Y
        //แก้ไขสี
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer( );
        renderer.setSeriesPaint(0, Color.GREEN); // สีของ series
        renderer.setSeriesStroke(0, new BasicStroke(3.0f)); //ความหนาของเส้น
        //แสดงเลขบนจุดที่ plot ไว้        
        NumberFormat format = NumberFormat.getNumberInstance();
        format.setMaximumFractionDigits(2); // โชว์ค่าเป็นเลขสองหลัก 
        XYItemLabelGenerator generator = new StandardXYItemLabelGenerator("{2}", format, format); //gen ค่าตามที่ format ไว้ โดย {}ดึงข้อมูลจาก series โดย 0 เป็น ชื่อ series , 1 คือค่า x และ 2 คือค่า y
        renderer.setBaseItemLabelGenerator(generator);
        renderer.setBaseItemLabelsVisible(true);
        
        plot.setRenderer(renderer); // set ตามที่ render ไว้
        
        ChartPanel panel = new ChartPanel(chart); //สร้าว chartpanel
        panel.setDomainZoomable(false); // ทำให้ซูมไม่ได้
        panel.setVisible(true); 
        panel.setPreferredSize(new Dimension(1143, 616)); //ทำให้ขนาดเท่ากับ panel ที่สร้างเอาไว้
        return panel; //คืนค่า panel กลับ
    }
}