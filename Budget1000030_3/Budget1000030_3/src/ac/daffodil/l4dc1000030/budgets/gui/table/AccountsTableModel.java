/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.daffodil.l4dc1000030.budgets.gui.table;

import ac.daffodil.l4dc1000030.budgets.beans.Accounts;
import ac.daffodil.l4dc1000030.budgets.manager.AccountsDataManager;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class AccountsTableModel extends AbstractTableModel{

    private ArrayList<Accounts> accList;
 
 private String[] columns = {"Account Title",  " User ", "Openning Date", "Initial Amount" };
 
 private static final int INDEX_TITLE = 0;
// private static final int INDEX_TYPE = 1;
 private static final int INDEX_USER = 1;
 
 private static final int INDEX_INITIAL_AMOUNT =  3;
 private static final int INDEX_OPENNING_DATE = 2;
 

    public AccountsTableModel() {
       accList  = AccountsDataManager.load();
        
        if(accList == null){
            accList = new ArrayList<Accounts>();
        }
        
       
    }
    
    @Override
    public int getRowCount() {
         return accList.size(); 
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
        Accounts accounts = accList.get(row);
		Object value = "";
		switch(column){
		case INDEX_TITLE:
			value = accounts.getTitle();
		break;
		/*case INDEX_TYPE:
			value = accounts.getAccType();
		break;*/
		case INDEX_USER:
			value = accounts.getUser();
		break;
                case INDEX_INITIAL_AMOUNT:
			value = accounts.getIniAmount();
		break;
                case INDEX_OPENNING_DATE:
			value = accounts.getAccountDate();
		break;
		}
		return value;
    }
    
    public void addRow(Accounts accounts){
		accList.add(accounts);
		fireTableDataChanged();
                AccountsDataManager.save(accList);
	}
    
    public void deletRow(int row){
            accList.remove(row);
            fireTableDataChanged();
            AccountsDataManager.save(accList);
        }
    
    public Accounts getAccounts(int row){
            return accList.get(row);
           
        }
    
    public void updateRow(int row, Accounts accounts){
            accList.set(row,accounts);
            fireTableDataChanged();
            AccountsDataManager.save(accList);
        }
    
}
