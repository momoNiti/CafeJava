/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import db.MenuController;
import gui.PosGUI;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import menu.FoodDrink;

/**
 *
 * @author STUDY fuckin HARD
 */
public class PanelDrink extends javax.swing.JPanel {
    MenuController menuctrl = new MenuController();
    FoodDrink fd = new FoodDrink();
    Object[] row_table;
    private PosGUI pos;

    private JButton[] button;
    private JLabel[] label;

    /** Creates new form PanelDrink */
    public PanelDrink(PosGUI pos) {
        this.pos = pos;
        initComponents();
        row_table = new Object[4];
        
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double price = 0;
                for(int i=0; i<fd.getMyMenu().size(); i++){
                    if(((JButton)e.getSource()).getText().equals(fd.getMyMenu().get(i).getName())){
                        price = fd.getMyMenu().get(i).getPrice();
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
        jPanel1.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;

        fd.setMyMenu(menuctrl.getDrinkMenu());
        button = new JButton[fd.getMyMenu().size()];
        label = new JLabel[fd.getMyMenu().size()];
        
        for(int i=0; i<fd.getMyMenu().size(); i++){
            button[i] = new JButton(fd.getMyMenu().get(i).getName());
            button[i].addActionListener(listener);
            label[i] = new JLabel(String.valueOf(fd.getMyMenu().get(i).getPrice()));
            jPanel1.add(button[i], c);
            c.gridx += 4;
            jPanel1.add(label[i], c);
            c.gridx = 0;
            c.gridy += 1;
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
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

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
