/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.daffodil.l4dc1000030.budgets.manager;



import ac.daffodil.l4dc1000030.budgets.beans.Category;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class CategoryDataManager {
     private static final String FILE_NAME = "data/category";
     public static void save(ArrayList<Category> categoryList){
      try{
        FileOutputStream fos = new FileOutputStream(FILE_NAME);
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(categoryList);
      oos.flush();
      oos.close();
      fos.close();
      }catch (IOException ioe) {
          System.err.println("Cannot save to file");
      }
}
     
     public static ArrayList<Category> load(){
          ArrayList<Category> categoryList = null;
           try{
               
               FileInputStream fis = new FileInputStream(FILE_NAME);
           
            ObjectInputStream ois = new ObjectInputStream(fis);
            categoryList = (ArrayList<Category>) ois.readObject();
            ois.close();
            fis.close();
           } catch (IOException ioe){
               System.err.println("Cannot load from file.");
               
           } catch( ClassNotFoundException cnfe){
               System.err.println("Class not found.");
           }
            return categoryList;
        
    }
}
