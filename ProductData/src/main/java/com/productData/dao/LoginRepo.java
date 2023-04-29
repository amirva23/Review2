package com.productData.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.productData.model.LoginModel;
@Repository
public interface LoginRepo extends JpaRepository<LoginModel,Integer>{
	
    LoginModel findByusername(String username);
}
