
package ac.daffodil.l4dc1000030.budgets.manager;

import ac.daffodil.l4dc1000030.budgets.beans.Accounts;
import ac.daffodil.l4dc1000030.budgets.beans.UserAccount;
import ac.daffodil.l4dc1000030.budgets.beans.User;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class UserAccountDataManager {
    private static final String FILE_NAME = "data/accuser";
     public static void save(ArrayList<UserAccount> accountuserList){
      try{
        FileOutputStream fos = new FileOutputStream(FILE_NAME);
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(accountuserList);
      oos.flush();
      oos.close();
      fos.close();
      }catch (IOException ioe) {
          System.err.println("Cannot save to file");
      }
     }
     
     public static ArrayList<UserAccount> load(){
          ArrayList<UserAccount> accountuserList = null;
           try{
               
               FileInputStream fis = new FileInputStream(FILE_NAME);
           
            ObjectInputStream ois = new ObjectInputStream(fis);
           accountuserList = (ArrayList<UserAccount>) ois.readObject();
            ois.close();
            fis.close();
           } catch (IOException ioe){
               System.err.println("Cannot load from file.");
               
           } catch( ClassNotFoundException cnfe){
               System.err.println("Class not found.");
           }
            return accountuserList;
        
    }
     
     public static boolean isAccessAllowed(Accounts account) {
        boolean allowed = false;
        User user = LoggedInUser.getInstance().getUser();
        if (user != null) {
            ArrayList<UserAccount> accountuserList = load();
            if (accountuserList != null) {
                for (int i = 0; i < accountuserList.size(); i++) {
                    UserAccount userAccount = accountuserList.get(i);
                    if (userAccount.getUser().equals(user) && userAccount.getAccount().equals(account)) {
                        allowed = true;
                        break;
                    }
                }
            }
        }

        return allowed;
    }
    

}
