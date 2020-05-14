/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.daffodil.l4dc1000030.budgets.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;


public class Accounts implements Serializable {
    
     private String id;
     private String title;
     private String reference;
     //private String accType;
     private User user;
     
     private String   iniAmount;
     private Date accountDate;
    

public Accounts (){

}

    public Accounts( String Title,  User user,  Date accountDate , String iniAmount) {
        
        setTitle(title);
        //setAccType(accType);
        setUser(user);
        setAccountDate(accountDate);
        setIniAmount(iniAmount);
    }

    public String getIniAmount() {
        return iniAmount;
    }

    public void setIniAmount(String iniAmount) {
        this.iniAmount = iniAmount;
    }

    



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String Title) {
        this.title = Title;
    }

    /*public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }*/

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

   

    public Date getAccountDate() {
        return accountDate;
    }

    public void setAccountDate(Date accountDate) {
        this.accountDate = accountDate;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
    public String toString(){
		return title;
	}

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.id);
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
        final Accounts other = (Accounts) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }



}

