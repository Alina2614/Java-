/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.daffodil.l4dc1000030.budgets.gui;

//import ac.daffodil.l4dc1000030.budgets.bean.Category;
import ac.daffodil.l4dc1000030.budgets.beans.Category;
import ac.daffodil.l4dc1000030.budgets.gui.table.CategoryTableModel;
import java.util.UUID;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class CategoryUI extends javax.swing.JInternalFrame {

    private Object categoryField;

    /**
     * Creates new form CategoryUI
     */
    public CategoryUI() {
        initComponents();
        categoryTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent lse) {
                
                int selectedRow = categoryTable.getSelectedRow();
                if(selectedRow >= 0){
               Category category = categoryTableModel.getCategory(selectedRow);
               if(category != null){
                categoryComboBox.setSelectedItem(category.getCategory());
                jDateChooser1.setDate(category.getCategoryDate());
               //0transaction.setModeOfTransaction((String)modeOfTransactionComboBox.getSelectedItem());
                if(category.getCategoryType().equals("Income")){
                    incomeRadioButton.setSelected(true);
                }else{
                    expenseRadioButton.setSelected(false);
                }
                
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        componentPanel = new javax.swing.JPanel();
        categoryLabel = new javax.swing.JLabel();
        categoryTypeLabel = new javax.swing.JLabel();
        incomeRadioButton = new javax.swing.JRadioButton();
        expenseRadioButton = new javax.swing.JRadioButton();
        categoryCreationDateLabel = new javax.swing.JLabel();
        categoryComboBox = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        dateField = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        categoryTableModel = new CategoryTableModel();
        categoryTable = new javax.swing.JTable();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        createButton = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        componentPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        categoryLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        categoryLabel.setText("Category");

        categoryTypeLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        categoryTypeLabel.setText("Category Type ");

        buttonGroup1.add(incomeRadioButton);
        incomeRadioButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        incomeRadioButton.setText("Income");

        buttonGroup1.add(expenseRadioButton);
        expenseRadioButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        expenseRadioButton.setText("Expense");

        categoryCreationDateLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        categoryComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Food", "Education", "Transportation", "Health", "Utility Bills", "Insurance", "Entertainment", "/Social", "Others" }));

        dateField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        dateField.setText("Choose Date");

        javax.swing.GroupLayout componentPanelLayout = new javax.swing.GroupLayout(componentPanel);
        componentPanel.setLayout(componentPanelLayout);
        componentPanelLayout.setHorizontalGroup(
            componentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, componentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(categoryCreationDateLabel)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(componentPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(componentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(componentPanelLayout.createSequentialGroup()
                        .addGroup(componentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(componentPanelLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(incomeRadioButton))
                            .addComponent(categoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(componentPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(dateField)))
                        .addGap(34, 34, 34)
                        .addGroup(componentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(expenseRadioButton)
                            .addComponent(categoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(categoryTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        componentPanelLayout.setVerticalGroup(
            componentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(componentPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(componentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(categoryTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(componentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(incomeRadioButton)
                    .addComponent(expenseRadioButton))
                .addGap(18, 18, 18)
                .addComponent(categoryCreationDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(componentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateField))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        categoryTable.setModel(categoryTableModel);
        jScrollPane1.setViewportView(categoryTable);

        updateButton.setBackground(new java.awt.Color(204, 204, 255));
        updateButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        updateButton.setText("Update");
        updateButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updateButton.setVerifyInputWhenFocusTarget(false);
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(204, 204, 255));
        deleteButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deleteButton.setVerifyInputWhenFocusTarget(false);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        clearButton.setBackground(new java.awt.Color(204, 204, 255));
        clearButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        clearButton.setText("Clear");
        clearButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clearButton.setVerifyInputWhenFocusTarget(false);
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        createButton.setBackground(new java.awt.Color(204, 204, 255));
        createButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        createButton.setText("Create");
        createButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        createButton.setVerifyInputWhenFocusTarget(false);
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(componentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(10, 44, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(createButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(242, 242, 242))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {deleteButton, updateButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(createButton)
                        .addGap(18, 18, 18)
                        .addComponent(updateButton, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteButton)
                        .addGap(28, 28, 28)
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(componentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(64, 64, 64))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        int selctedRow = categoryTable.getSelectedRow();
        if(selctedRow  >= 0){
            int selectedRow = categoryTable.getSelectedRow();
        if(selectedRow  >= 0){
            
            Category category = categoryTableModel.getCategory(selectedRow);
        category.setCategory((String) categoryComboBox.getSelectedItem());
        
        
        if(incomeRadioButton.isSelected()){
            category.setCategoryType("Income");
        }else if(expenseRadioButton.isSelected()){
            category.setCategoryType("Expense");
        
        
        
        }
        
        
        category.setCategoryDate(jDateChooser1.getDate());
        
        
        
        
        categoryTableModel.updateRow(selectedRow,category);
        }
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
       int  selectedRow = categoryTable.getSelectedRow();
       if(selectedRow>=0){
           categoryTableModel.deletRow(selectedRow);
           clear();
       }else{
           JOptionPane.showMessageDialog(this, "Please select a row first");
       }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        Category category = new Category();

        category.setId(UUID.randomUUID().toString());
        category.setCategory((String) categoryComboBox.getSelectedItem());
       category.setCategoryDate(jDateChooser1.getDate());
        

        if(incomeRadioButton.isSelected()){
            category.setCategoryType("Income");
        }else if(expenseRadioButton.isSelected()){
            category.setCategoryType("Expense");

        }

        categoryTableModel.addRow(category);
        clear();
        JOptionPane.showMessageDialog(this, " You have selected convenient categories for transaction!");
    }//GEN-LAST:event_createButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
             jDateChooser1.setDate(null);
             
    }//GEN-LAST:event_clearButtonActionPerformed
private void clear(){
    
    jDateChooser1.setDate(null);
     
 }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> categoryComboBox;
    private javax.swing.JLabel categoryCreationDateLabel;
    private javax.swing.JLabel categoryLabel;
    private javax.swing.JTable categoryTable;
    private javax.swing.JLabel categoryTypeLabel;
    private javax.swing.JButton clearButton;
    private javax.swing.JPanel componentPanel;
    private javax.swing.JButton createButton;
    private javax.swing.JLabel dateField;
    private javax.swing.JButton deleteButton;
    private javax.swing.JRadioButton expenseRadioButton;
    private javax.swing.JRadioButton incomeRadioButton;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
private CategoryTableModel categoryTableModel;

}
