/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.finalprojects;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author reden
 */
public class MCategory extends javax.swing.JPanel {

    /**
     * Creates new form MCategory
     */
    public MCategory() {
        initComponents();
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
        container = new javax.swing.JPanel();
        categoryPanel = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();

        jScrollPane1.setBorder(null);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1150, 60));

        container.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 10));

        categoryPanel.setLayout(new java.awt.GridLayout(1, 0));

        addButton.setText("+");
        addButton.setPreferredSize(new java.awt.Dimension(150, 40));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        categoryPanel.add(addButton);

        container.add(categoryPanel);

        jScrollPane1.setViewportView(container);

        add(jScrollPane1);
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        categoryPanel.add(new JButton("MENU 1"));
        repaint();
        revalidate();
    }//GEN-LAST:event_addButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JPanel categoryPanel;
    private javax.swing.JPanel container;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
