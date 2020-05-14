/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.daffodil.l4dc1000030.budgets.gui.table;

import ac.daffodil.l4dc1000030.budgets.beans.User;
import ac.daffodil.l4dc1000030.budgets.manager.UserDataManager;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;


public class UserTableModel extends AbstractTableModel {

    private ArrayList<User> userList;

    private String[] columns = {"Username","User No", "User ID ","E-Mail ID", "Cell Phone",
        "Date of Birth","NID/Birth Certificate No","Gender"};
    

    //private Integer[] column = {"UserID"};
    
    private static final int INDEX_USERNAME = 0;
    
    private static final int INDEX_USERNO = 1;

    private static final int INDEX_USERID = 2;

    private static final int INDEX_EMAILID = 3;

    private static final int INDEX_CELLPHONE = 4;

    private static final int INDEX_Date_OF_BIRTH = 5;

    private static final int INDEX_NID_BIRTH_CERTIFICATE_No = 6;

    private static final int INDEX_Gender = 7;

    public UserTableModel(){
        userList = UserDataManager.load();
        
        if(userList == null){
            userList = new ArrayList<User>();
        }
    }

    @Override
    public int getRowCount() {
        return userList.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }

    @Override
    public Object getValueAt(int row, int column) {
        User user = userList.get(row);
        Object value = "";
        switch (column) {
            
            case INDEX_USERNAME:
                value = user.getUserName();
                break;
                
                case INDEX_USERNO:
                value = user.getUserNo();
                break;
                
                case INDEX_USERID:
                value = user.getId();
                break;
                case INDEX_EMAILID:
                value = user.getMailID();
                break;
                case INDEX_CELLPHONE:
                value = user.getCellPhone();
                break;
                case INDEX_Date_OF_BIRTH:
                value = user.getDateOfBirth();
                break;
                case INDEX_NID_BIRTH_CERTIFICATE_No:
                value = user.getnID_BirthCertificateNo();
                break;
                case INDEX_Gender:
                value = user.getGender();
                break;

        }
        return value;
    }

    public void addRow(User user){
		userList.add(user);
		fireTableDataChanged();
                UserDataManager.save(userList);
	}
    
    public void deletRow(int row){
            userList.remove(row);
            fireTableDataChanged();
            UserDataManager.save(userList);
        }
    
    public User getUser(int row){
            return userList.get(row);
           
        }
    
    public void updateRow(int row, User user){
            userList.set(row,user);
            fireTableDataChanged();
            UserDataManager.save(userList);
        }
    
}
