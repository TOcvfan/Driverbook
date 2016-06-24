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
public class Change extends javax.swing.JFrame {
    DriverInterface con;
    /**
     * Creates new form Change
     */
    public Change() {
	initComponents();
	this.con = new Control();
	
	this.setSize(600, 600);
	setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        village = new javax.swing.JTextField();
        startTime = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        driver = new javax.swing.JComboBox();
        labelcity = new javax.swing.JLabel();
        send = new javax.swing.JButton();
        Annuller = new javax.swing.JButton();
        endTime = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        labelcountry = new javax.swing.JLabel();
        km = new javax.swing.JTextField();
        nation = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        village.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        getContentPane().add(village);
        village.setBounds(250, 339, 190, 60);

        startTime.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        startTime.setText("09:45");
        startTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startTimeActionPerformed(evt);
            }
        });
        getContentPane().add(startTime);
        startTime.setBounds(250, 160, 190, 50);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Km");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 90, 142, 49);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Start tid");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 160, 142, 53);

        driver.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        driver.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Christian", "Ask", "Steen" }));
        driver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                driverActionPerformed(evt);
            }
        });
        getContentPane().add(driver);
        driver.setBounds(250, 410, 193, 50);

        labelcity.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelcity.setText("By");
        getContentPane().add(labelcity);
        labelcity.setBounds(50, 350, 142, 50);

        send.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        send.setText("Send");
        send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendActionPerformed(evt);
            }
        });
        getContentPane().add(send);
        send.setBounds(417, 483, 110, 40);

        Annuller.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Annuller.setText("Annuller");
        Annuller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnnullerActionPerformed(evt);
            }
        });
        getContentPane().add(Annuller);
        Annuller.setBounds(10, 483, 130, 40);

        endTime.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        endTime.setText("14:45");
        endTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endTimeActionPerformed(evt);
            }
        });
        getContentPane().add(endTime);
        endTime.setBounds(250, 220, 190, 50);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Slut tid");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 220, 142, 53);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel5.setText("Chauffør");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 410, 142, 50);

        labelcountry.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelcountry.setText("Land");
        getContentPane().add(labelcountry);
        labelcountry.setBounds(50, 280, 142, 50);

        km.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        getContentPane().add(km);
        km.setBounds(250, 90, 190, 49);

        nation.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        nation.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tjekkiet", "Danmark", "Tyskland", "Østrig", "Schweiz", "Italien", "Frankrig", "Spanien", "Portugal", "Holland", "Belgien", "Luxembourg", "Liechtenstein" }));
        getContentPane().add(nation);
        nation.setBounds(250, 280, 190, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void driverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_driverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_driverActionPerformed

    private void startTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startTimeActionPerformed

    private void sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendActionPerformed
        String time1 = startTime.getText();
	String time2 = endTime.getText();
	String name = driver.getSelectedItem().toString();
	double distance = Double.parseDouble(km.getText());
	String country = nation.getSelectedItem().toString();
	String city = village.getText();
	
	con.time(time1, time2);
	con.driverChange(distance, name, country, city);
	con.saveDriver();
	con.saveDistanceDriver(distance);
	
	this.setVisible(false);
	
    }//GEN-LAST:event_sendActionPerformed

    private void endTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_endTimeActionPerformed

    private void AnnullerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnnullerActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_AnnullerActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Annuller;
    private javax.swing.JComboBox driver;
    private javax.swing.JTextField endTime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField km;
    private javax.swing.JLabel labelcity;
    private javax.swing.JLabel labelcountry;
    private javax.swing.JComboBox nation;
    private javax.swing.JButton send;
    private javax.swing.JTextField startTime;
    private javax.swing.JTextField village;
    // End of variables declaration//GEN-END:variables
}
