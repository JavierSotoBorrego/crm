package com.crm.crm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.crm.crm.model.User;
import com.crm.crm.service.UserService;


@SpringBootTest
class CrmApplicationTests {

	@Test
	void contextLoads() {
	}
	@Autowired
	UserService userService;
	@Test
	void saveUserWithUserNameAndPasswordCorrect() {
		User user=new User("userJaviSoto","passJaviSoto");
		User savedUser=userService.saveUser(user);
		System.out.println(savedUser);
		System.out.println(user);
		assertEquals(user.getUserName(), savedUser.getUserName());
		assertEquals(user.getPassword(), savedUser.getPassword());
	}
	
	
}
