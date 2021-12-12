/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WLVG_app.Login;

import java.util.ArrayList;

/**
 *
 * @author jackgallagher
 */
public class UserLoginCntl 
{
    UserList currentUserList;
    ArrayList<User> listOfUsers = new ArrayList<>();
    
    public UserLoginCntl()
    {
        currentUserList = new UserList();
        listOfUsers = currentUserList.getListOfUsers();
    }
    
     public void addNewUser(String firstName, String lastName, String userName, 
            String passWord){
        User newUser = new User(firstName, lastName, userName, passWord);
        listOfUsers.add(newUser);
        currentUserList.writeUserListFile();
    }
    
    
    
    
    public boolean authenticateUser(String userName, String passWord)
    {
        for (User listOfUser : listOfUsers)
        {
             if(listOfUser.getUserName().equals(userName)
                   && listOfUser.getPassWord().equals(passWord)) {
                 return true;
                 //ShovTableController tableController = new ShovTableController();
             }
        }
        System.out.println("User not found");
        return false;
        
    }
}
