package com.crm.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crm.crm.model.User;


public interface UserRepository extends JpaRepository<User, Long>{
	
		
    
}
