package com.crm.crm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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

//	@Autowired
//	private TestEntityManager entityManager;

	@Autowired
	OportunityService oportunityService;

	@Test
	void saveOportunityWithAllImputsCorrect() {

		Oportunity oportunity = new Oportunity("Javier", "Soto", "955512454", true, "01/12/2022");
		Oportunity oportunityTest = oportunityService.addOportunity(oportunity);
		assertEquals(oportunity.getName(), oportunityTest.getName());
		assertEquals(oportunity.getSurname(), oportunityTest.getSurname());
		assertEquals(oportunity.getTypeContact(), oportunityTest.getTypeContact());
		assertEquals(oportunity.getClientBoolean(), oportunityTest.getClientBoolean());
		assertEquals(oportunity.getDatecontact(), oportunityTest.getDatecontact());

	}

	@Test
	void addOportinitiesToListCorrect() {
		int iOportunitySizeBefore = oportunityService.findAllOportunities().size();
		this.newOportunity();
		int iOportunitySizeAfter = oportunityService.findAllOportunities().size();
		assertEquals(iOportunitySizeBefore+1, iOportunitySizeAfter);
	}

	@Test
	void findOportunityByNameCorrect() {
		Oportunity newOportunity = this.newOportunity();
		for (Oportunity o : oportunityService.findOportunitiesByName(newOportunity.getName())) {
			assertEquals("Javier", o.getName());
		}
	}

	@Test
	void updateOportunityClientCorrect() {
		Oportunity newOportunity = this.newOportunity();
		Oportunity oportunitySetted=oportunityService.updateOportunityClient(newOportunity,false);	
		assertNotEquals(newOportunity.getClientBoolean(), oportunitySetted.getClientBoolean());
	}

	
	
	
	
	
	
	
	Oportunity newOportunity() {
		Oportunity oportunity = new Oportunity("Javier", "Soto", "955512454", true, "01/12/2022");
		return oportunityService.addOportunity(oportunity);
	}

}
