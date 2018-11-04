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
public class OrderController{
    Database db;
    Connection conn;
    PreparedStatement pst;
    private int orderNumber = 1;

    public OrderController(){
        super();
        db = new Database();
        conn = db.getConnection();
        
    }
    
    public int insertOrder(Order o){
        int res = 0;
        String sql = "";
        
        try{
            sql = "INSERT INTO order(order_number, quantity, food_name, price) VALUES(?, ?, ?, ?)";
            pst = (PreparedStatement) conn.prepareStatement(sql);
            pst.setInt(1, orderNumber);
            pst.setInt(2, o.getQuantity());
            pst.setString(3, o.getName());
            pst.setDouble(4, o.getPrice());
            res = pst.executeUpdate();
            orderNumber ++;

        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
        return res;
    }
}
