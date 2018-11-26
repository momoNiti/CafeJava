/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import db.OrderController;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import restaurant.MyOrderDB;

/**
 *
 * @author STUDY fuckin HARD
 */
public class SelectedOrder extends javax.swing.JFrame {

    /**
     * Creates new form SelectedOrder
     */
    private int orderID;
    private int valueAt;
    //table
    private Object[] row_table, column_table;
    private DefaultTableModel model;
    public SelectedOrder(int orderID) {
        initComponents();
        this.orderID = orderID;
        showOrder();
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
        jTableDetail = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;   //Disallow the editing of any cell
            }
        };

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Detail");
        setResizable(false);

        jTableDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableDetail);
        jTableDetail.getTableHeader().setReorderingAllowed(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDetail;
    // End of variables declaration//GEN-END:variables

    public void showOrder(){
        OrderController ordc = new OrderController();
        
        //table
        column_table = new Object[4];
        row_table = new Object[4];
        column_table[0] = "Name";
        column_table[1] = "Quantity";
        column_table[2] = "Price_each";
        column_table[3] = "Price";

        model = new DefaultTableModel();
        model.setColumnIdentifiers(column_table);
        jTableDetail.setModel(model);
        //get index that have the same orderID
        ArrayList<MyOrderDB> myoDB = ordc.getDataDB();
        for(int i=0; i<myoDB.size(); i++){
            if(myoDB.get(i).getOrderID() == orderID){
                valueAt = i;
                break;
            }
        }
        //get detail to table
        for(int i=0; i<myoDB.get(valueAt).getOdb().size(); i++){
            row_table[0] = myoDB.get(valueAt).getOdb().get(i).getName();
            row_table[1] = myoDB.get(valueAt).getOdb().get(i).getQuantity();
            row_table[2] = myoDB.get(valueAt).getOdb().get(i).getPrice_each();
            row_table[3] = myoDB.get(valueAt).getOdb().get(i).getPrice();
            model.addRow(row_table);
        }
    }
}
