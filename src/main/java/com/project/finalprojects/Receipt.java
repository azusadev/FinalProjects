/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.finalprojects;

import java.awt.Dimension;

/**
 *
 * @author reden
 */
public class Receipt extends javax.swing.JPanel {

    /**
     * Creates new form Receipt
     */
    public Receipt() {
        initComponents();
        this.setBackground(ColorTheme.primaryColor);
        MainScrollPane.getVerticalScrollBar().setPreferredSize(new Dimension(0,0));
        MainScrollPane.getVerticalScrollBar().setUnitIncrement(36);
        MainScrollPane.getViewport().setBorder(null);
        MainScrollPane.setViewportBorder(null);
        MainScrollPane.setBorder(null);
        container.setBackground(ColorTheme.primaryColor);
        itemHolder.setBackground(ColorTheme.primaryColor);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainScrollPane = new javax.swing.JScrollPane();
        container = new javax.swing.JPanel();
        itemHolder = new javax.swing.JPanel();
        receiptItem1 = new com.project.finalprojects.ReceiptItem();
        receiptItem2 = new com.project.finalprojects.ReceiptItem();
        receiptItem3 = new com.project.finalprojects.ReceiptItem();
        receiptItem4 = new com.project.finalprojects.ReceiptItem();
        receiptItem5 = new com.project.finalprojects.ReceiptItem();
        receiptItem6 = new com.project.finalprojects.ReceiptItem();
        receiptItem7 = new com.project.finalprojects.ReceiptItem();
        receiptItem8 = new com.project.finalprojects.ReceiptItem();
        receiptItem9 = new com.project.finalprojects.ReceiptItem();
        receiptItem10 = new com.project.finalprojects.ReceiptItem();
        receiptItem11 = new com.project.finalprojects.ReceiptItem();
        receiptItem12 = new com.project.finalprojects.ReceiptItem();
        receiptItem13 = new com.project.finalprojects.ReceiptItem();
        receiptItem14 = new com.project.finalprojects.ReceiptItem();
        receiptItem15 = new com.project.finalprojects.ReceiptItem();
        receiptItem16 = new com.project.finalprojects.ReceiptItem();
        receiptItem17 = new com.project.finalprojects.ReceiptItem();
        receiptItem18 = new com.project.finalprojects.ReceiptItem();
        receiptItem19 = new com.project.finalprojects.ReceiptItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(400, 660));
        setMinimumSize(new java.awt.Dimension(400, 660));
        setPreferredSize(new java.awt.Dimension(400, 660));

        MainScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        MainScrollPane.setToolTipText("");
        MainScrollPane.setMaximumSize(new java.awt.Dimension(400, 400));
        MainScrollPane.setMinimumSize(new java.awt.Dimension(400, 400));
        MainScrollPane.setPreferredSize(new java.awt.Dimension(400, 400));

        container.setMaximumSize(new java.awt.Dimension(170, 80));
        container.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        itemHolder.setAutoscrolls(true);
        itemHolder.setLayout(new java.awt.GridLayout(0, 1, 0, 2));
        itemHolder.add(receiptItem1);
        itemHolder.add(receiptItem2);
        itemHolder.add(receiptItem3);
        itemHolder.add(receiptItem4);
        itemHolder.add(receiptItem5);
        itemHolder.add(receiptItem6);
        itemHolder.add(receiptItem7);
        itemHolder.add(receiptItem8);
        itemHolder.add(receiptItem9);
        itemHolder.add(receiptItem10);
        itemHolder.add(receiptItem11);
        itemHolder.add(receiptItem12);
        itemHolder.add(receiptItem13);
        itemHolder.add(receiptItem14);
        itemHolder.add(receiptItem15);
        itemHolder.add(receiptItem16);
        itemHolder.add(receiptItem17);
        itemHolder.add(receiptItem18);
        itemHolder.add(receiptItem19);

        container.add(itemHolder);

        MainScrollPane.setViewportView(container);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RECEIPT");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TOTAL:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TAX:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("POINTS:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("P 0.00");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("P 0.00");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("P 0.00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MainScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(MainScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel7)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane MainScrollPane;
    private javax.swing.JPanel container;
    private javax.swing.JPanel itemHolder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private com.project.finalprojects.ReceiptItem receiptItem1;
    private com.project.finalprojects.ReceiptItem receiptItem10;
    private com.project.finalprojects.ReceiptItem receiptItem11;
    private com.project.finalprojects.ReceiptItem receiptItem12;
    private com.project.finalprojects.ReceiptItem receiptItem13;
    private com.project.finalprojects.ReceiptItem receiptItem14;
    private com.project.finalprojects.ReceiptItem receiptItem15;
    private com.project.finalprojects.ReceiptItem receiptItem16;
    private com.project.finalprojects.ReceiptItem receiptItem17;
    private com.project.finalprojects.ReceiptItem receiptItem18;
    private com.project.finalprojects.ReceiptItem receiptItem19;
    private com.project.finalprojects.ReceiptItem receiptItem2;
    private com.project.finalprojects.ReceiptItem receiptItem3;
    private com.project.finalprojects.ReceiptItem receiptItem4;
    private com.project.finalprojects.ReceiptItem receiptItem5;
    private com.project.finalprojects.ReceiptItem receiptItem6;
    private com.project.finalprojects.ReceiptItem receiptItem7;
    private com.project.finalprojects.ReceiptItem receiptItem8;
    private com.project.finalprojects.ReceiptItem receiptItem9;
    // End of variables declaration//GEN-END:variables
}