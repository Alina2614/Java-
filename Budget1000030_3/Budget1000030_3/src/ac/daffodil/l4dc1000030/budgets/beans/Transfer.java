/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.daffodil.l4dc1000030.budgets.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;


public class Transfer implements Serializable{
    
    private String id;
    private Accounts fromAccount;  /// account class name
    private Accounts toAccount;
    private Date transferDate;
    private double amount;
    
    
    public  Transfer(){
        
    }
    
    public  Transfer(String id, Accounts fromAccount, Accounts toAccount,Date transferDate,double amount){
        
        setId(id);
        setFromAccount(fromAccount);
        setToAccount(toAccount);
        setTransferDate(transferDate);
        setAmount(amount);
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Accounts getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(Accounts fromAccount) {
        this.fromAccount = fromAccount;
    }

    public Accounts getToAccount() {
        return toAccount;
    }

    public void setToAccount(Accounts toAccount) {
        this.toAccount = toAccount;
    }

    public Date getTransferDate() {
        return transferDate;
    }

    public void setTransferDate(Date transferDate) {
        this.transferDate = transferDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.id);
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
        final Transfer other = (Transfer) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
}
