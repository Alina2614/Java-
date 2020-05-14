/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.daffodil.l4dc1000030.budgets.gui.table;

import ac.daffodil.l4dc1000030.budgets.beans.UserAccount;
import ac.daffodil.l4dc1000030.budgets.manager.UserAccountDataManager;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class UserAccountDetailsTableModel extends AbstractTableModel {

    private ArrayList<UserAccount> accountuserList;

    private String[] columns = {"Account Title", " User "};

    private static final int INDEX_ACCOUNT_TITLE = 0;
    private static final int INDEX_ACCOUNT_USER = 1;

    public UserAccountDetailsTableModel() {
        accountuserList = UserAccountDataManager.load();

        if (accountuserList == null) {
            accountuserList = new ArrayList<UserAccount>();
        }

    }

    @Override
    public int getRowCount() {
        return accountuserList.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    public String getColumnName(int column) {
        return columns[column];
    }

    @Override
    public Object getValueAt(int row, int column) {
        UserAccount accuser = accountuserList.get(row);
        Object value = "";
        switch (column) {
            case INDEX_ACCOUNT_TITLE:
                value = accuser.getAccount();
                break;
            case INDEX_ACCOUNT_USER:
                value = accuser.getUser();
                break;

        }
        return value;
    }

    public void addRow(UserAccount accuser) {
        accountuserList.add(accuser);
        fireTableDataChanged();
        UserAccountDataManager.save(accountuserList);
    }

    public void deleteRow(int row) {
        accountuserList.remove(row);
        fireTableDataChanged();
        UserAccountDataManager.save(accountuserList);
    }

    public UserAccount getAccountsUser(int row) {
        return accountuserList.get(row);

    }

    public void updateRow(int row, UserAccount accuser) {
        accountuserList.set(row, accuser);
        fireTableDataChanged();
        UserAccountDataManager.save(accountuserList);
    }

}
