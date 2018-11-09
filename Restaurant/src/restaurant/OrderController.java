/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import com.google.gson.Gson;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

        

/**
 *
 * @author STUDY fuckin HARD
 */
public class OrderController{
    Database db;
    Connection conn;
    PreparedStatement pst;
    myOrderDB myoDB;
    orderedDB oDB;

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
        
        Gson gson = new Gson();
//        gson.fromJson(json, myOrderDB.class);
        String sql = "";
        try{
            sql = "SELECT * FROM restaurant.order_foods WHERE orderID=?";
            pst = (PreparedStatement) conn.prepareCall(sql);
            if(getRowsOrder() != 0){
                for(int i=0; i<=getRowsOrder(); i++){
                pst.setInt(1, i);
                ResultSet rs = pst.executeQuery();
                while(rs.next()){
                    System.out.println(rs.getString(1)); //ID
                    oDB = gson.fromJson(rs.getString(2), orderedDB.class);
//                    myoDB = gson.fromJson(rs.getString(2), myOrderDB.class); // JSon
//                    oDB = gson.fromJson(rs.getString(2), orderedDB.class);
//                    System.out.println(rs.getString(2)); //JSon
//                    System.out.println(rs.getString(3)); // price_total
//                    System.out.println(rs.getString(4)); // price_include_vat
//                    System.out.println(rs.getString(5)); // date
//                    System.out.println(rs.getString(6)); // user
//                System.out.println(pst.toString());
                }
                System.out.println("-----");
                }
            }
            System.out.println(oDB);
        }
        catch(Exception ex){
            ex.printStackTrace();
            
        }
    }
    
    public static void main(String[] args) {
        OrderController ordc = new OrderController();
        ordc.showDB();
    }
}
