/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

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
            JOptionPane.showMessageDialog(null, ex);
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
            JOptionPane.showMessageDialog(null, ex);
        }
        return false;
    }
    
//    public int loginTime(userHours uh){
//        int res = 0;
//        String sql = "";
//        java.sql.Timestamp sqlTime = new java.sql.Timestamp(uh.getStart_work().getTime());
//        try{
//            sql = "INSERT INTO working_hours(username, name, surname, start_work) VALUES(?, ?, ?, ?)";
//            pst = (PreparedStatement) conn.prepareStatement(sql);
//            pst.setString(1, uh.getUname());
//            pst.setString(2, uh.getName());
//            pst.setString(3, uh.getSurname());
//            pst.setTimestamp(4, sqlTime);
//            pst.setString(5, uh.getSurname());
//            pst.setString(6, uh.getEmail());
//            res = pst.executeUpdate();
//            conn.close();
//            pst.close();
//        }
//        catch(SQLException ex){
//            JOptionPane.showMessageDialog(null, ex);
//        }
//        
//        return res;
//    }
//    
//    public int logoutTime(userHours uh){
//        int res = 0;
//        String sql = "";
//        java.sql.Timestamp sqlTime = new java.sql.Timestamp(uh.getEnd_work().getTime());
//        try{
//            sql = "update working_hours set end_work = ? where id=?;";
////            sql = "INSERT INTO working_hours(username, name, surname, end_work) VALUES(?, ?, ?, ?)";
//            pst = (PreparedStatement) conn.prepareStatement(sql);
//            pst.setString(1, u.getUname());
//            pst.setString(2, u.getPwd());
//            res = pst.executeUpdate();
//            conn.close();
//            pst.close();
//        }
//        catch(SQLException ex){
//            JOptionPane.showMessageDialog(null, ex);
//        }
//       
//        return res;
//    }
}
