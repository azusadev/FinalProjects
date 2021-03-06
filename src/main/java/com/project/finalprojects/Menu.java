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
public class Menu extends javax.swing.JPanel {

    /**
     * Creates new form Menu
     */
    public Menu(String categoryName) {
        initComponents();
        this.setBackground(ColorTheme.primaryColor);
        MainScrollPane.getVerticalScrollBar().setPreferredSize(new Dimension(0,0));
        MainScrollPane.getVerticalScrollBar().setUnitIncrement(36);
        MainScrollPane.getViewport().setBorder(null);
        MainScrollPane.setViewportBorder(null);
        MainScrollPane.setBorder(null);
        menuContainer.setBackground(ColorTheme.primaryColor);       
        menuPanel.setBackground(ColorTheme.primaryColor);
        for (int i = 0; i < 30; i++) {
            menuPanel.add(new MenuItem(categoryName + "_" + i));
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

        MainScrollPane = new javax.swing.JScrollPane();
        menuContainer = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();

        setMaximumSize(new java.awt.Dimension(660, 600));
        setMinimumSize(new java.awt.Dimension(660, 600));
        setPreferredSize(new java.awt.Dimension(660, 600));

        MainScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        MainScrollPane.setToolTipText("");
        MainScrollPane.setMaximumSize(new java.awt.Dimension(660, 600));
        MainScrollPane.setMinimumSize(new java.awt.Dimension(660, 600));
        MainScrollPane.setPreferredSize(new java.awt.Dimension(660, 600));

        menuContainer.setMaximumSize(new java.awt.Dimension(640, 250));
        menuContainer.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        menuPanel.setAutoscrolls(true);
        menuPanel.setLayout(new java.awt.GridLayout(0, 5, 15, 15));
        menuContainer.add(menuPanel);

        MainScrollPane.setViewportView(menuContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(MainScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane MainScrollPane;
    private javax.swing.JPanel menuContainer;
    private javax.swing.JPanel menuPanel;
    // End of variables declaration//GEN-END:variables
}
