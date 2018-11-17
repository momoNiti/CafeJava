/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import db.MenuController;
import gui.PosGUI;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import menu.FoodSnack;

/**
 *
 * @author STUDY fuckin HARD
 */
public class PanelSnack extends javax.swing.JPanel {
    private MenuController menuctrl = new MenuController();
    private FoodSnack fs = new FoodSnack();
    private Object[] row_table;
    private PosGUI pos;

    private JButton[] button;
    private JLabel[] label_price;
    private JLabel[] label;

    /**
     * Creates new form PanelSnack
     */
    public PanelSnack(PosGUI pos) {
        this.pos = pos;
        initComponents();
        row_table = new Object[4];
        
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double price = 0;
                for(int i=0; i<fs.getMyMenu().size(); i++){
                    if(((JButton)e.getSource()).getText().equals(fs.getMyMenu().get(i).getName())){
                        price = fs.getMyMenu().get(i).getPrice();
                        break;
                    }
                }
                row_table[0] = 1;
                row_table[1] = ((JButton)e.getSource()).getText();
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
            }
        };
        
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();
        jPanel1.setLayout(layout);
        label = new JLabel[2];
        label[0] = new JLabel("Menu");
        label[1] = new JLabel("Price");
        c.gridx = 1;
        c.gridy = 0;
        c.gridwidth = 2;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(5, 5, 5, 5);
        jPanel1.add(label[0], c); // add menu
        c.gridx = 2;
        c.gridy = 0;
        jPanel1.add(label[1], c); // add price
        c.gridx = 0;
        c.gridy = 1;
        fs.setMyMenu(menuctrl.getSnackMenu());
        button = new JButton[fs.getMyMenu().size()];
        label_price = new JLabel[fs.getMyMenu().size()];
        
        for(int i=0; i<fs.getMyMenu().size(); i++){
            System.out.println("Grid x " + c.gridx);
            System.out.println("Grid y " + c.gridy);
            c.gridx = 0;
            button[i] = new JButton(fs.getMyMenu().get(i).getName());
            button[i].addActionListener(listener);
            button[i].setSize(new Dimension(200, 40));
            button[i].setPreferredSize(new Dimension(200, 40));
            label_price[i] = new JLabel(String.valueOf(fs.getMyMenu().get(i).getPrice()));
            jPanel1.add(button[i], c);
            c.gridx = 2;
            jPanel1.add(label_price[i], c);
            c.gridy += 1; //new line
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 475, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
