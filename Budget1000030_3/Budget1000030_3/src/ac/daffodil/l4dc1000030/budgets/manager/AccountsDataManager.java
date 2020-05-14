/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.daffodil.l4dc1000030.budgets.manager;


import ac.daffodil.l4dc1000030.budgets.beans.Accounts;
import ac.daffodil.l4dc1000030.budgets.beans.User;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class AccountsDataManager {
     private static final String FILE_NAME = "data/accounts";
     public static void save(ArrayList<Accounts> accList){
      try{
        FileOutputStream fos = new FileOutputStream(FILE_NAME);
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(accList);
      oos.flush();
      oos.close();
      fos.close();
      }catch (IOException ioe) {
          System.err.println("Cannot save to file");
      }
     }
     
     public static ArrayList<Accounts> load(){
          ArrayList<Accounts> accList = null;
           try{
               
               FileInputStream fis = new FileInputStream(FILE_NAME);
           
            ObjectInputStream ois = new ObjectInputStream(fis);
            accList = (ArrayList<Accounts>) ois.readObject();
            ois.close();
            fis.close();
           } catch (IOException ioe){
               System.err.println("Cannot load from file.");
               
           } catch( ClassNotFoundException cnfe){
               System.err.println("Class not found.");
           }
            return accList;
        
    }
     
     
     public static ArrayList<Accounts> getUserAccountList() {
        ArrayList<Accounts> userAccountList = new ArrayList<Accounts>();
        User user = LoggedInUser.getInstance().getUser();
        if (user != null) {
            ArrayList<Accounts> allAccountList = load();
            if (allAccountList != null) {
                for (int i = 0; i < allAccountList.size(); i++) {
                    Accounts account = allAccountList.get(i);
                    if (account.getUser().equals(user)) {
                        userAccountList.add(account);
                    } else if (UserAccountDataManager.isAccessAllowed(account)) {
                        userAccountList.add(account);
                    }
                }
            }
        }
        
        return userAccountList;
     }
     
     
     
     
     
}






