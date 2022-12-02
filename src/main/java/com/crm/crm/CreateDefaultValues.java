package com.crm.crm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.crm.crm.model.Oportunity;
import com.crm.crm.repository.OportunityRegisterRepository;

@Component
public class CreateDefaultValues implements CommandLineRunner {
	@Autowired
	OportunityRegisterRepository oportunityRegisterRepository;

	@Override
	public void run(String... args) throws Exception {
		Oportunity oportunity = new Oportunity("Soto", "Soto", "Mail", true, "02/12/2022");

		oportunityRegisterRepository.save(oportunity);

	}

}
