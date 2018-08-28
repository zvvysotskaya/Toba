/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appBusiness;

import java.io.Serializable;
/**
 *
 * @author zhanna
 */
public class UserLogin implements Serializable{
    private String userName;
    private String password;
    
    public UserLogin(){
        userName = "";
        password = "";
    }
    public UserLogin(String userName, String password){
        this.userName = userName;
        this.password = password;
    }
    public String getUserName(){
        return userName;
    }
    public void setUserName(){
      this.userName = userName;
    }
    public String getPassword(){
     return password;   
    }
    public void setPassword(){
     this.password = password; 
    
}
}