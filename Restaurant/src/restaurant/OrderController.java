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
import java.sql.Timestamp;
import java.util.ArrayList;

        

/**
 *
 * @author STUDY fuckin HARD
 */
public class OrderController{
    Database db;
    Connection conn;
    PreparedStatement pst;
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
    public ArrayList<myOrderDB> collectData(){
        showDB result = new showDB();
        ArrayList<myOrderDB> myoDB = new ArrayList<myOrderDB>();
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
                    int orderID = rs.getInt(1);
                    Type orderedDBType = new TypeToken<ArrayList<orderedDB>>(){}.getType();
                    ArrayList<orderedDB> oDB= gson.fromJson(rs.getString(2), orderedDBType);
                    double priceTotal = rs.getDouble(3);
                    double price_include_vat = rs.getDouble(4);
                    Timestamp date = rs.getTimestamp(5);
                    String user = rs.getString(6);
                    
                    myOrderDB temp = new myOrderDB(orderID, oDB, priceTotal, price_include_vat, date, user);
                    myoDB.add(temp);
                    }   
                } 
            }
            return myoDB;
        }
        catch(Exception ex){
            ex.printStackTrace();
            
        }
        return myoDB;
    }

}
