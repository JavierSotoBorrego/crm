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
		Oportunity oportunity = new Oportunity("Javier", "Soto", "Mail javiyue@gamil.com", true, "02/12/2022");
		Oportunity oportunity1 = new Oportunity("Bad", "Soto", "Mail javi@gmail.com ", false, "02/12/2022");
		Oportunity oportunity2 = new Oportunity("Soto", "Borrego", "Telefono 666552233", true, "02/12/2022");
		Oportunity oportunity3 = new Oportunity("Wrong", "Soto", "Visita", false, "02/12/2022");

		oportunityRegisterRepository.save(oportunity);
		oportunityRegisterRepository.save(oportunity1);
		oportunityRegisterRepository.save(oportunity2);
		oportunityRegisterRepository.save(oportunity3);

	}

}
