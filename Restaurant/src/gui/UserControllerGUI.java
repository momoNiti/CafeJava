/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import db.UserController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import restaurant.User;

/**
 *
 * @author STUDY fuckin HARD
 */
public class UserControllerGUI extends javax.swing.JPanel {
    private MainGUI mg;
    
    //table
    private Object[] row_table, column_table;
    private DefaultTableModel model;
    UserController uc;
    
    public UserControllerGUI(MainGUI mg) {
        this.mg = mg;
        initComponents();
        uc = new UserController();
        getAllUser();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDB = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;   //Disallow the editing of any cell
            }
        };
        label_signup = new javax.swing.JLabel();
        jUsername = new javax.swing.JTextField();
        jPassword = new javax.swing.JTextField();
        jRoles = new javax.swing.JComboBox<>();
        jRealName = new javax.swing.JTextField();
        jRealSurname = new javax.swing.JTextField();
        jEmail = new javax.swing.JTextField();
        label_email = new javax.swing.JLabel();
        label_surname = new javax.swing.JLabel();
        label_realname = new javax.swing.JLabel();
        label_role = new javax.swing.JLabel();
        jSignUp = new javax.swing.JButton();
        label_username = new javax.swing.JLabel();
        label_password = new javax.swing.JLabel();
        jEdit = new javax.swing.JButton();
        jDelete = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));
        setPreferredSize(new java.awt.Dimension(1143, 616));

        jScrollPane1.setBorder(null);

        jTableDB.setBackground(new java.awt.Color(255, 255, 204));
        jTableDB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableDB.setToolTipText("double click to see more detail");
        jScrollPane1.setViewportView(jTableDB);
        jTableDB.getTableHeader().setReorderingAllowed(false);

        label_signup.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        label_signup.setText("Sign up");

        jRoles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "admin", "cashier" }));

        label_email.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        label_email.setText("E-mail");

        label_surname.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        label_surname.setText("Surname");

        label_realname.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        label_realname.setText("Name");

        label_role.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        label_role.setText("Role");

        jSignUp.setText("Sign up");
        jSignUp.setPreferredSize(new java.awt.Dimension(91, 49));
        jSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSignUpActionPerformed(evt);
            }
        });

        label_username.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        label_username.setText("Username");

        label_password.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        label_password.setText("Password");

        jEdit.setText("Edit");
        jEdit.setPreferredSize(new java.awt.Dimension(91, 49));
        jEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEditActionPerformed(evt);
            }
        });

        jDelete.setText("Delete");
        jDelete.setPreferredSize(new java.awt.Dimension(91, 49));
        jDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(label_username)
                                .addComponent(label_password)
                                .addComponent(label_role)
                                .addComponent(label_realname)
                                .addComponent(label_email)
                                .addComponent(label_surname))
                            .addGap(32, 32, 32)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jRealSurname)
                                .addComponent(jRealName)
                                .addComponent(jRoles, 0, 111, Short.MAX_VALUE)
                                .addComponent(jPassword)
                                .addComponent(jUsername)
                                .addComponent(jEmail, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(label_signup)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 831, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(label_signup)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_username))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_password)
                            .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_role))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_realname)
                            .addComponent(jRealName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_surname)
                            .addComponent(jRealSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_email)
                            .addComponent(jEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSignUpActionPerformed
        String uname = jUsername.getText();
        String pwd = jPassword.getText();
        String roles = jRoles.getSelectedItem().toString();
        String name = jRealName.getText();
        String surname = jRealSurname.getText();
        String email = jEmail.getText();
        if(uname.equals(null)|| pwd.equals(null) || roles.equals("Select") || name.equals(null) || surname.equals(null) || email.equals(null)){
            JOptionPane.showMessageDialog(null, "Fill your empty");
        }
        else{
            User u  = new User();
            u.setUname(uname);
            u.setPwd(pwd);
            u.setRoles(roles);
            u.setName(name);
            u.setSurname(surname);
            u.setEmail(email);
            int res = uc.createAccount(u);
            if(res > 0){
                JOptionPane.showMessageDialog(null, "Finish Sign up & Welcome " + u.getName());
                User user = mg.getU();
                mg.dispose();
                MainGUI mg_new = new MainGUI(user);
                mg_new.setVisible(true);
                mg_new.setLocationRelativeTo(null);                    
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Can not sign up", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }

    }//GEN-LAST:event_jSignUpActionPerformed

    private void jEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEditActionPerformed
        // TODO add your handling code here:
        JTextField username = new JTextField();
        JTextField name = new JTextField();
        JTextField surname = new JTextField();
        JTextField email = new JTextField();
        Object[] message = {
            "Username", username,
            "Name", name,
            "Surname", surname,
            "Email", email
        };
        int check = JOptionPane.showConfirmDialog(null, message, "Edit Detail of User", JOptionPane.OK_CANCEL_OPTION);
        if(check == JOptionPane.OK_OPTION){
                if( !username.getText().isEmpty() && !name.getText().isEmpty() && !surname.getText().isEmpty() && !email.getText().isEmpty() ){
                    int res = uc.editUser(username.getText(), name.getText(), surname.getText(), email.getText());
                    if(res > 0){
                        User user = mg.getU();
                        mg.dispose();
                        MainGUI mg_new = new MainGUI(user);
                        mg_new.setVisible(true);
                        mg_new.setLocationRelativeTo(null);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "No User found", "ERROR", JOptionPane.ERROR_MESSAGE); 
                    }                   
                }
                else{
                   JOptionPane.showMessageDialog(null, "Fill your empty", "ERROR", JOptionPane.ERROR_MESSAGE); 
                }
            }
    }//GEN-LAST:event_jEditActionPerformed

    private void jDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteActionPerformed
        // TODO add your handling code here:
        JTextField uname = new JTextField();
        Object[] message = {
            "Username", uname
        };
        JOptionPane.showMessageDialog(null, "This is DELTE User Function !!", "WARNING", JOptionPane.WARNING_MESSAGE);
        int check = JOptionPane.showConfirmDialog(null, message, "Delete User", JOptionPane.OK_CANCEL_OPTION);
        if(check == JOptionPane.OK_OPTION){
 
                if(!uname.getText().isEmpty()){
                    int res = uc.deleteUser(uname.getText());
                    if(res > 0){
                        User user = mg.getU();
                        MainGUI mg_new = new MainGUI(user);
                        mg_new.setVisible(true);
                        mg_new.setLocationRelativeTo(null); 
                        mg.dispose();
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "No User Found", "ERROR", JOptionPane.ERROR_MESSAGE); 
                    } 
                }
                else{
                    JOptionPane.showMessageDialog(null, "Fill your empty", "ERROR", JOptionPane.ERROR_MESSAGE); 
                }
            
        }
    }//GEN-LAST:event_jDeleteActionPerformed
    public void getAllUser(){
        column_table = new Object[6];
        row_table = new Object[6];
        column_table[0] = "Username";
        column_table[1] = "Password";
        column_table[2] = "Role";
        column_table[3] = "Name";
        column_table[4] = "Surname";
        column_table[5] = "E-mail";

        model = new DefaultTableModel();
        model.setColumnIdentifiers(column_table);
        jTableDB.setModel(model);
        
        ArrayList<User> alluser = uc.getAllUser();
        for(int i=0; i<alluser.size(); i++){
            row_table[0] = alluser.get(i).getUname();
            row_table[1] = alluser.get(i).getPwd();
            row_table[2] = alluser.get(i).getRoles();
            row_table[3] = alluser.get(i).getName();
            row_table[4] = alluser.get(i).getSurname();
            row_table[5] = alluser.get(i).getEmail();
            model.addRow(row_table);
         }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jDelete;
    private javax.swing.JButton jEdit;
    private javax.swing.JTextField jEmail;
    private javax.swing.JTextField jPassword;
    private javax.swing.JTextField jRealName;
    private javax.swing.JTextField jRealSurname;
    private javax.swing.JComboBox<String> jRoles;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jSignUp;
    private javax.swing.JTable jTableDB;
    private javax.swing.JTextField jUsername;
    private javax.swing.JLabel label_email;
    private javax.swing.JLabel label_password;
    private javax.swing.JLabel label_realname;
    private javax.swing.JLabel label_role;
    private javax.swing.JLabel label_signup;
    private javax.swing.JLabel label_surname;
    private javax.swing.JLabel label_username;
    // End of variables declaration//GEN-END:variables
}
