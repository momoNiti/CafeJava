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

    public void setPrice_include_vat(double price_include_vat) {
        double temp = price_include_vat * vat;
        double result = price_include_vat + temp;
        String[] mystr = String.valueOf(result).split("\\.");
        for(int i=0; i<mystr.length; i++){
            System.out.println(mystr[i]);
        }
        double decimal = 0;
//        System.out.println("myste[1] length : " + mystr[1].length());
        if(mystr[1].length() > 1 && Double.parseDouble(mystr[1]) != 0){
            char mychar1 = mystr[1].charAt(0);
            char mychar2 = mystr[1].charAt(1);
            String decimalString = Character.toString(mychar1) + Character.toString(mychar2);
            System.out.println("DecimalString : "+decimalString);
            if(Double.parseDouble(decimalString) >= 87.5){
                decimal = 1;
            }
            else if(Double.parseDouble(decimalString) < 87.5 && Double.parseDouble(decimalString) >= 75){
                decimal = 0.75;
            }
            else if(Double.parseDouble(decimalString) < 75 && Double.parseDouble(decimalString) >= 62.5){
                decimal = 0.75;
            }
            else if(Double.parseDouble(decimalString) < 62.5 && Double.parseDouble(decimalString) >= 50){
                decimal = 0.50;
            }
            else if(Double.parseDouble(decimalString) <50 && Double.parseDouble(decimalString) >= 37.5){
                decimal = 0.50;
            }
            else if(Double.parseDouble(decimalString) <37.5 && Double.parseDouble(decimalString) >= 25){
                decimal = 0.25;
            }
            else if(Double.parseDouble(decimalString) < 25 && Double.parseDouble(decimalString) >= 0){
                decimal = 0;
            }
        }
        else{
            decimal = 0;
        }
        double output = Double.parseDouble(mystr[0]) + decimal;
        System.out.println("decimal = : " + decimal);
        System.out.println("Output =  : " + output);
        System.out.println("----------------");
        
        this.price_include_vat = output;
    }
    public double getPrice_include_vat() {
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
