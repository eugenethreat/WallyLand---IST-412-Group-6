/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package WLVG_app.Login;

import WLVG_app.Controller;
import javax.swing.JButton;

/**
 *
 * @author jack
 */
public class NavigationPanel extends javax.swing.JPanel {

    /**
     * Creates new form NavigationPage
     */
    private Controller cntl;

    public NavigationPanel(Controller control) {
        this.cntl = control;
        initComponents();
    }

    public NavigationPanel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel = new javax.swing.JLabel();
        hotelBtn = new javax.swing.JButton();
        foodBtn = new javax.swing.JButton();
        timesBtn = new javax.swing.JButton();
        paymentBtn = new javax.swing.JButton();
        ticketsBtn = new javax.swing.JButton();

        jLabel.setFont(new java.awt.Font("Dialog", 0, 34)); // NOI18N
        jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel.setText("Welcome to the WallyLand Application!");

        hotelBtn.setText("Book a Hotel");
        hotelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hotelBtnActionPerformed(evt);
            }
        });

        foodBtn.setText("Order Food");
        foodBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodBtnActionPerformed(evt);
            }
        });

        timesBtn.setText("View Wait Times");
        timesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timesBtnActionPerformed(evt);
            }
        });

        paymentBtn.setText("Payment");
        paymentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentBtnActionPerformed(evt);
            }
        });

        ticketsBtn.setText("Buy Tickets");
        ticketsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticketsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ticketsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paymentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(foodBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hotelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(258, 258, 258))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(hotelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(foodBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(timesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ticketsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(paymentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    //Buttons only functional for implemented use cases
    
    private void hotelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hotelBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hotelBtnActionPerformed

    private void foodBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_foodBtnActionPerformed

    private void timesBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timesBtn2ActionPerformed
//        this.removeAll();
//        cntl.switchToWaitTimes();
    }//GEN-LAST:event_timesBtn2ActionPerformed

    private void paymentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentBtnActionPerformed
        // TODO add your handling code here:
        this.removeAll();
        cntl.newPayment();
    }//GEN-LAST:event_paymentBtnActionPerformed

    private void ticketsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticketsBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ticketsBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton foodBtn;
    public javax.swing.JButton hotelBtn;
    private javax.swing.JLabel jLabel;
    public javax.swing.JButton paymentBtn;
    public javax.swing.JButton ticketsBtn;
    public javax.swing.JButton timesBtn;
    // End of variables declaration//GEN-END:variables

//Getters and setters 
    public JButton getTicketsBtn2() {
        return ticketsBtn2;
    }

    public JButton getTimesBtn2() {
        return timesBtn2;
    }

    public JButton getHotelBtn2() {
        return hotelBtn2;

    }

    public JButton getFoodBtn2() {
        return foodBtn2;
    }

}
