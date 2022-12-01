package com.crm.crm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.crm.crm.model.Oportunity;
import com.crm.crm.service.OportunityService;


@SpringBootTest
public class OportunityTest {
	
	@Test
	void contextLoads() {
	}
	
	
	@Autowired
	OportunityService oportunityService;
	
	@Test
	void saveOportunityWithAllImputsCorrect() {
		Date date=new Date("30/11/2022");
		Oportunity oportunity=new Oportunity( "Javier", "Soto", "955512454", true,date);
		Oportunity oportunityTest=oportunityService.addOportunity(oportunity);
		assertEquals(oportunity.getName(), oportunityTest.getName());
		assertEquals(oportunity.getSurname(), oportunityTest.getSurname());
		assertEquals(oportunity.getTypeContact(), oportunityTest.getTypeContact());
		assertEquals(oportunity.getbClient(), oportunityTest.getbClient());
		assertEquals(oportunity.getDatecontact(), oportunityTest.getDatecontact());
	
	}
	
	@Test
	void addOportinitiesToList() {
		Date date=new Date("30/11/2022");
		Oportunity oportunity=new Oportunity( 1,"Javier", "Soto", "955512454", true, date);
		System.out.println(oportunity);
		oportunityService.addOportunity(oportunity);
		int i = oportunityService.findAllOportunities().size();
		assertEquals(1, i);
	}
	
	

	

}
