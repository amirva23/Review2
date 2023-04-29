package com.productData.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productData.dao.LoginRepo;
import com.productData.model.LoginModel;


@Service
public class LoginService {
  @Autowired
  public LoginRepo log;
  public String checklogin(String username,String password)
	{
		LoginModel login = log.findByusername(username);
		if(login==null)
		{
			return "no user found";
		}
		else {
			if(login.getPassword().equals(password))
			{
				return "Login Successful";
			}
			else {
				
				return "Login Failed.Try Again";
			}
			
		}
	}
	public LoginModel addUser(LoginModel l)
	{
		return log.save(l);
	}
	
	public List<LoginModel> getUser()
	{
		return log.findAll();
	}
	
	public String deleteById(int Id)
	{
		log.deleteById(Id);
		return "Deleted Successfully";
	}
	public LoginModel updateLogin(LoginModel lmodel)
	{
		LoginModel obj = log.save(lmodel);
		return obj;
	}
}
