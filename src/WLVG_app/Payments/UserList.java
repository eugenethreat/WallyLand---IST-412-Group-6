/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wallylandapplication;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author jackgallagher
 */
public class UserList implements Serializable
{
    
    private ArrayList<User> listOfUsers = new ArrayList<>();
    
    public ArrayList<User> getListOfUsers(){
        return listOfUsers;
    }
    
    public void setListOfUsers(ArrayList<User> listOfUsers) {
        this.listOfUsers = listOfUsers;
    }
    
    
    private String listOfUsersFileName = "listOfUsers.ser";
    //other methods to go here
    
    
    
    public UserList()
    {
        this.readUserListFile();
        if(listOfUsers.isEmpty() || listOfUsers == null)
        {
            this.createTestUserList();
            this.readUserListFile();
        }
        this.printUserList();
    }
    
    public void createTestUserList()
    {
        User u1 = new User("Julia", "G", "jg123", "dog2134");
        User u2 = new User("Jake", "D", "jd123", "dog2134");
        User u3 = new User("Melissa", "M", "mm123", "dog2134");
        User u4 = new User("Lainey", "M", "lm123", "dog2134");
        User u5 = new User("Molly", "B", "mb123", "dog2134");
        listOfUsers.add(u1);
        listOfUsers.add(u2);
        listOfUsers.add(u3);
        listOfUsers.add(u4);
        listOfUsers.add(u5);
        System.out.println("Test UserList Created");
    }
    
    public void printUserList()
    {
        System.out.println("The userlist has these names");
        for (User listOfUser : listOfUsers) 
        {
            System.out.println(listOfUsers);
        }
    }
    
    public void readUserListFile()
    {
        FileInputStream fis = null;
        ObjectInputStream in = null;
        try 
        {
            fis = new FileInputStream(listOfUsersFileName);
            in = new ObjectInputStream(fis);
            listOfUsers = (ArrayList)in.readObject();
            in.close();
            if(!listOfUsers.isEmpty())
            {
            System.out.println("There are users in the user list");
            }
            
        }
        catch(FileNotFoundException notFound){
            System.out.println("File not found, a new one is created");
        }
        catch(IOException ex)
        {
           
        }
        
        catch(ClassNotFoundException ex)
        {
            
        }
      
    }
     
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//    public void writeUserListFile()
//    {
//         FileOutputStream fos = null;
//         ObjectOutputStream out = null;
//         try 
//         {
//             fos = new FileOutputStream(listOfUsersFileName);
//             out = new ObjectOutputStream(fos);
//             out.writeObject(listOfUsers);
//             out.close();
//         }
//         
//         catch(IOException ex){
//             
//         }
//         
//}
}
