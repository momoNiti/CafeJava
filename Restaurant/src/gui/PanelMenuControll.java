/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import db.MenuController;
import java.awt.GridBagLayout;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import menu.FoodDrink;
import menu.FoodMain;
import menu.FoodSnack;
import restaurant.User;

/**
 *
 * @author STUDY fuckin HARD
 */
public class PanelMenuControll extends javax.swing.JPanel {
    private MainGUI mg;
    private MenuController menuctrl = new MenuController();
    private FoodDrink fd = new FoodDrink();
    private FoodMain fm = new FoodMain();
    private FoodSnack fs = new FoodSnack();
    //table
    private Object[] row_table, column_table;
    private DefaultTableModel model;
    /**
     * Creates new form MenuControllerGUI
     */
    public PanelMenuControll(MainGUI mg) {
        initComponents();
        this.mg = mg;
        //table
        column_table = new Object[3];
        row_table = new Object[3];
        column_table[0] = "Menu ID";
        column_table[1] = "Menu Name";
        column_table[2] = "Price";
        model = new DefaultTableModel();
        model.setColumnIdentifiers(column_table);
        JTable_menu.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DynamicPanel = new javax.swing.JPanel();
        jSelect_DB = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        scrollPane = new javax.swing.JScrollPane();
        JTable_menu = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;   //Disallow the editing of any cell
            }
        };
        jAddMenu = new javax.swing.JButton();
        jDeleteMenu = new javax.swing.JButton();
        jEditMenu = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1143, 616));

        DynamicPanel.setBackground(new java.awt.Color(255, 255, 204));

        jSelect_DB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select DataBase", "food_main", "food_snack", "food_drink" }));
        jSelect_DB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSelect_DBActionPerformed(evt);
            }
        });

        scrollPane.setBorder(null);

        JTable_menu.setBackground(new java.awt.Color(204, 255, 204));
        JTable_menu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollPane.setViewportView(JTable_menu);
        if (JTable_menu.getColumnModel().getColumnCount() > 0) {
            JTable_menu.getColumnModel().getColumn(0).setResizable(false);
            JTable_menu.getColumnModel().getColumn(1).setResizable(false);
            JTable_menu.getColumnModel().getColumn(2).setResizable(false);
            JTable_menu.getColumnModel().getColumn(3).setResizable(false);
        }
        JTable_menu.getTableHeader().setReorderingAllowed(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 943, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
        );

        jAddMenu.setText("Add Menu");
        jAddMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddMenuActionPerformed(evt);
            }
        });

        jDeleteMenu.setText("Delete Menu");
        jDeleteMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteMenuActionPerformed(evt);
            }
        });

        jEditMenu.setText("Edit Menu");
        jEditMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEditMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DynamicPanelLayout = new javax.swing.GroupLayout(DynamicPanel);
        DynamicPanel.setLayout(DynamicPanelLayout);
        DynamicPanelLayout.setHorizontalGroup(
            DynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DynamicPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(DynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSelect_DB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jAddMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDeleteMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jEditMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(43, 43, 43)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DynamicPanelLayout.setVerticalGroup(
            DynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DynamicPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jSelect_DB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jAddMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jDeleteMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jEditMenu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DynamicPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DynamicPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jSelect_DBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSelect_DBActionPerformed
        // TODO add your handling code here:
        if(jSelect_DB.getSelectedItem().toString().equals("food_main")){
            fm.setMyMenu(menuctrl.getMainMenu());
            model.setRowCount(0);
            for(int i=0; i<fm.getMyMenu().size(); i++){
                row_table[0] = fm.getMyMenu().get(i).getMenuID();
                row_table[1] = fm.getMyMenu().get(i).getName();
                row_table[2] = fm.getMyMenu().get(i).getPrice();
                model.addRow(row_table);
            }
        }
        if(jSelect_DB.getSelectedItem().toString().equals("food_snack")){
           fs.setMyMenu(menuctrl.getSnackMenu());
            model.setRowCount(0);
            for(int i=0; i<fs.getMyMenu().size(); i++){
                row_table[0] = fs.getMyMenu().get(i).getMenuID();
                row_table[1] = fs.getMyMenu().get(i).getName();
                row_table[2] = fs.getMyMenu().get(i).getPrice();
                model.addRow(row_table);
            }
        }
        if(jSelect_DB.getSelectedItem().toString().equals("food_drink")){
            fd.setMyMenu(menuctrl.getDrinkMenu());
            model.setRowCount(0);
            for(int i=0; i<fd.getMyMenu().size(); i++){
                row_table[0] = fd.getMyMenu().get(i).getMenuID();
                row_table[1] = fd.getMyMenu().get(i).getName();
                row_table[2] = fd.getMyMenu().get(i).getPrice();
                model.addRow(row_table);
            }
        }
        
    }//GEN-LAST:event_jSelect_DBActionPerformed

    private void jAddMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddMenuActionPerformed
        // TODO add your handling code here:
        JTextField menuID = new JTextField();
        JTextField menuName = new JTextField();
        JTextField price = new JTextField();
        Object[] message = {
            "Menu ID", menuID,
            "Menu name", menuName,
            "Price", price
        };
        int check = JOptionPane.showConfirmDialog(null, message, "Add new Menu", JOptionPane.OK_CANCEL_OPTION);
        if(check == JOptionPane.OK_OPTION){
            if(jSelect_DB.getSelectedIndex() == 0){
                JOptionPane.showMessageDialog(null, "Plese select your database", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            else{
                if( !menuID.getText().isEmpty() && !menuName.getText().isEmpty() && !price.getText().isEmpty() ){
                    int res = menuctrl.insertMenu(jSelect_DB.getSelectedItem().toString(), menuID.getText(), menuName.getText(), Double.parseDouble(price.getText()));
                    if(res > 0){
                        jSelect_DBActionPerformed(evt);
                        User user = mg.getU();
                        mg.dispose();
                        MainGUI mg_new = new MainGUI(user);
                        mg_new.setVisible(true);
                        mg_new.setLocationRelativeTo(null);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Duplicate ID or menu name", "ERROR", JOptionPane.ERROR_MESSAGE); 
                    }                   
                }
                else{
                   JOptionPane.showMessageDialog(null, "Fill your empty", "ERROR", JOptionPane.ERROR_MESSAGE); 
                }
            }
        }
    }//GEN-LAST:event_jAddMenuActionPerformed

    private void jDeleteMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteMenuActionPerformed
        // TODO add your handling code here:
        JTextField menuID = new JTextField();
        Object[] message = {
            "Menu ID", menuID
        };
        JOptionPane.showMessageDialog(null, "This is DELTE MENU Function !!", "WARNING", JOptionPane.WARNING_MESSAGE);
        int check = JOptionPane.showConfirmDialog(null, message, "Delete Menu", JOptionPane.OK_CANCEL_OPTION);
        if(check == JOptionPane.OK_OPTION){
            if(jSelect_DB.getSelectedIndex() == 0){
                JOptionPane.showMessageDialog(null, "Plese select your database", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            else{
                if(!menuID.getText().isEmpty()){
                    int res = menuctrl.deleteMenu(jSelect_DB.getSelectedItem().toString(), menuID.getText());
                    if(res > 0){
                        jSelect_DBActionPerformed(evt);
                        User user = mg.getU();
                        MainGUI mg_new = new MainGUI(user);
                        mg_new.setVisible(true);
                        mg_new.setLocationRelativeTo(null); 
                        mg.dispose();
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "No ID Found", "ERROR", JOptionPane.ERROR_MESSAGE); 
                    }
                    
                    
                }
                else{
                    JOptionPane.showMessageDialog(null, "Error", "ERROR", JOptionPane.ERROR_MESSAGE); 
                }
            }
        }
    }//GEN-LAST:event_jDeleteMenuActionPerformed

    private void jEditMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEditMenuActionPerformed
        // TODO add your handling code here:
        JTextField menuID = new JTextField();
        JTextField menuName = new JTextField();
        JTextField price = new JTextField();
        Object[] message = {
            "Menu ID", menuID,
            "Menu name", menuName,
            "Price", price
        };
        int check = JOptionPane.showConfirmDialog(null, message, "Edit Menu", JOptionPane.OK_CANCEL_OPTION);
        if(check == JOptionPane.OK_OPTION){
            if(jSelect_DB.getSelectedIndex() == 0){
                JOptionPane.showMessageDialog(null, "Plese select your database", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            else{
                if( !menuID.getText().isEmpty() && !menuName.getText().isEmpty() && !price.getText().isEmpty() ){
                    int res = menuctrl.editMenu(jSelect_DB.getSelectedItem().toString(), menuID.getText(), menuName.getText(), Double.parseDouble(price.getText()));
                    if(res > 0){
                        jSelect_DBActionPerformed(evt);
                        User user = mg.getU();
                        mg.dispose();
                        MainGUI mg_new = new MainGUI(user);
                        mg_new.setVisible(true);
                        mg_new.setLocationRelativeTo(null);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "No ID found or Duplicate menu name", "ERROR", JOptionPane.ERROR_MESSAGE); 
                    }                   
                }
                else{
                   JOptionPane.showMessageDialog(null, "Fill your empty", "ERROR", JOptionPane.ERROR_MESSAGE); 
                }
            }
        }
    }//GEN-LAST:event_jEditMenuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DynamicPanel;
    private javax.swing.JTable JTable_menu;
    private javax.swing.JButton jAddMenu;
    private javax.swing.JButton jDeleteMenu;
    private javax.swing.JButton jEditMenu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jSelect_DB;
    private javax.swing.JScrollPane scrollPane;
    // End of variables declaration//GEN-END:variables
}
