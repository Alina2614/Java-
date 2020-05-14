/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.daffodil.l4dc1000030.budgets.gui.table;

import ac.daffodil.l4dc1000030.budgets.beans.Category;
import ac.daffodil.l4dc1000030.budgets.manager.CategoryDataManager;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class CategoryTableModel extends AbstractTableModel{
    
    private ArrayList<Category> categoryList;
    private String[] columns = {"Category Name", "Type", "Creation Date"};
 
    private static final int INDEX_CATEGORYNAME = 0;
 private static final int INDEX_CATEGORYTYPE = 1;
 private static final int INDEX_CATEGORYCREATIONDATE = 2;

   
 
 public CategoryTableModel() {
       categoryList  = CategoryDataManager.load();
        
        if(categoryList == null){
            categoryList = new ArrayList<Category>();
        }
        
       
    }

    @Override
    public int getRowCount() {
       return categoryList.size();
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
      
         Category category = categoryList.get(row);
		Object value = "";
                switch ( column){
		case INDEX_CATEGORYNAME:
			value = category.getCategory();
		break;
		case INDEX_CATEGORYTYPE:
			value = category.getCategoryType();
		break;
		case INDEX_CATEGORYCREATIONDATE:
			value = category.getCategoryDate();
		break;
                
		}
		return value;
    }
    
    public void addRow(Category category){
		categoryList.add(category);
		fireTableDataChanged();
                CategoryDataManager.save(categoryList);
	}
    
    public void deletRow(int row){
            categoryList.remove(row);
            fireTableDataChanged();
            CategoryDataManager.save(categoryList);
        }
    
    public Category getCategory(int row){
            return categoryList.get(row);
           
        }
    
    public void updateRow(int row, Category category){
            categoryList.set(row,category);
            fireTableDataChanged();
            CategoryDataManager.save(categoryList);
        }
    
    
}
