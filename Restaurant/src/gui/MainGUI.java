/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JPanel;
import restaurant.User;

/**
 *
 * @author STUDY fuckin HARD
 */
public class MainGUI extends javax.swing.JFrame {
    private GridBagLayout layout = new GridBagLayout();
    private PosGUI pos;
    private SignUpGUI sign;
    private PanelDB pDB;
    private PanelMenuControll pmc;
    
    private User u;
    /**
     * Creates new form MainGUI
     */
    public MainGUI(User u) { //get Object from User
        this.u = u;
        initComponents();
        pos = new PosGUI(this);
        sign = new SignUpGUI(this);
        pDB = new PanelDB();
        pmc = new PanelMenuControll(this);
        //Dynamic Panel and set layout
        DynamicPanel.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        DynamicPanel.add(pos, c);
        DynamicPanel.add(sign, c);
        DynamicPanel.add(pDB, c);
        DynamicPanel.add(pmc, c);
        //set panel default visible
        pos.setVisible(true);
        btnPOS_color.setOpaque(true);
        setColor(btnPOS);
        sign.setVisible(false);
        pDB.setVisible(false);
        pmc.setVisible(false);
        //hide cashier menu
        if(u.getRoles().equals("cashier")){
            btnDB.setVisible(false);
            btnSignUp.setVisible(false);
            btnMenuController.setVisible(false);
        }
        //get username 
        jUsername_out.setText(u.getUname());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sidePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnPOS = new javax.swing.JPanel();
        btnPOS_color = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnDB = new javax.swing.JPanel();
        btnDB_color = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnMenuController = new javax.swing.JPanel();
        btnMenuController_color = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLogOut = new javax.swing.JButton();
        jUser = new javax.swing.JLabel();
        jUsername_out = new javax.swing.JLabel();
        btnSignUp = new javax.swing.JPanel();
        btnSignUp_color = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        DynamicPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cafe' V.2");

        sidePanel.setBackground(new java.awt.Color(204, 204, 255));
        sidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("ร้าน น้อยจนต้องสั่งเพิ่ม ");
        sidePanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 51, -1, -1));

        btnPOS.setBackground(new java.awt.Color(102, 204, 255));
        btnPOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPOSMouseClicked(evt);
            }
        });
        btnPOS.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPOS_color.setBackground(new java.awt.Color(102, 204, 255));

        javax.swing.GroupLayout btnPOS_colorLayout = new javax.swing.GroupLayout(btnPOS_color);
        btnPOS_color.setLayout(btnPOS_colorLayout);
        btnPOS_colorLayout.setHorizontalGroup(
            btnPOS_colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        btnPOS_colorLayout.setVerticalGroup(
            btnPOS_colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        btnPOS.add(btnPOS_color, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 100));

        jLabel6.setText("POS");
        btnPOS.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        sidePanel.add(btnPOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 117, 224, -1));

        btnDB.setBackground(new java.awt.Color(102, 204, 255));
        btnDB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDBMouseClicked(evt);
            }
        });
        btnDB.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDB_color.setBackground(new java.awt.Color(102, 204, 255));

        javax.swing.GroupLayout btnDB_colorLayout = new javax.swing.GroupLayout(btnDB_color);
        btnDB_color.setLayout(btnDB_colorLayout);
        btnDB_colorLayout.setHorizontalGroup(
            btnDB_colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        btnDB_colorLayout.setVerticalGroup(
            btnDB_colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        btnDB.add(btnDB_color, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, -1));

        jLabel4.setText("sales volume");
        btnDB.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        sidePanel.add(btnDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 235, 224, -1));

        btnMenuController.setBackground(new java.awt.Color(102, 204, 255));
        btnMenuController.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenuControllerMouseClicked(evt);
            }
        });
        btnMenuController.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMenuController_color.setBackground(new java.awt.Color(102, 204, 255));

        javax.swing.GroupLayout btnMenuController_colorLayout = new javax.swing.GroupLayout(btnMenuController_color);
        btnMenuController_color.setLayout(btnMenuController_colorLayout);
        btnMenuController_colorLayout.setHorizontalGroup(
            btnMenuController_colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        btnMenuController_colorLayout.setVerticalGroup(
            btnMenuController_colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        btnMenuController.add(btnMenuController_color, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, -1));

        jLabel5.setText("Menu Controll");
        btnMenuController.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        sidePanel.add(btnMenuController, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 353, 224, -1));

        jLogOut.setBackground(new java.awt.Color(51, 255, 204));
        jLogOut.setText("log out");
        jLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLogOutActionPerformed(evt);
            }
        });
        sidePanel.add(jLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 580, -1, -1));

        jUser.setText("User : ");
        sidePanel.add(jUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, -1, -1));

        jUsername_out.setBackground(new java.awt.Color(255, 204, 204));
        jUsername_out.setText("         ");
        sidePanel.add(jUsername_out, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 590, -1, -1));

        btnSignUp.setBackground(new java.awt.Color(102, 204, 255));
        btnSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSignUpMouseClicked(evt);
            }
        });
        btnSignUp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSignUp_color.setBackground(new java.awt.Color(102, 204, 255));

        javax.swing.GroupLayout btnSignUp_colorLayout = new javax.swing.GroupLayout(btnSignUp_color);
        btnSignUp_color.setLayout(btnSignUp_colorLayout);
        btnSignUp_colorLayout.setHorizontalGroup(
            btnSignUp_colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        btnSignUp_colorLayout.setVerticalGroup(
            btnSignUp_colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        btnSignUp.add(btnSignUp_color, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, -1));

        jLabel3.setText("SignUp");
        btnSignUp.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        sidePanel.add(btnSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 226, -1));

        DynamicPanel.setBackground(new java.awt.Color(255, 153, 204));

        javax.swing.GroupLayout DynamicPanelLayout = new javax.swing.GroupLayout(DynamicPanel);
        DynamicPanel.setLayout(DynamicPanelLayout);
        DynamicPanelLayout.setHorizontalGroup(
            DynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1143, Short.MAX_VALUE)
        );
        DynamicPanelLayout.setVerticalGroup(
            DynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 616, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DynamicPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(DynamicPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignUpMouseClicked
        // TODO add your handling code here:
        resetColor(btnPOS);
        resetColor(btnDB);
        setColor(btnSignUp);
        resetColor(btnMenuController);

        btnPOS_color.setOpaque(false);
        btnDB_color.setOpaque(false);
        btnSignUp_color.setOpaque(true);
        btnMenuController_color.setOpaque(false);

        pos.setVisible(false);
        pDB.setVisible(false);
        sign.setVisible(true);
        pmc.setVisible(false);
    }//GEN-LAST:event_btnSignUpMouseClicked

    private void jLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLogOutActionPerformed
        // TODO add your handling code here:
        new Login().run();
        this.dispose();
    }//GEN-LAST:event_jLogOutActionPerformed

    private void btnMenuControllerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuControllerMouseClicked
        // TODO add your handling code here:
        resetColor(btnPOS);
        resetColor(btnDB);
        resetColor(btnSignUp);
        setColor(btnMenuController);

        btnPOS_color.setOpaque(false);
        btnDB_color.setOpaque(false);
        btnSignUp_color.setOpaque(false);
        btnMenuController_color.setOpaque(true);

        pos.setVisible(false);
        pDB.setVisible(false);
        sign.setVisible(false);
        pmc.setVisible(true);
    }//GEN-LAST:event_btnMenuControllerMouseClicked

    private void btnDBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDBMouseClicked
        // TODO add your handling code here:
        resetColor(btnPOS);
        resetColor(btnMenuController);
        resetColor(btnSignUp);
        setColor(btnDB);

        btnPOS_color.setOpaque(false);
        btnDB_color.setOpaque(true);
        btnSignUp_color.setOpaque(false);
        btnMenuController_color.setOpaque(false);

        pos.setVisible(false);
        pDB.setVisible(true);
        sign.setVisible(false);
        pmc.setVisible(false);
    }//GEN-LAST:event_btnDBMouseClicked

    private void btnPOSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPOSMouseClicked
        // TODO add your handling code here:
        resetColor(btnDB);
        resetColor(btnMenuController);
        resetColor(btnSignUp);
        setColor(btnPOS);

        btnPOS_color.setOpaque(true);
        btnDB_color.setOpaque(false);
        btnSignUp_color.setOpaque(false);
        btnMenuController_color.setOpaque(false);

        pos.setVisible(true);
        pDB.setVisible(false);
        sign.setVisible(false);
        pmc.setVisible(false);
    }//GEN-LAST:event_btnPOSMouseClicked
    public void setColor(JPanel panel){
        panel.setBackground(new Color(102,153,255));
    }
    public void resetColor(JPanel panel){
        panel.setBackground(new Color(102,204,255));
    }
    public User getU() {
        return u;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DynamicPanel;
    private javax.swing.JPanel btnDB;
    private javax.swing.JPanel btnDB_color;
    private javax.swing.JPanel btnMenuController;
    private javax.swing.JPanel btnMenuController_color;
    private javax.swing.JPanel btnPOS;
    private javax.swing.JPanel btnPOS_color;
    private javax.swing.JPanel btnSignUp;
    private javax.swing.JPanel btnSignUp_color;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jLogOut;
    private javax.swing.JLabel jUser;
    private javax.swing.JLabel jUsername_out;
    private javax.swing.JPanel sidePanel;
    // End of variables declaration//GEN-END:variables
}
