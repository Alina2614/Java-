/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.daffodil.l4dc1000030.budgets.gui.table;

import ac.daffodil.l4dc1000030.budgets.beans.Transaction;
import ac.daffodil.l4dc1000030.budgets.beans.Schedule;
import ac.daffodil.l4dc1000030.budgets.manager.ScheduleDataManager;
import ac.daffodil.l4dc1000030.budgets.manager.TransactionDataManager;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class ScheduleTableModel extends AbstractTableModel {
    
    private ArrayList<Schedule> scheduleArrayList;
    
    private String[] columns = {"AccountName","Date", "Category" ,"Amount"};
 
    
     private static final int INDEX_ACCOUNT_NAME= 1;
     private static final int INDEX_DATE = 3;
     private static final int INDEX_CATEGORY = 2;
     private static final int INDEX_AMOUNT= 0;
    
     
     
    
    
    
    public ScheduleTableModel(){
            scheduleArrayList= ScheduleDataManager.load();
            if( scheduleArrayList==null){
             scheduleArrayList= new ArrayList<Schedule>();
        }
        }
    
    
   
    @Override
    public int getRowCount() {
        return scheduleArrayList.size();
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
        Schedule schedule =  scheduleArrayList.get(row);
        Object value = "";
        
        switch(column){
		case INDEX_AMOUNT:
			value = schedule.getAmount();
		break;
		
		 case INDEX_ACCOUNT_NAME:
                    value = schedule.getAccountName();
       
                      break;
			
                
                case INDEX_CATEGORY:
                    value = schedule.getCategory();
                        break;
                   
                 
                case INDEX_DATE:
                    value = schedule.getDate();
                      break;
        
    }
        
        return value;
      }
    
    public void addRow(Schedule schedule){
		scheduleArrayList.add(schedule);
		fireTableDataChanged(); //refresh table
                ScheduleDataManager.add(schedule);
	}
    
    
    public void updateRow( int row,Schedule schedule){
            scheduleArrayList.set(row, schedule);
            fireTableDataChanged();
              ScheduleDataManager.update(schedule);
        }
    
    public void deleteRow(int row){
        Schedule schedule = scheduleArrayList.get(row);
            scheduleArrayList.remove(row);
            fireTableDataChanged(); //refresh table
             ScheduleDataManager.delete(schedule);
        }
     
     public Schedule getSchedule ( int row ){
            return scheduleArrayList.get(row);
  
     
     }
     

    


public double getTotal(){
double total =0;
    for(int i =0; i< scheduleArrayList.size();i++){
       Schedule schedule = scheduleArrayList.get(i);

if (schedule.getCategory().getCategoryType().equalsIgnoreCase("Income")){
total = total + schedule.getAmount();

}else if(schedule.getCategory().getCategoryType().equalsIgnoreCase("Expense")){
total = total -schedule.getAmount();
}


}
return total;
}

    

}