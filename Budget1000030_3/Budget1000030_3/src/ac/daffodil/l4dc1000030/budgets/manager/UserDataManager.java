
package ac.daffodil.l4dc1000030.budgets.manager;


import ac.daffodil.l4dc1000030.budgets.beans.User;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class UserDataManager {
    
    private static final String FILE_NAME = "data/users";
    
    public static void save(ArrayList<User> userList){
        try{
        FileOutputStream fos = new FileOutputStream(FILE_NAME);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(userList);
        oos.flush();
        oos.close();
        fos.close();
        }catch(IOException ioe){
            System.err.println("can not save to file");
        }
        
        
    }
    public static ArrayList<User> load(){
        ArrayList<User> userList = null;
        try{
     FileInputStream fis = new FileInputStream(FILE_NAME);
     ObjectInputStream ois = new ObjectInputStream(fis);
     userList = (ArrayList<User>) ois.readObject();
     ois.close();
     fis.close();
        }catch(IOException ioe){
            System.err.println("can not load from file");
        }catch(ClassNotFoundException cnfe){
            System.err.println("lass not found");
        }
        return userList;
        
          
     }
    public  static User getUser(String username, String password){
        ArrayList<User> userList =load();
        if(userList != null && userList.size()>0){
            for(int i=0; i<userList.size();i++){
                User user = userList.get(i);
                if(user.getUserName().equals(username) && user.getPassword().equals(password)){
                return user;
            }
        }
    } else {
    if(username.equalsIgnoreCase("admin") && password.equals("secret")){
        User user = new User();
        user.setUserName("admin");
        
        return user;
    }
}
    return null;
    }


}