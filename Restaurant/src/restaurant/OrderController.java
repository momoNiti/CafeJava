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
    User u;
    Database db;
    Connection conn;
    PreparedStatement pst;

    public OrderController(){
        super();
        db = new Database();
        conn = db.getConnection();
        
    }
    
    public int insertOrder(myOrder myo){
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentTime = dateformat.format(myo.getOrderDate());
        Gson gson = new Gson();
        String myJson = gson.toJson(myo);
        int res = 0;
        String sql = "";

        try{
            sql = "INSERT INTO order_foods(orderID, detail, orderDate, user) VALUES(?, cast(? as json), ?, ?)";
            pst = (PreparedStatement) conn.prepareStatement(sql);
            pst.setInt(1, myo.getOrderNumber());
            pst.setString(2, myJson);
            pst.setString(3, currentTime);
            pst.setString(4, u.getUname());
            res = pst.executeUpdate();
        }
        catch(SQLException ex){
            System.out.println(ex);
        }
        
        return res;
    }
}
