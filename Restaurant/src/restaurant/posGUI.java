/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author STUDY fuckin HARD
 */
public class posGUI extends javax.swing.JPanel {
    GridBagLayout layout = new GridBagLayout();
    PanelMainFood pmf;
    PanelSnack ps;
    PanelDrink pd;

    //table
    Object[] row_table, column_table;
    DefaultTableModel model;
    private int selected_row;

    
    private MainGUI mg;
    /**
     * Creates new form posGUI
     */
    public posGUI(MainGUI mg) {
        this.mg = mg;
        initComponents();
        pmf = new PanelMainFood(this);
        ps = new PanelSnack(this);
        pd = new PanelDrink(this);
        
        DynamicPanel.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        DynamicPanel.add(pmf, c);
        DynamicPanel.add(ps, c);
        DynamicPanel.add(pd, c);
        
        pmf.setVisible(true);
        ps.setVisible(false);
        pd.setVisible(false);
        
        //table
        column_table = new Object[4];
        column_table[0] = "Qty";
        column_table[1] = "Product";
        column_table[2] = "ราคาต่อจำนวน";
        column_table[3] = "ราคารวม";
        model = new DefaultTableModel();
        model.setColumnIdentifiers(column_table);
        pos_jTable.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pos_Panel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pos_jTable = new javax.swing.JTable();
        jDelete = new javax.swing.JButton();
        jSubmit = new javax.swing.JButton();
        jTotal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jDecreseQty = new javax.swing.JButton();
        jIncreseQty = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jMainFood = new javax.swing.JButton();
        jSnack = new javax.swing.JButton();
        jDrink = new javax.swing.JButton();
        DynamicPanel = new javax.swing.JPanel();

        pos_Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pos_jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Qty", "Product", "รวม"
            }
        ));
        jScrollPane1.setViewportView(pos_jTable);

        jDelete.setText("Delete");
        jDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteActionPerformed(evt);
            }
        });

        jSubmit.setText("Submit");
        jSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSubmitMouseClicked(evt);
            }
        });
        jSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSubmitActionPerformed(evt);
            }
        });

        jTotal.setEditable(false);

        jLabel1.setText("Total");

        jDecreseQty.setText("<");
        jDecreseQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDecreseQtyActionPerformed(evt);
            }
        });

        jIncreseQty.setText(">");
        jIncreseQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIncreseQtyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29)
                        .addComponent(jTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jDecreseQty)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jIncreseQty)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSubmit)
                        .addGap(18, 18, 18)
                        .addComponent(jDelete)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDelete)
                    .addComponent(jSubmit)
                    .addComponent(jIncreseQty)
                    .addComponent(jDecreseQty))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setText("ประเภทอาหาร");

        jMainFood.setText("เมนูหลัก");
        jMainFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMainFoodActionPerformed(evt);
            }
        });

        jSnack.setText("เมนูทานเล่น");
        jSnack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSnackActionPerformed(evt);
            }
        });

        jDrink.setText("เครื่องดื่ม");
        jDrink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDrinkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel6))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSnack, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(jDrink, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jMainFood, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(26, 26, 26)
                .addComponent(jMainFood)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSnack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDrink)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        DynamicPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout DynamicPanelLayout = new javax.swing.GroupLayout(DynamicPanel);
        DynamicPanel.setLayout(DynamicPanelLayout);
        DynamicPanelLayout.setHorizontalGroup(
            DynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 319, Short.MAX_VALUE)
        );
        DynamicPanelLayout.setVerticalGroup(
            DynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pos_PanelLayout = new javax.swing.GroupLayout(pos_Panel);
        pos_Panel.setLayout(pos_PanelLayout);
        pos_PanelLayout.setHorizontalGroup(
            pos_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pos_PanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DynamicPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pos_PanelLayout.setVerticalGroup(
            pos_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pos_PanelLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(DynamicPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pos_Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pos_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteActionPerformed
        // TODO add your handling code here:
        selected_row = pos_jTable.getSelectedRow();
        if(selected_row>=0){
            model.removeRow(selected_row);
        }
        else{
            System.out.println("Cant delete");
        }
    }//GEN-LAST:event_jDeleteActionPerformed

    private void jSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSubmitActionPerformed
        myOrder myo = new myOrder();
        for(int i=0; i<model.getRowCount(); i++){
            int quantity = (int) model.getValueAt(i, 0);
            String name = (String) model.getValueAt(i, 1);
            Double price_each = (Double) model.getValueAt(i, 2);
            Double price = (Double) model.getValueAt(i, 3);
            myo.addFood(new Order(quantity, name, price_each, price));
        }
    
//        for(int i=0; i<model.getRowCount(); i++){
//        }
        myo.showFood();
//        myo.setOrderNumber();
//        System.out.println(myo.getOrderNumber());
        myo.calculatePrice();
        
        jTotal.setText(Double.toString(myo.getPrice_include_vat()));
        
    }//GEN-LAST:event_jSubmitActionPerformed

    private void jMainFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMainFoodActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == jMainFood){
            pmf.setVisible(true);
            ps.setVisible(false);
            pd.setVisible(false);
        }
    }//GEN-LAST:event_jMainFoodActionPerformed

    private void jSnackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSnackActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == jSnack){
            pmf.setVisible(false);
            ps.setVisible(true);
            pd.setVisible(false);
        }
    }//GEN-LAST:event_jSnackActionPerformed

    private void jDrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDrinkActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == jDrink){
            pmf.setVisible(false);
            ps.setVisible(false);
            pd.setVisible(true);
        }
    }//GEN-LAST:event_jDrinkActionPerformed

    private void jSubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSubmitMouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jSubmitMouseClicked

    private void jIncreseQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIncreseQtyActionPerformed
        // TODO add your handling code here:
        selected_row = pos_jTable.getSelectedRow();
        int value = (int) model.getValueAt(selected_row, 0);
        model.setValueAt(value+1, selected_row, 0); 
        double price_each = (double) model.getValueAt(selected_row, 2);
        model.setValueAt(price_each*(value+1), selected_row, 3);
    }//GEN-LAST:event_jIncreseQtyActionPerformed

    private void jDecreseQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDecreseQtyActionPerformed
        // TODO add your handling code here:
        selected_row = pos_jTable.getSelectedRow();
        int value = (int) model.getValueAt(selected_row, 0);
        double price_each = (double) model.getValueAt(selected_row, 2);

        if(value > 1){
            model.setValueAt(value-1, selected_row, 0);
            model.setValueAt(price_each*(value-1), selected_row, 3);
        }
        else{
            model.removeRow(selected_row);
        }
        
        
        
    }//GEN-LAST:event_jDecreseQtyActionPerformed
   
    public boolean checkMenu(String foodname){
        for(int i=0; i<model.getRowCount(); i++){
            if(model.getValueAt(i, 1).equals(foodname)){
//                System.out.println("ซ้ำ");
                return true;
            }            
        }
        return false;
    }
    public int checkRowDuplicate(String foodname){
        for(int i=0; i<model.getRowCount(); i++){
            if(model.getValueAt(i, 1).equals(foodname)){
                return i;
            }            
        }
        return 0;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DynamicPanel;
    private javax.swing.JButton jDecreseQty;
    private javax.swing.JButton jDelete;
    private javax.swing.JButton jDrink;
    private javax.swing.JButton jIncreseQty;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jMainFood;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jSnack;
    private javax.swing.JButton jSubmit;
    private javax.swing.JTextField jTotal;
    private javax.swing.JPanel pos_Panel;
    private javax.swing.JTable pos_jTable;
    // End of variables declaration//GEN-END:variables
}
