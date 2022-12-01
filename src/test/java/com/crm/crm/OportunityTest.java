package com.crm.crm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
		SimpleDateFormat sDate= new SimpleDateFormat("dd/MM/yy");
		Date date=null;
		try {
			date = sDate.parse("30/11/2022");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		this.newOportunity();
		int i = oportunityService.findAllOportunities().size();
		assertEquals(1, i);
	}
	
	@Test
	void findOportunityByName() {
		Oportunity newOportunity=this.newOportunity();
		for(Oportunity o: oportunityService.findOportunitiesByName(newOportunity.getName())){
			assertEquals("Javier", o.getName());
		}
		
		
	}
	
	Oportunity newOportunity() {
		SimpleDateFormat sDate= new SimpleDateFormat("dd/MM/yy");
		Date date=null;
		try {
			date = sDate.parse("30/11/2022");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Oportunity oportunity=new Oportunity( 1,"Javier", "Soto", "955512454", true, date);
		return oportunityService.addOportunity(oportunity);
	}
	
	

	

}
