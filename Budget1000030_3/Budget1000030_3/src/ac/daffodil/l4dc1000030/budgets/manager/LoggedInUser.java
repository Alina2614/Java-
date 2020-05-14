
package ac.daffodil.l4dc1000030.budgets.manager;

import ac.daffodil.l4dc1000030.budgets.beans.User;




public class LoggedInUser {
    private User user;
    private static LoggedInUser instance;
    
    private LoggedInUser(){
        
    }
    
    public static LoggedInUser getInstance(){
        if (instance == null){
            instance = new LoggedInUser();
        }
        return instance;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    
}
