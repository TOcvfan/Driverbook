/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Control.Control;
import Interface.DriverInterface;

/**
 *
 * @author TOcvfan
 */
public class FuelGUI extends javax.swing.JFrame {
    DriverInterface con;
    /**
     * Creates new form FuelGUI
     */
    public FuelGUI() {
	initComponents();
	this.con = new Control();
	this.setSize(600, 600);
	setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        money = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        km = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        send = new javax.swing.JButton();
        Annuller = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        coin = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        village = new javax.swing.JTextField();
        nation = new javax.swing.JComboBox();
        Betalt = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Liter");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 30, 91, 50);

        amount.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(amount);
        amount.setBounds(290, 30, 150, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Pris");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 100, 91, 46);

        money.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(money);
        money.setBounds(290, 100, 150, 51);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Valuta");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 360, 80, 50);

        km.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        km.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kmActionPerformed(evt);
            }
        });
        getContentPane().add(km);
        km.setBounds(290, 170, 150, 50);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Betalt af");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 420, 100, 40);

        send.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        send.setText("Send");
        send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendActionPerformed(evt);
            }
        });
        getContentPane().add(send);
        send.setBounds(455, 490, 130, 37);

        Annuller.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Annuller.setText("Annuller");
        Annuller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnnullerActionPerformed(evt);
            }
        });
        getContentPane().add(Annuller);
        Annuller.setBounds(10, 493, 150, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Km");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 170, 34, 50);

        coin.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        coin.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Euro", "Koruna", "Swiss", "Kroner" }));
        coin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coinActionPerformed(evt);
            }
        });
        getContentPane().add(coin);
        coin.setBounds(290, 370, 150, 40);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText("Oversigt for nu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(180, 490, 220, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Land");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 240, 91, 46);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("By");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 310, 26, 50);

        village.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        village.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                villageActionPerformed(evt);
            }
        });
        getContentPane().add(village);
        village.setBounds(290, 310, 200, 50);

        nation.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nation.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tjekkiet", "Danmark", "Tyskland", "Østrig", "Schweiz", "Italien", "Frankrig", "Spanien", "Portugal", "Holland", "Belgien", "Luxembourg", "Liechtenstein" }));
        getContentPane().add(nation);
        nation.setBounds(290, 240, 200, 60);

        Betalt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Betalt.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Christian", "Ask" }));
        getContentPane().add(Betalt);
        Betalt.setBounds(290, 420, 160, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kmActionPerformed

    private void sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendActionPerformed
        String name = Betalt.getSelectedItem().toString();
	int distance = Integer.parseInt(km.getText());
	double liter = Double.parseDouble(amount.getText());
	double pricePerLiter = Double.parseDouble(money.getText());
	String valuta = coin.getSelectedItem().toString();
	String country = nation.getSelectedItem().toString();
	String city = village.getText();
	String type = "Fuel";
	con.currency(valuta);
	con.kmPerLiter(type, distance, liter);
	con.saveKmPerL();
	con.saveDistance(type, distance);
	
	con.newFuel(name, country, city, liter);
	con.pricePerLiterDk(pricePerLiter);
	con.saveFuel();
	
	con.totalPrice(liter, pricePerLiter);
	con.economy(name, type, country, city);
	con.saveEconomy();
	this.setVisible(false);
        OversigtNu o = new OversigtNu();
	o.setVisible(true);
    }//GEN-LAST:event_sendActionPerformed

    private void coinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coinActionPerformed

    private void villageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_villageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_villageActionPerformed

    private void AnnullerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnnullerActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_AnnullerActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
    }//GEN-LAST:event_jButton2ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Annuller;
    private javax.swing.JComboBox Betalt;
    private javax.swing.JTextField amount;
    private javax.swing.JComboBox coin;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField km;
    private javax.swing.JTextField money;
    private javax.swing.JComboBox nation;
    private javax.swing.JButton send;
    private javax.swing.JTextField village;
    // End of variables declaration//GEN-END:variables
}
