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


public class Order {
    private int orderNumber;
    private String foodName;
    private int amount;
    private double price;
    public int getOrderNumber() {
        return orderNumber;
    }
    
    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    
//    java.util.List<Item> items = new ArrayList<Item>();

//test
//    public static void main( String[] args ) {
//
//    }
}
