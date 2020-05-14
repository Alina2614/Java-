/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.daffodil.l4dc1000030.budgets.beans;

import java.io.Serializable;
import java.util.Objects;



public class User implements Serializable {
    
    private String userName;
    private String password;
    private String confirmPassword;
    private String id;
    private String dateOfBirth;
    private String nID_BirthCertificateNo;
    private String cellPhone;
    private String mailID;
    private String gender;
    private int userNo;
    private String passwordHint;
    public User(){
        
    }

    public User(String userName, String password, String confirmPassword, String userID, String dateOfBirth, 
            String nID_BirthCertificateNo, String cellPhone, String mailID, String gender, int userNo,String passwordHint) {
        
        setUserName(userName);
        setPassword(password);
        setConfirmPassword(confirmPassword);
        setId(userID);
        setDateOfBirth(dateOfBirth);
        setnID_BirthCertificateNo(nID_BirthCertificateNo);
        setCellPhone(cellPhone);
        setMailID(mailID);
        setGender(gender);
        setUserNo(userNo);
        setPasswordHint(passwordHint);
    }
    

    


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getnID_BirthCertificateNo() {
        return nID_BirthCertificateNo;
    }

    public void setnID_BirthCertificateNo(String nID_BirthCertificateNo) {
        this.nID_BirthCertificateNo = nID_BirthCertificateNo;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getMailID() {
        return mailID;
    }

    public void setMailID(String mailID) {
        this.mailID = mailID;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getUserNo() {
        return userNo;
    }

    public void setUserNo(int userNo) {
        this.userNo = userNo;
    }

    public String getPasswordHint() {
        return passwordHint;
    }

    public void setPasswordHint(String passwordHint) {
        this.passwordHint = passwordHint;
    }
    
    public String toString(){
		return userName;
	}

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.id);
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
        final User other = (User) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    

    
    
}
            

    
   
