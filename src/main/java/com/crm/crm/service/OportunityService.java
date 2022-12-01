package com.crm.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.crm.model.Oportunity;
import com.crm.crm.repository.OportunityRegisterRepository;

@Service
public class OportunityService {

	@Autowired
	OportunityRegisterRepository oportunityRegisterRepository;

	public Oportunity addOportunity(Oportunity oportunity) {
		return oportunityRegisterRepository.save(oportunity);
	}
	

	
}
