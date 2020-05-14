/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.daffodil.l4dc1000030.budgets.gui;


import ac.daffodil.l4dc1000030.budgets.beans.Accounts;
import ac.daffodil.l4dc1000030.budgets.gui.table.AccountsTableModel;
import ac.daffodil.l4dc1000030.budgets.manager.LoggedInUser;
import java.util.UUID;
import javax.swing.JOptionPane;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class AccountsUI extends javax.swing.JInternalFrame {

   
    public AccountsUI() {
        initComponents();
        
        accountsTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent lse) {
                
                int selectedRow = accountsTable.getSelectedRow();
                if(selectedRow >= 0){
               Accounts accounts = accountsTableModel.getAccounts(selectedRow);
               if(accounts != null){
               accountTitleField.setText(accounts.getTitle());
                //accountTypeComboBox.setSelectedItem(accounts.getAccType() );
                referencesField.setText(accounts.getReference());
                //openingDateField.setDate(accounts.getAccountDate());
               initalAmountField.setText(accounts.getIniAmount());
               openingDateField.setDate(accounts.getAccountDate());
               
                
                }
                }
                
            }
        });
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        accountsPanel = new javax.swing.JPanel();
        accountTitleLabel = new javax.swing.JLabel();
        accountTitleField = new javax.swing.JTextField();
        openningDateLabel = new javax.swing.JLabel();
        assignUserLabel = new javax.swing.JLabel();
        referencesField = new javax.swing.JTextField();
        otherAccountsLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        otherAccountsArea = new javax.swing.JTextArea();
        openingDateField = new com.toedter.calendar.JDateChooser();
        buttonPanel = new javax.swing.JPanel();
        createButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        accountsTableModel = new AccountsTableModel();
        accountsTable = new javax.swing.JTable();
        initialAmount = new javax.swing.JLabel();
        initalAmountField = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        accountTitleLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        accountTitleLabel.setText("Account Title ");

        openningDateLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        openningDateLabel.setText("Openning Date ");

        assignUserLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        assignUserLabel.setText("References");

        otherAccountsLabel.setText("Other Accounts(If Any)");

        otherAccountsArea.setColumns(20);
        otherAccountsArea.setRows(5);
        jScrollPane2.setViewportView(otherAccountsArea);

        javax.swing.GroupLayout accountsPanelLayout = new javax.swing.GroupLayout(accountsPanel);
        accountsPanel.setLayout(accountsPanelLayout);
        accountsPanelLayout.setHorizontalGroup(
            accountsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(accountsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(otherAccountsLabel)
                    .addComponent(openningDateLabel)
                    .addGroup(accountsPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(assignUserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(accountTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(accountsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(accountTitleField, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(referencesField, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(openingDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 17, Short.MAX_VALUE))
        );
        accountsPanelLayout.setVerticalGroup(
            accountsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(accountsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountTitleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(accountsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(referencesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(assignUserLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(accountsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(openningDateLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(openingDateField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(accountsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(accountsPanelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(otherAccountsLabel)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, accountsPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        buttonPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        createButton.setText("Create");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updateButton)
                    .addComponent(clearButton)
                    .addComponent(deleteButton)
                    .addComponent(createButton))
                .addGap(0, 86, Short.MAX_VALUE))
        );

        buttonPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {clearButton, createButton, deleteButton, updateButton});

        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createButton)
                .addGap(18, 18, 18)
                .addComponent(updateButton)
                .addGap(29, 29, 29)
                .addComponent(clearButton)
                .addGap(18, 18, 18)
                .addComponent(deleteButton)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        accountsTable.setModel(accountsTableModel);
        jScrollPane1.setViewportView(accountsTable);

        initialAmount.setText("Initial Amount");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(accountsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(256, 256, 256))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(initialAmount)
                .addGap(61, 61, 61)
                .addComponent(initalAmountField, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(initialAmount))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(initalAmountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(accountsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
      Accounts accounts = new Accounts();
      accounts.setId(UUID.randomUUID().toString());
      accounts.setTitle(accountTitleField.getText());
     // accounts.setAccType(accountTypeComboBox.getSelectedItem().toString()) ;
      accounts.setReference((referencesField.getText()));
      
      accounts.setAccountDate(openingDateField.getDate());
      accounts.setUser(LoggedInUser.getInstance().getUser());
      accounts.setIniAmount(initalAmountField.getText());
      
      accountsTableModel.addRow(accounts);
        clear();
        JOptionPane.showMessageDialog(this, " have successfully created your account!");
    }//GEN-LAST:event_createButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
    int selectedRow = accountsTable.getSelectedRow();
        if(selectedRow>=0){
            accountsTableModel.deletRow(selectedRow);
        }else{
            JOptionPane.showMessageDialog(this, "Please select a row first");

        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        clear();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        int selectedRow = accountsTable.getSelectedRow();
        if(selectedRow  >= 0){
            
            Accounts accounts = accountsTableModel.getAccounts(selectedRow);
      
        accounts.setTitle(accountTitleField.getText());
     // accounts.setAccType(accountTypeComboBox.getSelectedItem().toString()) ;
      accounts.setReference((referencesField.getText()));
      
      accounts.setAccountDate(openingDateField.getDate());
      accounts.setUser(LoggedInUser.getInstance().getUser());
      accounts.setIniAmount(initalAmountField.getText());
        
        
        accountsTableModel.updateRow(selectedRow,accounts);
        }
    }//GEN-LAST:event_updateButtonActionPerformed
private void clear(){
     accountTitleField.setText("");
    
     referencesField.setText("");
   
     initalAmountField.setText("");
     
     openingDateField.setDate(null);
     
 }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accountTitleField;
    private javax.swing.JLabel accountTitleLabel;
    private javax.swing.JPanel accountsPanel;
    private javax.swing.JTable accountsTable;
    private javax.swing.JLabel assignUserLabel;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton createButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField initalAmountField;
    private javax.swing.JLabel initialAmount;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JDateChooser openingDateField;
    private javax.swing.JLabel openningDateLabel;
    private javax.swing.JTextArea otherAccountsArea;
    private javax.swing.JLabel otherAccountsLabel;
    private javax.swing.JTextField referencesField;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
 private AccountsTableModel accountsTableModel;

}
