/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.finalprojects;

import javax.swing.JFrame;

/**
 *
 * @author reden
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        main = new javax.swing.JPanel();
        receipt = new javax.swing.JPanel();
        mainArea = new javax.swing.JPanel();
        mCategory1 = new com.project.finalprojects.MCategory();
        mMenu1 = new com.project.finalprojects.MMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setName("RESTAURANT"); // NOI18N
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1366, 768));
        setResizable(false);

        Header.setPreferredSize(new java.awt.Dimension(0, 100));

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2183, Short.MAX_VALUE)
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(Header, java.awt.BorderLayout.NORTH);

        main.setLayout(new javax.swing.BoxLayout(main, javax.swing.BoxLayout.LINE_AXIS));

        receipt.setPreferredSize(new java.awt.Dimension(500, 773));

        javax.swing.GroupLayout receiptLayout = new javax.swing.GroupLayout(receipt);
        receipt.setLayout(receiptLayout);
        receiptLayout.setHorizontalGroup(
            receiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 918, Short.MAX_VALUE)
        );
        receiptLayout.setVerticalGroup(
            receiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 773, Short.MAX_VALUE)
        );

        main.add(receipt);

        mainArea.setPreferredSize(new java.awt.Dimension(850, 773));
        mainArea.setLayout(new javax.swing.BoxLayout(mainArea, javax.swing.BoxLayout.PAGE_AXIS));
        mainArea.add(mCategory1);
        mainArea.add(mMenu1);

        main.add(mainArea);

        getContentPane().add(main, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private com.project.finalprojects.MCategory mCategory1;
    private com.project.finalprojects.MMenu mMenu1;
    private javax.swing.JPanel main;
    private javax.swing.JPanel mainArea;
    private javax.swing.JPanel receipt;
    // End of variables declaration//GEN-END:variables
}
