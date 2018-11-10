/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;

/**
 *
 * @author STUDY fuckin HARD
 */
public class myOrderDB {
    private ArrayList<orderedDB> odb = new ArrayList<orderedDB>();
    private double price_include_vat;
    private double priceTotal;
    private String user;
    private int orderID;
    private Timestamp date;
    final double vat = 0.07;
    
    public myOrderDB(int orderID, ArrayList<orderedDB> odb, double priceTotal, double price_include_vat, Timestamp date, String user) {
        this.price_include_vat = price_include_vat;
        this.priceTotal = priceTotal;
        this.user = user;
        this.orderID = orderID;
        this.date = date;
        this.odb = odb;
    }
    public int getOrderID() {
        return orderID;
    }
    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }
    public void addFood(orderedDB odb){
        this.odb.add(odb);
    }
    public void showFood(){
        for(int i=0; i<odb.size(); i++){
            System.out.println(odb.get(i).getQuantity() + " " + odb.get(i).getName() + " " + odb.get(i).getPrice_each() + " " + odb.get(i).getPrice());
        }
    }

    public void setPrice_include_vat(double price_include_vat) {
        double temp = price_include_vat * vat;
        this.price_include_vat = price_include_vat + temp ;
    }
    public double getPrice_include_vat() {
        double temp = priceTotal * vat;
        price_include_vat = temp + priceTotal;
        return price_include_vat;
    }
    
    public double getPriceTotal() {
        return priceTotal;
    }

    public void setPriceTotal(double priceTotal) {
        this.priceTotal = priceTotal;
    }
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public ArrayList<orderedDB> getOdb() {
        return odb;
    }
    public void setOdb(ArrayList<orderedDB> odb) {
        this.odb = odb;
    }
    public Timestamp getDate() {
        return date;
    }
    public void setDate(Timestamp date) {
        this.date = date;
    }

}
