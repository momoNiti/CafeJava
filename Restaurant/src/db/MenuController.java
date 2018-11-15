/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import menu.Menu;

/**
 *
 * @author STUDY fuckin HARD
 */
public class MenuController {
//    ArrayList<Menu> menu = new ArrayList<Menu>();
    Database db;
    Connection conn;
    PreparedStatement pst;
    public MenuController(){
        db = new Database();
        db.getConnection();
    }
    public void insertMenu(String dbName, String name, double price){
        String sql = "";
        int res = 0;
        try {
            sql = "Insert into " + dbName + " VALUES(?, ?)";
            PreparedStatement pst = (PreparedStatement) conn.prepareStatement(sql);
            pst.setString(1, name);
            pst.setDouble(2, price);
            res = pst.executeUpdate();
            conn.close();
            pst.close();
        } catch (SQLException ex) {
            Logger.getLogger(MenuController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void getMenu(String dbName, String name, double price){
        String sql = "";
        
    }
}
