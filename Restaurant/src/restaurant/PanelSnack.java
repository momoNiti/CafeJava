/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

/**
 *
 * @author STUDY fuckin HARD
 */
public class PanelSnack extends javax.swing.JPanel {
    Object[] row_table;
    private FoodGUI fg;

    /**
     * Creates new form PanelSnack
     */
    public PanelSnack(FoodGUI fg) {
        this.fg = fg;
        initComponents();
        row_table = new Object[3];
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        frenchFries_b = new javax.swing.JButton();
        frenchFriesCheese_b = new javax.swing.JButton();
        mashPotato_b = new javax.swing.JButton();
        mashPotatoXCornCheese_b = new javax.swing.JButton();
        bakedSpinachXCheese_b = new javax.swing.JButton();
        garlicBread_b = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        frenchFries_p = new javax.swing.JLabel();
        frenchFriesCheese_p = new javax.swing.JLabel();
        mashPotato_p = new javax.swing.JLabel();
        mashPotatoXCornCheese_p = new javax.swing.JLabel();
        bakedSpinachXCheese_p = new javax.swing.JLabel();
        garlicBread_p = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        jLabel1.setText("Snack");

        frenchFries_b.setText("เฟรนฟราย");
        frenchFries_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frenchFries_bActionPerformed(evt);
            }
        });

        frenchFriesCheese_b.setText("เฟรนฟรายชีส");
        frenchFriesCheese_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frenchFriesCheese_bActionPerformed(evt);
            }
        });

        mashPotato_b.setText("มันบด");
        mashPotato_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mashPotato_bActionPerformed(evt);
            }
        });

        mashPotatoXCornCheese_b.setText("มันบดอบชีส");
        mashPotatoXCornCheese_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mashPotatoXCornCheese_bActionPerformed(evt);
            }
        });

        bakedSpinachXCheese_b.setText("ผักโขมอบชีส");
        bakedSpinachXCheese_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bakedSpinachXCheese_bActionPerformed(evt);
            }
        });

        garlicBread_b.setText("ขนมปังกระเทียม");
        garlicBread_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                garlicBread_bActionPerformed(evt);
            }
        });

        jLabel2.setText("ราคา");

        frenchFries_p.setText("49");

        frenchFriesCheese_p.setText("79");

        mashPotato_p.setText("35");

        mashPotatoXCornCheese_p.setText("59");

        bakedSpinachXCheese_p.setText("69");

        garlicBread_p.setText("39");

        jLabel9.setText("บาท");

        jLabel10.setText("บาท");

        jLabel11.setText("บาท");

        jLabel12.setText("บาท");

        jLabel13.setText("บาท");

        jLabel14.setText("บาท");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(frenchFries_b)
                                .addComponent(frenchFriesCheese_b)
                                .addComponent(mashPotato_b)
                                .addComponent(mashPotatoXCornCheese_b)
                                .addComponent(bakedSpinachXCheese_b)
                                .addComponent(garlicBread_b)))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(garlicBread_p)
                            .addComponent(bakedSpinachXCheese_p)
                            .addComponent(mashPotatoXCornCheese_p)
                            .addComponent(mashPotato_p)
                            .addComponent(frenchFries_p)
                            .addComponent(frenchFriesCheese_p))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(frenchFries_b)
                    .addComponent(frenchFries_p)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(frenchFriesCheese_b)
                    .addComponent(frenchFriesCheese_p)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mashPotato_b)
                    .addComponent(mashPotato_p)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mashPotatoXCornCheese_b)
                    .addComponent(mashPotatoXCornCheese_p)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bakedSpinachXCheese_b)
                    .addComponent(bakedSpinachXCheese_p)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(garlicBread_b)
                    .addComponent(garlicBread_p)
                    .addComponent(jLabel14))
                .addContainerGap(227, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void frenchFries_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frenchFries_bActionPerformed
        // TODO add your handling code here:
        double price = Double.parseDouble(frenchFries_p.getText());
        row_table[0] = 1;
        row_table[1] = frenchFries_b.getText();
        row_table[2] = price;
        if(fg.checkMenu((String) row_table[1])){
           int row = fg.checkRowDuplicate((String) row_table[1]);
           int value = (int) fg.model.getValueAt(row, 0);
           fg.model.setValueAt(value+1, row, 0);
           fg.model.setValueAt(price * (value+1), row, 2);
        }
        else{
            fg.addRowTable(row_table);
        }
    }//GEN-LAST:event_frenchFries_bActionPerformed

    private void frenchFriesCheese_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frenchFriesCheese_bActionPerformed
        // TODO add your handling code here:
        double price = Double.parseDouble(frenchFriesCheese_p.getText());
        row_table[0] = 1;
        row_table[1] = frenchFriesCheese_b.getText();
        row_table[2] = price;
        if(fg.checkMenu((String) row_table[1])){
           int row = fg.checkRowDuplicate((String) row_table[1]);
           int value = (int) fg.model.getValueAt(row, 0);
           fg.model.setValueAt(value+1, row, 0);
           fg.model.setValueAt(price * (value+1), row, 2);
        }
        else{
            fg.addRowTable(row_table);
        }
    }//GEN-LAST:event_frenchFriesCheese_bActionPerformed

    private void mashPotato_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mashPotato_bActionPerformed
        double price = Double.parseDouble(mashPotato_p.getText());
        row_table[0] = 1;
        row_table[1] = mashPotato_b.getText();
        row_table[2] = price;
        if(fg.checkMenu((String) row_table[1])){
           int row = fg.checkRowDuplicate((String) row_table[1]);
           int value = (int) fg.model.getValueAt(row, 0);
           fg.model.setValueAt(value+1, row, 0);
           fg.model.setValueAt(price * (value+1), row, 2);
        }
        else{
            fg.addRowTable(row_table);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_mashPotato_bActionPerformed

    private void mashPotatoXCornCheese_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mashPotatoXCornCheese_bActionPerformed
        double price = Double.parseDouble(mashPotatoXCornCheese_p.getText());
        row_table[0] = 1;
        row_table[1] = mashPotatoXCornCheese_b.getText();
        row_table[2] = price;
        if(fg.checkMenu((String) row_table[1])){
           int row = fg.checkRowDuplicate((String) row_table[1]);
           int value = (int) fg.model.getValueAt(row, 0);
           fg.model.setValueAt(value+1, row, 0);
           fg.model.setValueAt(price * (value+1), row, 2);
        }
        else{
            fg.addRowTable(row_table);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_mashPotatoXCornCheese_bActionPerformed

    private void bakedSpinachXCheese_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bakedSpinachXCheese_bActionPerformed
        double price = Double.parseDouble(bakedSpinachXCheese_p.getText());
        row_table[0] = 1;
        row_table[1] = bakedSpinachXCheese_b.getText();
        row_table[2] = price;
        if(fg.checkMenu((String) row_table[1])){
           int row = fg.checkRowDuplicate((String) row_table[1]);
           int value = (int) fg.model.getValueAt(row, 0);
           fg.model.setValueAt(value+1, row, 0);
           fg.model.setValueAt(price * (value+1), row, 2);
        }
        else{
            fg.addRowTable(row_table);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_bakedSpinachXCheese_bActionPerformed

    private void garlicBread_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_garlicBread_bActionPerformed
        double price = Double.parseDouble(garlicBread_p.getText());
        row_table[0] = 1;
        row_table[1] = garlicBread_b.getText();
        row_table[2] = price;
        if(fg.checkMenu((String) row_table[1])){
           int row = fg.checkRowDuplicate((String) row_table[1]);
           int value = (int) fg.model.getValueAt(row, 0);
           fg.model.setValueAt(value+1, row, 0);
           fg.model.setValueAt(price * (value+1), row, 2);
        }
        else{
            fg.addRowTable(row_table);
        }
    }//GEN-LAST:event_garlicBread_bActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bakedSpinachXCheese_b;
    private javax.swing.JLabel bakedSpinachXCheese_p;
    private javax.swing.JButton frenchFriesCheese_b;
    private javax.swing.JLabel frenchFriesCheese_p;
    private javax.swing.JButton frenchFries_b;
    private javax.swing.JLabel frenchFries_p;
    private javax.swing.JButton garlicBread_b;
    private javax.swing.JLabel garlicBread_p;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton mashPotatoXCornCheese_b;
    private javax.swing.JLabel mashPotatoXCornCheese_p;
    private javax.swing.JButton mashPotato_b;
    private javax.swing.JLabel mashPotato_p;
    // End of variables declaration//GEN-END:variables
}
