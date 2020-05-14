/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.daffodil.l4dc1000030.budgets.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;


public class Category implements Serializable {
   private String id;
    private String Category;
    private String CategoryType;
    private Date CategoryDate;
    //private String CreatedBy;
    
    public Category(){
        
    }

    public Category(String Category, String CategoryType, Date CategoryDate, String CreatedBy) {
        setCategory(Category);
        setCategoryType(CategoryType);
        setCategoryDate(CategoryDate);
        //setCreatedBy(CreatedBy);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    
    
    
    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public String getCategoryType() {
        return CategoryType;
    }

    public void setCategoryType(String CategoryType) {
        this.CategoryType = CategoryType;
    }

    public Date getCategoryDate() {
        return CategoryDate;
    }

    public void setCategoryDate(Date CategoryDate) {
        this.CategoryDate = CategoryDate;
    }

    /*public String getCreatedBy() {
        return CreatedBy;
    }

    public void setCreatedBy(String CreatedBy) {
        this.CreatedBy = CreatedBy;
    }*/
public String toString(){
		return Category;
	}
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Category other = (Category) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
         
   
    
    
}
