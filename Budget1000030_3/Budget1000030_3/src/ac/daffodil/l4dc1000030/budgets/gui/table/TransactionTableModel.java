/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.daffodil.l4dc1000030.budgets.gui.table;

import ac.daffodil.l4dc1000030.budgets.beans.Transaction;
import ac.daffodil.l4dc1000030.budgets.manager.TransactionDataManager;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class TransactionTableModel extends AbstractTableModel {
    
    private ArrayList<Transaction> transactionList;
    
    private String[] columns = {"Amount","Account", "Category" , "Payee","ModeOfTransaction","NetFlowOfMoney", "Date"};
    
    private static final int INDEX_AMOUNT= 0;
     private static final int INDEX_ACCOUNT= 1;
    private static final int INDEX_CATEGORY = 2; 
    private static final int INDEX_PAYEE = 3;
     private static final int INDEX_MODE_OF_TRANSACTION=4;
     private static final int INDEX_NET_FLOW_OF_MONEY=5;
     private static final int INDEX_DATE = 6;
    
    
    public TransactionTableModel(){
            transactionList=TransactionDataManager.getUserTransactionList();
            if( transactionList==null){
             transactionList=new ArrayList<Transaction>();
        }
        }
    
    
   
    @Override
    public int getRowCount() {
        return  transactionList.size();
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
        Transaction transectionDetails =  transactionList.get(row);
        Object value = "";
        
        switch(column){
		case INDEX_AMOUNT:
			value = transectionDetails.getAmount();
		break;
		
		 case INDEX_ACCOUNT:
                    value = transectionDetails.getAccount();
                      break;
			
                 case INDEX_MODE_OF_TRANSACTION:
                     value = transectionDetails.getModeOfTransaction();
                     break;
                case INDEX_CATEGORY:
                    value = transectionDetails.getCategory();
                        break;
                    
                 case INDEX_NET_FLOW_OF_MONEY:
                     value = transectionDetails.getNetFlowOfMoney();
               break;
                      
                case INDEX_PAYEE:
                    value = transectionDetails.getPayee();
                      break;
                      
                case INDEX_DATE:
                    value = transectionDetails.getDate();
                      break;
        
    }
        
        return value;
      }
    
    public void addRow(Transaction transaction){
		transactionList.add(transaction);
		fireTableDataChanged(); //refresh table
                TransactionDataManager.add(transaction);
	}
    
    
    public void updateRow( int row, Transaction transaction){
            transactionList.set(row, transaction);
            fireTableDataChanged();
             TransactionDataManager.update(transaction);
        }
    
    public void deleteRow(int row){
        Transaction transaction = transactionList.get(row);
            transactionList.remove(row);
            fireTableDataChanged(); //refresh table
            TransactionDataManager.delete(transaction);
        }
     
     public Transaction getTransaction ( int row ){
            return transactionList.get(row);
  
     
     }
     

    


public double getTotal(){
double total =0;
    for(int i =0; i< transactionList.size();i++){
       Transaction transaction = transactionList.get(i);

if (transaction.getCategory().getCategoryType().equalsIgnoreCase("Income")){
total = total + transaction.getAmount();

}else if(transaction.getCategory().getCategoryType().equalsIgnoreCase("Expense")){
total = total -transaction.getAmount();
}


}
return total;
}

    

}