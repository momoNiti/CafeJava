/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author STUDY fuckin HARD
 */
public class OrderController extends Order{
    Database db;
    Connection conn;
    PreparedStatement pst;
    public OrderController(){
//        super();
        db = new Database();
        conn = db.getConnection();
    }
    
    public int insertOrder(Order o){
        int res = 0;
        String sql = "";
        
        try{
            sql = "INSERT INTO order(order_number, food_name, amount, price) VALUES(?, ?, ?, ?)";
            pst = (PreparedStatement) conn.prepareStatement(sql);
            pst.setInt(1, o.getOrderNumber());
            pst.setString(2, o.getFoodName());
            pst.setInt(3, o.getAmount());
            pst.setDouble(4, o.getPrice());
            res = pst.executeUpdate();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
        return res;
    }
}
