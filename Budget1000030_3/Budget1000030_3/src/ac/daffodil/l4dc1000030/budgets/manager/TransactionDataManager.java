
package ac.daffodil.l4dc1000030.budgets.manager;


import ac.daffodil.l4dc1000030.budgets.beans.Accounts;
import ac.daffodil.l4dc1000030.budgets.beans.Transaction;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class TransactionDataManager {
    private static final String FILE_NAME = "data/transection";
     
      public static void save(ArrayList<Transaction>  transactionList){
      try{
        FileOutputStream fos = new FileOutputStream(FILE_NAME);
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject( transactionList);
      oos.flush();
      oos.close();
      fos.close();
      }catch (IOException ioe) {
          System.err.println("Cannot save to file");
    }
      }
      
      
       public static ArrayList<Transaction> load(){
          ArrayList<Transaction>  transactionList = null;
           try{
               
               FileInputStream fis = new FileInputStream(FILE_NAME);
           
            ObjectInputStream ois = new ObjectInputStream(fis);
             transactionList = (ArrayList<Transaction>) ois.readObject();
            ois.close();
            fis.close();
           } catch (IOException ioe){
               System.err.println("Cannot load from file.");
               
           } catch( ClassNotFoundException cnfe){
               System.err.println("Class not found.");
           }
            return  transactionList;
        
    }
       
           private static ArrayList<Transaction> getTransactionList() {
        ArrayList<Transaction> transactionList = load();
        if (transactionList == null) {
            transactionList = new ArrayList<Transaction>();
        }

        return transactionList;
    }

    public static void add(Transaction transaction) {
        if (transaction != null) {
            ArrayList<Transaction> transactionList = getTransactionList();
            transactionList.add(transaction);
            save(transactionList);
        }
    }

    public static void update(Transaction transaction) {
        if (transaction != null) {
            ArrayList<Transaction> transactionList = getTransactionList();
            for (int i = 0; i < transactionList.size(); i++) {
                Transaction oldTransaction = transactionList.get(i);
                if (oldTransaction.equals(transaction)) {
                    transactionList.set(i, transaction);
                    save(transactionList);
                    break;
                }
            }
        }
    }

    public static void delete(Transaction transaction) {
        if (transaction != null) {
            ArrayList<Transaction> transactionList = getTransactionList();
            for (int i = 0; i < transactionList.size(); i++) {
                Transaction oldTransaction = transactionList.get(i);
                if (oldTransaction.equals(transaction)) {
                    transactionList.remove(i);
                    save(transactionList);
                    break;
                }
            }
        }
    }

    public static ArrayList<Transaction> getTransactionList(Accounts account) {
        ArrayList<Transaction> allTransactionList = load();
        ArrayList<Transaction> accountTransactionList = new ArrayList<Transaction>();
        if (allTransactionList != null) {
            for (int i = 0; i < allTransactionList.size(); i++) {
                Transaction transaction = allTransactionList.get(i);
                if (transaction.getAccount().equals(account)) {
                    accountTransactionList.add(transaction);
                }
            }
        }

        return accountTransactionList;
    }

    public static ArrayList<Transaction> getTransactionList(ArrayList<Accounts> accList) {
        ArrayList<Transaction> transactionnewList = new ArrayList<Transaction>();
        for (int i = 0; i < accList.size(); i++) {
            Accounts account = accList.get(i);
            ArrayList<Transaction> accountTransactionList = getTransactionList(account);
            if (accountTransactionList != null) {
                for (int j = 0; j < accountTransactionList.size(); j++) {
                    Transaction transaction = accountTransactionList.get(i);
                    transactionnewList.add(transaction);
                }
            }
        }
        return transactionnewList;
    }

    public static ArrayList<Transaction> getUserTransactionList() {
        ArrayList<Accounts> userAccountList = AccountsDataManager.getUserAccountList();
        ArrayList<Transaction> userTransactionList = getTransactionList(userAccountList);
        return userTransactionList;
    }

}
