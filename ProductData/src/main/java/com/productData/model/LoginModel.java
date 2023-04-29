package com.productData.model;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="logindatabase")
public class LoginModel {
  @Id
      private int Id;
      private String username;
      private String password;
      
      public int getId() 
      {
      	return Id;
      }
      public void setId(int id) 
      {
	   Id = id;
      }
      public String getUsername() 
       {
	   return username;
       }
       public void setUsername(String username)
       {
	   this.username = username;
       }
       public String getPassword() 
       {
	    return password;
       }
       public void setPassword(String password) 
       {
	    this.password = password;
       }
}


