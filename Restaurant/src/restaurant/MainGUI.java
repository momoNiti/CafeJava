/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JPanel;

/**
 *
 * @author STUDY fuckin HARD
 */
public class MainGUI extends javax.swing.JFrame {
    GridBagLayout layout = new GridBagLayout();
    posGUI pos;
    SignUpGUI sign;
    /**
     * Creates new form MainGUI
     */
    public MainGUI(User u) {
        initComponents();
        
        pos = new posGUI(this);
        sign = new SignUpGUI(this);
        
        DynamicPanel.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        DynamicPanel.add(pos, c);
        DynamicPanel.add(sign, c);
        pos.setVisible(true);
        sign.setVisible(false);
        setColor(btnPOS);
        resetColor(btnDB);
        resetColor(btnSignUp);
        resetColor(btnEX);
        btnPOS_color.setOpaque(true);
        btnDB_color.setOpaque(false);
        btnSignUp_color.setOpaque(false);
        btnEX_color.setOpaque(false);
        
        if(u.getRoles().equals("cashier")){
            btnDB.setVisible(false);
            btnEX.setVisible(false);
            btnSignUp.setVisible(false);
        }
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
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnDB = new javax.swing.JPanel();
        btnDB_color = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnSignUp = new javax.swing.JPanel();
        btnSignUp_color = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnEX = new javax.swing.JPanel();
        btnEX_color = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        DynamicPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sidePanel.setBackground(new java.awt.Color(51, 255, 153));

        jLabel1.setText("ร้าน น้อยจนต้องสั่งเพิ่ม สกปรกเหมือนเดิมจนต้องสั่งปิด");

        btnPOS.setBackground(new java.awt.Color(51, 51, 255));
        btnPOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPOSMouseClicked(evt);
            }
        });
        btnPOS.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPOS_color.setBackground(new java.awt.Color(51, 51, 255));

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
        btnPOS.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        jLabel6.setText("POS");
        btnPOS.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        btnDB.setBackground(new java.awt.Color(51, 51, 255));
        btnDB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDBMouseClicked(evt);
            }
        });
        btnDB.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDB_color.setBackground(new java.awt.Color(51, 51, 255));

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

        jLabel4.setText("DataBase");
        btnDB.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        btnSignUp.setBackground(new java.awt.Color(51, 51, 255));
        btnSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSignUpMouseClicked(evt);
            }
        });
        btnSignUp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSignUp_color.setBackground(new java.awt.Color(51, 51, 255));

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

        btnEX.setBackground(new java.awt.Color(51, 51, 255));
        btnEX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEXMouseClicked(evt);
            }
        });
        btnEX.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEX_color.setBackground(new java.awt.Color(51, 51, 255));

        javax.swing.GroupLayout btnEX_colorLayout = new javax.swing.GroupLayout(btnEX_color);
        btnEX_color.setLayout(btnEX_colorLayout);
        btnEX_colorLayout.setHorizontalGroup(
            btnEX_colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        btnEX_colorLayout.setVerticalGroup(
            btnEX_colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        btnEX.add(btnEX_color, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, -1));

        jLabel5.setText("jLabel5");
        btnEX.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnEX, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSignUp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPOS, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addComponent(btnDB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(63, 63, 63)
                .addComponent(btnPOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        DynamicPanel.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout DynamicPanelLayout = new javax.swing.GroupLayout(DynamicPanel);
        DynamicPanel.setLayout(DynamicPanelLayout);
        DynamicPanelLayout.setHorizontalGroup(
            DynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
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
                .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DynamicPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(DynamicPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPOSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPOSMouseClicked
        // TODO add your handling code here:
        setColor(btnPOS);
        resetColor(btnDB);
        resetColor(btnSignUp);
        resetColor(btnEX);
        
        btnPOS_color.setOpaque(true);
        btnDB_color.setOpaque(false);
        btnSignUp_color.setOpaque(false);
        btnEX_color.setOpaque(false);
        
        pos.setVisible(true);
        sign.setVisible(false);
    }//GEN-LAST:event_btnPOSMouseClicked

    private void btnDBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDBMouseClicked
        // TODO add your handling code here:
        resetColor(btnPOS);
        setColor(btnDB);
        resetColor(btnSignUp);
        resetColor(btnEX);
        btnPOS_color.setOpaque(false);
        btnDB_color.setOpaque(true);
        btnSignUp_color.setOpaque(false);
        btnEX_color.setOpaque(false);
    }//GEN-LAST:event_btnDBMouseClicked

    private void btnSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignUpMouseClicked
        // TODO add your handling code here:
        resetColor(btnPOS);
        resetColor(btnDB);
        setColor(btnSignUp);
        resetColor(btnEX);
        
        btnPOS_color.setOpaque(false);
        btnDB_color.setOpaque(false);
        btnSignUp_color.setOpaque(true);
        btnEX_color.setOpaque(false);
        
        sign.setVisible(true);
        pos.setVisible(false);
    }//GEN-LAST:event_btnSignUpMouseClicked

    private void btnEXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEXMouseClicked
        // TODO add your handling code here:
        resetColor(btnPOS);
        resetColor(btnDB);
        resetColor(btnSignUp);
        setColor(btnEX);
        
        btnPOS_color.setOpaque(false);
        btnDB_color.setOpaque(false);
        btnSignUp_color.setOpaque(false);
        btnEX_color.setOpaque(true);
    }//GEN-LAST:event_btnEXMouseClicked
    public void setColor(JPanel panel){
        panel.setBackground(new Color(102,153,255));
    }
    public void resetColor(JPanel panel){
        panel.setBackground(new Color(51,51,255));
    }
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MainGUI(User u).setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DynamicPanel;
    private javax.swing.JPanel btnDB;
    private javax.swing.JPanel btnDB_color;
    private javax.swing.JPanel btnEX;
    private javax.swing.JPanel btnEX_color;
    private javax.swing.JPanel btnPOS;
    private javax.swing.JPanel btnPOS_color;
    private javax.swing.JPanel btnSignUp;
    private javax.swing.JPanel btnSignUp_color;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel sidePanel;
    // End of variables declaration//GEN-END:variables
}
