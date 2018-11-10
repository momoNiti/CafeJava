/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mysql.jdbc.PreparedStatement;
import java.lang.reflect.Type;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

        

/**
 *
 * @author STUDY fuckin HARD
 */
public class OrderController{
    Database db;
    Connection conn;
    PreparedStatement pst;
    myOrderDB myoDB;
    public OrderController(){
        super();
        db = new Database();
        conn = db.getConnection();
        
    }
    
    public int insertOrder(myOrder myo){
        Gson gson = new Gson();
        String myJson = gson.toJson(myo.getO());
        int res = 0;
        String sql = "";
        
        java.util.Date date=new java.util.Date();
        java.sql.Timestamp sqlTime = new java.sql.Timestamp(date.getTime());
        try{
            sql = "INSERT INTO order_foods(detail, price_total, price_include_vat, orderDate, user) VALUES(cast(? as json), ?, ?, ?, ?)";
            pst = (PreparedStatement) conn.prepareStatement(sql);
            pst.setString(1, myJson);
            pst.setDouble(2, myo.getPriceTotal());
            pst.setDouble(3, myo.getPrice_include_vat());
            pst.setTimestamp(4, sqlTime);
            pst.setString(5, myo.getUser());
            res = pst.executeUpdate();
            conn.close();
            pst.close();
            
        }
        catch(SQLException ex){
            System.out.println(ex);
        }
        
        return res;
    }
    public int getRowsOrder(){
        int size = -1;
        String sql = "";
        try{
            sql = "SELECT COUNT(*) FROM order_foods;";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next()){
                size = rs.getInt(1);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
//        System.out.println(size);
        return size;
    }
    public void showDB(){
        myoDB = new myOrderDB();
        Gson gson = new Gson();
        String sql = "";
        try{
            sql = "SELECT * FROM restaurant.order_foods WHERE orderID=?";
            pst = (PreparedStatement) conn.prepareCall(sql);
            if(getRowsOrder() != 0){
                for(int i=0; i<=getRowsOrder(); i++){
                pst.setInt(1, i);
                ResultSet rs = pst.executeQuery();
                while(rs.next()){
                    Type orderedDBType = new TypeToken<ArrayList<orderedDB>>(){}.getType();
                    ArrayList<orderedDB> oDB= gson.fromJson(rs.getString(2), orderedDBType);
                    myoDB.setOrderID(rs.getInt(1));
                    myoDB.setOdb(oDB);
                    myoDB.setPriceTotal(rs.getDouble(3));
                    myoDB.setPrice_include_vat(rs.getDouble(4));
                    myoDB.setDate(rs.getTimestamp(5));
                    myoDB.setUser(rs.getString(6));
                    }   
                } 
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
            
        }
        finally{
            System.out.println("Order Id = : " + myoDB.getOrderID());
            System.out.println("Items : ");
            for(int i=0; i<myoDB.getOdb().size(); i++){
                System.out.println("---Name : " + myoDB.getOdb().get(i).getName());
                System.out.println("---Price each : " + myoDB.getOdb().get(i).getPrice_each());
                System.out.println("---Quantity : " + myoDB.getOdb().get(i).getQuantity());
                System.out.println("---Price : " + myoDB.getOdb().get(i).getPrice());
            }
            System.out.println("Price total = " + myoDB.getPriceTotal());
            System.out.println("Price include vat = " + myoDB.getPrice_include_vat());
            System.out.println("Date : " + myoDB.getDate());
            System.out.println("User : " + myoDB.getUser());
        }
    }

    public static void main(String[] args) {
        OrderController ordc = new OrderController();
        ordc.showDB();
    }
}
