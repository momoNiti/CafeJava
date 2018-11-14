/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package print;

import gui.Login;
import java.awt.print.Paper;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;
import restaurant.MyOrder;

/**
 *
 * @author STUDY fuckin HARD
 */
public class Receipt {
    MyOrder myo;
//    public Receipt(MyOrder myo){
//        this.myo = myo;
//    }

    public String printTitle(){
        String line1 = String.format("%-15s %5s %10s\n", "Item", "Qty", "Price");
        String line2 = String.format("%-15s %5s %10s\n", "----", "---", "-----");
        String out = line1+line2;
        return out;
    }
    public String printDetail(String name, int quantity, double price) {
        String line1 = String.format("%-15.15s %5d %10.2f", name, quantity, price);
        return line1;
    }
    public String printTotal(double price, double price_include_vat) {
        String line1 = String.format("%-15.15s %5.5s %10.5s\n", "---------------", "----------", "------------");
        String line2 = String.format("%-15s %5s %10.2f\n", "Total", "", price);
        String line3 = String.format("%-15s %5s %10s\n", "", "", "-----");
        String line4 = String.format("%-15s %5s %10s\n", "Tax", "", "7%");
        String line5 = String.format("%-15s %5s %10s\n", "", "", "-----");
        String line6 = String.format("%-15s %5s %10.2f\n", "Total", "", price_include_vat);
        String out = line1 + line2 + line3 + line4 + line5 + line6;
        return out;
    }
    public String printUser(String name, String DateFormat){ //ตอนจริงรับมาเป็น TimeStamp
//        Timestamp time = myoDB.getDate(); //ดึงเวลาจาก database (เป็น format ของ sql)
//        Date date = new Date(time.getTime(s)); // แปลงจาก sql เป็น Date
//        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); // สร้าง Format ตามที่ต้องการ
//        String date_formated = formatter.format(date); //ได้วันเดือนปีตามที่ format ไว้
        String line1 = String.format("%-15s %5s %10s\n", "", "User", name);
        String line2 = String.format("%-15s %5s %10s\n", "", "Date", DateFormat);
        return line1 + line2;
    }
    public void makePaper(){
        Paper paper = new Paper();
    }
    public static void main(String[] args) {
        Receipt receipt = new Receipt();
        System.out.println(receipt.printTitle());
        for(int i=0; i<3; i++){
            System.out.println(receipt.printDetail("Hello", i, 10));
        }
        System.out.println(receipt.printTotal(100, 1024));        
        System.out.println(receipt.printUser("Mo", "10-11-2018"));
        
        
    }
}
