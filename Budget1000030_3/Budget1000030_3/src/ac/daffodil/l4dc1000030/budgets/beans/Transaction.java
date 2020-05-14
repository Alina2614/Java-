/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.daffodil.l4dc1000030.budgets.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;


public class Transaction implements Serializable{
    private String id;
    private double  amount;
    private Accounts account;
    private Category category;
    private String payee;
    private Date date;
    private String modeOfTransaction;
    private String netFlowOfMoney;
    
    
    
    public Transaction(){
        
    }
    
    public Transaction(int amount, Accounts account,  Category category, String payee, Date date,String modeOfTransaction, String netFlowOfMoney ){
        
        setAmount(amount);
        setAccount(account);
        setCategory(category);
        setPayee(payee);
        setDate(date);
        setModeOfTransaction(modeOfTransaction);
        setNetFlowOfMoney(netFlowOfMoney);
        
    }

    public Accounts getAccount() {
        return account;
    }

    public void setAccount(Accounts account) {
        this.account = account;
    }
    
    

    public String getModeOfTransaction() {
        return modeOfTransaction;
    }

    public void setModeOfTransaction(String modeOfTransaction) {
        this.modeOfTransaction = modeOfTransaction;
    }

    public String getNetFlowOfMoney() {
        return netFlowOfMoney;
    }

    public void setNetFlowOfMoney(String netFlowOfMoney) {
        this.netFlowOfMoney = netFlowOfMoney;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    

    

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getPayee() {
        return payee;
    }

    public void setPayee(String payee) {
        this.payee = payee;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.id);
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
        final Transaction other = (Transaction) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
}
