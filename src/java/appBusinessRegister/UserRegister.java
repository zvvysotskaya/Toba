/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appBusinessRegister;
import java.io.Serializable;
/**
/**
 *
 * @author zhann
 */
public class UserRegister implements Serializable{
    private String firstName;
    private String lastName;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String zipcode;
    private String email;
    
    public UserRegister(){
    firstName = "";
    lastName = "";
    phone = "";
    address = "";
    city = "";
    state = "";
    zipcode = "";
    email = "";
    }
      public UserRegister(String firstName, String lastName, String phone, String address, String city, String state, String zipcode, String email){      
           this.firstName = firstName;
    this.lastName = lastName;
    this.phone = phone;
    this.address = address;
    this.city = city;
    this.state = state;
    this.zipcode = zipcode;
    this.email = email;
      }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(){
      this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(){
      this.lastName = lastName;
    }
    public String getPhone(){
        return phone;
    }
    public void setPhone(){
      this.phone = phone;
    }
      public String getAddress(){
        return address;
    }
    public void setAddress(){
      this.address =  address;
    }
    public String getCity(){
        return city;
    }
    public void setCity(){
      this.city = city;
    }
    public String getState(){
        return state;
    }
    public void setState(){
      this.state = state;
    }
    public String getZipcode(){
        return zipcode;
    }
    public void setZipcode(){
      this.zipcode = zipcode;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(){
      this.email = email;
    }
    }
