/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.daffodil.l4dc1000030.budgets.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;


public class Schedule implements Serializable{
    
    private  String id;
     private Accounts accountName;
     private Date date;
     private Category category;
     private double amount;
    
    
    public Schedule(){
        
    }
    
    public Schedule(Accounts accountName, Date date, Category category,  double amount  ){
        
        setAmount(amount);
        setAccountName(accountName);
        setCategory(category);
        setDate(date);
        
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    

    public Accounts getAccountName() {
        return accountName;
    }

    public void setAccountName(Accounts accountName) {
        this.accountName = accountName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}