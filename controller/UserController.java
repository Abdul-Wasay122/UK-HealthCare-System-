package controller;
import model.User;

public class UserController {
    private User currentUser;
    public boolean login(User user , String email , String password){
        if(user.getEmail().equals(email) && user.getPassword().equals(password)){
            currentUser = user;
            return true;
        }
        return false;
    }
    public void logout(){
        currentUser = null;
    }
    public User getCurrentUser(){
        return currentUser;
    }

}
