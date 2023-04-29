package com.productData.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productData.model.LoginModel;
import com.productData.service.LoginService;

@RestController
@RequestMapping("/data")
public class LoginController 

{
			@Autowired
			public LoginService serve;
			
			@PostMapping("/login")
			public 	String login(@RequestBody Map<String, String> loginData )
			{
				String username = loginData.get("username");
				String password = loginData.get("password");
				String result = serve.checklogin(username, password);
				return result ;
			}
			
			@PostMapping("/add")
			public LoginModel Add(@RequestBody LoginModel log)
			{
				return serve.addUser(log);
			}
			
			@GetMapping
			public List<LoginModel> listall()
			{
				return serve.getUser();
			}
			
			 @PutMapping("/updatelogin")
			    public LoginModel updateLoginModel(@RequestBody LoginModel lm)
			    {
			    	return serve.updateLogin(lm);	
			    }
			
			@DeleteMapping("/delete/{Id}")
			public String delete(@PathVariable int Id)
			{
				return serve.deleteById(Id);
			}
			
}


