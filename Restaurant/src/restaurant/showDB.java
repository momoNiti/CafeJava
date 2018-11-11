/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author STUDY fuckin HARD
 */
public class showDB {
    private ArrayList<myOrderDB> myoDB = new ArrayList<myOrderDB>();
    private Map map = new TreeMap(); //Because Treemap -> order of key is important;
    public Map sumPricePerDay(){
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
    public static void main(String[] args) {
        OrderController ordc = new OrderController();
        showDB run = new showDB();
        run.setMyoDB(ordc.collectData());
        run.sumPricePerDay();   

    }
}
