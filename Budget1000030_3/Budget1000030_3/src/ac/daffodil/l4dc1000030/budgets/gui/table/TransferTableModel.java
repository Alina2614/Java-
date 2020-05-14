/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.daffodil.l4dc1000030.budgets.gui.table;


import ac.daffodil.l4dc1000030.budgets.beans.Transfer;
import ac.daffodil.l4dc1000030.budgets.manager.TransferDataManager;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class TransferTableModel extends AbstractTableModel{
    private ArrayList<Transfer> transferList;
     private String[] columns = {"From", "To", "Tranfer Date","Amount"};
     
     
    private static final int INDEX_FROM = 0;
    private static final int INDEX_TO = 1;
    private static final int INDEX_TRANSFER_DATE = 2;
    private static final int INDEX_AMOUNT = 3;
    
    public TransferTableModel(){
        transferList=TransferDataManager.load();
            if(transferList==null){
            transferList=new ArrayList<Transfer>();
    }
    }     

    
    
   

    @Override
    public int getRowCount() {
        return transferList.size();
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
        Transfer transfer = transferList.get(row);
        Object value = "";
        
        switch(column){
		case INDEX_FROM:
			value = transfer.getFromAccount();  // change from transfer class 
		break;
		
		
                case INDEX_TO:
                    value = transfer.getToAccount();
                        break;
                
                case INDEX_TRANSFER_DATE:
                    value = transfer.getTransferDate();
                        break;
                
                case INDEX_AMOUNT:
                    value = transfer.getAmount();
                      break;
        }
        return value;
     }
    
     public void addRow(Transfer transferDetails){
		transferList.add(transferDetails);
		fireTableDataChanged(); //refresh table
                TransferDataManager.save(transferList);
	}
    
    
     public void updateRow( int row, Transfer transferDetails){
            transferList.set(row, transferDetails);
            fireTableDataChanged();
             TransferDataManager.save(transferList);
        }
     
     
      public void deleteRow(int row){
            transferList.remove(row);
            fireTableDataChanged(); //refresh table
            TransferDataManager.save(transferList);
        }
      
       public Transfer getTransferDetails ( int row ){
            return transferList.get(row);
        }
    
}
