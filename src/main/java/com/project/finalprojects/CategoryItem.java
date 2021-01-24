/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.finalprojects;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author reden
 */
public class CategoryItem extends javax.swing.JPanel{

    public boolean isActive = false;
    /**
     * Creates new form CategoryItem
     */
    public CategoryItem() {
        initComponents();
        this.setBackground(ColorTheme.secondaryColor);
        repaint();
        revalidate();
    }

    public CategoryItem(String name, String iconPath) {
        initComponents();
        categoryName.setText("<html><div style='text-align: center;'>" + name + "</div></html>");
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconPath)));
        this.setBackground(ColorTheme.secondaryColor);
        repaint();
        revalidate();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mouseInteract = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        categoryName = new javax.swing.JLabel();

        setBackground(new java.awt.Color(20, 20, 20));
        setMaximumSize(new java.awt.Dimension(180, 50));
        setPreferredSize(new java.awt.Dimension(180, 50));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mouseInteract.setOpaque(false);
        mouseInteract.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseInteractMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseInteractMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mouseInteractMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                mouseInteractMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout mouseInteractLayout = new javax.swing.GroupLayout(mouseInteract);
        mouseInteract.setLayout(mouseInteractLayout);
        mouseInteractLayout.setHorizontalGroup(
            mouseInteractLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        mouseInteractLayout.setVerticalGroup(
            mouseInteractLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        add(mouseInteract, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 50));

        icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chicken.png"))); // NOI18N
        icon.setFocusable(false);
        icon.setRequestFocusEnabled(false);
        icon.setVerifyInputWhenFocusTarget(false);
        add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 50));

        categoryName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        categoryName.setForeground(new java.awt.Color(255, 255, 255));
        categoryName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        categoryName.setText("<html><div style='text-align: center;'>Dessert & Beverages</div></html>");
        categoryName.setToolTipText("");
        categoryName.setFocusable(false);
        categoryName.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        categoryName.setRequestFocusEnabled(false);
        categoryName.setVerifyInputWhenFocusTarget(false);
        add(categoryName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 140, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void mouseInteractMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseInteractMousePressed
        // TODO add your handling code here:
        Category category = (Category)getParent().getParent().getParent().getParent().getParent();
        if(category.selectedItem != this)
        {
            category.selectedItem = this;
            category.resetAllBackground();
            isActive = true;
            this.setBackground(ColorTheme.highlightColor);
        }
    }//GEN-LAST:event_mouseInteractMousePressed

    private void mouseInteractMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseInteractMouseReleased
        // TODO add your handling code here:
        //resetColor();
    }//GEN-LAST:event_mouseInteractMouseReleased

    private void mouseInteractMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseInteractMouseEntered
        // TODO add your handling code here:
        if(!isActive) this.setBackground(ColorTheme.secondaryHighlightColor);
    }//GEN-LAST:event_mouseInteractMouseEntered

    private void mouseInteractMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseInteractMouseExited
        // TODO add your handling code here:
        if(!isActive) this.setBackground(ColorTheme.secondaryColor);
        else this.setBackground(ColorTheme.highlightColor);
    }//GEN-LAST:event_mouseInteractMouseExited

    public void resetBackground()
    {
        isActive = false;
        this.setBackground(ColorTheme.secondaryColor);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel categoryName;
    private javax.swing.JLabel icon;
    private javax.swing.JPanel mouseInteract;
    // End of variables declaration//GEN-END:variables


}
