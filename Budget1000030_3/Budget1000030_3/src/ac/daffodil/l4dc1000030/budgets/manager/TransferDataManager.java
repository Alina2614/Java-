/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.daffodil.l4dc1000030.budgets.manager;

import ac.daffodil.l4dc1000030.budgets.beans.Transfer;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;




public class TransferDataManager {
    
    
     private static final String FILE_NAME = "data/transfer";
     
      public static void save(ArrayList<Transfer> transferList){
      try{
        FileOutputStream fos = new FileOutputStream(FILE_NAME);
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(transferList);
      oos.flush();
      oos.close();
      fos.close();
      }catch (IOException ioe) {
          System.err.println("Cannot save to file");
      }
    }
      
      
      
       public static ArrayList<Transfer> load(){
          ArrayList<Transfer> transferList = null;
           try{
               
               FileInputStream fis = new FileInputStream(FILE_NAME);
           
            ObjectInputStream ois = new ObjectInputStream(fis);
            transferList = (ArrayList<Transfer>) ois.readObject();
            ois.close();
            fis.close();
           } catch (IOException ioe){
               System.err.println("Cannot load from file.");
               
           } catch( ClassNotFoundException cnfe){
               System.err.println("Class not found.");
           }
            return transferList;
        
    } 
}
