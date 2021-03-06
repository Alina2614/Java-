/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.daffodil.l4dc1000030.budgets.gui;


import ac.daffodil.l4dc1000030.budgets.beans.Accounts;
import ac.daffodil.l4dc1000030.budgets.beans.Category;
import ac.daffodil.l4dc1000030.budgets.beans.Schedule;
import ac.daffodil.l4dc1000030.budgets.beans.Transaction;
import ac.daffodil.l4dc1000030.budgets.gui.table.ScheduleTableModel;
import ac.daffodil.l4dc1000030.budgets.gui.table.TransactionTableModel;
import ac.daffodil.l4dc1000030.budgets.manager.AccountsDataManager;
import ac.daffodil.l4dc1000030.budgets.manager.CategoryDataManager;
import java.util.ArrayList;
import java.util.UUID;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class ScheduleUI extends javax.swing.JInternalFrame {
    private Object categoryComboBox;

    /**
     * Creates new form TransectionUI
     */
    public ScheduleUI() {
        initComponents();
         loadAccounts();
         loadCategory();
    
        
         scheduleTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent lse) {

                int selectedRow = scheduleTable.getSelectedRow();
                if (selectedRow >= 0) {
                    Schedule schedule = scheduleTableModel.getSchedule(selectedRow);
                    if (schedule != null) {

                        
                        jDateChooser1.setDate(schedule.getDate());
                        category_S_ComboBox.setSelectedItem(schedule.getCategory());
                        accountNameComboBox.setSelectedItem(schedule.getCategory());
                        amountTextField.setText(String.valueOf(schedule.getAmount()));

                    }
                }

            }
        });
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        amountLabel = new javax.swing.JLabel();
        amountTextField = new javax.swing.JTextField();
        catagoryLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        deleteButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        dateLabel = new javax.swing.JLabel();
        sourceaccountLabel = new javax.swing.JLabel();
        hystoryLabel = new javax.swing.JLabel();
        category_S_ComboBox = new javax.swing.JComboBox<>();
        accountNameComboBox = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        scheduleTableModel = new ScheduleTableModel();
        scheduleTable = new javax.swing.JTable();

        setClosable(true);
        setMaximizable(true);

        amountLabel.setText("Transaction Amount : ");

        catagoryLabel.setText("Category of Transaction");

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        clearButton.setText("Clear All");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Exit");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitButton)
                    .addComponent(deleteButton)
                    .addComponent(clearButton))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(deleteButton)
                .addGap(28, 28, 28)
                .addComponent(clearButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(exitButton)
                .addGap(24, 24, 24))
        );

        dateLabel.setText("Date");

        sourceaccountLabel.setText("Account Name");

        hystoryLabel.setText("Hystory/Activity");

        addButton.setText("Create");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        scheduleTable.setModel(scheduleTableModel);
        jScrollPane1.setViewportView(scheduleTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(catagoryLabel)
                            .addComponent(amountLabel)
                            .addComponent(dateLabel)
                            .addComponent(sourceaccountLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(accountNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(category_S_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(amountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(87, 87, 87)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(137, 137, 137))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(addButton)
                                .addGap(34, 34, 34)
                                .addComponent(updateButton))
                            .addComponent(hystoryLabel)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sourceaccountLabel)
                    .addComponent(accountNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dateLabel)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(category_S_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(catagoryLabel))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(amountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(amountLabel)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(updateButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(hystoryLabel)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(404, 404, 404))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        Schedule  schedule = new Schedule();
      schedule.setId(UUID.randomUUID().toString());
        schedule.setAmount(Double.parseDouble(amountTextField.getText()));
    schedule.setDate(jDateChooser1.getDate());
   schedule.setCategory((Category) category_S_ComboBox.getSelectedItem());
        schedule.setAccountName((Accounts) accountNameComboBox.getSelectedItem());
        scheduleTableModel.addRow(schedule);
    }//GEN-LAST:event_addButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        int selectedRow = scheduleTable.getSelectedRow();
        if(selectedRow>=0){
             Schedule  schedule = new Schedule();
schedule.setCategory((Category) category_S_ComboBox.getSelectedItem());
        schedule.setAccountName((Accounts) accountNameComboBox.getSelectedItem());
            schedule.setAmount(Double.parseDouble(amountTextField.getText()));
            schedule.setDate(jDateChooser1.getDate());

            scheduleTableModel.updateRow(selectedRow, schedule);
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int selectedRow = scheduleTable.getSelectedRow();
        if(selectedRow>=0){
            scheduleTableModel.deleteRow(selectedRow);
        }else{
            JOptionPane.showMessageDialog(this, "Please select a row first");

        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        clear();
    }//GEN-LAST:event_clearButtonActionPerformed

private void loadAccounts(){
    ArrayList<Accounts> accList = AccountsDataManager.load();
    accountNameComboBox.removeAllItems();
    
    if( accList != null){
        for( int i=0; i< accList.size();i++){
            accountNameComboBox.addItem(accList.get(i));
        }
        
    }
    
}

private void loadCategory(){
    ArrayList<Category> categoryList = CategoryDataManager.load();
    category_S_ComboBox.removeAllItems();
    
    if (categoryList != null){
        for( int i=0; i < categoryList.size(); i++){
            category_S_ComboBox.addItem(categoryList.get(i));
        }
    }
}

public void clear() {
        amountTextField.setText("");
        
        jDateChooser1.setDate(null);
       
        
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Accounts> accountNameComboBox;
    private javax.swing.JButton addButton;
    private javax.swing.JLabel amountLabel;
    private javax.swing.JTextField amountTextField;
    private javax.swing.JLabel catagoryLabel;
    private javax.swing.JComboBox<Category> category_S_ComboBox;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel hystoryLabel;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable scheduleTable;
    private javax.swing.JLabel sourceaccountLabel;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
private ScheduleTableModel scheduleTableModel;
}
