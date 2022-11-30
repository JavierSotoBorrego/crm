package com.crm.crm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.crm.crm.model.Oportunity;
import com.crm.crm.model.User;
import com.crm.crm.service.OportunityService;
import com.crm.crm.service.UserService;


@SpringBootTest
public class createTestPage {
	
	@Test
	void contextLoads() {
	}
	
	
	@Autowired
	OportunityService oportunityService;
	@Test
	void saveOportunityWithAllImputsCorrect() {
		
		Oportunity oportunity=new Oportunity( null, null, null, null, null);
		Oportunity oportunityTest=oportunityService.addOportunity(oportunity);
		
		
	}

}
