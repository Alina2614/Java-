/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.daffodil.l4dc1000030.budgets.gui;

import ac.daffodil.l4dc1000030.budgets.beans.User;
import ac.daffodil.l4dc1000030.budgets.gui.table.UserTableModel;
import java.util.UUID;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class UserUI extends javax.swing.JInternalFrame {

    /**
     * Creates new form UserUI
     */
    public UserUI() {
        initComponents();

        userTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent lse) {

                int selectedRow = userTable.getSelectedRow();
                if (selectedRow >= 0) {
                    User user = userTableModel.getUser(selectedRow);
                    if (user != null) {
                       userNoField.setText(String.valueOf(user.getUserNo()));
                        usernameField.setText(user.getUserName());
                        nID_BirthCrtificateNoField.setText(user.getnID_BirthCertificateNo());
                        cellPhoneField.setText(user.getCellPhone());
                        passwordField.setText(user.getPassword());
                        confirmPasswordField.setText(user.getConfirmPassword());
                        mailIDField.setText(user.getMailID());
                        dateOfBirthField.setText(user.getDateOfBirth());

                        if (user.getGender().equals("Male")) {
                            maleRadioButton.setSelected(true);
                        } else {
                            femaleRadioButton.setSelected(false);
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        userInfoIPanel = new javax.swing.JPanel();
        genderLabel = new javax.swing.JLabel();
        maleRadioButton = new javax.swing.JRadioButton();
        femaleRadioButton = new javax.swing.JRadioButton();
        userNoLabel = new javax.swing.JLabel();
        userNoField = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        passwordLabel = new javax.swing.JLabel();
        passwordHintLabel = new javax.swing.JLabel();
        paswordHintField = new javax.swing.JTextField();
        confirmPasswordLabel = new javax.swing.JLabel();
        confirmPasswordField = new javax.swing.JTextField();
        dateOfBirthLabel = new javax.swing.JLabel();
        dateOfBirthField = new javax.swing.JTextField();
        nID_BirtCertificateNoLabel = new javax.swing.JLabel();
        nID_BirthCrtificateNoField = new javax.swing.JTextField();
        cellPhoneLabel = new javax.swing.JLabel();
        cellPhoneField = new javax.swing.JTextField();
        mailIDField = new javax.swing.JTextField();
        mailIDLabel = new javax.swing.JLabel();
        createButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        userTableModel = new UserTableModel();
        userTable = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        userInfoIPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        genderLabel.setText("Gender");

        buttonGroup1.add(maleRadioButton);
        maleRadioButton.setText("Male");

        buttonGroup1.add(femaleRadioButton);
        femaleRadioButton.setText("Female");
        femaleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleRadioButtonActionPerformed(evt);
            }
        });

        userNoLabel.setText("User No");

        userNoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNoFieldActionPerformed(evt);
            }
        });

        usernameLabel.setText("UserName");

        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });

        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        passwordLabel.setText("Password");

        passwordHintLabel.setText("Password Hint");

        confirmPasswordLabel.setText("Confirm Password");

        confirmPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmPasswordFieldActionPerformed(evt);
            }
        });

        dateOfBirthLabel.setText("Date Of Birth");

        nID_BirtCertificateNoLabel.setText("NID/Birth Certifiate No");

        cellPhoneLabel.setText("Cell Phone");

        cellPhoneField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellPhoneFieldActionPerformed(evt);
            }
        });

        mailIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailIDFieldActionPerformed(evt);
            }
        });

        mailIDLabel.setText("E-Mail ID");

        createButton.setText("Create");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        updateButton.setText("Modify");
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

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout userInfoIPanelLayout = new javax.swing.GroupLayout(userInfoIPanel);
        userInfoIPanel.setLayout(userInfoIPanelLayout);
        userInfoIPanelLayout.setHorizontalGroup(
            userInfoIPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userInfoIPanelLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(userNoLabel)
                .addGap(459, 459, 459))
            .addGroup(userInfoIPanelLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(userInfoIPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userInfoIPanelLayout.createSequentialGroup()
                        .addGroup(userInfoIPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(userInfoIPanelLayout.createSequentialGroup()
                                .addGroup(userInfoIPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dateOfBirthLabel)
                                    .addComponent(mailIDLabel)
                                    .addComponent(nID_BirtCertificateNoLabel)
                                    .addComponent(cellPhoneLabel))
                                .addGap(35, 35, 35)
                                .addGroup(userInfoIPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dateOfBirthField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(userInfoIPanelLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(userInfoIPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(mailIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cellPhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nID_BirthCrtificateNoField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(userInfoIPanelLayout.createSequentialGroup()
                                .addComponent(maleRadioButton)
                                .addGap(42, 42, 42)
                                .addComponent(femaleRadioButton)))
                        .addContainerGap(157, Short.MAX_VALUE))
                    .addGroup(userInfoIPanelLayout.createSequentialGroup()
                        .addGroup(userInfoIPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(genderLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, userInfoIPanelLayout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(confirmPasswordLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, userInfoIPanelLayout.createSequentialGroup()
                                .addComponent(passwordHintLabel)
                                .addGap(75, 75, 75)
                                .addComponent(paswordHintField, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, userInfoIPanelLayout.createSequentialGroup()
                                .addGroup(userInfoIPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                    .addComponent(passwordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(70, 70, 70)
                                .addGroup(userInfoIPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(userNoField, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(usernameField, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                    .addComponent(passwordField))
                                .addGap(34, 34, 34)
                                .addGroup(userInfoIPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(updateButton)
                                    .addComponent(createButton)
                                    .addComponent(clearButton)
                                    .addComponent(deleteButton)
                                    .addComponent(exitButton))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        userInfoIPanelLayout.setVerticalGroup(
            userInfoIPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userInfoIPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(userInfoIPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNoLabel))
                .addGap(45, 45, 45)
                .addGroup(userInfoIPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(userInfoIPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userInfoIPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(createButton))
                    .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(userInfoIPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userInfoIPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(userInfoIPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(paswordHintField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordHintLabel))
                        .addGap(26, 26, 26)
                        .addGroup(userInfoIPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(confirmPasswordLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(27, 27, 27)
                        .addGroup(userInfoIPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateOfBirthField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateOfBirthLabel)))
                    .addGroup(userInfoIPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(updateButton)
                        .addGap(18, 18, 18)
                        .addComponent(clearButton)))
                .addGap(18, 18, 18)
                .addGroup(userInfoIPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(genderLabel)
                    .addComponent(deleteButton))
                .addGap(18, 18, 18)
                .addGroup(userInfoIPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(femaleRadioButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(maleRadioButton))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(userInfoIPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nID_BirthCrtificateNoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nID_BirtCertificateNoLabel))
                .addGap(18, 18, 18)
                .addGroup(userInfoIPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(userInfoIPanelLayout.createSequentialGroup()
                        .addComponent(exitButton)
                        .addContainerGap())
                    .addGroup(userInfoIPanelLayout.createSequentialGroup()
                        .addGroup(userInfoIPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cellPhoneLabel)
                            .addComponent(cellPhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(userInfoIPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mailIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mailIDLabel))
                        .addGap(28, 28, 28))))
        );

        userTable.setModel(userTableModel);
        jScrollPane2.setViewportView(userTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(userInfoIPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(userInfoIPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        clear();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int selectedRow = userTable.getSelectedRow();
        if (selectedRow >= 0) {
            userTableModel.deletRow(selectedRow);
            clear();
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row first");
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        int selctedRow = userTable.getSelectedRow();
        if (selctedRow >= 0) {

            User user = new User();
            user.setUserNo(Integer.parseInt(userNoField.getText()));
            user.setUserName(usernameField.getText());
            user.setCellPhone(cellPhoneField.getText());
            user.setDateOfBirth(dateOfBirthField.getText());
            user.setPassword(passwordField.getText());
            user.setConfirmPassword(confirmPasswordField.getText());
            user.setMailID(mailIDField.getText());
            user.setnID_BirthCertificateNo(nID_BirthCrtificateNoField.getText());
            if (maleRadioButton.isSelected()) {
                user.setGender("Male");
            } else if (femaleRadioButton.isSelected()) {
                user.setGender("Female");

            }
            userTableModel.updateRow(selctedRow, user);
            clear();
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row first. ");
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        User user = new User();
      
        user.setId(UUID.randomUUID().toString());
        if(usernameField.getText().isEmpty()){
         JOptionPane.showMessageDialog(this, "Sorry!User name can not be empty.");
        }else if(isNumeric(usernameField.getText())){
        JOptionPane.showMessageDialog(this, "User Name can not contain symbols and numbers!");
        
        }
        if(passwordField.getText().isEmpty()){
         JOptionPane.showMessageDialog(this, "Sorry!Password field can not be empty.");
        }else if(isNumeric(passwordField.getText())){
        JOptionPane.showMessageDialog(this, "Password field can not contain symbols and numbers!");
        
        }
        if(confirmPasswordField.getText().isEmpty()){
         JOptionPane.showMessageDialog(this, "Sorry!Password field can not be empty.");
        }else if(isNumeric(passwordField.getText())){
        JOptionPane.showMessageDialog(this, " Password field can not contain symbols and numbers!");
        
        }
        
        
        user.setUserNo(Integer.parseInt(userNoField.getText()));
        user.setUserName(usernameField.getText());
        user.setCellPhone(cellPhoneField.getText());
        user.setDateOfBirth(dateOfBirthField.getText());
        user.setPassword(passwordField.getText());
        user.setConfirmPassword(confirmPasswordField.getText());
        user.setMailID(mailIDField.getText());
        user.setnID_BirthCertificateNo(nID_BirthCrtificateNoField.getText());

        if (maleRadioButton.isSelected()) {
            user.setGender("Male");
        } else if (femaleRadioButton.isSelected()) {
            user.setGender("Female");

        }

        userTableModel.addRow(user);
        clear();
        JOptionPane.showMessageDialog(this, "You have successfully created your account!");
    }//GEN-LAST:event_createButtonActionPerformed

    private void mailIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailIDFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mailIDFieldActionPerformed

    private void cellPhoneFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellPhoneFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cellPhoneFieldActionPerformed

    private void confirmPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmPasswordFieldActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldActionPerformed

    private void userNoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNoFieldActionPerformed

    private void femaleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleRadioButtonActionPerformed

    }//GEN-LAST:event_femaleRadioButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);      // TODO add your handling code here:
    }//GEN-LAST:event_exitButtonActionPerformed
    private void clear() {

        usernameField.setText("");
        nID_BirthCrtificateNoField.setText("");

        cellPhoneField.setText("");
        passwordField.setText("");
        confirmPasswordField.setText("");
        mailIDField.setText("");
        dateOfBirthField.setText("");
        userNoField.setText("");
        paswordHintField.setText("");
    }
    public static boolean isNumeric(String str){
        return str.matches("-!@#$%^&*+<>/()");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JTextField cellPhoneField;
    private javax.swing.JLabel cellPhoneLabel;
    private javax.swing.JButton clearButton;
    private javax.swing.JTextField confirmPasswordField;
    private javax.swing.JLabel confirmPasswordLabel;
    private javax.swing.JButton createButton;
    private javax.swing.JTextField dateOfBirthField;
    private javax.swing.JLabel dateOfBirthLabel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JRadioButton femaleRadioButton;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField mailIDField;
    private javax.swing.JLabel mailIDLabel;
    private javax.swing.JRadioButton maleRadioButton;
    private javax.swing.JLabel nID_BirtCertificateNoLabel;
    private javax.swing.JTextField nID_BirthCrtificateNoField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordHintLabel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField paswordHintField;
    private javax.swing.JButton updateButton;
    private javax.swing.JPanel userInfoIPanel;
    private javax.swing.JTextField userNoField;
    private javax.swing.JLabel userNoLabel;
    private javax.swing.JTable userTable;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
   private UserTableModel userTableModel;

}