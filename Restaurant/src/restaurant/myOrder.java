/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import java.util.ArrayList;

/**
 *
 * @author STUDY fuckin HARD
 */
public class myOrder{
    private ArrayList<Order> o = new ArrayList<Order>();
    private double price_include_vat;
    private double priceTotal;
    private String user;


    final double vat = 0.07;
    public void addFood(Order o){
        this.o.add(o);
    }
    public void showFood(){
        for(int i=0; i<o.size(); i++){
            System.out.println(o.get(i).getQuantity() + " " + o.get(i).getName() + " " + o.get(i).getPrice_each() + " " + o.get(i).getPrice());
        }
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
    public ArrayList<Order> getO() {
        return o;
    }
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
}
