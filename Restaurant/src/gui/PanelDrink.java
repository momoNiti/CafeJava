/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import gui.PosGUI;

/**
 *
 * @author STUDY fuckin HARD
 */
public class PanelDrink extends javax.swing.JPanel {
    Object[] row_table;
    private PosGUI pos;

    /** Creates new form PanelDrink */
    public PanelDrink(PosGUI pos) {
        this.pos = pos;
        initComponents();
        row_table = new Object[4];
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        italianSoda_b = new javax.swing.JButton();
        greenTeaMacchiato_b = new javax.swing.JButton();
        unicornFrappe_b = new javax.swing.JButton();
        doubleChoco_b = new javax.swing.JButton();
        water_b = new javax.swing.JButton();
        freshMilkXButterflyPea_p = new javax.swing.JLabel();
        italianSoda_p = new javax.swing.JLabel();
        greenTeaMacchiato_p = new javax.swing.JLabel();
        unicornFrappe_p = new javax.swing.JLabel();
        doubleChoco_p = new javax.swing.JLabel();
        water_p = new javax.swing.JLabel();
        freshMilkXButterflyPea_b = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        jLabel1.setText("Drink");

        italianSoda_b.setText("Drink2");
        italianSoda_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                italianSoda_bActionPerformed(evt);
            }
        });

        greenTeaMacchiato_b.setText("Drink3");
        greenTeaMacchiato_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greenTeaMacchiato_bActionPerformed(evt);
            }
        });

        unicornFrappe_b.setText("Drink4");
        unicornFrappe_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unicornFrappe_bActionPerformed(evt);
            }
        });

        doubleChoco_b.setText("Drink5");
        doubleChoco_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doubleChoco_bActionPerformed(evt);
            }
        });

        water_b.setText("Drink6");
        water_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                water_bActionPerformed(evt);
            }
        });

        freshMilkXButterflyPea_p.setText("59");

        italianSoda_p.setText("69");

        greenTeaMacchiato_p.setText("79");

        unicornFrappe_p.setText("89");

        doubleChoco_p.setText("95");

        water_p.setText("15");

        freshMilkXButterflyPea_b.setText("Drink1");
        freshMilkXButterflyPea_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                freshMilkXButterflyPea_bActionPerformed(evt);
            }
        });

        jLabel8.setText("ราคา");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(italianSoda_b)
                                    .addComponent(greenTeaMacchiato_b)
                                    .addComponent(unicornFrappe_b)
                                    .addComponent(doubleChoco_b)
                                    .addComponent(water_b)
                                    .addComponent(freshMilkXButterflyPea_b))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(water_p)
                                    .addComponent(doubleChoco_p)
                                    .addComponent(unicornFrappe_p)
                                    .addComponent(italianSoda_p)
                                    .addComponent(freshMilkXButterflyPea_p)
                                    .addComponent(greenTeaMacchiato_p))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(freshMilkXButterflyPea_p)
                    .addComponent(freshMilkXButterflyPea_b)
                    .addComponent(jLabel9))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(italianSoda_b)
                    .addComponent(italianSoda_p)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(greenTeaMacchiato_b)
                    .addComponent(greenTeaMacchiato_p)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unicornFrappe_b)
                    .addComponent(unicornFrappe_p)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doubleChoco_b)
                    .addComponent(doubleChoco_p)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(water_b)
                    .addComponent(water_p)
                    .addComponent(jLabel14))
                .addContainerGap(229, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void freshMilkXButterflyPea_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_freshMilkXButterflyPea_bActionPerformed
       double price = Double.parseDouble(freshMilkXButterflyPea_p.getText());
        row_table[0] = 1;
        row_table[1] = freshMilkXButterflyPea_b.getText();
        row_table[2] = price;
        row_table[3] = price;
        if(pos.checkMenu((String) row_table[1])){
           int row = pos.checkRowDuplicate((String) row_table[1]);
           int value = (int) pos.model.getValueAt(row, 0);
           pos.model.setValueAt(value+1, row, 0);
           pos.model.setValueAt(price * (value+1), row, 3);
           pos.calculatePrice();
        }
        else{
            pos.model.addRow(row_table);
        }
        pos.calculatePrice();
    }//GEN-LAST:event_freshMilkXButterflyPea_bActionPerformed

    private void italianSoda_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_italianSoda_bActionPerformed
        double price = Double.parseDouble(italianSoda_p.getText());
        row_table[0] = 1;
        row_table[1] = italianSoda_b.getText();
        row_table[2] = price;
        row_table[3] = price;
        if(pos.checkMenu((String) row_table[1])){
           int row = pos.checkRowDuplicate((String) row_table[1]);
           int value = (int) pos.model.getValueAt(row, 0);
           pos.model.setValueAt(value+1, row, 0);
           pos.model.setValueAt(price * (value+1), row, 3);
           pos.calculatePrice();
        }
        else{
            pos.model.addRow(row_table);
        }
        pos.calculatePrice();
    }//GEN-LAST:event_italianSoda_bActionPerformed

    private void greenTeaMacchiato_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greenTeaMacchiato_bActionPerformed
        double price = Double.parseDouble(greenTeaMacchiato_p.getText());
        row_table[0] = 1;
        row_table[1] = greenTeaMacchiato_b.getText();
        row_table[2] = price;
        row_table[3] = price;
        if(pos.checkMenu((String) row_table[1])){
           int row = pos.checkRowDuplicate((String) row_table[1]);
           int value = (int) pos.model.getValueAt(row, 0);
           pos.model.setValueAt(value+1, row, 0);
           pos.model.setValueAt(price * (value+1), row, 3);
           pos.calculatePrice();
        }
        else{
            pos.model.addRow(row_table);
        }
        pos.calculatePrice();
    }//GEN-LAST:event_greenTeaMacchiato_bActionPerformed

    private void unicornFrappe_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unicornFrappe_bActionPerformed
        double price = Double.parseDouble(unicornFrappe_p.getText());
        row_table[0] = 1;
        row_table[1] = unicornFrappe_b.getText();
        row_table[2] = price;
        row_table[3] = price;
        if(pos.checkMenu((String) row_table[1])){
           int row = pos.checkRowDuplicate((String) row_table[1]);
           int value = (int) pos.model.getValueAt(row, 0);
           pos.model.setValueAt(value+1, row, 0);
           pos.model.setValueAt(price * (value+1), row, 3);
           pos.calculatePrice();
        }
        else{
            pos.model.addRow(row_table);
        }
        pos.calculatePrice();
    }//GEN-LAST:event_unicornFrappe_bActionPerformed

    private void doubleChoco_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doubleChoco_bActionPerformed
        double price = Double.parseDouble(doubleChoco_p.getText());
        row_table[0] = 1;
        row_table[1] = doubleChoco_b.getText();
        row_table[2] = price;
        row_table[3] = price;
        if(pos.checkMenu((String) row_table[1])){
           int row = pos.checkRowDuplicate((String) row_table[1]);
           int value = (int) pos.model.getValueAt(row, 0);
           pos.model.setValueAt(value+1, row, 0);
           pos.model.setValueAt(price * (value+1), row, 3);
           pos.calculatePrice();
        }
        else{
            pos.model.addRow(row_table);
        }
        pos.calculatePrice();
    }//GEN-LAST:event_doubleChoco_bActionPerformed

    private void water_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_water_bActionPerformed
        double price = Double.parseDouble(water_p.getText());
        row_table[0] = 1;
        row_table[1] = water_b.getText();
        row_table[2] = price;
        row_table[3] = price;
        if(pos.checkMenu((String) row_table[1])){
           int row = pos.checkRowDuplicate((String) row_table[1]);
           int value = (int) pos.model.getValueAt(row, 0);
           pos.model.setValueAt(value+1, row, 0);
           pos.model.setValueAt(price * (value+1), row, 3);
           pos.calculatePrice();
        }
        else{
            pos.model.addRow(row_table);
        }
        pos.calculatePrice();
    }//GEN-LAST:event_water_bActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton doubleChoco_b;
    private javax.swing.JLabel doubleChoco_p;
    private javax.swing.JButton freshMilkXButterflyPea_b;
    private javax.swing.JLabel freshMilkXButterflyPea_p;
    private javax.swing.JButton greenTeaMacchiato_b;
    private javax.swing.JLabel greenTeaMacchiato_p;
    private javax.swing.JButton italianSoda_b;
    private javax.swing.JLabel italianSoda_p;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton unicornFrappe_b;
    private javax.swing.JLabel unicornFrappe_p;
    private javax.swing.JButton water_b;
    private javax.swing.JLabel water_p;
    // End of variables declaration//GEN-END:variables

}
