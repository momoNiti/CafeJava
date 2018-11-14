/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package print;

import java.awt.print.Paper;
import java.util.Formatter;
import restaurant.MyOrder;

/**
 *
 * @author STUDY fuckin HARD
 */
public class Receipt {
    MyOrder myo;
    private Formatter myformat = new Formatter();
    public Receipt(MyOrder myo){
        this.myo = myo;
    }
    public void printTitle(){
        myformat.format("%-15s %5s %10s\n", "Item", "Qty", "Price");
        myformat.format("%-15s %5s %10s\n", "----", "---", "-----");
    }
    public void printDetail(String name, int quantity, double price) {
        myformat.format("%-15.15s %5d %10.2f\n", name, quantity, price);
    }
    public void printTotal() {
        myformat.format("%-15s %5s %10.2f\n", "Tax", "", "7%");
        myformat.format("%-15s %5s %10s\n", "", "", "-----");
        myformat.format("%-15s %5s %10.2f\n", "Total", "", myo.getPrice_include_vat());
    }
    public void makePaper(){
        Paper paper = new Paper();
    }
}
