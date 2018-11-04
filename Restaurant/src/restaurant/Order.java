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
public class Order {
    private int quantity;
    private String name;
    private double price;
    private double price_include_vat;

    public Order(int quantity, String name, double price){
        this.quantity = quantity;
        this.name = name;
        this.price = price;
    }
    
    public double getPrice_include_vat() {
        return price_include_vat;
    }

    public void setPrice_include_vat(double price_include_vat) {
        this.price_include_vat = price_include_vat;
    }
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
}
