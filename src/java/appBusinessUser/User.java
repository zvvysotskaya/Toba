/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appBusinessUser;
import appBusinessRegister.UserRegister;
import java.io.Serializable;

/**
 *
 * @author zhann
 */
public class User implements Serializable{
    private UserRegister userRegister ;
        private String userName; 
    private String password;
   public User(){
            
   }
   
   public User(String userName, String password){
     this.userName = userName;
     this.password = password;
   }
    
      public UserRegister getUserRegister(){
       return userRegister;   
      }
      public void setUserRegister(UserRegister u){
       userRegister = u;   
      }
     
    
    public String getPassword(){
     return password;   
    }
    public void setPassword(String password){
      this.password = password;  
    }
   
    public String getUserName(){
         
        return userName; 
    }
    public void setUserName(String userName){
      this.userName = userName;
    } 

}
