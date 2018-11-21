/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import db.OrderController;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import print.Receipt;
import restaurant.Order;
import restaurant.MyOrder;
/**
 *
 * @author STUDY fuckin HARD
 */
public class PosGUI extends javax.swing.JPanel {
    private GridBagLayout layout = new GridBagLayout();
    private PanelMainFood pmf;
    private PanelSnack ps;
    private PanelDrink pd;
    private MainGUI mg;
    //table
    private Object[] row_table, column_table;
    DefaultTableModel model;
    private int selected_row;
    
    MyOrder myo;
    OrderController oc;
    /**
     * Creates new form posGUI
     */
    public PosGUI(MainGUI mg) {
        this.mg = mg;
        initComponents();
        myo = new MyOrder();
        oc = new OrderController();
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
        jDelete = new javax.swing.JButton();
        jSubmit = new javax.swing.JButton();
        jTotal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jDecreseQty = new javax.swing.JButton();
        jIncreseQty = new javax.swing.JButton();
        jReceive = new javax.swing.JTextField();
        jChange = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPrice_vat = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        pos_jTable = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;   //Disallow the editing of any cell
            }
        };
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jMainFood = new javax.swing.JButton();
        jSnack = new javax.swing.JButton();
        jDrink = new javax.swing.JButton();
        DynamicPanel = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1143, 616));

        pos_Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jDelete.setText("Delete");
        jDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteActionPerformed(evt);
            }
        });

        jSubmit.setText("Submit");
        jSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSubmitActionPerformed(evt);
            }
        });

        jTotal.setEditable(false);

        jLabel1.setText("Price");

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

        jReceive.setText("0.0");
        jReceive.setPreferredSize(new java.awt.Dimension(6, 22));

        jChange.setEditable(false);

        jLabel2.setText("Receive");

        jLabel3.setText("Change");

        jPrice_vat.setEditable(false);

        jLabel4.setText("+ Vat 7%");

        pos_jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Qty", "Product", "ราคาต่อจำนวน", "รวม"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(pos_jTable);
        if (pos_jTable.getColumnModel().getColumnCount() > 0) {
            pos_jTable.getColumnModel().getColumn(0).setResizable(false);
            pos_jTable.getColumnModel().getColumn(1).setResizable(false);
            pos_jTable.getColumnModel().getColumn(2).setResizable(false);
            pos_jTable.getColumnModel().getColumn(3).setResizable(false);
        }
        pos_jTable.getTableHeader().setReorderingAllowed(false);

        jScrollPane2.setViewportView(jScrollPane1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jDecreseQty)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jIncreseQty)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSubmit)
                        .addGap(18, 18, 18)
                        .addComponent(jDelete))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPrice_vat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(jChange)
                            .addComponent(jReceive, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTotal, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPrice_vat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jReceive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDelete)
                    .addComponent(jSubmit)
                    .addComponent(jIncreseQty)
                    .addComponent(jDecreseQty))
                .addGap(37, 37, 37))
        );

        jReceive.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                try{
                    double receive = Double.parseDouble(jReceive.getText());
                    myo.setReceive(receive);
                    double change = myo.getReceive() - myo.getPrice_include_vat();
                    myo.setChange(change);
                    String result = String.format("%.2f", myo.getChange());
                    jChange.setText(result);
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "Use Number");
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                try{
                    double receive = Double.parseDouble(jReceive.getText());
                    double change = receive - myo.getPrice_include_vat();
                    String result = String.format("%.2f",change);
                    jChange.setText(result);
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "Use Number");
                }
            }
        });

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
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSnack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDrink, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jMainFood, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel6)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jMainFood)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSnack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDrink)
                .addContainerGap(127, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(DynamicPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pos_PanelLayout.setVerticalGroup(
            pos_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(DynamicPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pos_PanelLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jIncreseQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIncreseQtyActionPerformed
        // TODO add your handling code here:
        selected_row = pos_jTable.getSelectedRow();
        int value = (int) model.getValueAt(selected_row, 0);
        model.setValueAt(value+1, selected_row, 0);
        double price_each = (double) model.getValueAt(selected_row, 2);
        model.setValueAt(price_each*(value+1), selected_row, 3);
        calculatePrice();
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
        calculatePrice();
    }//GEN-LAST:event_jDecreseQtyActionPerformed

    private void jSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSubmitActionPerformed

        for(int i=0; i<model.getRowCount(); i++){
            int quantity = (int) model.getValueAt(i, 0);
            String name = (String) model.getValueAt(i, 1);
            Double price_each = (Double) model.getValueAt(i, 2);
            Double price = (Double) model.getValueAt(i, 3);
            myo.addFood(new Order(quantity, name, price_each, price));
        }
        myo.setUser(mg.getU().getUname());
        myo.setDate(new Date());
        int res = oc.insertOrder(myo);
        if(res > 0){
            Receipt receipt = new Receipt(myo);
            try {
                receipt.saveReceipt();
            } catch (IOException ex) {
                Logger.getLogger(PosGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(receipt.getMyReceipt());
            JOptionPane.showMessageDialog(null, "Finish insert order to database");
            mg.dispose();
            MainGUI run = new MainGUI(mg.getU());
            run.setVisible(true);
            run.setLocationRelativeTo(null);
        }
        else{
            JOptionPane.showMessageDialog(null, "Unable to insert");
        }

    }//GEN-LAST:event_jSubmitActionPerformed

    private void jDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteActionPerformed
        // TODO add your handling code here:
        selected_row = pos_jTable.getSelectedRow();
        if(selected_row>=0){
            model.removeRow(selected_row);
        }
        else{
            System.out.println("Cant delete");
        }
        calculatePrice();
    }//GEN-LAST:event_jDeleteActionPerformed

    public void calculatePrice(){
        int temp = 0;
        for(int i=0; i<model.getRowCount(); i++){
            temp += (double)model.getValueAt(i, 3);
        }

        myo.setPriceTotal(temp);
        myo.setPrice_include_vat(myo.getPriceTotal());
        
        DecimalFormat df = new DecimalFormat(".##");
        jTotal.setText(df.format(myo.getPriceTotal()));
        jPrice_vat.setText(df.format(myo.getPrice_include_vat()));
    }
    public boolean checkMenu(String foodname){
        for(int i=0; i<model.getRowCount(); i++){
            if(model.getValueAt(i, 1).equals(foodname)){
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
    private javax.swing.JTextField jChange;
    private javax.swing.JButton jDecreseQty;
    private javax.swing.JButton jDelete;
    private javax.swing.JButton jDrink;
    private javax.swing.JButton jIncreseQty;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jMainFood;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jPrice_vat;
    private javax.swing.JTextField jReceive;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jSnack;
    private javax.swing.JButton jSubmit;
    private javax.swing.JTextField jTotal;
    private javax.swing.JPanel pos_Panel;
    private javax.swing.JTable pos_jTable;
    // End of variables declaration//GEN-END:variables
}
