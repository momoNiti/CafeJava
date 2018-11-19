/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import restaurant.User;

/**
 *
 * @author STUDY fuckin HARD
 */
public class UserController{
    Database db;
    Connection conn;
    PreparedStatement pst;
    public UserController(){
//        super();
        db = new Database();
        conn = db.getConnection();
    }
    public int createAccount(User u){
        int res = 0;
        String sql = "";
        
        try{
            sql = "INSERT INTO log_in(uname, pwd, roles, name, surname, email) VALUES(?, ?, ?, ?, ?, ?)";
            pst = (PreparedStatement) conn.prepareStatement(sql);
            pst.setString(1, u.getUname());
            pst.setString(2, u.getPwd());
            pst.setString(3, u.getRoles());
            pst.setString(4, u.getName());
            pst.setString(5, u.getSurname());
            pst.setString(6, u.getEmail());
            res = pst.executeUpdate();
            conn.close();
            pst.close();
        }
        catch(SQLException ex){
            ex.printStackTrace();
//            JOptionPane.showMessageDialog(null, "Error Singup", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        return res;
    }
    public boolean checkLogin(User u){
        String sql = "";
        try{
            sql = "SELECT * FROM log_in WHERE uname=? and pwd=? and roles=?";
            pst = (PreparedStatement) conn.prepareCall(sql);
            pst.setString(1, u.getUname());
            pst.setString(2, u.getPwd());
            pst.setString(3, u.getRoles());
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                conn.close();
                pst.close();
                return true;
            }
            else{
                return false;
            }
    
        }
        catch(SQLException ex){
            ex.printStackTrace();
//            JOptionPane.showMessageDialog(null, "Error while login", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

}
