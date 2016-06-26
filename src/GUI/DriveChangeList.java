/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Interface.DriverInterface;
import javax.swing.DefaultListModel;

/**
 *
 * @author TOcvfan
 */
public class DriveChangeList extends javax.swing.JFrame {
    DefaultListModel listModel = new DefaultListModel();
    private DriverInterface con;
    /**
     * Creates new form Kørebog
     */
    public DriveChangeList(/*DriverInterface con*/) {
	initComponents();
        
        jList1.setModel(listModel);
        addToList();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Navn");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(126, 48, 25, 14);

        jLabel2.setText("Kørte km");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(251, 48, 42, 14);

        jLabel3.setText("tid");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(401, 48, 12, 14);

        jButton1.setText("Ok");
        getContentPane().add(jButton1);
        jButton1.setBounds(494, 406, 45, 23);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(100, 70, 340, 260);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void addToList() {
        String[] driverList = con.loadDriver();
        for (int i = 0; i < con.loadDriver().length; i++) {
            listModel.addElement(driverList[i]);
            
        }

    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
