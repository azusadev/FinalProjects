/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.finalprojects;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author reden
 */
public class AccountPanel extends javax.swing.JPanel {

    ArrayList<Account> accounts = new ArrayList<>();
    
    /**
     * Creates new form AccountPanel
     */
    public AccountPanel() {
        initComponents();
        accounts = SaveSystem.Load("accounts");
        //UpdateTable();
    }
    
    public void UpdateTable()
    {
        DefaultTableModel model = (DefaultTableModel)accountsTable.getModel();
        model.setRowCount(0);
        for (int i = 0; i < accounts.size(); i++) {
            Vector vec = new Vector();
            String[] s = accounts.get(i).toString().split(":");
            vec.add(s[0]);
            vec.add(s[1]);
            vec.add(s[2]);
            vec.add(s[3]);
            vec.add(s[4]);
            model.addRow(vec);
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

        editButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        accountsTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        addAccount = new javax.swing.JButton();

        editButton.setText("EDIT");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        accountsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Account Level", "Username", "Password", "Full Name", "Date Registered"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(accountsTable);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Product", "Total"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        addAccount.setText("ADD");
        addAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAccountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addGap(47, 47, 47))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(addAccount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAccountActionPerformed
        AddAccountPanel panel = new AddAccountPanel();
        int value = JOptionPane.showConfirmDialog(SwingUtilities.getWindowAncestor(this),
                        panel,
                        "Add Account",
                        JOptionPane.OK_CANCEL_OPTION,
                        JOptionPane.PLAIN_MESSAGE);
       
        if(value == JOptionPane.OK_OPTION && !panel.username.getText().isEmpty() && !panel.password.getText().isEmpty() && !panel.fullname.getText().isEmpty()){
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
            Date date = new Date();  
            AccountLevel level = AccountLevel.Manager;
            switch(String.valueOf(panel.accountLevel.getSelectedItem()))
            {
                case "Manager":
                    level = AccountLevel.Manager;
                    break;
                case "Cashier":
                    level = AccountLevel.Cashier;
                    break;
            }
            Account account = new Account(level, panel.username.getText(), panel.password.getText(),  panel.fullname.getText(), formatter.format(date));
            accounts.add(account);
            SaveSystem.Save("accounts", accounts);
            accounts = SaveSystem.Load("accounts");
        }else if(value == JOptionPane.CANCEL_OPTION){
            
        }
        UpdateTable();
    }//GEN-LAST:event_addAccountActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        AddAccountPanel panel = new AddAccountPanel();
        int row = accountsTable.getSelectedRow();
        String l = accountsTable.getModel().getValueAt(row, 0).toString();
        String username = accountsTable.getModel().getValueAt(row, 1).toString();
        String password = accountsTable.getModel().getValueAt(row, 2).toString();
        String fullname = accountsTable.getModel().getValueAt(row, 3).toString();
        String date = accountsTable.getModel().getValueAt(row, 4).toString();
        panel.username.setText(username);
        panel.password.setText(password);
        panel.fullname.setText(fullname);
        int index = 0;
        switch(l)
        {
            case "Manager":
                index = 0;
                break;
            case "Cashier":
                index = 1;
                break;
        }
        panel.accountLevel.setSelectedIndex(index);
        
        int value = JOptionPane.showConfirmDialog(SwingUtilities.getWindowAncestor(this),
                        panel,
                        "Add Account",
                        JOptionPane.OK_CANCEL_OPTION,
                        JOptionPane.PLAIN_MESSAGE);
       
        if(value == JOptionPane.OK_OPTION && !panel.username.getText().isEmpty() && !panel.password.getText().isEmpty() && !panel.fullname.getText().isEmpty()){ 
            AccountLevel level = AccountLevel.Manager;
            switch(String.valueOf(panel.accountLevel.getSelectedItem()))
            {
                case "Manager":
                    level = AccountLevel.Manager;
                    break;
                case "Cashier":
                    level = AccountLevel.Cashier;
                    break;
            }
            Account account = new Account(level, panel.username.getText(), panel.password.getText(),  panel.fullname.getText(), date);
            
            for (int i = 0; i < accounts.size(); i++) {
                if(accounts.get(i).getUsername().equals(account.getUsername()))
                {
                    accounts.set(i, account);
                    break;
                }
            }
            SaveSystem.Save("accounts", accounts);
            accounts = SaveSystem.Load("accounts");       
        }
        UpdateTable();
    }//GEN-LAST:event_editButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        AddAccountPanel panel = new AddAccountPanel();
        int row = accountsTable.getSelectedRow();
        String l = accountsTable.getModel().getValueAt(row, 0).toString();
        String username = accountsTable.getModel().getValueAt(row, 1).toString();
        String password = accountsTable.getModel().getValueAt(row, 2).toString();
        String fullname = accountsTable.getModel().getValueAt(row, 3).toString();
        String date = accountsTable.getModel().getValueAt(row, 4).toString();
        AccountLevel level = AccountLevel.Manager;
        switch(String.valueOf(panel.accountLevel.getSelectedItem()))
        {
            case "Manager":
                level = AccountLevel.Manager;
                break;
            case "Cashier":
                level = AccountLevel.Cashier;
                break;
        }
        Account account = new Account(level, username, password, fullname, date);

        for (int i = 0; i < accounts.size(); i++) {
            if(accounts.get(i).getUsername().equals(account.getUsername()))
            {
                accounts.remove(i);
                break;
            }
        }
        SaveSystem.Save("accounts", accounts);
        accounts = SaveSystem.Load("accounts");       
        UpdateTable();
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable accountsTable;
    private javax.swing.JButton addAccount;
    private javax.swing.JButton editButton;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
