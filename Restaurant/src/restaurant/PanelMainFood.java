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
public class PanelMainFood extends javax.swing.JPanel {
    Object[] row_table;
    private posGUI pos;
    /**
     * Creates new form PanelMainFood
     */
    public PanelMainFood(posGUI pos) {
        this.pos = pos;
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

        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        honeyTostMango_b = new javax.swing.JButton();
        rasberryPancake_b = new javax.swing.JButton();
        icecremeWaffle_b = new javax.swing.JButton();
        chocolateLava_b = new javax.swing.JButton();
        rasberryFrenchTost_b = new javax.swing.JButton();
        mangoStickyRiceCrepe_b = new javax.swing.JButton();
        mojiWater_b = new javax.swing.JButton();
        spaghettiCarbonara_b = new javax.swing.JButton();
        spaghettiSpicyXSeafood_b = new javax.swing.JButton();
        honeyTostMango_p = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rasberryPancake_p = new javax.swing.JLabel();
        icecremeWaffle_p = new javax.swing.JLabel();
        chocolateLava_p = new javax.swing.JLabel();
        rasberryFrenchTost_p = new javax.swing.JLabel();
        mangoStickyRiceCrepe_p = new javax.swing.JLabel();
        mojiWater_p = new javax.swing.JLabel();
        spaghettiCarbonara_p = new javax.swing.JLabel();
        spaghettiSpicyXSeafood_p = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        jLabel17.setText("บาท");

        jLabel1.setText("Main Course");

        honeyTostMango_b.setText("ฮันนี่โทสต์มะม่วง");
        honeyTostMango_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                honeyTostMango_bActionPerformed(evt);
            }
        });

        rasberryPancake_b.setText("แพนเค้กราสเบอร์รี่");
        rasberryPancake_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rasberryPancake_bActionPerformed(evt);
            }
        });

        icecremeWaffle_b.setText("วาฟเฟิลไอศกรีม");
        icecremeWaffle_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icecremeWaffle_bActionPerformed(evt);
            }
        });

        chocolateLava_b.setText("ช็อกโกแลตลาวา");
        chocolateLava_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chocolateLava_bActionPerformed(evt);
            }
        });

        rasberryFrenchTost_b.setText("เฟรนช์โทสต์ราสป์เบอร์รี่");
        rasberryFrenchTost_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rasberryFrenchTost_bActionPerformed(evt);
            }
        });

        mangoStickyRiceCrepe_b.setText("เครปข้าวเหนียวมะม่วง");
        mangoStickyRiceCrepe_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mangoStickyRiceCrepe_bActionPerformed(evt);
            }
        });

        mojiWater_b.setText("โมจิหยดน้ำ");
        mojiWater_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mojiWater_bActionPerformed(evt);
            }
        });

        spaghettiCarbonara_b.setText("สปาเก็ตตี้คาโบนาร่า");
        spaghettiCarbonara_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spaghettiCarbonara_bActionPerformed(evt);
            }
        });

        spaghettiSpicyXSeafood_b.setText("สปาเก็ตตี้ขี้เมาทะเล");
        spaghettiSpicyXSeafood_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spaghettiSpicyXSeafood_bActionPerformed(evt);
            }
        });

        honeyTostMango_p.setText("259");

        jLabel3.setText("ราคา");

        rasberryPancake_p.setText("159");

        icecremeWaffle_p.setText("239");

        chocolateLava_p.setText("85");

        rasberryFrenchTost_p.setText("129");

        mangoStickyRiceCrepe_p.setText("129");

        mojiWater_p.setText("129");

        spaghettiCarbonara_p.setText("189");

        spaghettiSpicyXSeafood_p.setText("199");

        jLabel12.setText("บาท");

        jLabel13.setText("บาท");

        jLabel14.setText("บาท");

        jLabel15.setText("บาท");

        jLabel16.setText("บาท");

        jLabel18.setText("บาท");

        jLabel19.setText("บาท");

        jLabel20.setText("บาท");

        jLabel21.setText("บาท");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(honeyTostMango_b)
                            .addComponent(rasberryPancake_b)
                            .addComponent(icecremeWaffle_b)
                            .addComponent(chocolateLava_b)
                            .addComponent(rasberryFrenchTost_b)
                            .addComponent(mangoStickyRiceCrepe_b)
                            .addComponent(mojiWater_b)
                            .addComponent(spaghettiCarbonara_b)
                            .addComponent(spaghettiSpicyXSeafood_b))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(spaghettiSpicyXSeafood_p)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel21))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(spaghettiCarbonara_p)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel20))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(mojiWater_p)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel19))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(mangoStickyRiceCrepe_p)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel16))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rasberryFrenchTost_p)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel18))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(icecremeWaffle_p)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel14))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rasberryPancake_p)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(honeyTostMango_p)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel13)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chocolateLava_p)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel15))
                            .addComponent(jLabel3))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(honeyTostMango_b)
                    .addComponent(honeyTostMango_p)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rasberryPancake_b)
                    .addComponent(rasberryPancake_p)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(icecremeWaffle_b)
                    .addComponent(icecremeWaffle_p)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chocolateLava_b)
                    .addComponent(chocolateLava_p)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rasberryFrenchTost_b)
                    .addComponent(rasberryFrenchTost_p)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mangoStickyRiceCrepe_b)
                    .addComponent(mangoStickyRiceCrepe_p)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mojiWater_b)
                    .addComponent(mojiWater_p)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spaghettiCarbonara_b)
                    .addComponent(spaghettiCarbonara_p)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spaghettiSpicyXSeafood_b)
                    .addComponent(spaghettiSpicyXSeafood_p)
                    .addComponent(jLabel21))
                .addContainerGap(123, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void honeyTostMango_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_honeyTostMango_bActionPerformed

        double price = Double.parseDouble(honeyTostMango_p.getText());
        row_table[0] = 1;
        row_table[1] = honeyTostMango_b.getText();
        row_table[2] = price;
        if(pos.checkMenu((String) row_table[1])){
           int row = pos.checkRowDuplicate((String) row_table[1]);
           int value = (int) pos.model.getValueAt(row, 0);
           pos.model.setValueAt(value+1, row, 0);
           pos.model.setValueAt(price * (value+1), row, 2);
        }
        else{
            pos.model.addRow(row_table);
//            pos.addRowTable(row_table);
        }

    }//GEN-LAST:event_honeyTostMango_bActionPerformed

    private void chocolateLava_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chocolateLava_bActionPerformed
        double price = Double.parseDouble(chocolateLava_p.getText());
        row_table[0] = 1;
        row_table[1] = chocolateLava_b.getText();
        row_table[2] = price;
        if(pos.checkMenu((String) row_table[1])){
           int row = pos.checkRowDuplicate((String) row_table[1]);
           int value = (int) pos.model.getValueAt(row, 0);
           pos.model.setValueAt(value+1, row, 0);
           pos.model.setValueAt(price * (value+1), row, 2);
        }
        else{
            pos.model.addRow(row_table);
//            pos.addRowTable(row_table);
        }
    }//GEN-LAST:event_chocolateLava_bActionPerformed

    private void rasberryFrenchTost_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rasberryFrenchTost_bActionPerformed
        // TODO add your handling code here:
        double price = Double.parseDouble(rasberryFrenchTost_p.getText());
        row_table[0] = 1;
        row_table[1] = rasberryFrenchTost_b.getText();
        row_table[2] = price;
        if(pos.checkMenu((String) row_table[1])){
           int row = pos.checkRowDuplicate((String) row_table[1]);
           int value = (int) pos.model.getValueAt(row, 0);
           pos.model.setValueAt(value+1, row, 0);
           pos.model.setValueAt(price * (value+1), row, 2);
        }
        else{
            pos.model.addRow(row_table);
//            pos.addRowTable(row_table);
        }
    }//GEN-LAST:event_rasberryFrenchTost_bActionPerformed

    private void rasberryPancake_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rasberryPancake_bActionPerformed
        double price = Double.parseDouble(rasberryPancake_p.getText());
        row_table[0] = 1;
        row_table[1] = rasberryPancake_b.getText();
        row_table[2] = price;
        if(pos.checkMenu((String) row_table[1])){
           int row = pos.checkRowDuplicate((String) row_table[1]);
           int value = (int) pos.model.getValueAt(row, 0);
           pos.model.setValueAt(value+1, row, 0);
           pos.model.setValueAt(price * (value+1), row, 2);
        }
        else{
            pos.model.addRow(row_table);
//            pos.addRowTable(row_table);
        }
    }//GEN-LAST:event_rasberryPancake_bActionPerformed

    private void icecremeWaffle_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icecremeWaffle_bActionPerformed
        // TODO add your handling code here:
        double price = Double.parseDouble(icecremeWaffle_p.getText());
        row_table[0] = 1;
        row_table[1] = icecremeWaffle_b.getText();
        row_table[2] = price;
        if(pos.checkMenu((String) row_table[1])){
           int row = pos.checkRowDuplicate((String) row_table[1]);
           int value = (int) pos.model.getValueAt(row, 0);
           pos.model.setValueAt(value+1, row, 0);
           pos.model.setValueAt(price * (value+1), row, 2);
        }
        else{
//            pos.addRowTable(row_table);
            pos.model.addRow(row_table);
        }
    }//GEN-LAST:event_icecremeWaffle_bActionPerformed

    private void mangoStickyRiceCrepe_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mangoStickyRiceCrepe_bActionPerformed
        // TODO add your handling code here:
        double price = Double.parseDouble(mangoStickyRiceCrepe_p.getText());
        row_table[0] = 1;
        row_table[1] = mangoStickyRiceCrepe_b.getText();
        row_table[2] = price;
        if(pos.checkMenu((String) row_table[1])){
           int row = pos.checkRowDuplicate((String) row_table[1]);
           int value = (int) pos.model.getValueAt(row, 0);
           pos.model.setValueAt(value+1, row, 0);
           pos.model.setValueAt(price * (value+1), row, 2);
        }
        else{
            pos.model.addRow(row_table);
//            pos.addRowTable(row_table);
        }
    }//GEN-LAST:event_mangoStickyRiceCrepe_bActionPerformed

    private void mojiWater_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mojiWater_bActionPerformed
        // TODO add your handling code here:
        double price = Double.parseDouble(mojiWater_p.getText());
        row_table[0] = 1;
        row_table[1] = mojiWater_b.getText();
        row_table[2] = price;
        if(pos.checkMenu((String) row_table[1])){
           int row = pos.checkRowDuplicate((String) row_table[1]);
           int value = (int) pos.model.getValueAt(row, 0);
           pos.model.setValueAt(value+1, row, 0);
           pos.model.setValueAt(price * (value+1), row, 2);
        }
        else{
//            pos.addRowTable(row_table);
            pos.model.addRow(row_table);
        }
    }//GEN-LAST:event_mojiWater_bActionPerformed

    private void spaghettiCarbonara_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spaghettiCarbonara_bActionPerformed
        // TODO add your handling code here:
        double price = Double.parseDouble(spaghettiCarbonara_p.getText());
        row_table[0] = 1;
        row_table[1] = spaghettiCarbonara_b.getText();
        row_table[2] = price;
        if(pos.checkMenu((String) row_table[1])){
           int row = pos.checkRowDuplicate((String) row_table[1]);
           int value = (int) pos.model.getValueAt(row, 0);
           pos.model.setValueAt(value+1, row, 0);
           pos.model.setValueAt(price * (value+1), row, 2);
        }
        else{
//            pos.addRowTable(row_table);
            pos.model.addRow(row_table);

        }
    }//GEN-LAST:event_spaghettiCarbonara_bActionPerformed

    private void spaghettiSpicyXSeafood_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spaghettiSpicyXSeafood_bActionPerformed
        // TODO add your handling code here:
        double price = Double.parseDouble(spaghettiSpicyXSeafood_p.getText());
        row_table[0] = 1;
        row_table[1] = spaghettiSpicyXSeafood_b.getText();
        row_table[2] = price;
        if(pos.checkMenu((String) row_table[1])){
           int row = pos.checkRowDuplicate((String) row_table[1]);
           int value = (int) pos.model.getValueAt(row, 0);
           pos.model.setValueAt(value+1, row, 0);
           pos.model.setValueAt(price * (value+1), row, 2);
        }
        else{
            pos.model.addRow(row_table);
//            pos.addRowTable(row_table);
        }
    }//GEN-LAST:event_spaghettiSpicyXSeafood_bActionPerformed

    // Variables declaration - 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chocolateLava_b;
    private javax.swing.JLabel chocolateLava_p;
    private javax.swing.JButton honeyTostMango_b;
    private javax.swing.JLabel honeyTostMango_p;
    private javax.swing.JButton icecremeWaffle_b;
    private javax.swing.JLabel icecremeWaffle_p;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton mangoStickyRiceCrepe_b;
    private javax.swing.JLabel mangoStickyRiceCrepe_p;
    private javax.swing.JButton mojiWater_b;
    private javax.swing.JLabel mojiWater_p;
    private javax.swing.JButton rasberryFrenchTost_b;
    private javax.swing.JLabel rasberryFrenchTost_p;
    private javax.swing.JButton rasberryPancake_b;
    private javax.swing.JLabel rasberryPancake_p;
    private javax.swing.JButton spaghettiCarbonara_b;
    private javax.swing.JLabel spaghettiCarbonara_p;
    private javax.swing.JButton spaghettiSpicyXSeafood_b;
    private javax.swing.JLabel spaghettiSpicyXSeafood_p;
    // End of variables declaration//GEN-END:variables
}
