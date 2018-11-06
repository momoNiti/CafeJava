/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import com.google.gson.Gson;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
        

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
        String myJson = gson.toJson(myo);
        int res = 0;
        String sql = "";
        
        java.util.Date date=new java.util.Date();
        java.sql.Date sqlDate=new java.sql.Date(date.getTime());
        java.sql.Timestamp sqlTime = new java.sql.Timestamp(date.getTime());
        try{
            sql = "INSERT INTO order_foods(detail, orderDate, user) VALUES(cast(? as json), ?, ?)";
            pst = (PreparedStatement) conn.prepareStatement(sql);
            pst.setString(1, myJson);
            pst.setTimestamp(2, sqlTime);
            pst.setString(3, myo.getUser());
            res = pst.executeUpdate();
            
        }
        catch(SQLException ex){
            System.out.println(ex);
        }
        
        return res;
    }
}
